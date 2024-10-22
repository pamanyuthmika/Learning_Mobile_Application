package com.example.gym

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class page3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page3)

        val imageView15: ImageView = findViewById<ImageView>(R.id.imageView15)
        imageView15.setOnClickListener {
            val intent = Intent(this, page4::class.java)
            startActivity(intent)

        }
        val imageView16: ImageView = findViewById<ImageView>(R.id.imageView16)
        imageView16.setOnClickListener {
            val intent = Intent(this, page6::class.java)
            startActivity(intent)
        }

        val imageView18: ImageView = findViewById<ImageView>(R.id.imageView18)
        imageView18.setOnClickListener {
            val intent = Intent(this, page7::class.java)
            startActivity(intent)
        }
        var button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            val intent1 = Intent(this, page2::class.java)
            startActivity(intent1)
        }
    }
}