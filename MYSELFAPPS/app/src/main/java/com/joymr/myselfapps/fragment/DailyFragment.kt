// Tanggal    : 12 juni 2024 -->
// NIM        : 10121910 -->
// Nama       : Joy Muhamad Rizal -->
// Kelas      : IF9K -->
// Matkul     : 2023/2024 Genap - Pemrograman Android -->
// Dosen      : Pak Rizki Adam Kurniawan -->
package com.joymr.myselfapps.fragment

import RecycleAdapter
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.joymr.myselfapps.R
import com.joymr.myselfapps.R.*

class DailyFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(layout.fragment_daily, container, false)

        // Aktifitas
        val recViewDaily = view.findViewById<RecyclerView>(R.id.recViewDaily)

        recViewDaily.layoutManager = LinearLayoutManager(requireContext())

        val dataList1 = listOf(
            Pair("Shalat 5 Waktu", R.drawable.ic1_praying),
            Pair("Bekerja", R.drawable.ic1_hardwork),
            Pair("Makan", R.drawable.ic1_healthyfood),
            Pair("Smoke", R.drawable.ic1_smoking),
            Pair("Games", R.drawable.ic1_playingvideogames),
            Pair("Bersama Keluarga", R.drawable.ic1_family)
        )

        val adapter1 = RecycleAdapter(dataList1)
        recViewDaily.adapter = adapter1

        // Sahabat
        val recViewFriends = view.findViewById<RecyclerView>(R.id.recViewFriends)

        recViewFriends.layoutManager = LinearLayoutManager(requireContext(),
            LinearLayoutManager.HORIZONTAL, false)

        val dataList2 = listOf(
            Pair("KangDifa", R.drawable.sahabat_difa),
            Pair("KangFajar", R.drawable.sahabat_fajar),
            Pair("KangBagus", R.drawable.sahabat_bagus),
            Pair("TehOlga", R.drawable.sahabat_olga),
            Pair("KangNasir", R.drawable.sahabat_nasir)
        )

        val adapter2 = RecycleAdapter(dataList2)
        recViewFriends.adapter = adapter2

        return view
    }
}