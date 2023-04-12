package com.example.binnaa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.binnaa.databinding.ActivitySignupBinding
import com.example.binnaa.userdataclass.UserIfromation
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase


class SignUP : AppCompatActivity() {
    private lateinit var firstName :String
    private lateinit var lastName :String
    private lateinit var email :String
    private lateinit var password :String
    private lateinit var confirmPass :String
    private lateinit var gander :String
    private lateinit var binding : ActivitySignupBinding
    private lateinit var database :DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.radioGroup.setOnCheckedChangeListener{group ,chechedID ->
            if (chechedID== R.id.maleRadio){
                gander=binding.maleRadio.text.toString()
            }
           else if (chechedID==R.id.femaleRadio){
                gander=binding.femaleRadio.text.toString()
            }
        }
        binding.signupBTN.setOnClickListener {
            validation()

        }

        binding.backArrow.setOnClickListener {

            startActivity(Intent(this , intro::class.java ))
        }


    }
    private fun validation () :String?{
        firstName=binding.fristname.text.toString()
        lastName=binding.lastnamee.text.toString()
        email=binding.userEmail.text.toString()
        password=binding.userPassword.text.toString()
        confirmPass=binding.confirmUserPassword.text.toString()
        if (firstName.isEmpty()){
            binding.fristname.error="enter your first name"
            binding.Fname.helperText="enter your first name"

        }
        else if (lastName.isEmpty()){
            binding.lastname.error="enter your last name"
            binding.lastname.helperText="enter your last name"
        }
        else if(email.isEmpty()){
            binding.email.error="enter your email"
            binding.email.helperText="enter your  email"
        }
        else if (password.length<7 && password.isEmpty()){
            binding.password.error="Enter password"
            binding.password.helperText="Password should be more then 7"

        }
        else if (confirmPass.isEmpty()){
            binding.confirmpassword.error="password not matching"
            binding.confirmpassword.helperText="password not matching"


        }
        else if (confirmPass !=password)
        else if (!binding.maleRadio.isChecked && !binding.femaleRadio.isChecked){
            Toast.makeText(this,"Check your gander",Toast.LENGTH_LONG).show()
        }
        else{
            database=FirebaseDatabase.getInstance("https://binna2-default-rtdb.firebaseio.com/").getReference("Users")
            val user=UserIfromation(firstName,lastName,email,gander)
            database.push().child(firstName).setValue(user).addOnCompleteListener() {
                binding.fristname.text?.clear()
                binding.lastnamee.text?.clear()
                binding.userEmail.text?.clear()
                binding.userPassword.text?.clear()
                binding.confirmUserPassword.text?.clear()

                Toast.makeText(this,"done",Toast.LENGTH_LONG).show()
            }
        }


        return null

    }
}