package com.example.weatherapp.data

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class Retrofit {

    fun getWeather(){
        val retrofit = Retrofit.Builder()
            .baseUrl("http://api.weatherapi.com/")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
            .create(Api::class.java)

    }

}