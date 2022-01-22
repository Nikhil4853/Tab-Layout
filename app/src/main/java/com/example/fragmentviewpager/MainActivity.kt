package com.example.fragmentviewpager

import android.graphics.drawable.Drawable
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.lifecycle.Lifecycle
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.fragmentviewpager.R.drawable.*
import com.example.fragmentviewpager.adapter.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tabLayout= findViewById<TabLayout>(R.id.tab_layout)
        val viewpager= findViewById<ViewPager2>(R.id.view_Pager_2)
        val adapter= ViewPagerAdapter(supportFragmentManager,lifecycle)
               viewpager.adapter=adapter
        TabLayoutMediator(tabLayout,viewpager){tab, position->
            when(position){
                0->{
                    tab.text="Chat"
                tab.setIcon(chat_24)
                }1->{
                tab.setIcon(settings_24)
                    tab.text="Setting"
                }2->{
                    tab.text="call"
                tab.setIcon(call_24)
                }

            }
        }.attach()
    }
}