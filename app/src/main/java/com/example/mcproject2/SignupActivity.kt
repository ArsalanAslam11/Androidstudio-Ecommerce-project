package com.example.mcproject2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.UserProfileChangeRequest
import com.google.firebase.auth.auth

class SignupActivity : AppCompatActivity() {
    private lateinit var textView34: TextView
    private lateinit var auth:FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup)

//        textView34.setOnClickListener{
//            val intent= Intent(this,LoginActivity::class.java)
//            startActivity(intent)
//        }

        auth = Firebase.auth

        val naam: EditText = findViewById(R.id.usermail)
        val mail: EditText = findViewById(R.id.email)
        val userPass: EditText = findViewById(R.id.userpass)
        val signup: TextView = findViewById(R.id.textView34)



        signup.setOnClickListener {
            signup.setOnClickListener {
                val emailStr = mail.text.toString()
                val passwordStr = userPass.text.toString()

                if (emailStr.isEmpty() || passwordStr.isEmpty()) {
                    Toast.makeText(this, "Fill all the fields", Toast.LENGTH_SHORT).show()
                } else {
                    auth.createUserWithEmailAndPassword(emailStr, passwordStr).addOnCompleteListener(this) { task ->
                        if (task.isSuccessful) {
//                                Toast.makeText(this, "User created successfully", Toast.LENGTH_SHORT).show()
//                                startActivity(Intent(this, MainActivity::class.java))

                            val user = auth.currentUser

                            user?.let {
                                val profileUpdates = UserProfileChangeRequest.Builder()
                                    .setDisplayName(naam.text.toString())
                                    .build()

                                it.updateProfile(profileUpdates).addOnCompleteListener { profileUpdateTask ->
                                    if (profileUpdateTask.isSuccessful) {
                                        Toast.makeText(this, "User created successfully", Toast.LENGTH_SHORT).show()
                                        startActivity(Intent(this, LoginActivity::class.java))
                                    } else {
                                        Toast.makeText(this, "Profile update failed", Toast.LENGTH_SHORT).show()
                                    }
                                }
                            }
                        } else {
                            Toast.makeText(this, "Authentication failed", Toast.LENGTH_SHORT).show()
                        }
                    }
                }

            }


        }
    }
    }
