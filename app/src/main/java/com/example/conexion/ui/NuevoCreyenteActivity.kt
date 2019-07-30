package com.example.conexion.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.conexion.R
import kotlinx.android.synthetic.main.activity_nuevo_creyente.*

class NuevoCreyenteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nuevo_creyente)

        btnEnviar.setOnClickListener {
            Toast.makeText(applicationContext, "Aún falta programar! :p", Toast.LENGTH_LONG).show()
        }
    }
}
