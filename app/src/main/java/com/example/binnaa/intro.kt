package com.example.binnaapplicationn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import com.example.binnaa.R
import com.example.binnaa.databinding.ActivityHomeBinding
import com.example.binnaa.databinding.ActivityIntroBinding

class intro : AppCompatActivity() {
    private lateinit var binding: ActivityIntroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntroBinding.inflate(layoutInflater)
        setContentView(binding.root)


       //activity without limits
        window.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)

        //click on both buttons
        binding.constraintLayoutLogin.setOnClickListener {
            startActivity(Intent(this,login::class.java))
        }


           binding.constraintLayoutSignup.setOnClickListener {
               startActivity(Intent(this,SignUP::class.java))
           }

    }
}