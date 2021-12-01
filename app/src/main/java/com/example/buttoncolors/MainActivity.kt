package com.example.buttoncolors

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var clickRed="Red"
    var clickYellow="Yellow"
    var clickGreen="Green"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val clickColorDisplayView=findViewById<TextView>(R.id.notClicked)
        val clickRedButton=findViewById<TextView>(R.id.redColor)
        val clickYellowButton=findViewById<TextView>(R.id.yellowColor)
        val clickGreenButton=findViewById<TextView>(R.id.greenColor)

        clickRedButton.setOnClickListener {
            clickColorDisplayView.text="You Have Clicked $clickRed color"
        }


        clickYellowButton.setOnClickListener {
            clickColorDisplayView.text="You Have Clicked $clickYellow color"
        }

        clickGreenButton.setOnClickListener {
            clickColorDisplayView.text="You Have Clicked $clickGreen color"
        }

    }
}