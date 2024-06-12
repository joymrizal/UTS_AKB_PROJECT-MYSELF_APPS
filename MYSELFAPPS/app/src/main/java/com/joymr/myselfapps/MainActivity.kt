// Tanggal    : 12 juni 2024 -->
// NIM        : 10121910 -->
// Nama       : Joy Muhamad Rizal -->
// Kelas      : IF9K -->
// Matkul     : 2023/2024 Genap - Pemrograman Android -->
// Dosen      : Pak Rizki Adam Kurniawan -->
package com.joymr.myselfapps

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.joymr.myselfapps.fragment.DailyFragment
import com.joymr.myselfapps.fragment.GalleryFragment
import com.joymr.myselfapps.fragment.HomeFragment
import com.joymr.myselfapps.fragment.MusicFragment
import com.joymr.myselfapps.fragment.profileFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //navbar
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.nav_home -> {
                    replaceFragment(HomeFragment())
                    title = "Home"
                }
                R.id.nav_daily -> {
                    replaceFragment(DailyFragment())
                    title = "Daily"
                }
                R.id.nav_gallery -> {
                    replaceFragment(GalleryFragment())
                    title = "Gallery"
                }
                R.id.nav_music -> {
                    replaceFragment(MusicFragment())
                    title = "Music"
                }
                R.id.nav_profile -> {
                    replaceFragment(profileFragment())
                    title = "Profile"
                }
            }
            true
        }

        // default bottom tab selected
        replaceFragment(HomeFragment())
        title = "Home"
        bottomNavigationView.selectedItemId = R.id.nav_home
    }
    private fun replaceFragment(fragment: Fragment){
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentContainer,fragment)
            .commit()
    }
}