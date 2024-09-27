package com.example.cc17_3f_aboutme

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.ImageView

class AboutJeremiahActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_about_jeremiah)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.jeremiah)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
        val button: Button = findViewById(R.id.summon)
        imageView = findViewById(R.id.summoning)

        button.setOnClickListener(this)
    }
    override fun onClick(view: View?) {
        imageView.setImageResource(R.drawable.sum)
    }
}