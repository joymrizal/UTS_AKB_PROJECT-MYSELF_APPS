// Tanggal    : 12 juni 2024 -->
// NIM        : 10121910 -->
// Nama       : Joy Muhamad Rizal -->
// Kelas      : IF9K -->
// Matkul     : 2023/2024 Genap - Pemrograman Android -->
// Dosen      : Pak Rizki Adam Kurniawan -->
package com.joymr.myselfapps.fragment

import android.app.AlertDialog
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import com.joymr.myselfapps.R
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.MapView
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class profileFragment : Fragment() {
    private lateinit var googleMap: GoogleMap
    private lateinit var mapView: MapView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_profile, container, false)

        val socialFBbtn = view.findViewById<ImageView>(R.id.socialFBbtn)
        val socialIGbtn = view.findViewById<ImageView>(R.id.socialIGbtn)
        val socialTwitsbtn = view.findViewById<ImageView>(R.id.socialTwitsbtn)
        val socialLinkenbtn = view.findViewById<ImageView>(R.id.socialLinkenbtn)
        val callBtn = view.findViewById<Button>(R.id.callBtn)
        val mailBtn = view.findViewById<Button>(R.id.mailBtn)
        val aboutBtn = view.findViewById<Button>(R.id.aboutBtn)

        socialFBbtn.setOnClickListener {
            openSocialMedia("https://www.facebook.com/jeprutzzz/")}
        socialIGbtn.setOnClickListener {
            openSocialMedia("https://instagram.com/")}
        socialTwitsbtn.setOnClickListener {
            openSocialMedia("https://x.com/")}
        socialLinkenbtn.setOnClickListener {
            openSocialMedia("https://www.linkedin.com/")}
        callBtn.setOnClickListener {
            callPhoneNumber("+6281224031305")}
        mailBtn.setOnClickListener {
            sendEmail("joy.10121910@mahasiswa.unikom.ac.id") }

        aboutBtn.setOnClickListener {
            showAboutDialog()
        }

        return view
    }

//    override fun onMapReady(map: GoogleMap) {
//        googleMap = map
//        val myLocation = LatLng(-7.123, 107.123)
//        googleMap.addMarker(MarkerOptions().position(myLocation).title("My Location"))
//        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(myLocation,15f))
//    }

    private fun openSocialMedia(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }
    private fun callPhoneNumber(phoneNumber: String) {
        val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
        startActivity(intent)
    }
    private fun sendEmail(email: String) {
        val intent = Intent(Intent.ACTION_SENDTO).apply {
            data = Uri.parse("mailto:$email")
        }
        startActivity(intent)
    }

    private fun showAboutDialog() {
        val dialog = AlertDialog.Builder(requireContext())
            .setTitle("About MySelfAps")
            .setMessage("By : Joy Muhamad Rizal v1.0")
            .setPositiveButton("OK") { dialog, _ ->
                dialog.dismiss()
            }
            .create()
        dialog.show()
    }


}