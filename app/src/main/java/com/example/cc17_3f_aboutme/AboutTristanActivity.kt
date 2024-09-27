package com.example.cc17_3f_aboutme

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.animation.ObjectAnimator
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.view.View
import android.widget.Button
import android.widget.ImageView

class AboutTristanActivity : AppCompatActivity() {

    private lateinit var profileImage: ImageView
    private lateinit var catImage: ImageView
    private lateinit var flipButton: Button
    private var isProfileShowing = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_about_tristan)


        profileImage = findViewById(R.id.profile)
        catImage = findViewById(R.id.cat)
        flipButton = findViewById(R.id.btn)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        catImage.visibility = View.GONE

        flipButton.setOnClickListener {
            flipImages()
        }
    }

    private fun flipImages() {
        val currentImage = if (isProfileShowing) profileImage else catImage
        val nextImage = if (isProfileShowing) catImage else profileImage


        val flipOutAnimation = ObjectAnimator.ofFloat(currentImage, "rotationY", 0f, 90f).apply {
            duration = 200
            addListener(object : AnimatorListenerAdapter() {
                override fun onAnimationEnd(animation: Animator) {

                    currentImage.visibility = View.GONE
                    nextImage.visibility = View.VISIBLE

                    ObjectAnimator.ofFloat(nextImage, "rotationY", -90f, 0f).start()
                }
            })
        }

        flipOutAnimation.start()
        isProfileShowing = !isProfileShowing
    }

}
