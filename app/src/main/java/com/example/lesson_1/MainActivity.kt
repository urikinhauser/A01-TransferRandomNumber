package com.example.lesson_1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Random value for the second activity
        val rand1 =  Random.nextInt(1, 10)
        //Associate Second Number(tvNumber2) to the Variable (rand1)


        //Action to call second activity with the random number input to the textview2
        btActivityA.setOnClickListener {
            // Action
            //tvNumber2.text = rand1.toString()
            val intent = Intent(this, Main2Activity::class.java)
            intent.putExtra("Key1", rand1.toString())
            startActivity(intent)
       }
        tvNumber1.text = intent.getStringExtra("Key2")

    }}
