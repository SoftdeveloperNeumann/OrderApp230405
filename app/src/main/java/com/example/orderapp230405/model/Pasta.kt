package com.example.orderapp230405.model

import android.os.Parcel
import android.os.Parcelable
import com.example.orderapp230405.R

class Pasta (
   override val name: String?,
   override val imageResource: Int,
   override val price:Double
):Item{
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

    companion object CREATOR : Parcelable.Creator<Pasta> {

        val items:Array<Item> = arrayOf(
            Pasta("Nudeln1", R.drawable.nudel1,5.5),
            Pasta("Nudeln2", R.drawable.nudel2,5.5),
            Pasta("Nudeln3", R.drawable.nudel3,5.5),
            Pasta("Nudeln4", R.drawable.nudel1,5.5),
            Pasta("Nudeln5", R.drawable.nudel2,5.5),
            Pasta("Nudeln6", R.drawable.nudel3,5.5),
        )
        override fun createFromParcel(parcel: Parcel): Pasta {
            return Pasta(parcel)
        }

        override fun newArray(size: Int): Array<Pasta?> {
            return arrayOfNulls(size)
        }
    }
}