package com.example.orderapp230405.model

interface Item {
    val name:String
    val imageResource: Int
    val price: Double

    companion object{
        lateinit var items : Array<Item>
    }
}