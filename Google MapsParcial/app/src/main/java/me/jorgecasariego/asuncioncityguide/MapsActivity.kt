package me.jorgecasariego.asuncioncityguide

import android.content.pm.PackageManager
import android.location.Location
import android.os.Bundle
import android.support.v4.app.ActivityCompat
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity : AppCompatActivity(),
        OnMapReadyCallback, GoogleMap.OnMarkerClickListener {

    companion object {
        private const val LOCATION_PERMISSION_REQUEST_CODE = 1
    }

    private lateinit var mMap: GoogleMap
    private lateinit var fusedLocationProviderClient: FusedLocationProviderClient
    private lateinit var lastLocation: Location

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)

        val mapFragment = supportFragmentManager
                .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)

        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this)
    }

    private fun setupMap() {
        if (ActivityCompat.checkSelfPermission(
                        this,
                        android.Manifest.permission.ACCESS_FINE_LOCATION) !=

                PackageManager.PERMISSION_GRANTED) {

            ActivityCompat.requestPermissions(this,
                    arrayOf(android.Manifest.permission.ACCESS_FINE_LOCATION),
                    LOCATION_PERMISSION_REQUEST_CODE)

            return
        }

        mMap.isMyLocationEnabled = true
        fusedLocationProviderClient.lastLocation.addOnSuccessListener { location ->
            if(location != null) {
                lastLocation = location
                val posicionActual = LatLng(location.latitude, location.longitude)
                placeMarkerOnMap(posicionActual)
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(posicionActual, 16F))
            }
        }
    }

    private fun placeMarkerOnMap(posicionActual: LatLng) {
        val markerOptions = MarkerOptions().position(posicionActual)
        mMap.addMarker(markerOptions)
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        if (requestCode == LOCATION_PERMISSION_REQUEST_CODE) {
            if(grantResults.size > 0 && grantResults.get(0) == PackageManager.PERMISSION_GRANTED){
                Toast.makeText(this, "Permiso concedido!!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, " :( ", Toast.LENGTH_LONG).show()
                finish()
            }
        }
    }


    override fun onMarkerClick(p0: Marker?): Boolean {
        Toast.makeText(
                this,
                "Click sobre marcador " + p0?.title,
                Toast.LENGTH_SHORT).show()

        return true
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        mMap.uiSettings.isZoomControlsEnabled = true

        // Add a marker in Sydney and move the camera
//        val sydney = LatLng(-34.0, 151.0)
//        mMap.addMarker(MarkerOptions().position(sydney).title("Marker in Sydney"))
//        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney))
//
//        val ucaSedeCampus = LatLng(-25.324187, -57.639729)
//        mMap.addMarker(MarkerOptions().position(ucaSedeCampus).title("Campus UCA"))
//        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ucaSedeCampus, 10F))
//
//        mMap.setOnMarkerClickListener(this)

        setupMap()
    }
}
