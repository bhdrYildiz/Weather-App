package com.yildiz.weatherapp.service

import com.yildiz.weatherapp.model.WeatherModel
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

//http://api.openweathermap.org/data/2.5/weather?q=izmir&APPID=8266cb7d25b3f9c171867ac175716c94

interface WeatherAPI {

    @GET("data/2.5/weather?&units=metric&APPID=8266cb7d25b3f9c171867ac175716c94")
    fun getData(
        @Query("q") cityName : String
    ) : Single<WeatherModel>


}