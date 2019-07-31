package com.example.conexion.ui

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.widget.Toast
import com.example.conexion.R
import com.example.conexion.ui.fragment.MisDatosFragment
import com.example.conexion.ui.fragment.NoticiaFragment
import com.example.conexion.ui.fragment.NuevoCreyenteFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when(item.itemId){
            R.id.noticias -> {
                supportActionBar?.title = "Noticias"
                val nuevoCreyenteFragment = NoticiaFragment.newInstance()
                openFragment(nuevoCreyenteFragment)
                true
            }
            R.id.nuevo_creyente -> {
                supportActionBar?.title = "Nuevo creyente"
                val nuevoCreyenteFragment = NuevoCreyenteFragment.newInstance()
                openFragment(nuevoCreyenteFragment)
                true
            }
            R.id.mis_datos -> {
                supportActionBar?.title = "Mis datos"
                val nuevoCreyenteFragment = MisDatosFragment.newInstance()
                openFragment(nuevoCreyenteFragment)
                true
            }
            else -> {
                Toast.makeText(applicationContext, "Error", Toast.LENGTH_SHORT).show()
                true
            }
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        eventsActionBar()
        bottomNavigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }

    private fun eventsActionBar(){

        setSupportActionBar(toolbar_main)
        supportActionBar!!.setDisplayShowTitleEnabled(true)
    }

    private fun openFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frame_container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}
