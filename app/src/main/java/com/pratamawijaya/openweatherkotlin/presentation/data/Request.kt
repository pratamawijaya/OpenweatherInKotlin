package com.pratamawijaya.openweatherkotlin.presentation.data

import java.net.URL

/**
 * Created by mnemonix
 * Date : Dec - 12/27/16
 * Project Name : OpenWeatherKotlin
 */
class Request {

  fun run(url: String): String {
    val requestData = URL(url).readText()
    return requestData
  }
}