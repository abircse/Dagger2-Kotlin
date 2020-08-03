package com.coxtuneslab.myapplication.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.coxtuneslab.myapplication.model.FoodSeller
import com.coxtuneslab.myapplication.model.Foods
import com.coxtuneslab.myapplication.R
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var foodSeller: FoodSeller

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            textView.text = foodSeller.getFoodNames()
        }
    }
}