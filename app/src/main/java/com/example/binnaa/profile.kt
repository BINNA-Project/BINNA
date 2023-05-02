package com.example.binnaa

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class profile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // Get references to the five buttons
        val button1 = findViewById<Button>(R.id.personal_info)
        val button2 = findViewById<Button>(R.id.points)
        val button3 = findViewById<Button>(R.id.uploaded_images)
        val button4 = findViewById<Button>(R.id.favourite)
        val button5 = findViewById<Button>(R.id.logout)

        // Set click listeners for each button
        button1.setOnClickListener {
            // Code to execute when button1 is clicked
        }

        button2.setOnClickListener {
            // Code to execute when button2 is clicked
        }

        button3.setOnClickListener {
            // Code to execute when button3 is clicked
        }

        button4.setOnClickListener {
            // Code to execute when button4 is clicked
        }

        button5.setOnClickListener {
            // Code to execute when button5 is clicked
        }
    }
}
