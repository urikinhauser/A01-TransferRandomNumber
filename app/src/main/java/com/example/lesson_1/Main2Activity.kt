package com.example.lesson_1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*
import kotlin.random.Random

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //Random value for the first activity
        val rand2 =  Random.nextInt(0, 10)
        //Associate First Number(tvNumber1) to the Variable (rand2) Using .toString

        //Action to call second activity with the random number input to the textview1( tvNumber1 ) by clicking Button2(btActivityB)
        btActivityB.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("Key2", rand2.toString())
            startActivity(intent)
        }
        //test
        tvNumber2.text = intent.getStringExtra("Key1")
    }
}
