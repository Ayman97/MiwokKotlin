package com.aymanalrifai.MiwokKotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set a click listener on that View
        numbers.setOnClickListener {
            // Create a new intent to open the {@link NumbersActivity}
            val numbersIntent = Intent(this@MainActivity, NumbersActivity::class.java)

            // Start the new activity
            startActivity(numbersIntent)
        }

        // Set a click listener on that View
        family.setOnClickListener {
            // Create a new intent to open the {@link FamilyActivity}
            val familyIntent = Intent(this@MainActivity, FamilyActivity::class.java)

            // Start the new activity
            startActivity(familyIntent)
        }

        // Set a click listener on that View
        colors.setOnClickListener {
            // Create a new intent to open the {@link ColorsActivity}
            val colorsIntent = Intent(this@MainActivity, ColorsActivity::class.java)

            // Start the new activity
            startActivity(colorsIntent)
        }

        // Set a click listener on that View
        phrases.setOnClickListener {
            // Create a new intent to open the {@link PhrasesActivity}
            val phrasesIntent = Intent(this@MainActivity, PhrasesActivity::class.java)

            // Start the new activity
            startActivity(phrasesIntent)
        }
    }
}
