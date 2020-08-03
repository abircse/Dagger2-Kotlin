package com.coxtuneslab.myapplication.di

import com.coxtuneslab.myapplication.App
import com.coxtuneslab.myapplication.di.module.ActivityBuilderModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        ActivityBuilderModule::class
    ]
)

interface AppComponent : AndroidInjector<App>
