package com.example.binnaa

import android.os.Bundle
import android.widget.RadioButton
import android.widget.TextView
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity



class popup_filter : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_popup_filter)

        // Accessing the radio buttons and text views
        val indoorRadioButton = findViewById<RadioButton>(R.id.indooor)
        val outdoorRadioButton = findViewById<RadioButton>(R.id.outdoor)
        val cafesRadioButton = findViewById<RadioButton>(R.id.cafes)
        val parksRadioButton = findViewById<RadioButton>(R.id.Parks)
        val hotelsRadioButton = findViewById<RadioButton>(R.id.hotels)
        val restaurantRadioButton = findViewById<RadioButton>(R.id.Restaurant)
        val historicalPlacesRadioButton = findViewById<RadioButton>(R.id.historical_places)
        val amusementParkRadioButton = findViewById<RadioButton>(R.id.amusment_park)
        val preferencesTextView = findViewById<TextView>(R.id.textView4)
        val placesTextView = findViewById<TextView>(R.id.places_you_prefer)

        // Setting listeners for the radio buttons
        indoorRadioButton.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                // Do something when the indoor radio button is checked
            }
        }

        outdoorRadioButton.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                // Do something when the outdoor radio button is checked
            }
        }

        cafesRadioButton.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                // Do something when the cafes radio button is checked
            }
        }

        parksRadioButton.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                // Do something when the parks radio button is checked
            }
        }

        hotelsRadioButton.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                // Do something when the hotels radio button is checked
            }
        }

        restaurantRadioButton.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                // Do something when the restaurant radio button is checked
            }
        }

        historicalPlacesRadioButton.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                // Do something when the historical places radio button is checked
            }
        }

        amusementParkRadioButton.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                // Do something when the amusement park radio button is checked
            }
        }

        // Setting the text of the text views
        preferencesTextView.text = getString(R.string.prefrencess)
        placesTextView.text = getString(R.string.places_you_prefer2)
    }
}
