package com.example.weatherapp.data

import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object NetworkServiceLocator {

    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl("http://api.weatherapi.com/")
            .client(provideOkHttpClient(provideLoggingInterceptor()))
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }

    val api: Api by lazy {
        retrofit.create(Api::class.java)
    }

    private fun provideOkHttpClient(logger: Interceptor): OkHttpClient = OkHttpClient.Builder()
        .addInterceptor(logger)
        .build()

    private fun provideLoggingInterceptor(): Interceptor =
        HttpLoggingInterceptor().apply { setLevel(HttpLoggingInterceptor.Level.BODY) }

}

