package com.pratamawijaya.openweatherkotlin.domain.repository

import com.pratamawijaya.openweatherkotlin.data.Forecast

/**
 * Created by mnemonix
 * Date : Dec - 12/27/16
 * Project Name : OpenWeatherKotlin
 */
interface WeatherRepository {
  fun getForecast(cityName: String, apiKey: String): List<Forecast>
}