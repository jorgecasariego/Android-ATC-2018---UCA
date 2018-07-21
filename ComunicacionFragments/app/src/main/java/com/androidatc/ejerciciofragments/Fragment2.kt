package com.androidatc.ejerciciofragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_dos.*


class Fragment2 : Fragment() {

    companion object {
        fun newInstance():Fragment2 {
            return Fragment2()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_dos, container, false)
    }

    fun cambiarValorActual(nuevoValor: Int) {
        valor.setText(" - $nuevoValor - ")
    }


}
