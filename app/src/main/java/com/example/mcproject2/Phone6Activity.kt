package com.example.mcproject2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Phone6Activity : AppCompatActivity() {
    private lateinit var button3: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.phone6)
        button3=findViewById(R.id.button3)
        button3.setOnClickListener{
        val intent= Intent(this,Phone6cartActivity::class.java)
        startActivity(intent)
    }}
}