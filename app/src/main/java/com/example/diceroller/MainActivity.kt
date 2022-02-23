package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private lateinit var diceImage : ImageView
    private lateinit var diceImageSecond : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
        diceImage = findViewById(R.id.dice_image)
        diceImageSecond = findViewById(R.id.dice_image_second)

        val resetButton: Button = findViewById(R.id.reset_button)
        resetButton.setOnClickListener { reset() }
    }

    private fun reset() {
        diceImage.setImageResource(R.drawable.empty_dice)
        diceImageSecond.setImageResource(R.drawable.empty_dice)
    }

    private fun getRandomDiceImage() : Int {
        val drawableResource = when ((1..6).random()) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        return drawableResource
    }

    private fun rollDice(){
        var res = getRandomDiceImage()

        diceImage.setImageResource(res)

        res = getRandomDiceImage()
        diceImageSecond.setImageResource(res)
    }
}