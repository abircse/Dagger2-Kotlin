package com.coxtuneslab.myapplication.model

import javax.inject.Inject

class FoodSeller @Inject constructor(val foods: Foods,val vendor: Vendor) {
    fun getFoodNames(): String = foods.getFoodsName()
    fun getVendorName(): String = vendor.getName()
}