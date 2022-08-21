package com.yildiz.weatherapp.service

import com.yildiz.weatherapp.model.WeatherModel
import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

//http://api.openweathermap.org/data/2.5/weather?q=izmir&APPID=8266cb7d25b3f9c171867ac175716c94


class WeatherAPIService {

    private val BASE_URL = "http://api.openweathermap.org"
    private val api = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()
        .create(WeatherAPI::class.java)

    fun getDataService(cityName : String) : Single<WeatherModel> {
        return api.getData(cityName)
    }




}