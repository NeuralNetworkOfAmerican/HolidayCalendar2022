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
import androidx.core.content.ContextCompat.startActivity
import com.neuralnetwork.holidaycalendar2022.R
import com.neuralnetwork.holidaycalendar2022.presentation.fragments.Celebration_dec_25
import com.neuralnetwork.holidaycalendar2022.presentation.fragments.Celebration_may_30
import com.neuralnetwork.holidaycalendar2022.tasksfeb.tasksfeb21
import com.neuralnetwork.holidaycalendar2022.tasksmay.*

class May : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_may)

        supportActionBar?.hide()
    }

    fun may_1(view: android.view.View) {
        val taskler = Intent(this, tasksmay1::class.java)
        startActivity(taskler)
    }
    fun may_2(view: android.view.View) {
        val taskler = Intent(this, tasksmay2::class.java)
        startActivity(taskler)
    }
    fun may_5(view: android.view.View) {
        val taskler = Intent(this, tasksmay5::class.java)
        startActivity(taskler)
    }
    fun may_4(view: android.view.View) {
        val taskler = Intent(this, tasksmay4::class.java)
        startActivity(taskler)
    }
    fun may_3(view: android.view.View) {
        val taskler = Intent(this, tasksmay3::class.java)
        startActivity(taskler)
    }
    fun may_6(view: android.view.View) {
        val taskler = Intent(this, tasksmay6::class.java)
        startActivity(taskler)
    }
    fun may_7(view: android.view.View) {
        val taskler = Intent(this, tasksmay7::class.java)
        startActivity(taskler)
    }
    fun may_8(view: android.view.View) {
        val taskler = Intent(this, tasksmay8::class.java)
        startActivity(taskler)
    }
    fun may_9(view: android.view.View) {
        val taskler = Intent(this, tasksmay9::class.java)
        startActivity(taskler)
    }
    fun may_10(view: android.view.View) {
        val taskler = Intent(this, tasksmay10::class.java)
        startActivity(taskler)
    }
    fun may_11(view: android.view.View) {
        val taskler = Intent(this, tasksmay11::class.java)
        startActivity(taskler)
    }
    fun may_12(view: android.view.View) {
        val taskler = Intent(this, tasksmay12::class.java)
        startActivity(taskler)
    }
    fun may_13(view: android.view.View) {
        val taskler = Intent(this, tasksmay13::class.java)
        startActivity(taskler)
    }
    fun may_14(view: android.view.View) {
        val taskler = Intent(this, tasksmay14::class.java)
        startActivity(taskler)
    }
    fun may_15(view: android.view.View) {
        val taskler = Intent(this, tasksmay15::class.java)
        startActivity(taskler)
    }
    fun may_16(view: android.view.View) {
        val taskler = Intent(this, tasksmay16::class.java)
        startActivity(taskler)
    }
    fun may_19(view: android.view.View) {
        val taskler = Intent(this, tasksmay19::class.java)
        startActivity(taskler)
    }
    fun may_18(view: android.view.View) {
        val taskler = Intent(this, tasksmay18::class.java)
        startActivity(taskler)
    }
    fun may_17(view: android.view.View) {
        val taskler = Intent(this, tasksmay17::class.java)
        startActivity(taskler)
    }
    fun may_20(view: android.view.View) {
        val taskler = Intent(this, tasksmay20::class.java)
        startActivity(taskler)
    }
    fun may_31(view: android.view.View) {
        val taskler = Intent(this, tasksmay31::class.java)
        startActivity(taskler)
    }
    fun may_29(view: android.view.View) {
        val taskler = Intent(this, tasksmay29::class.java)
        startActivity(taskler)
    }
    fun may_28(view: android.view.View) {
        val taskler = Intent(this, tasksmay28::class.java)
        startActivity(taskler)
    }
    fun may_27(view: android.view.View) {
        val taskler = Intent(this, tasksmay27::class.java)
        startActivity(taskler)
    }
    fun may_26(view: android.view.View) {
        val taskler = Intent(this, tasksmay26::class.java)
        startActivity(taskler)
    }
    fun may_25(view: android.view.View) {
        val taskler = Intent(this, tasksmay25::class.java)
        startActivity(taskler)
    }
    fun may_24(view: android.view.View) {
        val taskler = Intent(this, tasksmay24::class.java)
        startActivity(taskler)
    }
    fun may_23(view: android.view.View) {
        val taskler = Intent(this, tasksmay23::class.java)
        startActivity(taskler)
    }
    fun may_22(view: android.view.View) {
        val taskler = Intent(this, tasksmay22::class.java)
        startActivity(taskler)
    }
    fun may_21(view: android.view.View) {
        val taskler = Intent(this, tasksmay21::class.java)
        startActivity(taskler)
    }
    fun may_30(view: android.view.View) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.celebration_may_30, Celebration_may_30.newInstance())
            .commit()
    }

    fun Create_task_may_30(view: View) {
        val taskler = Intent(this, tasksmay30::class.java)
        startActivity(taskler)
    }

    fun Exit(view: View){
        val intent: Intent = intent
        finish()
        startActivity(intent)
    }
}