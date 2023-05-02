package com.example.binnaa

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import android.widget.TextView

class Content_home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content_home)

        val restaurantImage = findViewById<ImageView>(R.id.restaurant_image)
        restaurantImage.setImageResource(R.drawable.img_2)

        val restaurantText = findViewById<TextView>(R.id.restaurant_text)
        restaurantText.text = getString(R.string.Restaurants_text_view)

        val cafesImage = findViewById<ImageView>(R.id.cafes_image)
        cafesImage.setImageResource(R.drawable.img_1)

        val cafesText = findViewById<TextView>(R.id.cafes_text)
        cafesText.text = getString(R.string.Cafes_text_view)

        val parksImage = findViewById<ImageView>(R.id.parks_image)
        parksImage.setImageResource(R.drawable.img_4)

        val parksText = findViewById<TextView>(R.id.parks_text)
        parksText.text = getString(R.string.Parks_text_view)

        val amusementImage = findViewById<ImageView>(R.id.amusement_image)
        amusementImage.setImageResource(R.drawable.img_3)

        val amusementText = findViewById<TextView>(R.id.amusement_text)
        amusementText.text = getString(R.string.Amusement_Parks_text_view)
    }
}
