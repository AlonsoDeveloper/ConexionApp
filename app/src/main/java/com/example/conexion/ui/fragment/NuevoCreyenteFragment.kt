package com.example.conexion.ui.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.conexion.R


class NuevoCreyenteFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_nuevo_creyente, container, false)
    }

    companion object {
        fun newInstance(): NuevoCreyenteFragment = NuevoCreyenteFragment()
    }
}
