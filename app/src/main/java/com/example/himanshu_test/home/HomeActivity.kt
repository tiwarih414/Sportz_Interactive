package com.example.himanshu_test.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.himanshu_test.R
import com.example.himanshu_test.home.adapter.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    private lateinit var viewPagerAdapter: ViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        init()
    }

    private fun init() {
        toolbar.title = "Home"
        viewPagerAdapter = ViewPagerAdapter(supportFragmentManager)
        pager.adapter = viewPagerAdapter
        tabLayout.setupWithViewPager(pager)
    }
}
