package com.example.projec_2_raj_rana

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.util.Log
import com.google.android.gms.maps.model.LatLng


class CoordinatesFragment : Fragment() {
    private lateinit var tvCoordinates: TextView
    private lateinit var btnDisplay: Button
    var lat: Double = 0.0
    var long: Double = 0.0

    fun setCoordinates(latitude: Double, longitude: Double) {
        lat = latitude
        long = longitude
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d("CoordinatesFragment", "onCreateView called")
        val view = inflater.inflate(R.layout.fragment_coordinates, container, false)

        tvCoordinates = view.findViewById(R.id.tvCoordinates)
        btnDisplay = view.findViewById(R.id.btnDisplay)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnDisplay = view.findViewById(R.id.btnDisplay)
        btnDisplay.setOnClickListener {
            tvCoordinates.text = "Latitude: $lat, Longitude: $long"
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = CoordinatesFragment()
    }
}
