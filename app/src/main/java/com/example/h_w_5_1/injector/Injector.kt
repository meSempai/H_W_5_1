package com.example.h_w_5_1.injector

import com.example.h_w_5_1.model.CounterModel
import com.example.h_w_5_1.presenter.Presenter

class Injector {
    companion object {
        fun fillModel() = CounterModel()
        fun fillPresenter() = Presenter()
    }
}