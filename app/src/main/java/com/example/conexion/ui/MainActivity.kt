package com.example.conexion.ui

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.conexion.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        onFabClickEvent()
    }

    private fun onFabClickEvent(){
        fabCrearNuevoCreyente.setOnClickListener {
            goToNuevoCreyenteActivity()
        }
    }

    private fun goToNuevoCreyenteActivity(){
        val nuevoCreyenteActivity = Intent(applicationContext, NuevoCreyenteActivity::class.java)
        startActivity(nuevoCreyenteActivity)
    }
}
