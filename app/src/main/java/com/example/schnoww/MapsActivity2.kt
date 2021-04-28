package com.example.schnoww

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity2 : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps2)
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
            val icer = LatLng(48.4341553230978, -89.21701843724826)

            mMap.addMarker(MarkerOptions().position(icer).title("Sport place #1"))
            mMap.moveCamera(CameraUpdateFactory.newLatLng(icer))


            val uni = LatLng(48.42144121776313, -89.26639017244311)

            mMap.addMarker(MarkerOptions().position(uni).title("Sport place #2"))
            mMap.moveCamera(CameraUpdateFactory.newLatLng(uni))


            val soccer = LatLng(48.393686258706225, -89.2661443187116)

            mMap.addMarker(MarkerOptions().position(soccer).title("Sport place #3"))
            mMap.moveCamera(CameraUpdateFactory.newLatLng(soccer))


        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(icer,12f ))

            val actionbar = supportActionBar
            //set actionbar title
            actionbar!!.title = "Sport Locations"
            //set back button
            actionbar.setDisplayHomeAsUpEnabled(true)
            actionbar.setDisplayHomeAsUpEnabled(true)
        }

        override fun onSupportNavigateUp(): Boolean {
            onBackPressed()
            return true

        }
    }
