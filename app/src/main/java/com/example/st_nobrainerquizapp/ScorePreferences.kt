package com.example.st_nobrainerquizapp

import android.content.Context
import android.content.SharedPreferences

object ScorePreferences {
    private const val PREF_NAME = "ScorePrefs"
    private const val KEY_SCORE = "score"
    private lateinit var preferences: SharedPreferences

    fun init(context: Context) {
        preferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
    }

    fun getScore(): Int {
        return preferences.getInt(KEY_SCORE, 0)
    }

    fun incrementScore() {
        val currentScore = getScore()
        preferences.edit().putInt(KEY_SCORE, currentScore + 5).apply()
    }

    fun decrementScore() {
        val currentScore = getScore()
        preferences.edit().putInt(KEY_SCORE, currentScore - 5).apply()
    }

    fun setScore(score: Int) {
        preferences.edit().putInt(KEY_SCORE, score).apply()
    }
}

