package com.androidatc.holamundo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calcularEdadView.setOnClickListener { calcularEdad() }
    }

    private fun calcularEdad() {
        // 1. Ver si yearView no esta vacio
        if(yearView.text.toString().isEmpty()) {
            Toast.makeText(this, "Debe ingresar algun valor",
                    Toast.LENGTH_SHORT).show()
        } else {
            // 2. Si esta vacio mostrar un mensaje diciendo que agregue algun valor
            val year: Int = yearView.text.toString().toInt()
            Toast.makeText(this, "Año de nacimiento: $year",
                    Toast.LENGTH_SHORT).show()

            val resultado: Int = 2018 - year
            resultadoView.text = "Tu edad es $resultado"
        }
    }
}
