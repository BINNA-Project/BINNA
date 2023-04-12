package com.example.binnaa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.binnaa.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //val lets_start_btn = findViewById<Button>(R.id.lets_start_btn)


        binding.letsStartBtn.setOnClickListener {

        //twadini 3ala page el intro
            startActivity(Intent(this , intro::class.java ))

        }




    }




    }














