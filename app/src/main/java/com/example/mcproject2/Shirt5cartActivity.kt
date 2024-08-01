package com.example.mcproject2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Shirt5cartActivity : AppCompatActivity() {
    private lateinit var button5: Button
    private lateinit var button6: Button
    private lateinit var textView30: TextView
    private lateinit var button7: Button
    private lateinit var textView27: TextView
    var increment:Int=1;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.shirt5cart)

        button5 = findViewById(R.id.button5)
        button6 = findViewById(R.id.button6)
        button7 = findViewById(R.id.button7)
        textView30 = findViewById(R.id.textView30)
        textView27 = findViewById(R.id.textView27)
        val price=75000

        textView27.text=75000.toString()

        textView30.text=1.toString()




        button6.setOnClickListener{
            increment++

            textView30.text=increment.toString()

            textView27.text=(price*increment).toString()
        }

        button5.setOnClickListener{
            if(increment>1){
                increment--

                textView30.text=increment.toString()

                textView27.text=(price*increment).toString()}

        }

        button7.setOnClickListener{
            val intent= Intent(this,AnimationActivity::class.java)
            startActivity(intent)
        }

    }
}