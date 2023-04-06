package com.example.orderapp230405.model

import com.example.orderapp230405.R

data class Pizza(
    override val name: String,
    override val imageResource: Int,
    override val price:Double
) : Item {

    companion object{
        val items:Array<Item> = arrayOf(
            Pizza("Fresca", R.drawable.pizza_fresca, 5.0),
            Pizza("Kiwi", R.drawable.pizza_kiwi, 6.0),
            Pizza("Salami", R.drawable.pizza_salami, 4.0),
            Pizza("Fresca2", R.drawable.pizza_fresca, 5.0),
            Pizza("Kiwi2", R.drawable.pizza_kiwi, 6.0),
            Pizza("Salami2", R.drawable.pizza_salami, 4.0),

        )
    }
}