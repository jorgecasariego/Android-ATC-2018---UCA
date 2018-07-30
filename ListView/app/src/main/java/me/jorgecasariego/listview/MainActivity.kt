package me.jorgecasariego.listview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // 1. Datos
    val elementos = arrayOf(
            "Elemento 1",
            "Elemento 2",
            "Elemento 3",
            "Elemento 4","Elemento 1",
            "Elemento 2",
            "Elemento 3",
            "Elemento 4","Elemento 1",
            "Elemento 2",
            "Elemento 3",
            "Elemento 4","Elemento 1",
            "Elemento 2",
            "Elemento 3",
            "Elemento 4")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 2. Creamos nuestro adapter
        val adaptador = ArrayAdapter<String>(
                this,
                R.layout.simple_row,
                elementos)

        mi_lista.adapter = adaptador
    }
}
