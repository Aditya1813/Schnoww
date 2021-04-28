package com.example.schnoww

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity5 : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps5)
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
        val supers = LatLng(48.409098532612774, -89.24869653877772)

        mMap.addMarker(MarkerOptions().position(supers).title("Grocery place #1"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(supers))




        val wl = LatLng(48.414299475379536, -89.24050060888118)

        mMap.addMarker(MarkerOptions().position(wl).title("Grocery place #2"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(wl))




        val pen = LatLng(48.41236682440642, -89.24561340500512)

        mMap.addMarker(MarkerOptions().position(pen).title("Clothing place #3"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pen))




        val lec = LatLng(48.403584265373716, -89.2442276547964)

        mMap.addMarker(MarkerOptions().position(lec).title("Clothing place #4"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(lec))



        val mks = LatLng(48.4050685346155, -89.23695440072872)

        mMap.addMarker(MarkerOptions().position(mks).title("Clothing place #5"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(mks))

        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(mks,12f ))


        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Shopping Locations"
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}