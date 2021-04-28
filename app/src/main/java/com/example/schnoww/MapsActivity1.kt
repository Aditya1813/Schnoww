package com.example.schnoww

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity1 : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps1)
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
        val Lot66 = LatLng(48.43345014565141, -89.22482393561208)

        mMap.addMarker(MarkerOptions().position(Lot66).title("Romantic place #1"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Lot66))




        val bight = LatLng(48.4342249143865, -89.21636372816835)

        mMap.addMarker(MarkerOptions().position(bight).title("Romantic place #2"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(bight))




        val giorg = LatLng(48.38502504098561, -89.24748812714533)

        mMap.addMarker(MarkerOptions().position(giorg).title("Romantic place #3"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(giorg))




        val tomlin = LatLng(48.43509759997268, -89.2196539903362)

        mMap.addMarker(MarkerOptions().position(tomlin).title("Romantic place #4"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(tomlin))



        val sb = LatLng(48.435624339015924, -89.21890517766151)

        mMap.addMarker(MarkerOptions().position(sb).title("Romantic place #5"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sb))

        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Lot66,12f ))


        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Romantic Locations"
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}