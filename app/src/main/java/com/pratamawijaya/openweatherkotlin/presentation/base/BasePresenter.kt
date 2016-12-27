package com.pratamawijaya.openweatherkotlin.presentation.base

/**
 * Created by mnemonix
 * Date : Dec - 12/27/16
 * Project Name : OpenWeatherKotlin
 */
open class BasePresenter<T : BaseView> : Presenter<T> {

  private var view: T? = null

  override fun attachView(view: T) {
    this.view = view
  }

  override fun detachView() {
    this.view = null
  }

  fun isViewAttached(): Boolean {
    return view != null
  }

  fun getView(): T {
    return view!!
  }

  fun checkViewAttached() {
    if (!isViewAttached()) throw MvpViewNotAttachedException()
  }

  class MvpViewNotAttachedException : RuntimeException(
      "Please call Presenter.attachView(MvpView) before" + " requesting data to the Presenter")
}