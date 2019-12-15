package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


// the main class used by the android app
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
