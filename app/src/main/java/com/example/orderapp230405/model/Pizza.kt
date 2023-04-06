package com.example.orderapp230405.model

import android.os.Parcel
import android.os.Parcelable
import com.example.orderapp230405.R

data class Pizza(
    override val name: String?,
    override val imageResource: Int,
    override val price:Double
) : Item, Parcelable{

    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readInt(),
        parcel.readDouble()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeInt(imageResource)
        parcel.writeDouble(price)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Pizza> {

        val items:Array<Item> = arrayOf(
            Pizza("Fresca", R.drawable.pizza_fresca, 5.0),
            Pizza("Kiwi", R.drawable.pizza_kiwi, 6.0),
            Pizza("Salami", R.drawable.pizza_salami, 4.0),
            Pizza("Fresca2", R.drawable.pizza_fresca, 5.0),
            Pizza("Kiwi2", R.drawable.pizza_kiwi, 6.0),
            Pizza("Salami2", R.drawable.pizza_salami, 4.0),

            )
        override fun createFromParcel(parcel: Parcel): Pizza {
            return Pizza(parcel)
        }

        override fun newArray(size: Int): Array<Pizza?> {
            return arrayOfNulls(size)
        }
    }
}