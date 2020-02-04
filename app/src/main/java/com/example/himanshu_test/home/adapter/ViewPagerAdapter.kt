package com.example.himanshu_test.home.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.himanshu_test.home.fragments.HeatFragment
import com.example.himanshu_test.home.fragments.ScorchersFragment

class ViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        var fragment: Fragment? = null
        fragment = when (position) {
            0 -> {
                ScorchersFragment()
            }
            else -> HeatFragment()
        }
        return fragment
    }

    override fun getCount() = 2

    override fun getPageTitle(position: Int): CharSequence? {
        var title = ""
        when (position) {
            0 -> {
                title = "Scorcher"
            }
            1 -> {
                title = "Heat"
            }
        }
        return title
    }
}