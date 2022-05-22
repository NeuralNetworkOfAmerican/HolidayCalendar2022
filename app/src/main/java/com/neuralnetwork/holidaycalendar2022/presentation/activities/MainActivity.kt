package com.neuralnetwork.holidaycalendar2022.presentation.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.neuralnetwork.holidaycalendar2022.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()
    }

    fun ButtonJanuary (view: View) {
        val JanuaryIntent = Intent(this, January::class.java)
        startActivity(JanuaryIntent)
    }

    fun ButtonFebruary (view: View) {
        val FebruaryIntent = Intent(this, February::class.java)
        startActivity(FebruaryIntent)
    }

    fun ButtonMarch (view: View) {
        val MarchIntent = Intent(this, March::class.java)
        startActivity(MarchIntent)
    }

    fun ButtonApril (view: View) {
        val AprilIntent = Intent(this, April::class.java)
        startActivity(AprilIntent)
    }

    fun ButtonMay (view: View) {
        val MayIntent = Intent(this, May::class.java)
        startActivity(MayIntent)
    }

    fun ButtonJune (view: View) {
        val JuneIntent = Intent(this, June::class.java)
        startActivity(JuneIntent)
    }

    fun ButtonJuly (view: View) {
        val JulyIntent = Intent(this, July::class.java)
        startActivity(JulyIntent)
    }

    fun ButtonAugust (view: View) {
        val AugustIntent = Intent(this, August::class.java)
        startActivity(AugustIntent)
    }

    fun ButtonSeptember (view: View) {
        val SeptemberIntent = Intent(this, September::class.java)
        startActivity(SeptemberIntent)
    }

    fun ButtonOctober (view: View) {
        val OctoberIntent = Intent(this, October::class.java)
        startActivity(OctoberIntent)
    }

    fun ButtonNovember (view: View) {
        val NovemberIntent = Intent(this, November::class.java)
        startActivity(NovemberIntent)
    }

    fun ButtonDecember (view: View) {
        val DecemberIntent = Intent(this, December::class.java)
        startActivity(DecemberIntent)
    }
}