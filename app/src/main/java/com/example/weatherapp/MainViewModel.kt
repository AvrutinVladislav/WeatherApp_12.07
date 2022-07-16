package com.example.weatherapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weather_app.model.ModelWeather
import com.example.weatherapp.data.repository.Repository
import kotlinx.coroutines.launch
import retrofit2.Response

class MainViewModel(private val repository: Repository) : ViewModel() {

    val myResponse : MutableLiveData<ModelWeather> = MutableLiveData()

    fun getWeather(){

        viewModelScope.launch {
            val response : ModelWeather = repository.getWeather()
            myResponse.value = response
        }

    }
}