package me.jorgecasariego.fragmentdinamico

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        pastelitoView.setOnClickListener {
            mostrarComida(PastelitoFragment.newInstance()) }

        bifeCaballoView.setOnClickListener {
            mostrarComida(FragmentLomitoCaballo.newInstance()) }

        caldoPezcadoView.setOnClickListener {
            mostrarComida(PezcadoFragment.newInstance()) }

    }

    fun mostrarComida(comidaFragment: Fragment) {
        logo.visibility = View.GONE
        supportFragmentManager
                .beginTransaction()
                .replace(R.id.contenedor, comidaFragment)
                .commit()
    }
}
