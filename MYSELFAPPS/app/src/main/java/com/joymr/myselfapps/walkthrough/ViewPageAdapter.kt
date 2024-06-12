package com.joymr.myselfapps.walkthrough

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPageAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> Walkthrough1stFragment()
            1 -> Walkthrough2ndFragment()
            2 -> Walkthrough3rdFragment()
            else -> throw IllegalStateException("Unexpected position $position")
        }
    }
}