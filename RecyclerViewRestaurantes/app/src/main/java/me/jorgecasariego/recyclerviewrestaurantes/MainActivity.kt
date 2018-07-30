package me.jorgecasariego.recyclerviewrestaurantes

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import me.jorgecasariego.recyclerviewrestaurantes.modelos.Restaurante

class MainActivity : AppCompatActivity() {

    // Paso 3: Crear modelo de datos
    val restaurantes = arrayListOf<Restaurante>(
            Restaurante(1, "La Cabrera", "https://media-cdn.tripadvisor.com/media/photo-f/06/c5/72/8e/la-cabrera.jpg"),
            Restaurante(2, "Mburicao", "https://media-cdn.tripadvisor.com/media/photo-f/04/2b/64/c4/mburicao-restaurante.jpg"),
            Restaurante(3, "Talleyran", "https://media-cdn.tripadvisor.com/media/photo-s/0d/3d/9b/9a/salmon-con-camarones.jpg"),
            Restaurante(4, "Bar San Roque", "https://media-cdn.tripadvisor.com/media/photo-s/0d/3d/9b/9a/salmon-con-camarones.jpg"),
            Restaurante(5, "Bolsi", "https://media-cdn.tripadvisor.com/media/photo-f/04/8b/27/c3/restaurante-bolsi.jpg")

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. Orientacion de las vistas en el RV
        lista_restaurantes.layoutManager = LinearLayoutManager(this)
        lista_restaurantes.adapter = MiAdaptador(restaurantes, {

            Toast.makeText(
                    this,
                    "Click en ${it.nombre}",
                    Toast.LENGTH_SHORT).show()
        })
    }
}
