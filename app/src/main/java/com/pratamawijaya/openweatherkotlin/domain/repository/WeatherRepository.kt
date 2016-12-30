package com.pratamawijaya.openweatherkotlin.domain.repository

import com.pratamawijaya.openweatherkotlin.data.Forecast
import com.pratamawijaya.openweatherkotlin.data.WeatherResponse

/**
 * Created by mnemonix
 * Date : Dec - 12/27/16
 * Project Name : OpenWeatherKotlin
 */
interface WeatherRepository {
  fun getForecast(cityName: String, apiKey: String): List<Forecast>
  fun getCurrentWeather(cityName: String, apiKey: String): WeatherResponse
}