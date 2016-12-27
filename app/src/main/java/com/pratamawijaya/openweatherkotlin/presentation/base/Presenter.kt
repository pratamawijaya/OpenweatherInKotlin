package com.pratamawijaya.openweatherkotlin.presentation.base

/**
 * Created by mnemonix
 * Date : Dec - 12/27/16
 * Project Name : OpenWeatherKotlin
 */
interface Presenter<V : BaseView> {
  fun attachView(view: V)
  fun detachView()
}