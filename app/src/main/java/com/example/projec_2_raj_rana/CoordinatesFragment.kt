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

    fun setCoordinates(latitude: Double, longitude: Double) {
        tvCoordinates.text = "Latitude: $latitude, Longitude: $longitude"
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
    }



    companion object {
        @JvmStatic
        fun newInstance() = CoordinatesFragment()
    }
}
