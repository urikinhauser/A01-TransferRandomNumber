package com.example.lesson_1

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Random value for the second activity
        val rand1 =  Random.nextInt(0, 10)
        //Associate Second Number(tvNumber2) to the Variable (rand1)
//        tvNumber2.text = String.valueOf(rand1)

        //Testing the Val into textView
        tvNumber1.text = String.valueOf(rand1)


        //Action to call second activity with the random number input to the textview2
       // btActivityA.setOnClickListener {
            // Action
           // tvNumber1.setText(rand1)
       //}


    }}
