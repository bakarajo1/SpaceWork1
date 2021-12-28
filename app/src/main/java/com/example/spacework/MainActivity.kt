package com.example.spacework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.view.isGone

class MainActivity : AppCompatActivity() {

    lateinit var textView: TextView
    lateinit var linearLayout: LinearLayout
    lateinit var button1 :Button
    lateinit var buttonMinus: Button
    lateinit var buttonPlus: Button

    var displayInt=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        textView=findViewById(R.id.textView)
        linearLayout=findViewById(R.id.linearCenter)
        button1=findViewById(R.id.button)
        buttonMinus=findViewById(R.id.buttonMinus)
        buttonPlus=findViewById(R.id.buttonPlus)

    }

    fun b1(view: View) {

        view.isGone=true


        linearLayout.isGone=false


    }
    fun bMinus(view: View) {
        displayInt--

        textView.text= displayInt.toString()



    }
    fun bPlus(view: View) {

        displayInt++ 

        textView.text= displayInt.toString()
    }
}