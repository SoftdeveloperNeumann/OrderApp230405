package com.example.orderapp230405.model

import com.example.orderapp230405.R

class Pasta (
   override val name: String,
   override val imageResource: Int,
   override val price:Double
):Item{
    companion object{
        val items:Array<Item> = arrayOf(
            Pasta("Nudeln1", R.drawable.nudel1,5.5),
            Pasta("Nudeln2", R.drawable.nudel2,5.5),
            Pasta("Nudeln3", R.drawable.nudel3,5.5),
            Pasta("Nudeln4", R.drawable.nudel1,5.5),
            Pasta("Nudeln5", R.drawable.nudel2,5.5),
            Pasta("Nudeln6", R.drawable.nudel3,5.5),
        )
    }
}