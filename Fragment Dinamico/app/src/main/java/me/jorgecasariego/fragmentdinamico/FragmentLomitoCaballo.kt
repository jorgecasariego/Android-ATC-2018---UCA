package me.jorgecasariego.fragmentdinamico


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class FragmentLomitoCaballo : Fragment() {

    companion object {
        fun newInstance(): FragmentLomitoCaballo {
            return FragmentLomitoCaballo()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_fragment_uno, container, false)
    }


}
