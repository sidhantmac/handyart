package com.example.myapplication

import android.R.attr.value
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun registerUser(v: View?) {
        val myIntent = Intent(this, RegistrationActivity::class.java)
        startActivity(myIntent)
    }

    fun loginUser(v: View?) {
        val myIntent = Intent(this, RegistrationActivity::class.java)
        startActivity(myIntent)
    }
}