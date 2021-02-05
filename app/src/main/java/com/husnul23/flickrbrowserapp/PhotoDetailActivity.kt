package com.husnul23.flickrbrowserapp

import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.brows.*
import kotlinx.android.synthetic.main.content_photo_detail.*

class PhotoDetailActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo_detail)
        activateToolbar(true)

        val photo = intent.getSerializableExtra(PHOTO_TRANSFER) as Photo

        photo_title.text = photo.title
        photo_tag.text = photo.tags
        photo_author.text = photo.author

        Picasso.with(this).load(photo.link)
                .error(R.drawable.placeholder)
                .placeholder(R.drawable.placeholder)
                .into(imageView)
    }
}