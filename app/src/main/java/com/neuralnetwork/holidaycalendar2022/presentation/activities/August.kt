package com.neuralnetwork.holidaycalendar2022.presentation.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.neuralnetwork.holidaycalendar2022.R
import com.neuralnetwork.holidaycalendar2022.tasksaug.*

class August : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_august)

        supportActionBar?.hide()
    }

    fun aug_1(view: android.view.View) {
        val taskler = Intent(this, tasksaug1::class.java)
        startActivity(taskler)
    }
    fun aug_2(view: android.view.View) {
        val taskler = Intent(this, tasksaug2::class.java)
        startActivity(taskler)
    }
    fun aug_5(view: android.view.View) {
        val taskler = Intent(this, tasksaug5::class.java)
        startActivity(taskler)
    }
    fun aug_4(view: android.view.View) {
        val taskler = Intent(this, tasksaug4::class.java)
        startActivity(taskler)
    }
    fun aug_3(view: android.view.View) {
        val taskler = Intent(this, tasksaug3::class.java)
        startActivity(taskler)
    }
    fun aug_6(view: android.view.View) {
        val taskler = Intent(this, tasksaug6::class.java)
        startActivity(taskler)
    }
    fun aug_7(view: android.view.View) {
        val taskler = Intent(this, tasksaug7::class.java)
        startActivity(taskler)
    }
    fun aug_8(view: android.view.View) {
        val taskler = Intent(this, tasksaug8::class.java)
        startActivity(taskler)
    }
    fun aug_9(view: android.view.View) {
        val taskler = Intent(this, tasksaug9::class.java)
        startActivity(taskler)
    }
    fun aug_10(view: android.view.View) {
        val taskler = Intent(this, tasksaug10::class.java)
        startActivity(taskler)
    }
    fun aug_11(view: android.view.View) {
        val taskler = Intent(this, tasksaug11::class.java)
        startActivity(taskler)
    }
    fun aug_12(view: android.view.View) {
        val taskler = Intent(this, tasksaug12::class.java)
        startActivity(taskler)
    }
    fun aug_13(view: android.view.View) {
        val taskler = Intent(this, tasksaug13::class.java)
        startActivity(taskler)
    }
    fun aug_14(view: android.view.View) {
        val taskler = Intent(this, tasksaug14::class.java)
        startActivity(taskler)
    }
    fun aug_15(view: android.view.View) {
        val taskler = Intent(this, tasksaug15::class.java)
        startActivity(taskler)
    }
    fun aug_16(view: android.view.View) {
        val taskler = Intent(this, tasksaug16::class.java)
        startActivity(taskler)
    }
    fun aug_19(view: android.view.View) {
        val taskler = Intent(this, tasksaug19::class.java)
        startActivity(taskler)
    }
    fun aug_18(view: android.view.View) {
        val taskler = Intent(this, tasksaug18::class.java)
        startActivity(taskler)
    }
    fun aug_17(view: android.view.View) {
        val taskler = Intent(this, tasksaug17::class.java)
        startActivity(taskler)
    }
    fun aug_20(view: android.view.View) {
        val taskler = Intent(this, tasksaug20::class.java)
        startActivity(taskler)
    }
    fun aug_30(view: android.view.View) {
        val taskler = Intent(this, tasksaug30::class.java)
        startActivity(taskler)
    }
    fun aug_31(view: android.view.View) {
        val taskler = Intent(this, tasksaug31::class.java)
        startActivity(taskler)
    }
    fun aug_29(view: android.view.View) {
        val taskler = Intent(this, tasksaug29::class.java)
        startActivity(taskler)
    }
    fun aug_28(view: android.view.View) {
        val taskler = Intent(this, tasksaug28::class.java)
        startActivity(taskler)
    }
    fun aug_27(view: android.view.View) {
        val taskler = Intent(this, tasksaug27::class.java)
        startActivity(taskler)
    }
    fun aug_26(view: android.view.View) {
        val taskler = Intent(this, tasksaug26::class.java)
        startActivity(taskler)
    }
    fun aug_25(view: android.view.View) {
        val taskler = Intent(this, tasksaug25::class.java)
        startActivity(taskler)
    }
    fun aug_24(view: android.view.View) {
        val taskler = Intent(this, tasksaug24::class.java)
        startActivity(taskler)
    }
    fun aug_23(view: android.view.View) {
        val taskler = Intent(this, tasksaug23::class.java)
        startActivity(taskler)
    }
    fun aug_22(view: android.view.View) {
        val taskler = Intent(this, tasksaug22::class.java)
        startActivity(taskler)
    }
    fun aug_21(view: android.view.View) {
        val taskler = Intent(this, tasksaug21::class.java)
        startActivity(taskler)
    }

    fun Exit(view: View){
        val intent: Intent = intent
        finish()
        startActivity(intent)
    }
}