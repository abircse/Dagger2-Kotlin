package com.coxtuneslab.myapplication.model

import javax.inject.Inject

class FoodSeller @Inject constructor(val foods: Foods) {
    fun getFoodNames(): String = foods.getFoodsName()
}