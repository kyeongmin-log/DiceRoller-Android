package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val countUpButton: Button = findViewById(R.id.count_up_button)
        countUpButton.setOnClickListener { countUp() }
    }

    private fun countUp() {
        val resultText: TextView = findViewById(R.id.result_text)
        val resultString = resultText.text.toString()
//        Log.i("resultString", resultString)
        if(resultString == "Click Roll Button!"){
            resultText.text = "1"
        } else {
            if(resultString != "6"){
                resultText.text = (resultString.toInt() + 1).toString()
            }
        }
    }

    private fun rollDice(){
//        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
        val randomInt = (1..6).random()

        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()
    }
}