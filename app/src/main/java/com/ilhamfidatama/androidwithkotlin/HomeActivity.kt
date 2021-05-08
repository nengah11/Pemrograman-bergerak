package com.ilhamfidatama.androidwithkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val mFragmentManager = supportFragmentManager
        val mMovieFragment = MovieFragment()
        mFragmentManager
            .beginTransaction()
            .add(R.id.frame_container, mMovieFragment, MovieFragment::class.java.simpleName)
            .commit()

    }
}