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
import com.neuralnetwork.holidaycalendar2022.presentation.fragments.Celebration_oct_10
import com.neuralnetwork.holidaycalendar2022.tasksnov.tasksnov24
import com.neuralnetwork.holidaycalendar2022.tasksoct.*


class October : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_october)

        supportActionBar?.hide()
    }

     fun oct_1(view: android.view.View) {
        val taskler = Intent(this, tasksoct1::class.java)
        startActivity(taskler)
    }
    fun oct_2(view: android.view.View) {
        val taskler = Intent(this, tasksoct2::class.java)
        startActivity(taskler)
    }
    fun oct_5(view: android.view.View) {
        val taskler = Intent(this, tasksoct5::class.java)
        startActivity(taskler)
    }
    fun oct_4(view: android.view.View) {
        val taskler = Intent(this, tasksoct4::class.java)
        startActivity(taskler)
    }
    fun oct_3(view: android.view.View) {
        val taskler = Intent(this, tasksoct3::class.java)
        startActivity(taskler)
    }
    fun oct_6(view: android.view.View) {
        val taskler = Intent(this, tasksoct6::class.java)
        startActivity(taskler)
    }
    fun oct_7(view: android.view.View) {
        val taskler = Intent(this, tasksoct7::class.java)
        startActivity(taskler)
    }
    fun oct_8(view: android.view.View) {
        val taskler = Intent(this, tasksoct8::class.java)
        startActivity(taskler)
    }
    fun oct_9(view: android.view.View) {
        val taskler = Intent(this, tasksoct9::class.java)
        startActivity(taskler)
    }
    fun oct_11(view: android.view.View) {
        val taskler = Intent(this, tasksoct11::class.java)
        startActivity(taskler)
    }
    fun oct_12(view: android.view.View) {
        val taskler = Intent(this, tasksoct12::class.java)
        startActivity(taskler)
    }
    fun oct_13(view: android.view.View) {
        val taskler = Intent(this, tasksoct13::class.java)
        startActivity(taskler)
    }
    fun oct_14(view: android.view.View) {
        val taskler = Intent(this, tasksoct14::class.java)
        startActivity(taskler)
    }
    fun oct_15(view: android.view.View) {
        val taskler = Intent(this, tasksoct15::class.java)
        startActivity(taskler)
    }
    fun oct_16(view: android.view.View) {
        val taskler = Intent(this, tasksoct16::class.java)
        startActivity(taskler)
    }
    fun oct_19(view: android.view.View) {
        val taskler = Intent(this, tasksoct19::class.java)
        startActivity(taskler)
    }
    fun oct_18(view: android.view.View) {
        val taskler = Intent(this, tasksoct18::class.java)
        startActivity(taskler)
    }
    fun oct_17(view: android.view.View) {
        val taskler = Intent(this, tasksoct17::class.java)
        startActivity(taskler)
    }
    fun oct_20(view: android.view.View) {
        val taskler = Intent(this, tasksoct20::class.java)
        startActivity(taskler)
    }
    fun oct_31(view: android.view.View) {
        val taskler = Intent(this, tasksoct31::class.java)
        startActivity(taskler)
    }
    fun oct_30(view: android.view.View) {
        val taskler = Intent(this, tasksoct30::class.java)
        startActivity(taskler)
    }
    fun oct_29(view: android.view.View) {
        val taskler = Intent(this, tasksoct29::class.java)
        startActivity(taskler)
    }
    fun oct_28(view: android.view.View) {
        val taskler = Intent(this, tasksoct28::class.java)
        startActivity(taskler)
    }
    fun oct_27(view: android.view.View) {
        val taskler = Intent(this, tasksoct27::class.java)
        startActivity(taskler)
    }
    fun oct_26(view: android.view.View) {
        val taskler = Intent(this, tasksoct26::class.java)
        startActivity(taskler)
    }
    fun oct_25(view: android.view.View) {
        val taskler = Intent(this, tasksoct25::class.java)
        startActivity(taskler)
    }
    fun oct_24(view: android.view.View) {
        val taskler = Intent(this, tasksoct24::class.java)
        startActivity(taskler)
    }
    fun oct_23(view: android.view.View) {
        val taskler = Intent(this, tasksoct23::class.java)
        startActivity(taskler)
    }
    fun oct_22(view: android.view.View) {
        val taskler = Intent(this, tasksoct22::class.java)
        startActivity(taskler)
    }
    fun oct_21(view: android.view.View) {
        val taskler = Intent(this, tasksoct21::class.java)
        startActivity(taskler)
    }
    
    fun oct_10(view: android.view.View) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.celebration_oct_10, Celebration_oct_10.newInstance())
            .commit()
    }

    fun Create_task_oct_10(view: View) {
        val taskler = Intent(this, tasksoct10::class.java)
        startActivity(taskler)
    }

    fun Exit(view: View){
        val intent: Intent = intent
        finish()
        startActivity(intent)
    }
}