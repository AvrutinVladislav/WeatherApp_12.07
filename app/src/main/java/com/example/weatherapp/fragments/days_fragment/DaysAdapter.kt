package com.example.weatherapp.fragments.days_fragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.weather_app.model.Forecastday
import com.example.weatherapp.R
import com.example.weatherapp.databinding.RvItemDayBinding


class DaysAdapter : RecyclerView.Adapter<DaysAdapter.DaysViewHolder>() {

    private val daysWeatherList : MutableList<Forecastday> = emptyList<Forecastday>().toMutableList()

    class DaysViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val binding : RvItemDayBinding = RvItemDayBinding.bind(view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DaysViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.rv_item_hours, parent, false)
        return DaysViewHolder(view)
    }

    override fun onBindViewHolder(holder: DaysViewHolder, position: Int) {
        val daysWeather = daysWeatherList[position]
        with(holder.binding){
            daysWeather.day.condition.icon.let {
                Glide.with(holder.itemView).load(it).into(rvItemConditionImg)
            }
            rvItemCondition.text = daysWeather.day.condition.text
            rvItemTime.text = daysWeather.date
            rvItemTempMax.text = daysWeather.day.maxtemp_c.toString()
            rvItemTempMin.text = daysWeather.day.mintemp_c.toString()
        }
    }

    override fun getItemCount(): Int {
        return daysWeatherList.size
    }
}