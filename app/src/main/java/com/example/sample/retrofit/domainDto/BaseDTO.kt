package com.example.velvetlifestyleassignment.retrofit.domainDto

import android.os.Parcel
import android.os.Parcelable

open class BaseDTO() : Parcelable {
    constructor(parcel: Parcel) : this() {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<BaseDTO> {
        override fun createFromParcel(parcel: Parcel): BaseDTO {
            return BaseDTO(parcel)
        }

        override fun newArray(size: Int): Array<BaseDTO?> {
            return arrayOfNulls(size)
        }
    }
}