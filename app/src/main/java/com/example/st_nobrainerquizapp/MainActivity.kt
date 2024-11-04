package com.example.st_nobrainerquizapp


import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.BitmapFactory
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.core.graphics.drawable.toDrawable
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.st_nobrainerquizapp.OwnQuiz.MyQuiz
import com.example.st_nobrainerquizapp.OwnQuiz.OwnQuizActivity
import com.example.st_nobrainerquizapp.databinding.ActivityMainBinding
import com.example.st_nobrainerquizapp.otherGames.OtherGamesActivity
import com.google.firebase.Firebase
import com.google.firebase.auth.auth
import com.google.firebase.database.FirebaseDatabase
//import com.google.firebase.database.core.Context
import java.io.ByteArrayInputStream
import android.Manifest

class MainActivity : BaseActivity() {

    private lateinit var quizDB : SQLiteDBQuiz
    val connect = CheckConnStatus()

    private var binding: ActivityMainBinding? = null

    companion object {
        private const val CHANNEL_ID = "nobrainer_channel"
        private const val NOTIFICATION_PERMISSION_REQUEST_CODE = 123
        private const val NOTIFICATION_ID = 1
        private const val PENDING_INTENT_REQUEST_CODE = 0
    }

    lateinit var quizModelList : MutableList<QuizModel>
    lateinit var adapter: QuizListAdapter

    var auth = Firebase.auth.currentUser?.email.toString()
    var user = Firebase.auth.currentUser?.uid.toString()

    //private val user = db.retrieveUser(auth)
    private val score = 0//db.retrieveScore(auth)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //db = DBConnect(this)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        quizModelList = mutableListOf()


        if (connect.isConnectedToInternet(this)) {
            // Run functions that require an internet connection
            getQuizFromFirebase()
        } else {
            // Run functions that should work offline
            getQuizFromDatabase()
        }

        // Create notification channel when app starts
        createNotificationChannel()

        // Request notification permission for Android 13 and above
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            requestNotificationPermission()}

        binding?.apply {

            //loadImage()
            val databaseRef = FirebaseDatabase.getInstance().getReference("user")
            databaseRef.child(user).get().addOnSuccessListener {
                if(it.exists()){
                    val gender = it.child("gender").value.toString()

                    if(gender == "Male"){
                        dp.setImageResource(R.drawable.person1)
                    }
                    else{
                        dp.setImageResource(R.drawable.person2)
                    }
                }
            }.addOnFailureListener(){

                Toast.makeText(this@MainActivity,"Unable to access database, try again later!", Toast.LENGTH_SHORT).show()
            }

            if (connect.isConnectedToInternet(this@MainActivity)) {
                val databaseRefScore = FirebaseDatabase.getInstance().getReference("score")
                databaseRefScore.child(user).get().addOnSuccessListener {
                    if(it.exists()){
                        val score = it.child("score").value.toString()
                        binding?.tvScore?.setText(score)
                        ScorePreferences.setScore(score.toInt())
                    }
                    else{
                        Toast.makeText(this@MainActivity,"Unable to access your score, try again later!", Toast.LENGTH_SHORT).show()
                    }
                }.addOnFailureListener(){

                    Toast.makeText(this@MainActivity,"Unable to access database, try again later!", Toast.LENGTH_SHORT).show()
                }
            }
            else {
                binding?.tvScore?.setText(ScorePreferences.getScore().toString())
            }



            tvUserWelcome.setText("Hi, " + auth)

            chatbtn.setOnClickListener(){
                val intent = Intent(this@MainActivity, ActivityChatAI::class.java)
                startActivity(intent)

            //Toast.makeText(this@MainActivity,"Feature in development POE3", Toast.LENGTH_SHORT).show()
            }

            btnOtherGames.setOnClickListener{
                val intent = Intent(this@MainActivity, OtherGamesActivity::class.java)
                startActivity(intent)
            }

            createbtn.setOnClickListener {
                val intent = Intent(this@MainActivity, OwnQuizActivity::class.java)
                startActivity(intent)
            }

            myQuiz.setOnClickListener{
                val intent = Intent(this@MainActivity, MyQuiz::class.java)
                startActivity(intent)
            }

            bottomNavigation.setOnNavigationItemSelectedListener { item ->
                when (item.itemId) {
                    R.id.nav_home -> {
                        startActivity(Intent(this@MainActivity, MainActivity::class.java))
                        true
                    }

                    R.id.nav_board -> {
                        startActivity(Intent(this@MainActivity, ActivityScoreboard::class.java))
                        //Toast.makeText(this@MainActivity,"Leaderboard feature in development POE3", Toast.LENGTH_SHORT).show()
                        true
                    }

                    R.id.nav_setting -> {
                        startActivity(Intent(this@MainActivity, ActivitySettings::class.java))
                        true
                    }

                    R.id.nav_profile -> {
                        startActivity(Intent(this@MainActivity, ActivityViewProfile::class.java))
                        true
                    }

                    else -> false
                }
            }
        }

        // Show notification when app starts
        showNotification()
    }

    private fun setupRecyclerView(){
        binding?.progressBar?.visibility ?:  View.GONE
        adapter = QuizListAdapter(quizModelList)
        binding?.recyclerViewQuiz?.layoutManager = LinearLayoutManager(this)
        binding?.recyclerViewQuiz?.adapter = adapter
    }

    private fun getQuizFromFirebase(){
        binding?.progressBar?.visibility ?: View.VISIBLE
        FirebaseDatabase.getInstance().getReference("quiz")
            .get()
            .addOnSuccessListener { dataSnapshot->
                if(dataSnapshot.exists()){
                    for (snapshot in dataSnapshot.children){
                        val quizModel = snapshot.getValue(QuizModel::class.java)
                        if (quizModel != null) {
                            quizModelList.add(quizModel)
                        }
                    }
                }
                setupRecyclerView()
            }.addOnFailureListener(){
                Toast.makeText(this@MainActivity,"Unable to access quiz database, try again later! Enjoy offline quiz sets until then..", Toast.LENGTH_SHORT).show()
            }
    }


    // Function to fetch quizzes from the SQLite database
    private fun getQuizFromDatabase() {
        quizDB = SQLiteDBQuiz(this)
        val db = quizDB.readableDatabase

        // Query the quiz table
        val quizCursor = db.query(
            SQLiteDBQuiz.TABLE_QUIZ,
            null, // Select all columns
            null,
            null,
            null,
            null,
            null
        )

        // Check if quiz data is available
        if (quizCursor.moveToFirst()) {
            do {
                val quizId = quizCursor.getString(quizCursor.getColumnIndexOrThrow(SQLiteDBQuiz.COLUMN_QUIZ_ID))
                val title = quizCursor.getString(quizCursor.getColumnIndexOrThrow(SQLiteDBQuiz.COLUMN_TITLE))
                val subtitle = quizCursor.getString(quizCursor.getColumnIndexOrThrow(SQLiteDBQuiz.COLUMN_SUBTITLE))
                val time = quizCursor.getString(quizCursor.getColumnIndexOrThrow(SQLiteDBQuiz.COLUMN_TIME))

                // Retrieve questions associated with the current quiz
                val questionList = mutableListOf<QuestionModel>()
                val questionCursor = db.query(
                    SQLiteDBQuiz.TABLE_QUESTION,
                    null,
                    "${SQLiteDBQuiz.COLUMN_QUIZ_ID_FK} = ?",
                    arrayOf(quizId),
                    null,
                    null,
                    null
                )

                // Fetch questions for the quiz
                if (questionCursor.moveToFirst()) {
                    do {
                        val questionText = questionCursor.getString(questionCursor.getColumnIndexOrThrow(SQLiteDBQuiz.COLUMN_QUESTION))
                        val options = questionCursor.getString(questionCursor.getColumnIndexOrThrow(SQLiteDBQuiz.COLUMN_OPTIONS)).split(",")
                        val correctAnswer = questionCursor.getString(questionCursor.getColumnIndexOrThrow(SQLiteDBQuiz.COLUMN_CORRECT))
                        val hint = questionCursor.getString(questionCursor.getColumnIndexOrThrow(SQLiteDBQuiz.COLUMN_HINT))

                        // Create a QuestionModel instance and add it to the question list
                        val questionModel = QuestionModel(questionText, options, correctAnswer, hint)
                        questionList.add(questionModel)
                    } while (questionCursor.moveToNext())
                }
                questionCursor.close()

                // Create a QuizModel instance with the associated questions and add it to the quiz list
                val quizModel = QuizModel(quizId, title, subtitle, time, questionList)
                quizModelList.add(quizModel)
            } while (quizCursor.moveToNext())
        }
        quizCursor.close()
        db.close()
        setupRecyclerView()

    }


    private fun showNotification() {
        // Create an explicit intent for the MainActivity
        val intent = Intent(this, OtherGamesActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        }

        // Create the PendingIntent
        val pendingIntent = PendingIntent.getActivity(
            this,
            PENDING_INTENT_REQUEST_CODE,
            intent,
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                PendingIntent.FLAG_IMMUTABLE or PendingIntent.FLAG_UPDATE_CURRENT
            } else {
                PendingIntent.FLAG_UPDATE_CURRENT
            }
        )

        // Build the notification with the PendingIntent
        val builder = NotificationCompat.Builder(this, CHANNEL_ID)
            .setSmallIcon(R.drawable.logo)
            .setContentTitle(getString(R.string.notification_title))
            .setContentText(getString(R.string.notification_text))
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            .setAutoCancel(true) // Automatically removes the notification when tapped
            .setContentIntent(pendingIntent) // Sets the pending intent

        // Show the notification
        with(NotificationManagerCompat.from(this)) {
            if (ActivityCompat.checkSelfPermission(
                    applicationContext,
                    Manifest.permission.POST_NOTIFICATIONS
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                return@with
            }
            notify(NOTIFICATION_ID, builder.build())
        }
    }

    // Your existing methods remain the same
    private fun requestNotificationPermission() {
        if (ActivityCompat.checkSelfPermission(
                this,
                Manifest.permission.POST_NOTIFICATIONS
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.POST_NOTIFICATIONS),
                NOTIFICATION_PERMISSION_REQUEST_CODE
            )
        }
    }

    private fun createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val name = getString(R.string.channel_name)
            val descriptionText = getString(R.string.channel_description)
            val channel = NotificationChannel(
                CHANNEL_ID,
                name,
                NotificationManager.IMPORTANCE_DEFAULT
            ).apply {
                description = descriptionText
            }

            val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}


    /*fun loadImage() {
        val imageByteArray = null//user.image
        if (imageByteArray != null)
        {
            val imageStream = ByteArrayInputStream(imageByteArray)
            val bitmap = BitmapFactory.decodeStream(imageStream)
            val drawable: Drawable = BitmapDrawable(bitmap)
            binding?.dp?.background = drawable

        }
        else
        {
            binding?.dp?.background = (R.drawable.person6).toDrawable()
        }
    }*/
