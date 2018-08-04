package me.jorgecasariego.claseintents

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_principal.*

class PrincipalActivity : AppCompatActivity() {

    companion object {
        val KEY_NOMBRE_AMIGO: String = "NOMBRE_AMIGO"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        val extras = intent.extras ?: null

        if (extras == null) {
            Toast.makeText(this, "No se reciben datos", Toast.LENGTH_LONG).show()
            finish()
        }

        val nombreUsuario = extras?.getString(LoginActivity.KEY_NOMBRE)
        nombre_usuario_textview.text = "Bienvenido $nombreUsuario"

        elegir_amigo_imageView.setOnClickListener { elegirAmigo() }
    }

    private fun elegirAmigo() {
        val amigos = arrayOf("Daenerys", "Tyrion", "Cercei", "Jaime", "Rock" ,"John")

        val indiceAmigo = (Math.random() * 6).toInt()

        val intent = Intent(this, DetalleAmigoActivity::class.java)
        intent.putExtra(KEY_NOMBRE_AMIGO, amigos.get(indiceAmigo))
        startActivity(intent)
    }


}
