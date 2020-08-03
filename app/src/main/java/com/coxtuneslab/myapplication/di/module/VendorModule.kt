package com.coxtuneslab.myapplication.di.module

import com.coxtuneslab.myapplication.model.FoodVendor
import com.coxtuneslab.myapplication.model.Vendor
import dagger.Binds
import dagger.Module

@Module
abstract class VendorModule {

    @Binds
    abstract fun getVendor(foodVendor: FoodVendor) : Vendor
}

