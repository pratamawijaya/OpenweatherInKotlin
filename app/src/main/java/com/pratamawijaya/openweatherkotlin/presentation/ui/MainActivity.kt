package com.pratamawijaya.openweatherkotlin.presentation.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.Toast
import com.pratamawijaya.openweatherkotlin.R
import com.pratamawijaya.openweatherkotlin.presentation.ui.presenter.MainPresenter
import kotlinx.android.synthetic.main.activity_main.pbMain
import kotlinx.android.synthetic.main.activity_main.rvMain

class MainActivity : AppCompatActivity(), MainView {

  lateinit private var presenter: MainPresenter

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    presenter = MainPresenter()
    presenter.attachView(this)
    presenter.getDataWeather()
  }

  override fun showLoading() {
    pbMain.visibility = VISIBLE
    rvMain.visibility = GONE
  }

  override fun hideLoading() {
    rvMain.visibility = VISIBLE
    pbMain.visibility = GONE
  }

  override fun showMessage(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
  }
}
