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
import com.neuralnetwork.holidaycalendar2022.presentation.fragments.Celebration_jul_4
import com.neuralnetwork.holidaycalendar2022.tasksfeb.tasksfeb21
import com.neuralnetwork.holidaycalendar2022.tasksjul.*

class July : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_july)

        supportActionBar?.hide()
    }

    fun jul_1(view: android.view.View) {
        val taskler = Intent(this, tasksjul1::class.java)
        startActivity(taskler)
    }
    fun jul_2(view: android.view.View) {
        val taskler = Intent(this, tasksjul2::class.java)
        startActivity(taskler)
    }
    fun jul_5(view: android.view.View) {
        val taskler = Intent(this, tasksjul5::class.java)
        startActivity(taskler)
    }
    fun jul_4(view: android.view.View) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.celebration_jul_4, Celebration_jul_4.newInstance())
            .commit()
    }

    fun Create_task_jul_4(view: View) {
        val taskler = Intent(this, tasksjul4::class.java)
        startActivity(taskler)
    }

    fun Exit(view: View) {
        val intent: Intent = intent
        finish()
        startActivity(intent)
    }

    fun jul_3(view: android.view.View) {
        val taskler = Intent(this, tasksjul3::class.java)
        startActivity(taskler)
    }
    fun jul_6(view: android.view.View) {
        val taskler = Intent(this, tasksjul6::class.java)
        startActivity(taskler)
    }
    fun jul_7(view: android.view.View) {
        val taskler = Intent(this, tasksjul7::class.java)
        startActivity(taskler)
    }
    fun jul_8(view: android.view.View) {
        val taskler = Intent(this, tasksjul8::class.java)
        startActivity(taskler)
    }
    fun jul_9(view: android.view.View) {
        val taskler = Intent(this, tasksjul9::class.java)
        startActivity(taskler)
    }
    fun jul_10(view: android.view.View) {
        val taskler = Intent(this, tasksjul10::class.java)
        startActivity(taskler)
    }
    fun jul_11(view: android.view.View) {
        val taskler = Intent(this, tasksjul11::class.java)
        startActivity(taskler)
    }
    fun jul_12(view: android.view.View) {
        val taskler = Intent(this, tasksjul12::class.java)
        startActivity(taskler)
    }
    fun jul_13(view: android.view.View) {
        val taskler = Intent(this, tasksjul13::class.java)
        startActivity(taskler)
    }
    fun jul_14(view: android.view.View) {
        val taskler = Intent(this, tasksjul14::class.java)
        startActivity(taskler)
    }
    fun jul_15(view: android.view.View) {
        val taskler = Intent(this, tasksjul15::class.java)
        startActivity(taskler)
    }
    fun jul_16(view: android.view.View) {
        val taskler = Intent(this, tasksjul16::class.java)
        startActivity(taskler)
    }
    fun jul_19(view: android.view.View) {
        val taskler = Intent(this, tasksjul19::class.java)
        startActivity(taskler)
    }
    fun jul_18(view: android.view.View) {
        val taskler = Intent(this, tasksjul18::class.java)
        startActivity(taskler)
    }
    fun jul_17(view: android.view.View) {
        val taskler = Intent(this, tasksjul17::class.java)
        startActivity(taskler)
    }
    fun jul_20(view: android.view.View) {
        val taskler = Intent(this, tasksjul20::class.java)
        startActivity(taskler)
    }
    fun jul_31(view: android.view.View) {
        val taskler = Intent(this, tasksjul31::class.java)
        startActivity(taskler)
    }
    fun jul_30(view: android.view.View) {
        val taskler = Intent(this, tasksjul30::class.java)
        startActivity(taskler)
    }
    fun jul_29(view: android.view.View) {
        val taskler = Intent(this, tasksjul29::class.java)
        startActivity(taskler)
    }
    fun jul_28(view: android.view.View) {
        val taskler = Intent(this, tasksjul28::class.java)
        startActivity(taskler)
    }
    fun jul_27(view: android.view.View) {
        val taskler = Intent(this, tasksjul27::class.java)
        startActivity(taskler)
    }
    fun jul_26(view: android.view.View) {
        val taskler = Intent(this, tasksjul26::class.java)
        startActivity(taskler)
    }
    fun jul_25(view: android.view.View) {
        val taskler = Intent(this, tasksjul25::class.java)
        startActivity(taskler)
    }
    fun jul_24(view: android.view.View) {
        val taskler = Intent(this, tasksjul24::class.java)
        startActivity(taskler)
    }
    fun jul_23(view: android.view.View) {
        val taskler = Intent(this, tasksjul23::class.java)
        startActivity(taskler)
    }
    fun jul_22(view: android.view.View) {
        val taskler = Intent(this, tasksjul22::class.java)
        startActivity(taskler)
    }
    fun jul_21(view: android.view.View) {
        val taskler = Intent(this, tasksjul21::class.java)
        startActivity(taskler)
    }
}