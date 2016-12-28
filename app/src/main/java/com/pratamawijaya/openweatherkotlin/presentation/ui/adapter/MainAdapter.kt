package com.pratamawijaya.openweatherkotlin.presentation.ui.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pratamawijaya.openweatherkotlin.R
import com.pratamawijaya.openweatherkotlin.data.Forecast
import com.pratamawijaya.openweatherkotlin.presentation.ui.adapter.MainAdapter.MainHolder
import kotlinx.android.synthetic.main.item_forecast.view.tvItemDate
import kotlinx.android.synthetic.main.item_forecast.view.tvItemTemperature
import kotlinx.android.synthetic.main.item_forecast.view.tvItemWeather

/**
 * Created by mnemonix
 * Date : Dec - 12/28/16
 * Project Name : OpenWeatherKotlin
 */
class MainAdapter(val forecasts: List<Forecast>) : RecyclerView.Adapter<MainHolder>() {

  override fun getItemCount() = forecasts.size

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainHolder {
    val view = LayoutInflater.from(parent.context).inflate(R.layout.item_forecast, parent, false)
    return MainHolder(view)
  }

  override fun onBindViewHolder(holder: MainHolder, position: Int) {
    holder.bindItem(forecasts[position])
  }

  class MainHolder(view: View) : RecyclerView.ViewHolder(view) {

    fun bindItem(forecasts: Forecast) {
      with(forecasts) {
        itemView.tvItemDate.text = dt_txt
        itemView.tvItemWeather.text = weather[0].description
        itemView.tvItemTemperature.text = main.temp.toString()
      }
    }

  }
}