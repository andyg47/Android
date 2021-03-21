package com.example.tema1android.activitati

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.tema1android.R
import com.example.tema1android.fragmente.FourthFr
import com.example.tema1android.fragmente.SecondFr
import com.example.tema1android.fragmente.ThirdFr

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        var fragment=SecondFr()
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.FrameLayout,fragment)
            commit()
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finishAffinity()
    }

    fun Close(view: View)
    {
        this.finish()
    }

    fun toThirdFr(view: View)
    {
        var fragment=FourthFr()
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.FrameLayout,fragment)
            commit()
        }

    }

    fun toSecondFr(view: View)
    {
        var fragment=ThirdFr()
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.FrameLayout,fragment)
            commit()
        }

    }

    fun toFirstFr(view: View)
    {
        var fragment=SecondFr()
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.FrameLayout,fragment)
            commit()
        }

    }
}