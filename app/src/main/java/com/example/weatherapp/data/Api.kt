package com.example.weatherapp.data

import com.example.weatherapp.data.repository.model.ModelWeather
import retrofit2.http.GET

interface Api {
    @GET("v1/forecast.json?key=ed70f03a10b94c57a1592332220207&q=Taganrog&days=7&aqi=no&alerts=no\n")
    suspend fun weatherResponse(): ModelWeather
}