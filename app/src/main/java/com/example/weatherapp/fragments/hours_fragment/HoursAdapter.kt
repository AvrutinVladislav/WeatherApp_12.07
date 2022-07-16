package com.example.weatherapp.fragments.hours_fragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.weatherapp.data.repository.model.Hour
import com.example.weatherapp.R
import com.example.weatherapp.databinding.RvItemHoursBinding

class HoursAdapter : RecyclerView.Adapter<HoursAdapter.HoursViewHolder>() {

    private val hoursWeatherList: MutableList<Hour> = emptyList<Hour>().toMutableList()

    class HoursViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val binding: RvItemHoursBinding = RvItemHoursBinding.bind(view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HoursViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.rv_item_hours, parent, false)
        return HoursViewHolder(view)
    }

    override fun onBindViewHolder(holder: HoursViewHolder, position: Int) {
        val hourWeather = hoursWeatherList[position]
        with(holder.binding) {
            hourWeather.condition.icon.let {
                Glide.with(holder.itemView).load(it).into(rvItemConditionImg)
            }
            rvItemCondition.text = hourWeather.condition.text
            rvItemTemp.text = hourWeather.temp_c.toString()
            rvItemTime.text = hourWeather.time
        }
    }

    override fun getItemCount(): Int {
        return hoursWeatherList.size
    }
}