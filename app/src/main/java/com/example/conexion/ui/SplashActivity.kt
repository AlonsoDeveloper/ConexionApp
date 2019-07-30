package com.example.conexion.ui

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.conexion.R

class SplashActivity : AppCompatActivity() {

    private val splashTime = 3000L
    private lateinit var myHandler : Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        myHandler = Handler()

        myHandler.postDelayed({
            goToMainActivity()
        }, splashTime)
    }

    private fun goToMainActivity(){
        val mainActivity = Intent(applicationContext, MainActivity::class.java)
        startActivity(mainActivity)
        finish()
    }
}
