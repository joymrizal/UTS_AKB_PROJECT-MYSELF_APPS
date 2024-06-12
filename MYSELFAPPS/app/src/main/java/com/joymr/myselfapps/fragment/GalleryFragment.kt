// Tanggal    : 12 juni 2024 -->
// NIM        : 10121910 -->
// Nama       : Joy Muhamad Rizal -->
// Kelas      : IF9K -->
// Matkul     : 2023/2024 Genap - Pemrograman Android -->
// Dosen      : Pak Rizki Adam Kurniawan -->
package com.joymr.myselfapps.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.joymr.adapter.GalleryAdapter
import com.joymr.myselfapps.R

class GalleryFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_gallery, container, false)

        val recyclerViewGallery = view.findViewById<RecyclerView>(R.id.recViewGalleri)

        recyclerViewGallery.layoutManager = GridLayoutManager(requireContext(), 2)

        val images = listOf(
            R.drawable.gallery__3_,
            R.drawable.gallery_8,
            R.drawable.gallery_10,
            R.drawable.gallery_1,
            R.drawable.gallery_13,
            R.drawable.gallery__5_,
            R.drawable.gallery__6_,
            R.drawable.gallery__4_
        )

        val galleryAdapter = GalleryAdapter(images)
        recyclerViewGallery.adapter = galleryAdapter

        return view
    }
}