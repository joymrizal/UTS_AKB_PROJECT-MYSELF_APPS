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


class MusicFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_music, container, false)

        // Music
        val recViewDaily = view.findViewById<RecyclerView>(R.id.recViewMusik)

        recViewDaily.layoutManager = LinearLayoutManager(requireContext())

        val dataList1 = listOf(
            Pair("Kau Adalah - Isyana Sarasvati", R.drawable.ic_musicalnote),
            Pair("Bulan - Didi Kempot ft. Nadin Amizah", R.drawable.ic_musicalnote),
            Pair("Mungkin Hari Ini Esok Atau Nanti - Anneth", R.drawable.ic_musicalnote),
            Pair("Kala Cinta Menggoda - Glenn Fredly", R.drawable.ic_musicalnote),
            Pair("Sungguh Ku Merasa Resah - Andmesh Kamaleng", R.drawable.ic_musicalnote),
            Pair("Cukup Sudah - Glenn Samuel ft. Sal Priadi", R.drawable.ic_musicalnote)
        )

        val adapter1 = RecycleAdapter(dataList1)
        recViewDaily.adapter = adapter1

        return view
    }
}