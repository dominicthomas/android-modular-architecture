package com.example.core

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.feature1.Feature1Fragment
import kotlinx.android.synthetic.main.activity_common.*

class CoreActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_common)
        setSupportActionBar(toolbar)

        val feature1Fragment = Feature1Fragment.newInstance()
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frameLayout, feature1Fragment, "feature1")
            .addToBackStack(null)
            .commit()
    }

}
