package com.example.st_nobrainerquizapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.st_nobrainerquizapp.databinding.ActivityEditUserBinding
import com.google.firebase.Firebase
import com.google.firebase.auth.auth
import com.google.firebase.database.FirebaseDatabase

class ActivityEditUser : BaseActivity(){

    private lateinit var binding: ActivityEditUserBinding
    val connect = CheckConnStatus()

//private lateinit var db : DBConnect

private lateinit var gender : String
var email = Firebase.auth.currentUser?.email.toString()

val databaseRef = FirebaseDatabase.getInstance().getReference("user")


override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityEditUserBinding.inflate(layoutInflater)
    setContentView(binding.root)

    //db = DBConnect(this)
    //binding.imgPic.setBackground(selectedImage)

    gender = "Male"

    binding.radioGroup.setOnCheckedChangeListener { _, id ->
        when (id) {
            R.id.rdMale -> gender = "Male"
            R.id.rdFemale -> gender = "Female"
        }
    }

    binding.btnCreateProfile.setOnClickListener {

        if (connect.isConnectedToInternet(this)) {
            // Run functions that require an internet connection
            //db.insertUser(email, binding.edtUsername.text.toString(), binding.edtbio.text.toString(), gender, binding.edtAge.text.toString(), selectedImage)
            var userAuth = Firebase.auth.currentUser?.uid.toString()
            val user = UserSQLiteDB(email, binding.edtUsername.text.toString(), binding.edtBio.text.toString(), gender, binding.edtAge.text.toString())
            databaseRef.child(userAuth).setValue(user).addOnCompleteListener(){

                Toast.makeText(this,"User Profile Updated!!", Toast.LENGTH_SHORT).show()


                startActivity(Intent(this, MainActivity::class.java))
                this.finish()
            }.addOnFailureListener(){
                Toast.makeText(this,"Error in creating profile and updating user account, try again!", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, this::class.java))
            }
        }

        else {
            // Run functions that should work offline
            // Set user details
            UserPreferences.setUserDetails(
                email = email,
                username = binding.edtUsername.text.toString(),
                bio = binding.edtBio.text.toString(),
                gender = gender,
                age = binding.edtAge.text.toString()
            )
            Toast.makeText(this,"You are currently offline, do not forget to sync your data!!", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, MainActivity::class.java))
        }





    }
}
}