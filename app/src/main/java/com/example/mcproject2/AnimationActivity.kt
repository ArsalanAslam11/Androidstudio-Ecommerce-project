package com.example.mcproject2

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.airbnb.lottie.LottieAnimationView

class AnimationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.animation)

        val lottieAnimationView:LottieAnimationView=findViewById(R.id.lottieAnimationView)
        lottieAnimationView.setAnimation(R.raw.truck)
        lottieAnimationView.playAnimation()
        lottieAnimationView.loop(true)




    }
}