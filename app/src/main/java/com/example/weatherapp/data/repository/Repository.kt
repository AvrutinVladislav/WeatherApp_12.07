package com.example.weatherapp.data.repository

import com.example.weatherapp.data.repository.model.ModelWeather
import com.example.weatherapp.data.NetworkServiceLocator
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Repository {

    suspend fun getWeather(): ModelWeather = withContext(Dispatchers.IO) {
        NetworkServiceLocator.api.weatherResponse()
    }

}