package com.example.weatherapp.data

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object Retrofit {

    val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl("http://api.weatherapi.com/")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }


    val api: Api by lazy {
        retrofit.create(Api::class.java)
    }


}

