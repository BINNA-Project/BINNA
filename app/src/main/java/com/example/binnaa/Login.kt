package com.example.binnaa
import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Patterns
import android.widget.Toast
import com.example.binnaa.databinding.ActivityLoginBinding
import com.google.firebase.FirebaseApp
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class Login : AppCompatActivity() {
    private lateinit var binding:ActivityLoginBinding
    private lateinit var sEmail : String
    private lateinit var  sPassword :String
    private lateinit var firebaseApp :FirebaseApp

    private lateinit var auth :FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding= ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        auth= Firebase.auth
        firebaseApp= FirebaseApp.initializeApp(applicationContext)!!
        binding.loginBtn.setOnClickListener {
               validation()
        }


        binding.backarrow.setOnClickListener {

            startActivity(Intent(this , intro::class.java ))
        }
    }
    private fun validation():String?{
        sEmail=binding.emailEditText.text.toString()
        sPassword=binding.passwordEditText.text.toString()
        if (!Patterns.EMAIL_ADDRESS.matcher(sEmail).matches() &&sEmail.isEmpty()){
            Toast.makeText(baseContext, "Enter your Email correctly",
                Toast.LENGTH_SHORT).show()
            binding.emailEditText.requestFocus()

        }
        else if (sPassword.isEmpty()){
            binding.passwordEditText.requestFocus()
        }
        else {
            auth.signInWithEmailAndPassword(binding.emailEditText.text.toString(),binding.passwordEditText.text.toString())
                .addOnCompleteListener{task->
                    if (task.isSuccessful) {
                        startActivity(Intent(this,Home::class.java))
                    }
                    else{
                        Log.w(TAG, "signInWithEmail:failure", task.exception)
                        Toast.makeText(baseContext, "Authentication failed."+task.exception,
                            Toast.LENGTH_SHORT).show()
                    }
                }
        }
        return null


    }
}