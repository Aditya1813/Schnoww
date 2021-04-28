package com.example.schnoww

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity4 : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps4)
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
        val alz = LatLng(48.43571959075453, -89.21713893606682)

        mMap.addMarker(MarkerOptions().position(alz).title("Grace place #1"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(alz))




        val vol1 = LatLng(48.40689713923266, -89.24288814301644)

        mMap.addMarker(MarkerOptions().position(vol1).title("Grace place #2"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(vol1))




        val shlthos = LatLng(48.38451590751175, -89.24319863262465)

        mMap.addMarker(MarkerOptions().position(shlthos).title("Grace place #3"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(shlthos))






        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(shlthos,12f ))


        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Grace Locations"
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}