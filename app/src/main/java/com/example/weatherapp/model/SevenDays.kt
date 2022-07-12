package com.example.weather_app.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SevenDays(
    val current: Current,
    val forecast: Forecast,
    val location: Location
)