package com.example.st_nobrainerquizapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.firebase.database.FirebaseDatabase

class ActivityScoreboard : BaseActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var scoreboardAdapter: ScoreboardAdapter
    private lateinit var bottomNavigation: BottomNavigationView
    private val userScores = mutableListOf<UserScore>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scoreboard)

        recyclerView = findViewById(R.id.recyclerViewScores)
        recyclerView.layoutManager = LinearLayoutManager(this)
        bottomNavigation = findViewById(R.id.bottom_navigation)
        scoreboardAdapter = ScoreboardAdapter(userScores)
        recyclerView.adapter = scoreboardAdapter


        bottomNavigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    startActivity(Intent(this@ActivityScoreboard, MainActivity::class.java))
                    true
                }

                R.id.nav_board -> {
                    startActivity(Intent(this@ActivityScoreboard, ActivityScoreboard::class.java))
                    //Toast.makeText(this@MainActivity,"Leaderboard feature in development POE3", Toast.LENGTH_SHORT).show()
                    true
                }

                R.id.nav_setting -> {
                    startActivity(Intent(this@ActivityScoreboard, ActivitySettings::class.java))
                    true
                }

                R.id.nav_profile -> {
                    startActivity(Intent(this@ActivityScoreboard, ActivityViewProfile::class.java))
                    true
                }

                else -> false
            }
        }


        fetchTopScores()
    }

    private fun fetchTopScores() {
        val scoresRef = FirebaseDatabase.getInstance().getReference("score")
        val usersRef = FirebaseDatabase.getInstance().getReference("user")

        // Fetch all scores, then sort and get top 10
        scoresRef.get().addOnSuccessListener { scoreSnapshot ->
            val scoreEntries = mutableListOf<Pair<String, Int>>()

            for (userScoreSnapshot in scoreSnapshot.children) {
                val uid = userScoreSnapshot.key ?: continue
                val score = userScoreSnapshot.child("score").getValue(Int::class.java) ?: continue
                scoreEntries.add(Pair(uid, score))
            }

            // Sort scores in descending order and take the top 10
            scoreEntries.sortByDescending { it.second }
            val topTenScores = scoreEntries.take(10)

            // Fetch corresponding usernames and display
            for ((uid, scoreValue) in topTenScores) {
                usersRef.child(uid).get().addOnSuccessListener { userSnapshot ->
                    val userName = userSnapshot.child("username").getValue(String::class.java) ?: "Unknown"
                    userScores.add(UserScore(userName, scoreValue))

                    // Update the RecyclerView when all usernames have been retrieved
                    if (userScores.size == topTenScores.size) {
                        scoreboardAdapter.notifyDataSetChanged()
                    }
                }
            }
        }.addOnFailureListener {
            Toast.makeText(this@ActivityScoreboard,"Unable to access database, try again later!", Toast.LENGTH_SHORT).show()
            Log.e("ScoreboardActivity", "Error fetching scores: ${it.message}")
        }
    }
}