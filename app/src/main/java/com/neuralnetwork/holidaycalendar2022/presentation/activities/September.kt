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
import com.neuralnetwork.holidaycalendar2022.presentation.fragments.Celebration_sep_5
import com.neuralnetwork.holidaycalendar2022.tasksnov.tasksnov24
import com.neuralnetwork.holidaycalendar2022.taskssep.*


class September : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_september)

        supportActionBar?.hide()
    }

    fun sep_1(view: android.view.View) {
        val taskler = Intent(this, taskssep1::class.java)
        startActivity(taskler)
    }
    fun sep_2(view: android.view.View) {
        val taskler = Intent(this, taskssep2::class.java)
        startActivity(taskler)
    }
    fun sep_4(view: android.view.View) {
        val taskler = Intent(this, taskssep4::class.java)
        startActivity(taskler)
    }
    fun sep_3(view: android.view.View) {
        val taskler = Intent(this, taskssep3::class.java)
        startActivity(taskler)
    }
    fun sep_6(view: android.view.View) {
        val taskler = Intent(this, taskssep6::class.java)
        startActivity(taskler)
    }
    fun sep_7(view: android.view.View) {
        val taskler = Intent(this, taskssep7::class.java)
        startActivity(taskler)
    }
    fun sep_8(view: android.view.View) {
        val taskler = Intent(this, taskssep8::class.java)
        startActivity(taskler)
    }
    fun sep_9(view: android.view.View) {
        val taskler = Intent(this, taskssep9::class.java)
        startActivity(taskler)
    }
    fun sep_10(view: android.view.View) {
        val taskler = Intent(this, taskssep10::class.java)
        startActivity(taskler)
    }
    fun sep_11(view: android.view.View) {
        val taskler = Intent(this, taskssep11::class.java)
        startActivity(taskler)
    }
    fun sep_12(view: android.view.View) {
        val taskler = Intent(this, taskssep12::class.java)
        startActivity(taskler)
    }
    fun sep_13(view: android.view.View) {
        val taskler = Intent(this, taskssep13::class.java)
        startActivity(taskler)
    }
    fun sep_14(view: android.view.View) {
        val taskler = Intent(this, taskssep14::class.java)
        startActivity(taskler)
    }
    fun sep_15(view: android.view.View) {
        val taskler = Intent(this, taskssep15::class.java)
        startActivity(taskler)
    }
    fun sep_16(view: android.view.View) {
        val taskler = Intent(this, taskssep16::class.java)
        startActivity(taskler)
    }
    fun sep_19(view: android.view.View) {
        val taskler = Intent(this, taskssep19::class.java)
        startActivity(taskler)
    }
    fun sep_18(view: android.view.View) {
        val taskler = Intent(this, taskssep18::class.java)
        startActivity(taskler)
    }
    fun sep_17(view: android.view.View) {
        val taskler = Intent(this, taskssep17::class.java)
        startActivity(taskler)
    }
    fun sep_20(view: android.view.View) {
        val taskler = Intent(this, taskssep20::class.java)
        startActivity(taskler)
    }
    fun sep_30(view: android.view.View) {
        val taskler = Intent(this, taskssep30::class.java)
        startActivity(taskler)
    }
    fun sep_29(view: android.view.View) {
        val taskler = Intent(this, taskssep29::class.java)
        startActivity(taskler)
    }
    fun sep_28(view: android.view.View) {
        val taskler = Intent(this, taskssep28::class.java)
        startActivity(taskler)
    }
    fun sep_27(view: android.view.View) {
        val taskler = Intent(this, taskssep27::class.java)
        startActivity(taskler)
    }
    fun sep_26(view: android.view.View) {
        val taskler = Intent(this, taskssep26::class.java)
        startActivity(taskler)
    }
    fun sep_25(view: android.view.View) {
        val taskler = Intent(this, taskssep25::class.java)
        startActivity(taskler)
    }
    fun sep_24(view: android.view.View) {
        val taskler = Intent(this, taskssep24::class.java)
        startActivity(taskler)
    }
    fun sep_23(view: android.view.View) {
        val taskler = Intent(this, taskssep23::class.java)
        startActivity(taskler)
    }
    fun sep_22(view: android.view.View) {
        val taskler = Intent(this, taskssep22::class.java)
        startActivity(taskler)
    }
    fun sep_21(view: android.view.View) {
        val taskler = Intent(this, taskssep21::class.java)
        startActivity(taskler)
    }
    
    fun sep_5(view: android.view.View) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.celebration_sep_5, Celebration_sep_5.newInstance())
            .commit()
    }

    fun Create_task_sep_5(view: View) {
        val taskler = Intent(this, taskssep5::class.java)
        startActivity(taskler)
    }

    fun Exit(view: View){
        val intent: Intent = intent
        finish()
        startActivity(intent)
    }
}