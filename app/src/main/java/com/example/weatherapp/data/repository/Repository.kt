package com.example.weatherapp.data.repository

import com.example.weather_app.model.ModelWeather
import com.example.weatherapp.data.Retrofit

class Repository {

    suspend fun getWeather(): ModelWeather {
        return Retrofit.api.weatherResponce()
    }

}