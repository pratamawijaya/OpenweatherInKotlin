package com.pratamawijaya.openweatherkotlin.presentation.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.Toast
import com.pratamawijaya.openweatherkotlin.R
import com.pratamawijaya.openweatherkotlin.data.Forecast
import com.pratamawijaya.openweatherkotlin.presentation.ui.adapter.MainAdapter
import com.pratamawijaya.openweatherkotlin.presentation.ui.presenter.MainPresenter
import kotlinx.android.synthetic.main.activity_main.pbMain
import kotlinx.android.synthetic.main.activity_main.rvMain
import java.util.ArrayList

class MainActivity : AppCompatActivity(), MainView {

  lateinit private var presenter: MainPresenter
  lateinit private var adapter: MainAdapter

  private var forecasts: MutableList<Forecast> = ArrayList<Forecast>()

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    presenter = MainPresenter()
    presenter.attachView(this)
    presenter.getDataWeather()

    setupRecyclerView()
  }

  private fun setupRecyclerView() {
    adapter = MainAdapter(forecasts)
    rvMain.layoutManager = LinearLayoutManager(this)
    rvMain.adapter = adapter
  }

  override fun showLoading() {
    pbMain.visibility = VISIBLE
    rvMain.visibility = GONE
  }

  override fun hideLoading() {
    rvMain.visibility = VISIBLE
    pbMain.visibility = GONE
  }

  override fun onStop() {
    super.onStop()
    presenter.detachView()
  }

  override fun showMessage(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
  }

  override fun setData(forecasts: List<Forecast>) {
    this.forecasts.addAll(forecasts)
    adapter.notifyDataSetChanged()
  }
}
