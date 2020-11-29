package com.github.goutarouh.room

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels

class MainActivity : AppCompatActivity() {

    private val viewModel by viewModels<MyViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        viewModel.background()

    }


    override fun onDestroy() {
        super.onDestroy()
    }

    override fun finish() {
        super.finish()
    }
}