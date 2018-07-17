package com.androidatc.calculadora

import android.app.Activity
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // https://kotlinlang.org/docs/reference/operator-overloading.html
        sumarView.setOnClickListener {
            evaluar(valor1View.text.toString().toInt(),
                    valor2View.text.toString().toInt(), Int::plus)
        }

        restarView.setOnClickListener {
            evaluar(valor1View.text.toString().toInt(),
                    valor2View.text.toString().toInt(), Int::minus)
        }
        limpiarView.setOnClickListener { limpiarPantalla() }
    }

    private fun limpiarPantalla() {
        resultadoView.text.clear()
        valor1View.text.clear()
        valor2View.text.clear()
    }

    private fun evaluar(a: Int, b: Int, fn:(Int, Int) -> Int) {
        if(isEmtpy()) {
            toast("No pueden quedar valores vacios")
        } else {
            resultadoView.setText("${fn(a, b)}")
        }
    }

    fun isEmtpy() = valor1View.text.toString().isEmpty() && valor2View.text.toString().isEmpty()

    fun Activity.toast(mensaje: String, duracion: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, mensaje, duracion).show()
    }

}
