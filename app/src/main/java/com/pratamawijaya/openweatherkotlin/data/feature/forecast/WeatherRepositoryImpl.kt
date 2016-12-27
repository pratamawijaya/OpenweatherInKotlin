package com.pratamawijaya.openweatherkotlin.data.feature.forecast

import com.pratamawijaya.openweatherkotlin.data.Request
import com.pratamawijaya.openweatherkotlin.domain.repository.WeatherRepository

/**
 * Created by mnemonix
 * Date : Dec - 12/27/16
 * Project Name : OpenWeatherKotlin
 */
class WeatherRepositoryImpl : WeatherRepository {

  override fun getForecast(): String {
    return Request().run("https://jsonplaceholder.typicode.com/users")
  }
}