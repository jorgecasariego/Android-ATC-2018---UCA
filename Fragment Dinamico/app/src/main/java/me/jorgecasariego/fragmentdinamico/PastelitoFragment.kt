package me.jorgecasariego.fragmentdinamico


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class PastelitoFragment : Fragment() {

    companion object {
        fun newInstance() = PastelitoFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_pastelito, container, false)
    }


}
