package com.example.aimplate

import android.app.Activity
import android.os.Bundle
import com.example.aimplate.databinding.ActivityMainBinding

object test {
    fun foo(): Unit {
        println("IM working beach")
    }
}

class MainActivity : Activity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        test.foo()
    }
}

