package com.example.orderapp230405.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.orderapp230405.R
import com.example.orderapp230405.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}