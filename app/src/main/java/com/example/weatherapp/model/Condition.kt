package com.example.weather_app.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Condition(
    val code: Int,
    val icon: String,
    val text: String
)