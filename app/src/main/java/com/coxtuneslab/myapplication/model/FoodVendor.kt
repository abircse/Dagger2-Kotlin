package com.coxtuneslab.myapplication.model

class FoodVendor private constructor() : Vendor{

    companion object{
        fun getFoodVendorInstance() : FoodVendor = FoodVendor()
    }

    override fun getName(): String = "Mr Mark"
}

// private constructor not possible to inject via dagger2