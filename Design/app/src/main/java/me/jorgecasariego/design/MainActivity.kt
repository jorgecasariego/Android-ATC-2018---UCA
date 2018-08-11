package me.jorgecasariego.design

import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nombre_ciudad.setOnClickListener {
            cambiarCiudad()
        }
    }

    private fun cambiarCiudad() {
        val r = Random()
        var ciudadRandom = r.nextInt(4)

        when(ciudadRandom){
            0 -> {
                //Picasso.get().load(R.drawable.newyork).into(image_ciudad)
                nombre_ciudad.text = "New York"
                image_ciudad
                        .setImageDrawable(
                                ContextCompat
                                        .getDrawable(this, R.drawable.newyork))
            }
            1 -> {
                Picasso.get().load(R.drawable.cneloviedo).into(image_ciudad)
                nombre_ciudad.text = "Cnel. Oviedo"
            }
            2 -> {
                Picasso.get().load(R.drawable.asuncion).into(image_ciudad)
                nombre_ciudad.text = "Asunción"
            }
            3 -> {
                Picasso.get().load(R.drawable.paris).into(image_ciudad)
                nombre_ciudad.text = "Paris"
            }
        }
    }
}











