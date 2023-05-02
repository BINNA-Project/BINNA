package com.example.binnaa


import android.annotation.SuppressLint
import android.os.Bundle
import com.example.binnaa.R
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class interests : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.intrests)

        val preferenceBtns = listOf(
            findViewById<Button>(R.id.indoor_btn),
            findViewById<Button>(R.id.outdoor_btn),
            findViewById<Button>(R.id.both_btn),
        )

        val groupBtns = listOf(
            findViewById<Button>(R.id.family_btn),
            findViewById<Button>(R.id.alone_btn),
            findViewById<Button>(R.id.couple_btn),
            findViewById<Button>(R.id.others_btn),
        )
        val statuesbtns = listOf(
            findViewById<Button>(R.id.single_btn),
            findViewById<Button>(R.id.married_btn),
            findViewById<Button>(R.id.engaged_btn),
        )
        val placesbtns = listOf(
            findViewById<Button>(R.id.Amusment_btn),
            findViewById<Button>(R.id.Historical_btn),
            findViewById<Button>(R.id.Restaurant_btn),
            findViewById<Button>(R.id.Parks_btn),
            findViewById<Button>(R.id.Hotels_btn),
            findViewById<Button>(R.id.cafe_btn),
        )
        val creativitybtns = listOf(
            findViewById<Button>(R.id.art_btn),
            findViewById<Button>(R.id.craft_btn),
            findViewById<Button>(R.id.dancing_btn),
            findViewById<Button>(R.id.singing_btn),
            findViewById<Button>(R.id.photography_btn),
            findViewById<Button>(R.id.makingvideos_btn),
        )
        val sportsbtns = listOf(
            findViewById<Button>(R.id.football_btn),
            findViewById<Button>(R.id.basketball_btn),
            findViewById<Button>(R.id.swimming_btn),
            findViewById<Button>(R.id.bowling_btn),
            findViewById<Button>(R.id.boating_btn),
            findViewById<Button>(R.id.Athletics_btn),
            findViewById<Button>(R.id.boxing_btn),
            findViewById<Button>(R.id.gymanistic_btn),
            findViewById<Button>(R.id.badminton_btn),
        )

        var selectedpreference: String? = null
        var selectedGroup: String? = null
        var selectedstatues: String? = null
        var selectedplaces: String? = null
        var selectedcreativity: String? = null
        var selectedsports: String? = null

        preferenceBtns.forEach { button ->
            button.setOnClickListener {
                selectedpreference = button.text.toString()
            }
        }

        groupBtns.forEach { button ->
            button.setOnClickListener {
                selectedGroup = button.text.toString()
            }
        }
        statuesbtns.forEach { button ->
            button.setOnClickListener {
                selectedstatues = button.text.toString()
            }
        }
        placesbtns.forEach { button ->
            button.setOnClickListener {
                selectedplaces = button.text.toString()
            }
        }
        creativitybtns.forEach { button ->
            button.setOnClickListener {
                selectedcreativity = button.text.toString()
            }
        }
        sportsbtns.forEach { button ->
            button.setOnClickListener {
                selectedsports = button.text.toString()
            }
        }
// backend of submit button

    }
}
// i will continue