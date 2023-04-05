package com.example.orderapp230405.model

import com.example.orderapp230405.R

data class Pizza(
    val name: String,
    val imageResource: Int,
    val price:Double
) {

    companion object{
        val pizzen = arrayOf(
            Pizza("Fresca", R.drawable.pizza_fresca, 5.0),
            Pizza("Kiwi", R.drawable.pizza_kiwi, 6.0),
            Pizza("Salami", R.drawable.pizza_salami, 4.0),
            Pizza("Fresca2", R.drawable.pizza_fresca, 5.0),
            Pizza("Kiwi2", R.drawable.pizza_kiwi, 6.0),
            Pizza("Salami2", R.drawable.pizza_salami, 4.0),

        )
    }
}