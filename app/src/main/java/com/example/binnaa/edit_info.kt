package com.example.binnaa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton


class edit_info : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_info)

        val saveChangesButton = findViewById<AppCompatButton>(R.id.logout)
        saveChangesButton.setOnClickListener {
        }
    }
}
