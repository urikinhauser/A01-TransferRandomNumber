package com.example.lesson_1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    //Random value for the first activity
    val rand1 =  Random.nextInt(0, 10)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //Action to call second activity with the random number input to the textview1
        btActivityB.setOnClickListener()
        //test
    }
}
