package com.pratamawijaya.openweatherkotlin.data

import java.net.URL

/**
 * Created by mnemonix
 * Date : Dec - 12/27/16
 * Project Name : OpenWeatherKotlin
 */
class Request {
  fun run(url: String): String = URL(url).readText()
}