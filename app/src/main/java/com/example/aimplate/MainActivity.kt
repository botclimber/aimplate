package com.example.aimplate

import android.app.Activity
import android.os.Bundle
import android.view.View
import com.example.aimplate.databinding.ActivityMainBinding

object counter {
    var count : Int = 0
}

class MainActivity : Activity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    fun addCounter(view: View) {
        counter.count++
        println(counter.count)
    }
}

