package com.pratamawijaya.openweatherkotlin.data

/**
 * Created by mnemonix
 * Date : Dec - 12/28/16
 * Project Name : OpenWeatherKotlin
 */

data class ForecastResponse(val city: City, val list: List<Forecast>)

data class WeatherResponse(val id: Int, val name: String, val cod: Int, val coord: Coordinate, val weather: List<Weather>, val main: Temperature, val dt: Long)

data class Forecast(val dt: Long, val main: Temperature, val weather: List<Weather>, val dt_txt: String)

data class City(val id: Long, val name: String, val country: String, val population: Long, val coord: Coordinate)

data class Temperature(val temp: Float, val temp_min: Float, val temp_max: Float, val pressure: Float)

data class Coordinate(val lon: Float, val lat: Float)

data class Weather(val id: Long, val main: String, val description: String, val icon: String)