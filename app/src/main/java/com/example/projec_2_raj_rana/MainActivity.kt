package com.example.projec_2_raj_rana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.android.gms.maps.model.LatLng

class MainActivity : AppCompatActivity(), MapFragment.OnMarkerClickListener  {

    private var currentMarkerLatLng: LatLng? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity", "onCreate called")
    }

    override fun onMarkerClicked(markerPosition: LatLng) {
        currentMarkerLatLng = markerPosition
    }

    fun getCurrentMarkerLatLng(): LatLng? {
        return currentMarkerLatLng
    }

}
