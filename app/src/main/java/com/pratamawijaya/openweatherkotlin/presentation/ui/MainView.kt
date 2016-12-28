package com.pratamawijaya.openweatherkotlin.presentation.ui

import com.pratamawijaya.openweatherkotlin.data.Forecast
import com.pratamawijaya.openweatherkotlin.presentation.base.BaseView

/**
 * Created by mnemonix
 * Date : Dec - 12/27/16
 * Project Name : OpenWeatherKotlin
 */
interface MainView : BaseView {
  fun setData(forecasts: List<Forecast>)
}