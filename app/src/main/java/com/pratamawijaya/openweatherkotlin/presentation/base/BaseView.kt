package com.pratamawijaya.openweatherkotlin.presentation.base

/**
 * Created by mnemonix
 * Date : Dec - 12/27/16
 * Project Name : OpenWeatherKotlin
 */
interface BaseView {
  fun showLoading()
  fun hideLoading()
  fun showMessage(message: String)
}