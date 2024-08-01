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
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class LoginActivity : AppCompatActivity() {
private lateinit var auth:FirebaseAuth
    private lateinit var login: TextView
    private lateinit var signup: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.login)
//
//        login = findViewById(R.id.login)
//        signup = findViewById(R.id.signup)

        auth = Firebase.auth

        val loginBut:TextView=findViewById(R.id.login)
        val signUpBut:TextView=findViewById(R.id.signup)
        val mail: EditText =findViewById(R.id.email)
        val pas:EditText=findViewById(R.id.pass)


        signUpBut.setOnClickListener{
            startActivity(Intent(this,SignupActivity::class.java))
        }


        loginBut.setOnClickListener {
            val emailStr = mail.text.toString()
            val passwordStr = pas.text.toString()

            if (emailStr.isEmpty() || passwordStr.isEmpty()) {
                Toast.makeText(this, "Fill all the fields", Toast.LENGTH_SHORT).show()
            } else {
                auth.signInWithEmailAndPassword(emailStr, passwordStr)
                    .addOnCompleteListener(this) { task ->
                        if (task.isSuccessful) {
                            val user = auth.currentUser
                            updateUI(user)
                            startActivity(Intent(this, MainActivity3::class.java))
                        } else {
                            Toast.makeText(this, "Authentication failed", Toast.LENGTH_SHORT).show()
                            updateUI(null)
                        }
                    }
            }





        }
    }

    private fun updateUI(currentUser: FirebaseUser?) {
        if (currentUser != null) {
            Toast.makeText(this, "Welcome ${currentUser.displayName}", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Please Sign in", Toast.LENGTH_SHORT).show()
        }
    }
//
//        login.setOnClickListener{
//            val intent=Intent(this,MainActivity3::class.java)
//            startActivity(intent)
//        }
//        signup.setOnClickListener{
//            val intent=Intent(this,signup::class.java)
//            startActivity(intent)
//        }
    }
