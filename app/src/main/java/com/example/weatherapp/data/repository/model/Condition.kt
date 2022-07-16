package com.example.weatherapp.data.repository.model

import com.squareup.moshi.JsonClass

data class Condition(
    val code: Int,
    val icon: String,
    val text: String
)