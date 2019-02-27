package com.example.lesson_1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.R
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    //Random value for the second activity
    val rand2 =  Random.nextInt(0, 10)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Action to call second activity with the random number input to the textview2
        btActivityA.setOnClickListener()
    }


}
