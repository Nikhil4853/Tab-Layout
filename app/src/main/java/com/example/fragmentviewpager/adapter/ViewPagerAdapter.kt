package com.example.fragmentviewpager.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.fragmentviewpager.fragment.Secfragment
import com.example.fragmentviewpager.fragment.firstfragment
import com.example.fragmentviewpager.fragment.thirdfragment

class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                firstfragment()
            }
            1 -> {
                Secfragment()
            }
            2 -> {
                thirdfragment()
            }

            else -> {
                Fragment()
            }
        }
    }
}