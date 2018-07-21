package com.androidatc.ejerciciofragments


import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.androidatc.ejerciciofragments.R.id.enviar
import kotlinx.android.synthetic.main.fragment_uno.*

/**
 * 1. Kotlin tiene unas cuantas diferencias con respecto a Java, entre las que se destacan la omisión  de miembros y metodos estaticos.
 *
 * 2. En java es comun añadir un metodo estatico llamadao "newInstance" en cada fragmento.
 *
 * 3. La documentación oficial de Android [1] recomienda seguir este patron porque permite separar verticalmente el fragmento de la actividad en que se aloja. Mantiene los componentes de la
 *      aplicación modular.
 *
 *    Dado que el código del fragmento no sabe nada de la actividad donde se encuentra alojada,
 *    no tendrá que ocuparse de la refactorización si decide alojar este mismo fragmento en otro
 *    lugar en el futuro. Toda la información necesaria para crear el fragmento es independiente
 *    dentro del código del fragmento.
 *
 *  3.1 En java podemos crear un Fragment de 2 maneras: utilizando un constructor y utilizando el
 *      metodo estatico newInstance creado por nosotros. ¿Cual es la ventaja de usar el segundo
 *      metodo, especialmente si a nuestro fragment le pasamos argumentos?
 *      Si Android decide recrear en algún momento nuestro fragment, Android va a hacerlo llamando
 *      al constructor sin-argumentos. Si nosotros sobreescribiamos un constructor pasandole argumentos
 *      ésta no será llamada.
 *
 *      Con esto dicho, la manera de pasarle argumentos a nuestro fragment para que puedan luego estar
 *      disponibles luego de que el fragment fue recreado por Android es pasando un Bundle al metodo
 *      setArguments. Y luego en el método onCreate() del Fragment podemos acceder a estas variables.
 *
 *      Este Bundle incluso estará disponible si el fragment en algun momento es recreado.
 *
 * 4. Como Kotlin no cuenta con variables y metodos estaticos entonces la manera de realizar este
 *      mismo patron es utilizando "companion object"
 *
 * 5. Cuando una variable o un metodo es declarado como parte del "companion object", es posible luego
 *      usar este metodo o variable como si fueran metodos estaticos en Java. La diferencia en kotlin
 *      es que los companion objects son más versatiles. Los items declarados e un companion object
 *      son instancias de objetos reales, lo cual significa que pueden implementar interfaces.
 *
 * [1] https://developer.android.com/reference/android/app/Fragment
 */
class Fragment1 : Fragment() {
    var comunicador: Comunicador? = null
    var contador: Int = 1

    override fun onAttach(context: Context?) {
        super.onAttach(context)

        if (context is MainActivity) {
            comunicador = context
        }
    }

    companion object {
        fun newInstance(): Fragment1 {
            return Fragment1()
        }
    }

    /*
        1. Las actividades utilizan el metodo setContentView() para especficar el XML que define el layout
        de la actividad. Los fragments crean su jerarquía de vistas cuando se realiza la llamada al
        metodo onCreateView()

        2. El tercer parametro del metodo inflate especifica si el fragmento "inflado" debería añadirse
        al container. El container es la vista superior que contendrá la jerarquía de vistas del
        fragmento. Debemos siempre setear este parametro a false y dejar que el fragmentManager se
        encargue de añadir este fragmento al container.
     */
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_uno, container, false)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        enviar.setOnClickListener { enviarAccion() }
    }

    fun enviarAccion() {
        comunicador?.enviar(contador++)
    }


}
