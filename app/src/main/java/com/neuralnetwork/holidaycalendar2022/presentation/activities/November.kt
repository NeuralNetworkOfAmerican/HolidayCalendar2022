package com.neuralnetwork.holidaycalendar2022.presentation.activities

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.Button
import android.widget.TextView
import com.neuralnetwork.holidaycalendar2022.R
import com.neuralnetwork.holidaycalendar2022.presentation.fragments.Celebration_dec_25
import com.neuralnetwork.holidaycalendar2022.presentation.fragments.Celebration_nov_11
import com.neuralnetwork.holidaycalendar2022.presentation.fragments.Celebration_nov_24
import com.neuralnetwork.holidaycalendar2022.tasksfeb.tasksfeb21
import com.neuralnetwork.holidaycalendar2022.tasksnov.*

class November : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_november)

        supportActionBar?.hide()
    }

    fun nov_1(view: android.view.View) {
        val taskler = Intent(this, tasksnov1::class.java)
        startActivity(taskler)
    }
    fun nov_2(view: android.view.View) {
        val taskler = Intent(this, tasksnov2::class.java)
        startActivity(taskler)
    }
    fun nov_5(view: android.view.View) {
        val taskler = Intent(this, tasksnov5::class.java)
        startActivity(taskler)
    }
    fun nov_4(view: android.view.View) {
        val taskler = Intent(this, tasksnov4::class.java)
        startActivity(taskler)
    }
    fun nov_3(view: android.view.View) {
        val taskler = Intent(this, tasksnov3::class.java)
        startActivity(taskler)
    }
    fun nov_6(view: android.view.View) {
        val taskler = Intent(this, tasksnov6::class.java)
        startActivity(taskler)
    }
    fun nov_7(view: android.view.View) {
        val taskler = Intent(this, tasksnov7::class.java)
        startActivity(taskler)
    }
    fun nov_8(view: android.view.View) {
        val taskler = Intent(this, tasksnov8::class.java)
        startActivity(taskler)
    }
    fun nov_9(view: android.view.View) {
        val taskler = Intent(this, tasksnov9::class.java)
        startActivity(taskler)
    }
    fun nov_10(view: android.view.View) {
        val taskler = Intent(this, tasksnov10::class.java)
        startActivity(taskler)
    }
    fun nov_12(view: android.view.View) {
        val taskler = Intent(this, tasksnov12::class.java)
        startActivity(taskler)
    }
    fun nov_13(view: android.view.View) {
        val taskler = Intent(this, tasksnov13::class.java)
        startActivity(taskler)
    }
    fun nov_14(view: android.view.View) {
        val taskler = Intent(this, tasksnov14::class.java)
        startActivity(taskler)
    }
    fun nov_15(view: android.view.View) {
        val taskler = Intent(this, tasksnov15::class.java)
        startActivity(taskler)
    }
    fun nov_16(view: android.view.View) {
        val taskler = Intent(this, tasksnov16::class.java)
        startActivity(taskler)
    }
    fun nov_19(view: android.view.View) {
        val taskler = Intent(this, tasksnov19::class.java)
        startActivity(taskler)
    }
    fun nov_18(view: android.view.View) {
        val taskler = Intent(this, tasksnov18::class.java)
        startActivity(taskler)
    }
    fun nov_17(view: android.view.View) {
        val taskler = Intent(this, tasksnov17::class.java)
        startActivity(taskler)
    }
    fun nov_20(view: android.view.View) {
        val taskler = Intent(this, tasksnov20::class.java)
        startActivity(taskler)
    }
    fun nov_30(view: android.view.View) {
        val taskler = Intent(this, tasksnov30::class.java)
        startActivity(taskler)
    }
    fun nov_29(view: android.view.View) {
        val taskler = Intent(this, tasksnov29::class.java)
        startActivity(taskler)
    }
    fun nov_28(view: android.view.View) {
        val taskler = Intent(this, tasksnov28::class.java)
        startActivity(taskler)
    }
    fun nov_27(view: android.view.View) {
        val taskler = Intent(this, tasksnov27::class.java)
        startActivity(taskler)
    }
    fun nov_26(view: android.view.View) {
        val taskler = Intent(this, tasksnov26::class.java)
        startActivity(taskler)
    }
    fun nov_25(view: android.view.View) {
        val taskler = Intent(this, tasksnov25::class.java)
        startActivity(taskler)
    }
    fun nov_23(view: android.view.View) {
        val taskler = Intent(this, tasksnov23::class.java)
        startActivity(taskler)
    }
    fun nov_22(view: android.view.View) {
        val taskler = Intent(this, tasksnov22::class.java)
        startActivity(taskler)
    }
    fun nov_21(view: android.view.View) {
        val taskler = Intent(this, tasksnov21::class.java)
        startActivity(taskler)
    }
    
    fun nov_24(view: android.view.View) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.celebration_nov_24, Celebration_nov_24.newInstance())
            .commit()
    }

    fun Create_task_nov_24(view: View) {
        val taskler = Intent(this, tasksnov24::class.java)
        startActivity(taskler)
    }

    fun nov_11(view: android.view.View) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.celebration_nov_11, Celebration_nov_11.newInstance())
            .commit()
    }

    fun Create_task_nov_11(view: View) {
        val taskler = Intent(this, tasksnov11::class.java)
        startActivity(taskler)
    }

    fun Exit(view: View){
        val intent: Intent = intent
        finish()
        startActivity(intent)
    }
}