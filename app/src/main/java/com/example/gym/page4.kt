package com.example.gym

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class page4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page4)

        var button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            val intent1 = Intent(this, page3::class.java)
            startActivity(intent1)
        }
    }
}