package com.example.st_nobrainerquizapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.st_nobrainerquizapp.databinding.ActivitySettingsBinding
import android.app.Activity
import android.content.Context
import android.content.res.Configuration
import androidx.appcompat.app.AlertDialog
import com.google.firebase.Firebase
import com.google.firebase.auth.auth
import com.google.firebase.database.FirebaseDatabase
import java.util.Locale

class ActivitySettings : BaseActivity() {
    private var binding: ActivitySettingsBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingsBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        val userAuth = Firebase.auth.currentUser?.uid.toString()

        binding?.apply {

            buttonEditUser.setOnClickListener(){
                startActivity(Intent(this@ActivitySettings, ActivityEditUser::class.java))
            }
            /*buttonDarkMode.setOnClickListener(){
                Toast.makeText(this@ActivitySettings,"Feature in development POE 3", Toast.LENGTH_SHORT).show()
            }
            buttonLightMode.setOnClickListener(){
                Toast.makeText(this@ActivitySettings,"Feature in development POE 3", Toast.LENGTH_SHORT).show()
            }*/
            buttonLanguages.setOnClickListener(){
                showLanguageSelectionDialog()
                //Toast.makeText(this@ActivitySettings,"Feature in development POE 3", Toast.LENGTH_SHORT).show()
            }

            buttonUserManual.setOnClickListener(){
                startActivity(Intent(this@ActivitySettings, ActivityUserManual::class.java))
            }

            buttonSync.setOnClickListener(){

                if(UserPreferences.getUsername()?.isNotEmpty() == true) {
                    val databaseRef = FirebaseDatabase.getInstance().getReference("user")

                    /*val user = mapOf(
                    "email" to UserPreferences.getEmail(),
                    "username" to UserPreferences.getUsername(),
                    "bio" to UserPreferences.getBio(),
                    "gender" to UserPreferences.getGender(),
                    "age" to UserPreferences.getAge()
                )*/
                    val user = UserSQLiteDB(
                        UserPreferences.getEmail().toString(),
                        UserPreferences.getUsername().toString(),
                        UserPreferences.getBio().toString(),
                        UserPreferences.getGender().toString(),
                        UserPreferences.getAge().toString()
                    )
                    databaseRef.child(userAuth).setValue(user).addOnCompleteListener() {

                        Toast.makeText(
                            this@ActivitySettings,
                            "User Profile Updated and Sync-ed!!",
                            Toast.LENGTH_SHORT
                        ).show()

                    }.addOnFailureListener() {
                        Toast.makeText(
                            this@ActivitySettings,
                            "Error in updating user account, try again!",
                            Toast.LENGTH_SHORT
                        ).show()
                        startActivity(Intent(this@ActivitySettings, this::class.java))
                    }
                }

                val score = ScorePreferences.getScore().toInt()
                val newScore = UserScores((score))
                val databaseRefScore = FirebaseDatabase.getInstance().getReference("score")
                databaseRefScore.child(userAuth).setValue(newScore).addOnCompleteListener(){
                    Toast.makeText(this@ActivitySettings,"Score updated and Sync-ed!", Toast.LENGTH_SHORT).show()
                }.addOnFailureListener(){
                    Toast.makeText(this@ActivitySettings,"Error in updating user score, try again!", Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this@ActivitySettings, this::class.java))
                }
            }

            buttonLogout.setOnClickListener() {
                startActivity(Intent(this@ActivitySettings, ActivityLogin::class.java))
                Toast.makeText(this@ActivitySettings, "Thank you for using the No Brainer App, you are not successfully logged out! Goodbye!", Toast.LENGTH_LONG).show()
                finish()
            }


            bottomNavigation.setOnNavigationItemSelectedListener { item ->
                when (item.itemId) {
                    R.id.nav_home -> {
                        startActivity(Intent(this@ActivitySettings, MainActivity::class.java))
                        true
                    }

                    R.id.nav_board -> {
                        startActivity(Intent(this@ActivitySettings, ActivityScoreboard::class.java))
                        //Toast.makeText(this@ActivitySettings,"Leaderboard feature in development", Toast.LENGTH_SHORT).show()
                        true
                    }

                    R.id.nav_setting -> {
                        startActivity(Intent(this@ActivitySettings, ActivitySettings::class.java))
                        true
                    }

                    R.id.nav_profile -> {
                        startActivity(Intent(this@ActivitySettings, ActivityViewProfile::class.java))
                        true
                    }

                    else -> false
                }
            }
        }
    }


    private fun showLanguageSelectionDialog() {
        val languages = arrayOf("English", "Zulu")
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Change the Language")
        builder.setSingleChoiceItems(languages, -1) { dialog, which ->
            val selectedLanguage = if (which == 0) "en" else "zu"
            setLocale(selectedLanguage)
            dialog.dismiss()

            // Restart the app to apply the language change globally
            val intent = Intent(applicationContext, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
            finish()
        }
        builder.create().show()
    }

    private fun setLocale(languageCode: String) {
        val editor = getSharedPreferences("Settings", Context.MODE_PRIVATE).edit()
        editor.putString("My_Lang", languageCode)
        editor.apply()
        recreate()
    }

}