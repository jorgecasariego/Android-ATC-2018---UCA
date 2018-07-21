package com.androidatc.ejerciciofragments

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity(), Comunicador {

    var fragment2: Fragment2? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fragment2 = supportFragmentManager.findFragmentById(R.id.fragment2) as Fragment2?
    }

    override fun enviar(data: Int) {
        fragment2?.cambiarValorActual(data)

    }
}

