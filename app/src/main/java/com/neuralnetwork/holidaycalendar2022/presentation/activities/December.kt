package com.neuralnetwork.holidaycalendar2022.presentation.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.neuralnetwork.holidaycalendar2022.R
import com.neuralnetwork.holidaycalendar2022.presentation.fragments.Celebration_dec_25
import com.neuralnetwork.holidaycalendar2022.presentation.fragments.Celebration_dec_26
import com.neuralnetwork.holidaycalendar2022.tasksdec.*

class December : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_december)
        supportActionBar?.hide()
    }

    fun dec_1(view: android.view.View) {
        val taskler = Intent(this, tasksdec1::class.java)
        startActivity(taskler)
    }
    fun dec_2(view: android.view.View) {
        val taskler = Intent(this, tasksdec2::class.java)
        startActivity(taskler)
    }
    fun dec_5(view: android.view.View) {
        val taskler = Intent(this, tasksdec5::class.java)
        startActivity(taskler)
    }
    fun dec_4(view: android.view.View) {
        val taskler = Intent(this, tasksdec4::class.java)
        startActivity(taskler)
    }
    fun dec_3(view: android.view.View) {
        val taskler = Intent(this, tasksdec3::class.java)
        startActivity(taskler)
    }
    fun dec_6(view: android.view.View) {
        val taskler = Intent(this, tasksdec6::class.java)
        startActivity(taskler)
    }
    fun dec_7(view: android.view.View) {
        val taskler = Intent(this, tasksdec7::class.java)
        startActivity(taskler)
    }
    fun dec_8(view: android.view.View) {
        val taskler = Intent(this, tasksdec8::class.java)
        startActivity(taskler)
    }
    fun dec_9(view: android.view.View) {
        val taskler = Intent(this, tasksdec9::class.java)
        startActivity(taskler)
    }
    fun dec_10(view: android.view.View) {
        val taskler = Intent(this, tasksdec10::class.java)
        startActivity(taskler)
    }
    fun dec_11(view: android.view.View) {
        val taskler = Intent(this, tasksdec11::class.java)
        startActivity(taskler)
    }
    fun dec_12(view: android.view.View) {
        val taskler = Intent(this, tasksdec12::class.java)
        startActivity(taskler)
    }
    fun dec_13(view: android.view.View) {
        val taskler = Intent(this, tasksdec13::class.java)
        startActivity(taskler)
    }
    fun dec_14(view: android.view.View) {
        val taskler = Intent(this, tasksdec14::class.java)
        startActivity(taskler)
    }
    fun dec_15(view: android.view.View) {
        val taskler = Intent(this, tasksdec15::class.java)
        startActivity(taskler)
    }
    fun dec_16(view: android.view.View) {
        val taskler = Intent(this, tasksdec16::class.java)
        startActivity(taskler)
    }
    fun dec_19(view: android.view.View) {
        val taskler = Intent(this, tasksdec19::class.java)
        startActivity(taskler)
    }
    fun dec_18(view: android.view.View) {
        val taskler = Intent(this, tasksdec18::class.java)
        startActivity(taskler)
    }
    fun dec_17(view: android.view.View) {
        val taskler = Intent(this, tasksdec17::class.java)
        startActivity(taskler)
    }
    fun dec_20(view: android.view.View) {
        val taskler = Intent(this, tasksdec20::class.java)
        startActivity(taskler)
    }
    fun dec_31(view: android.view.View) {
        val taskler = Intent(this, tasksdec31::class.java)
        startActivity(taskler)
    }
    fun dec_30(view: android.view.View) {
        val taskler = Intent(this, tasksdec30::class.java)
        startActivity(taskler)
    }
    fun dec_29(view: android.view.View) {
        val taskler = Intent(this, tasksdec29::class.java)
        startActivity(taskler)
    }
    fun dec_28(view: android.view.View) {
        val taskler = Intent(this, tasksdec28::class.java)
        startActivity(taskler)
    }
    fun dec_27(view: android.view.View) {
        val taskler = Intent(this, tasksdec27::class.java)
        startActivity(taskler)
    }
    fun dec_24(view: android.view.View) {
        val taskler = Intent(this, tasksdec24::class.java)
        startActivity(taskler)
    }
    fun dec_23(view: android.view.View) {
        val taskler = Intent(this, tasksdec23::class.java)
        startActivity(taskler)
    }
    fun dec_22(view: android.view.View) {
        val taskler = Intent(this, tasksdec22::class.java)
        startActivity(taskler)
    }
    fun dec_21(view: android.view.View) {
        val taskler = Intent(this, tasksdec21::class.java)
        startActivity(taskler)
    }
    
    fun dec_25(view: android.view.View) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.celebration_dec_25, Celebration_dec_25.newInstance())
            .commit()
    }

    fun Create_task_25dec(view: View) {
        val taskler = Intent(this, tasksdec25::class.java)
        startActivity(taskler)
    }

    fun dec_26(view: android.view.View) {
        supportFragmentManager
            .beginTransaction()
            .add(R.id.celebration_dec_26, Celebration_dec_26.newInstance())
            .commit()

    }

    fun Create_task_26dec(view: View) {
        val taskler = Intent(this, tasksdec26::class.java)
        startActivity(taskler)
    }

    fun Exit(view: View){
        val intent: Intent = intent
        finish()
        startActivity(intent)
    }

}