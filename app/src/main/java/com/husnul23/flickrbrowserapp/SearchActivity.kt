package com.husnul23.flickrbrowserapp

import android.os.Bundle
import android.util.Log

class SearchActivity : BaseActivity() {
    private val TAG = "SearchActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG,"onCreate: ends")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)
        activateToolbar(true)
        Log.d(TAG,"onCreate: ends")
    }
}