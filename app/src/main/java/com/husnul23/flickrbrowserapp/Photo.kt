package com.husnul23.flickrbrowserapp

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Photo(var title: String, var author: String, var authorId: String, var link: String, var tags: String,
            var image: String) : Parcelable