package com.example.orderapp230405.model

import android.os.Parcelable

interface Item : Parcelable {
    val name:String?
    val imageResource: Int
    val price: Double

    companion object{
        lateinit var items : Array<Item>
    }
}