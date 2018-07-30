package me.jorgecasariego.recyclerviewrestaurantes

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.restaurante_row.view.*
import me.jorgecasariego.recyclerviewrestaurantes.modelos.Restaurante

class MiAdaptador(val listaRestaurantes: List<Restaurante>,
                  val listener: (Restaurante) -> Unit)

    : RecyclerView.Adapter<MiAdaptador.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {
        val view = LayoutInflater
                .from(parent.context)
                .inflate(R.layout.restaurante_row, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount() = listaRestaurantes.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) =
        holder.bind(listaRestaurantes[position], listener)

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bind(item: Restaurante, listener: (Restaurante) -> Unit) {

            with(itemView) {
                nombre_restaurante.text = item.nombre
                Picasso.get().load(item.url).into(imagen_restaurante)
                setOnClickListener { listener(item) }
            }
        }

    }

}