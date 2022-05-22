package com.neuralnetwork.holidaycalendar2022.presentation.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat.startActivity
import com.neuralnetwork.holidaycalendar2022.R
import com.neuralnetwork.holidaycalendar2022.presentation.fragments.Celebration_feb_21
import com.neuralnetwork.holidaycalendar2022.tasksdec.tasksdec25
import com.neuralnetwork.holidaycalendar2022.tasksfeb.*


class February : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_february)

        supportActionBar?.hide()
    }

   fun feb_1(view: android.view.View) {
        val taskler = Intent(this, tasksfeb1::class.java)
        startActivity(taskler)
    }

    fun feb_2(view: android.view.View) {
        val taskler = Intent(this, tasksfeb2::class.java)
        startActivity(taskler)
    }

    fun feb_3(view: android.view.View) {
        val taskler = Intent(this, tasksfeb3::class.java)
        startActivity(taskler)
    }

    fun feb_4(view: android.view.View) {
        val taskler = Intent(this, tasksfeb4::class.java)
        startActivity(taskler)
    }

    fun feb_5(view: android.view.View) {
        val taskler = Intent(this, tasksfeb5::class.java)
        startActivity(taskler)
    }

    fun feb_6(view: android.view.View) {
        val taskler = Intent(this, tasksfeb6::class.java)
        startActivity(taskler)
    }

    fun feb_7(view: android.view.View) {
        val taskler = Intent(this, tasksfeb7::class.java)
        startActivity(taskler)
    }

    fun feb_8(view: android.view.View) {
        val taskler = Intent(this, tasksfeb8::class.java)
        startActivity(taskler)
    }

    fun feb_9(view: android.view.View) {
        val taskler = Intent(this, tasksfeb9::class.java)
        startActivity(taskler)
    }

    fun feb_10(view: android.view.View) {
        val taskler = Intent(this, tasksfeb10::class.java)
        startActivity(taskler)
    }

    fun feb_11(view: android.view.View) {
        val taskler = Intent(this, tasksfeb11::class.java)
        startActivity(taskler)
    }

    fun feb_12(view: android.view.View) {
        val taskler = Intent(this, tasksfeb12::class.java)
        startActivity(taskler)
    }

    fun feb_13(view: android.view.View) {
        val taskler = Intent(this, tasksfeb13::class.java)
        startActivity(taskler)
    }

    fun feb_14(view: android.view.View) {
        val taskler = Intent(this, tasksfeb14::class.java)
        startActivity(taskler)
    }

    fun feb_15(view: android.view.View) {
        val taskler = Intent(this, tasksfeb15::class.java)
        startActivity(taskler)
    }

    fun feb_16(view: android.view.View) {
        val taskler = Intent(this, tasksfeb16::class.java)
        startActivity(taskler)
    }

    fun feb_17(view: android.view.View) {
        val taskler = Intent(this, tasksfeb17::class.java)
        startActivity(taskler)
    }

    fun feb_18(view: android.view.View) {
        val taskler = Intent(this, tasksfeb18::class.java)
        startActivity(taskler)
    }

    fun feb_20(view: android.view.View) {
        val taskler = Intent(this, tasksfeb20::class.java)
        startActivity(taskler)
    }

    fun feb_19(view: android.view.View) {
        val taskler = Intent(this, tasksfeb19::class.java)
        startActivity(taskler)
    }

    fun feb_21(view: android.view.View) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.celebration_feb_21, Celebration_feb_21.newInstance())
            .commit()
    }

    fun Create_task_feb_21(view: View) {
        val taskler = Intent(this, tasksfeb21::class.java)
        startActivity(taskler)
    }

    fun Exit(view: View) {
        val intent: Intent = intent
        finish()
        startActivity(intent)
    }

    fun feb_22(view: android.view.View) {
        val taskler = Intent(this, tasksfeb22::class.java)
        startActivity(taskler)
    }

    fun feb_23(view: android.view.View) {
        val taskler = Intent(this, tasksfeb23::class.java)
        startActivity(taskler)
    }

    fun feb_24(view: android.view.View) {
        val taskler = Intent(this, tasksfeb24::class.java)
        startActivity(taskler)
    }

    fun feb_25(view: android.view.View) {
        val taskler = Intent(this, tasksfeb25::class.java)
        startActivity(taskler)
    }

    fun feb_27(view: android.view.View) {
        val taskler = Intent(this, tasksfeb27::class.java)
        startActivity(taskler)
    }

    fun feb_26(view: android.view.View) {
        val taskler = Intent(this, tasksfeb26::class.java)
        startActivity(taskler)
    }

    fun feb_28(view: android.view.View) {
        val taskler = Intent(this, tasksfeb28::class.java)
        startActivity(taskler)
    }

}