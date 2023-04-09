package com.example.binnaa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RatingBar
import android.widget.Toast

class popup_review : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        overridePendingTransition(0, 0)
        setContentView(R.layout.activity_popup_review)

        val ratingBar = findViewById<RatingBar>(R.id.ratingBar)

        ratingBar.onRatingBarChangeListener =
            RatingBar.OnRatingBarChangeListener { ratingBar, rating, fromUser -> // Do something with the new rating, for example:
                Toast.makeText(applicationContext, "New rating: $rating", Toast.LENGTH_SHORT).show()
            }

        // ...
    }
}