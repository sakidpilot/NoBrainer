package com.example.st_nobrainerquizapp

import android.content.Context
import android.content.SharedPreferences

object UserPreferences {
    private const val PREF_NAME = "UserPrefs"
    private const val KEY_EMAIL = "email"
    private const val KEY_USERNAME = "username"
    private const val KEY_BIO = "bio"
    private const val KEY_GENDER = "gender"
    private const val KEY_AGE = "age"
    private lateinit var preferences: SharedPreferences

    fun init(context: Context) {
        preferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
    }

    // Store user details
    fun setUserDetails(email: String, username: String, bio: String, gender: String, age: String) {
        preferences.edit().apply {
            putString(KEY_EMAIL, email)
            putString(KEY_USERNAME, username)
            putString(KEY_BIO, bio)
            putString(KEY_GENDER, gender)
            putString(KEY_AGE, age)
            apply()
        }
    }

    // Retrieve user details
    fun getEmail(): String? = preferences.getString(KEY_EMAIL, null)
    fun getUsername(): String? = preferences.getString(KEY_USERNAME, null)
    fun getBio(): String? = preferences.getString(KEY_BIO, null)
    fun getGender(): String? = preferences.getString(KEY_GENDER, null)
    fun getAge(): String? = preferences.getString(KEY_AGE, null)

    // Clear user details (optional, for logout)
    fun clearUserDetails() {
        preferences.edit().clear().apply()
    }
}
