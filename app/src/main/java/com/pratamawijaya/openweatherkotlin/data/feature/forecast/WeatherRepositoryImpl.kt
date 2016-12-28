package com.pratamawijaya.openweatherkotlin.data.feature.forecast

import android.util.Log
import com.pratamawijaya.openweatherkotlin.data.Request
import com.pratamawijaya.openweatherkotlin.domain.repository.WeatherRepository

/**
 * Created by mnemonix
 * Date : Dec - 12/27/16
 * Project Name : OpenWeatherKotlin
 */
class WeatherRepositoryImpl : WeatherRepository {

  override fun getForecast(cityName: String, apiKey: String): String {
    var url = "http://api.openweathermap.org/data/2.5/forecast?q=${cityName}&mode=json&appid=${apiKey}"
    Log.d("url", "request : " + url)
    return Request().run(url)
  }

}