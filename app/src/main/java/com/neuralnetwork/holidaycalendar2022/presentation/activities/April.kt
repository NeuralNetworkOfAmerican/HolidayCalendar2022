package com.neuralnetwork.holidaycalendar2022.presentation.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.neuralnetwork.holidaycalendar2022.R
import com.neuralnetwork.holidaycalendar2022.tasksapr.*

class April : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_april)

        supportActionBar?.hide()
    }

    fun apr_1(view: android.view.View) {
        val taskler = Intent(this, tasksapr1::class.java)
        startActivity(taskler)
    }
    fun apr_2(view: android.view.View) {
        val taskler = Intent(this, tasksapr2::class.java)
        startActivity(taskler)
    }
    fun apr_5(view: android.view.View) {
        val taskler = Intent(this, tasksapr5::class.java)
        startActivity(taskler)
    }
    fun apr_4(view: android.view.View) {
        val taskler = Intent(this, tasksapr4::class.java)
        startActivity(taskler)
    }
    fun apr_3(view: android.view.View) {
        val taskler = Intent(this, tasksapr3::class.java)
        startActivity(taskler)
    }
    fun apr_6(view: android.view.View) {
        val taskler = Intent(this, tasksapr6::class.java)
        startActivity(taskler)
    }
    fun apr_7(view: android.view.View) {
        val taskler = Intent(this, tasksapr7::class.java)
        startActivity(taskler)
    }
    fun apr_8(view: android.view.View) {
        val taskler = Intent(this, tasksapr8::class.java)
        startActivity(taskler)
    }
    fun apr_9(view: android.view.View) {
        val taskler = Intent(this, tasksapr9::class.java)
        startActivity(taskler)
    }
    fun apr_10(view: android.view.View) {
        val taskler = Intent(this, tasksapr10::class.java)
        startActivity(taskler)
    }
    fun apr_11(view: android.view.View) {
        val taskler = Intent(this, tasksapr11::class.java)
        startActivity(taskler)
    }
    fun apr_12(view: android.view.View) {
        val taskler = Intent(this, tasksapr12::class.java)
        startActivity(taskler)
    }
    fun apr_13(view: android.view.View) {
        val taskler = Intent(this, tasksapr13::class.java)
        startActivity(taskler)
    }
    fun apr_14(view: android.view.View) {
        val taskler = Intent(this, tasksapr14::class.java)
        startActivity(taskler)
    }
    fun apr_15(view: android.view.View) {
        val taskler = Intent(this, tasksapr15::class.java)
        startActivity(taskler)
    }
    fun apr_16(view: android.view.View) {
        val taskler = Intent(this, tasksapr16::class.java)
        startActivity(taskler)
    }
    fun apr_19(view: android.view.View) {
        val taskler = Intent(this, tasksapr19::class.java)
        startActivity(taskler)
    }
    fun apr_18(view: android.view.View) {
        val taskler = Intent(this, tasksapr18::class.java)
        startActivity(taskler)
    }
    fun apr_17(view: android.view.View) {
        val taskler = Intent(this, tasksapr17::class.java)
        startActivity(taskler)
    }
    fun apr_20(view: android.view.View) {
        val taskler = Intent(this, tasksapr20::class.java)
        startActivity(taskler)
    }
    fun apr_30(view: android.view.View) {
        val taskler = Intent(this, tasksapr30::class.java)
        startActivity(taskler)
    }
    fun apr_29(view: android.view.View) {
        val taskler = Intent(this, tasksapr29::class.java)
        startActivity(taskler)
    }
    fun apr_28(view: android.view.View) {
        val taskler = Intent(this, tasksapr28::class.java)
        startActivity(taskler)
    }
    fun apr_27(view: android.view.View) {
        val taskler = Intent(this, tasksapr27::class.java)
        startActivity(taskler)
    }
    fun apr_26(view: android.view.View) {
        val taskler = Intent(this, tasksapr26::class.java)
        startActivity(taskler)
    }
    fun apr_25(view: android.view.View) {
        val taskler = Intent(this, tasksapr25::class.java)
        startActivity(taskler)
    }
    fun apr_24(view: android.view.View) {
        val taskler = Intent(this, tasksapr24::class.java)
        startActivity(taskler)
    }
    fun apr_23(view: android.view.View) {
        val taskler = Intent(this, tasksapr23::class.java)
        startActivity(taskler)
    }
    fun apr_22(view: android.view.View) {
        val taskler = Intent(this, tasksapr22::class.java)
        startActivity(taskler)
    }
    fun apr_21(view: android.view.View) {
        val taskler = Intent(this, tasksapr21::class.java)
        startActivity(taskler)
    }

    fun Exit(view: View){
        val intent: Intent = intent
        finish()
        startActivity(intent)
    }
}