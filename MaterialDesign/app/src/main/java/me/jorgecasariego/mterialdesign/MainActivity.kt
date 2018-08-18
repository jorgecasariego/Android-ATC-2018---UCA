package me.jorgecasariego.mterialdesign

import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.app.Fragment
import android.support.v4.view.GravityCompat
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import me.jorgecasariego.mterialdesign.fragmemt.Opcion1
import me.jorgecasariego.mterialdesign.fragmemt.Opcion2
import me.jorgecasariego.mterialdesign.fragmemt.Opcion3
import me.jorgecasariego.mterialdesign.fragmemt.Opcion4

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(my_toolbar as Toolbar)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_nav_menu)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        nav_view.setNavigationItemSelectedListener(this)

        fab.setOnClickListener {
            Toast.makeText(this, "Click sobre fab", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onNavigationItemSelected(menu: MenuItem): Boolean {
        when(menu.itemId) {
            R.id.menu_opcion1 -> cambiarFragment(Opcion1.newInstance())
            R.id.menu_opcion2 -> cambiarFragment(Opcion2.newInstance())
            R.id.menu_opcion3 -> cambiarFragment(Opcion3.newInstance())
            R.id.menu_opcion4 -> cambiarFragment(Opcion4.newInstance())
        }

        drawer.closeDrawers()

        return true
    }

    private fun cambiarFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
                .add(R.id.contenedor, fragment)
                .addToBackStack(null)
                .commit()
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId) {
            android.R.id.home -> drawer.openDrawer(GravityCompat.START)
        }

        return true
    }


}
