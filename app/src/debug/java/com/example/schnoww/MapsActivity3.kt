package com.example.schnoww

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity3 : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps3)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in Sydney and move the camera
        val loch = LatLng(48.29457718637893, -89.34828784306667)

        mMap.addMarker(MarkerOptions().position(loch).title("Adrenanline place #1"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(loch))




        val avi = LatLng(48.378199360979416, -89.31493116700427)

        mMap.addMarker(MarkerOptions().position(avi).title("Adrenaline place #2"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(avi))




        val csf = LatLng(48.41218531524773, -89.24517408657138)

        mMap.addMarker(MarkerOptions().position(csf).title("Aomantic place #3"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(csf))




        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(csf,12f ))


        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Adrenaline Locations"
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}