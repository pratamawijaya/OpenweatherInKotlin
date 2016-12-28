package com.pratamawijaya.openweatherkotlin.presentation.ui.presenter

import android.util.Log
import com.pratamawijaya.openweatherkotlin.BuildConfig
import com.pratamawijaya.openweatherkotlin.data.Request
import com.pratamawijaya.openweatherkotlin.data.feature.forecast.WeatherRepositoryImpl
import com.pratamawijaya.openweatherkotlin.domain.repository.WeatherRepository
import com.pratamawijaya.openweatherkotlin.presentation.base.BasePresenter
import com.pratamawijaya.openweatherkotlin.presentation.ui.MainView
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

/**
 * Created by mnemonix
 * Date : Dec - 12/27/16
 * Project Name : OpenWeatherKotlin
 */
class MainPresenter : BasePresenter<MainView>() {
  private var repository: WeatherRepository
  private var request: Request

  init {
    request = Request()
    repository = WeatherRepositoryImpl()
  }

  override fun attachView(view: MainView) {
    super.attachView(view)
  }

  override fun detachView() {
    super.detachView()
  }

  fun getDataWeather() {
    getView().showMessage("Get Weather")

//    async
    doAsync {
      getView().showLoading()
      var stringJson = repository.getForecast("Yogyakarta", BuildConfig.API_KEY)
      uiThread {
        getView().hideLoading()
        Log.d("result", stringJson)
      }
    }

  }
}