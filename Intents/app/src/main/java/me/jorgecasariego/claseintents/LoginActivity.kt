package me.jorgecasariego.claseintents

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    companion object {
        val KEY_NOMBRE: String = "KEY_NOMBRE"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        registrarse_button.setOnClickListener {
            registrarUsuario()
        }
    }

    private fun registrarUsuario() {
        val nombreUsuario = nombre_edittext.text.toString()

        if(nombreUsuario.isEmpty()) {
            Toast.makeText(this,
                    "No se puede registrar un usuario sin nombre",
                    Toast.LENGTH_LONG).show()
        } else {
            val intent = Intent(this, PrincipalActivity::class.java)
            intent.putExtra(KEY_NOMBRE, nombreUsuario)
            startActivity(intent)
        }


    }
}
