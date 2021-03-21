package com.example.tema1android.activitati

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.tema1android.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toSecondActivity(view: View) {
        Intent(this,SecondActivity::class.java).also{
            startActivity(it)
        }
    }
}