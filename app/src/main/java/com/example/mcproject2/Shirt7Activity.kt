package com.example.mcproject2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Shirt7Activity : AppCompatActivity() {
    private lateinit var button3: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.shirt7)
        button3=findViewById(R.id.button3)
        button3.setOnClickListener{
        val intent= Intent(this,Shirt7cartActivity::class.java)
        startActivity(intent)
    }}
}