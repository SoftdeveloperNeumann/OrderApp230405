package com.example.orderapp230405.ui


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.orderapp230405.R
import com.example.orderapp230405.databinding.ActivityDetailBinding
import com.example.orderapp230405.model.Item
import com.example.orderapp230405.ui.fragment.DetailFragment

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.tbDetail)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val args = Bundle().apply {
            putParcelable("item",intent.getParcelableExtra<Bundle>("item"))
        }



        supportFragmentManager.beginTransaction()
            .replace(R.id.container_detail,DetailFragment::class.java,args)
            .commitNow()
    }
}