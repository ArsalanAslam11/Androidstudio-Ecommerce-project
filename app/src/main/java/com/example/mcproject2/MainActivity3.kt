package com.example.mcproject2

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import com.example.mcproject2.BlankFragment


class MainActivity3 : AppCompatActivity() {
    private lateinit var myTextView: TextView
    private lateinit var Text2: EditText
    private lateinit var textView12: TextView
    private lateinit var fragmentManager: FragmentManager
    private lateinit var imageview5: ImageView
    private lateinit var imageView6: ImageView
    private lateinit var imageView7: ImageView
    private lateinit var imageView8: ImageView
    private lateinit var image3: ImageView
    private lateinit var image2: ImageView
    private lateinit var Layout1: LinearLayout
    private lateinit var Layout2: LinearLayout
    private lateinit var Layout3: LinearLayout
    private lateinit var Layout4: LinearLayout






    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        myTextView = findViewById(R.id.textView13)
        textView12 = findViewById(R.id.textView12)
        imageview5 = findViewById(R.id.imageView5)
        imageView6= findViewById(R.id.imageView6)
        imageView7= findViewById(R.id.imageView7)
        imageView8= findViewById(R.id.imageView8)
        image2= findViewById(R.id.image2)
        image3= findViewById(R.id.image3)
        Layout1=findViewById(R.id.Layout1)
        Layout2=findViewById(R.id.Layout2)
        Layout3=findViewById(R.id.Layout3)
        Layout4=findViewById(R.id.Layout4)



        image2.setOnClickListener{
            val fragmentManager: FragmentManager = supportFragmentManager
            fragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, BlankFragment2())
                .setReorderingAllowed(true)
                .addToBackStack("name")
                .commit()
}
        image3.setOnClickListener{
            val fragmentManager: FragmentManager = supportFragmentManager
            fragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, BlankFragment4())
                .setReorderingAllowed(true)
                .addToBackStack("name")
                .commit()
        }

        myTextView.setOnClickListener {
            myTextView.setBackgroundColor(Color.parseColor("#808080"))
            textView12.text="Popular Products"
            Layout2.setBackgroundColor(Color.TRANSPARENT)
            Layout3.setBackgroundColor(Color.TRANSPARENT)
            Layout4.setBackgroundColor(Color.TRANSPARENT)
            Layout1.setBackgroundColor(Color.TRANSPARENT)
            val fragmentManager: FragmentManager = supportFragmentManager
            fragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, BlankFragment())
                .setReorderingAllowed(true)
                .addToBackStack("name")
                .commit()


        }
        imageview5.setOnClickListener {
            Layout1.setBackgroundColor(Color.parseColor("#808080"))
            Layout2.setBackgroundColor(Color.TRANSPARENT)
            Layout3.setBackgroundColor(Color.TRANSPARENT)
            Layout4.setBackgroundColor(Color.TRANSPARENT)
            myTextView.setBackgroundColor(Color.TRANSPARENT)
            textView12.text="Mobile Phones"
            val fragmentManager: FragmentManager = supportFragmentManager
            fragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, BlankFragment2())
                .setReorderingAllowed(true)
                .addToBackStack("name")
                .commit()


        }
        imageView6.setOnClickListener {
            Layout2.setBackgroundColor(Color.parseColor("#808080"))
            Layout1.setBackgroundColor(Color.TRANSPARENT)
            Layout3.setBackgroundColor(Color.TRANSPARENT)
            Layout4.setBackgroundColor(Color.TRANSPARENT)
            myTextView.setBackgroundColor(Color.TRANSPARENT)
            textView12.text="Shirts"

            val fragmentManager: FragmentManager = supportFragmentManager
            fragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, BlankFragment3())
                .setReorderingAllowed(true)
                .addToBackStack("name")
                .commit()
        }
        imageView7.setOnClickListener {
            Layout3.setBackgroundColor(Color.parseColor("#808080"))
            Layout2.setBackgroundColor(Color.TRANSPARENT)
            Layout1.setBackgroundColor(Color.TRANSPARENT)
            Layout4.setBackgroundColor(Color.TRANSPARENT)
            myTextView.setBackgroundColor(Color.TRANSPARENT)
            textView12.text="Shoes"

            val fragmentManager: FragmentManager = supportFragmentManager
            fragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, BlankFragment4())
                .setReorderingAllowed(true)
                .addToBackStack("name")
                .commit()
        }

        imageView8.setOnClickListener {
            Layout4.setBackgroundColor(Color.parseColor("#808080"))
            Layout2.setBackgroundColor(Color.TRANSPARENT)
            Layout3.setBackgroundColor(Color.TRANSPARENT)
            Layout1.setBackgroundColor(Color.TRANSPARENT)
            myTextView.setBackgroundColor(Color.TRANSPARENT)
            textView12.text="All Products"
            val fragmentManager: FragmentManager = supportFragmentManager
            fragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, BlankFragment5())
                .setReorderingAllowed(true)
                .addToBackStack("name")
                .commit()
        }

    }
}