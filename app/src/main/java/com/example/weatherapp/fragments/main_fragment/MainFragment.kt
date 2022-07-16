package com.example.weather_app.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.example.weatherapp.fragments.main_fragment.ViewPager
import com.example.weatherapp.databinding.FragmentMainBinding
import com.example.weatherapp.fragments.days_fragment.DaysFragment
import com.example.weatherapp.fragments.hours_fragment.HoursFragment
import com.google.android.material.tabs.TabLayoutMediator

class MainFragment : Fragment() {

    lateinit var binding: FragmentMainBinding

    private val fList = listOf(
        HoursFragment.newInstance(),
        DaysFragment.newInstance()
    )

    private val tList = listOf(
        "HOURS", "DAYS"
    )


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater, container, false)

        return binding.root


    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        init()
    }

    private fun init() = with(binding) {
        val adapter = ViewPager(activity as FragmentActivity, fList)
        vp.adapter = adapter
        TabLayoutMediator(tabLayout, vp) { tab, pos ->
            tab.text = tList[pos]
        }.attach()
    }


    companion object {

        @JvmStatic
        fun newInstance() = MainFragment()
    }
}