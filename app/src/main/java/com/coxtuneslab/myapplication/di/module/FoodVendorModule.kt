package com.coxtuneslab.myapplication.di.module

import com.coxtuneslab.myapplication.model.FoodVendor
import dagger.Module
import dagger.Provides

@Module
class FoodVendorModule {

    /*
    * Providers user for which class not possible to inject constructor via dagger2
    * */
    @Provides
    fun getFoodVendorMark() : FoodVendor = FoodVendor.getFoodVendorInstance()
}