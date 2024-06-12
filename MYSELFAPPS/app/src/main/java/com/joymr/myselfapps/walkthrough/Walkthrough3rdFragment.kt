package com.joymr.myselfapps.walkthrough

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.joymr.myselfapps.MainActivity
import com.joymr.myselfapps.R

class Walkthrough3rdFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_walkthrough3rd, container, false)

        val btnGetStarted = view.findViewById<Button>(R.id.WtrNextBtn)

        btnGetStarted.setOnClickListener {
            startJourney()
        }

        return view
    }

    private fun startJourney() {
        val intent = Intent(activity, MainActivity::class.java)
        startActivity(intent)
        activity?.finish()
    }
}