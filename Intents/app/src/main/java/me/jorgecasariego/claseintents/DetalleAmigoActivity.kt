package me.jorgecasariego.claseintents

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detalle_amigo.*
import me.jorgecasariego.claseintents.R.id.*

class DetalleAmigoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_amigo)

        val extras = intent.extras ?: null

        if(extras == null) {
            finish()
        }

        val nombreAmigo = extras?.getString(PrincipalActivity.KEY_NOMBRE_AMIGO)
        amigo_textview.text = "Mi amigo invisible es $nombreAmigo"

        amazon_button.setOnClickListener { abrirNavegador() }
        llamar_button.setOnClickListener { llamar() }
        mapas_button.setOnClickListener { abrirMapas() }
        email_button.setOnClickListener { escribirCorreo() }
    }

    private fun escribirCorreo() {
        val direccionesCorreosAmigos =
                arrayOf("daenerys@gmail.com", "johnsnow@gmail.com", "cercei@gmail.com")

        val intent = Intent(Intent.ACTION_SEND)
        intent.setType("text/plain")
        intent.putExtra(Intent.EXTRA_SUBJECT, "Feliz dia amigos")
        intent.putExtra(Intent.EXTRA_TEXT, "Los quiero amigos!!")
        intent.putExtra(Intent.EXTRA_EMAIL, direccionesCorreosAmigos)

        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        }
    }

    private fun abrirMapas() {
        // Opción 1: el mapa se centra en la posicion pasada
//        val intent = Intent(
//                Intent.ACTION_VIEW,
//                Uri.parse("geo: -25.2951621,-57.5832257"))

        // Opción 2: Mostrar un cuadro de busqueda
//        val intent = Intent(
//                Intent.ACTION_VIEW,
//                Uri.parse("geo: -25.2951621,-57.5832257?q=Shopping")
//        )

        // OPcion 3: Mostrar la dirección exacta
        val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("geo: 0,0?q=Palma y 15 de agosto")
        )

        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        }

    }

    private fun llamar() {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("tel: 021-446544"))
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        }
    }

    private fun abrirNavegador() {
        val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("http://www.amazon.com"))

        if(intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        }
    }
}
