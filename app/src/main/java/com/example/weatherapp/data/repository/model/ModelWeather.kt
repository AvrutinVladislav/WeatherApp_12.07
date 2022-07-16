package com.example.weatherapp.data.repository.model


data class ModelWeather(
    val current: Current,
    val forecast: Forecast,
    val location: Location
)