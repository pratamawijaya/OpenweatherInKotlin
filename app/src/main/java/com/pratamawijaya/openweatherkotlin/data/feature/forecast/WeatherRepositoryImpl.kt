package com.pratamawijaya.openweatherkotlin.data.feature.forecast

import android.util.Log
import com.google.gson.Gson
import com.pratamawijaya.openweatherkotlin.data.Forecast
import com.pratamawijaya.openweatherkotlin.data.ForecastResponse
import com.pratamawijaya.openweatherkotlin.data.Request
import com.pratamawijaya.openweatherkotlin.data.WeatherResponse
import com.pratamawijaya.openweatherkotlin.domain.repository.WeatherRepository

/**
 * Created by mnemonix
 * Date : Dec - 12/27/16
 * Project Name : OpenWeatherKotlin
 */
class WeatherRepositoryImpl : WeatherRepository {

  override fun getCurrentWeather(cityName: String, apiKey: String): WeatherResponse {
    var url = "http://api.openweathermap.org/data/2.5/weather?q=${cityName}&mode=json&appid=${apiKey}&units=metric"
    Log.d("url", "request : " + url)

    val responseJson = Request().run(url)
    val weatherResponse = Gson().fromJson(responseJson, WeatherResponse::class.java)
    return weatherResponse
  }

  override fun getForecast(cityName: String, apiKey: String): List<Forecast> {
    var url = "http://api.openweathermap.org/data/2.5/forecast?q=${cityName}&mode=json&appid=${apiKey}&units=metric"
    Log.d("url", "request : " + url)

    val responseJson = Request().run(url)

    var forecastObj = Gson().fromJson(responseJson, ForecastResponse::class.java)

    return forecastObj.list
  }

}