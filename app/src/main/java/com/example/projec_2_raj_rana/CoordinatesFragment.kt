package com.example.projec_2_raj_rana

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.util.Log

class CoordinatesFragment : Fragment() {

    private lateinit var tvCoordinates: TextView
    private lateinit var btnDisplay: Button

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d("CoordinatesFragment", "onCreateView called")
        val view = inflater.inflate(R.layout.fragment_coordinates, container, false)

        tvCoordinates = view.findViewById(R.id.tvCoordinates)
        btnDisplay = view.findViewById(R.id.btnDisplay)

        btnDisplay.setOnClickListener {
            // Replace with actual coordinates
            val latitude = -34.0
            val longitude = 151.0
            tvCoordinates.text = "Latitude: $latitude, Longitude: $longitude"
        }

        return view
    }


    companion object {
        @JvmStatic
        fun newInstance() = CoordinatesFragment()
    }
}
