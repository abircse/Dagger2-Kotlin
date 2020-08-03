package com.coxtuneslab.myapplication.model

import javax.inject.Inject

class Foods @Inject constructor() {
    fun getFoodsName(): String {
        return "Rice, Egg, Oil, Tomato"
    }
}