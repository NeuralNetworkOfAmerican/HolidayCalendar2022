package com.neuralnetwork.holidaycalendar2022.presentation.activities

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.*
import com.neuralnetwork.holidaycalendar2022.R
import com.neuralnetwork.holidaycalendar2022.db.MyDbManagerJan1
import com.neuralnetwork.holidaycalendar2022.presentation.fragments.Celebration_dec_25
import com.neuralnetwork.holidaycalendar2022.presentation.fragments.Celebration_jan_1
import com.neuralnetwork.holidaycalendar2022.presentation.fragments.Celebration_jan_17
import com.neuralnetwork.holidaycalendar2022.tasksfeb.tasksfeb21
import com.neuralnetwork.holidaycalendar2022.tasksjan.*

class January : AppCompatActivity() {

    val myDbManagerJan1 = MyDbManagerJan1(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_january)


        supportActionBar?.hide()
    }

    fun jan_1(view: android.view.View) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.celebration_jan_1, Celebration_jan_1.newInstance())
            .commit()
    }

    fun Create_task_jan_1(view: View) {
        val taskler = Intent(this, tasksjan1::class.java)
        startActivity(taskler)
    }

    fun jan_2(view: android.view.View) {
            val taskler = Intent(this, tasksjan2::class.java)
            startActivity(taskler)
    }

    fun jan_3(view: android.view.View) {
        val taskler = Intent(this, tasksjan3::class.java)
        startActivity(taskler)
    }

    fun jan_4(view: android.view.View) {
        val taskler = Intent(this, tasksjan4::class.java)
        startActivity(taskler)
    }

    fun jan_5(view: android.view.View) {
        val taskler = Intent(this, tasksjan5::class.java)
        startActivity(taskler)
    }

    fun jan_6(view: android.view.View) {
        val taskler = Intent(this, tasksjan6::class.java)
        startActivity(taskler)
    }

    fun jan_7(view: android.view.View) {
        val taskler = Intent(this, tasksjan7::class.java)
        startActivity(taskler)
    }

    fun jan_8(view: android.view.View) {
        val taskler = Intent(this, tasksjan8::class.java)
        startActivity(taskler)
    }

    fun jan_9(view: android.view.View) {
        val taskler = Intent(this, tasksjan9::class.java)
        startActivity(taskler)
    }

    fun jan_10(view: android.view.View) {
        val taskler = Intent(this, tasksjan10::class.java)
        startActivity(taskler)
    }

    fun jan_11(view: android.view.View) {
        val taskler = Intent(this, tasksjan11::class.java)
        startActivity(taskler)
    }

    fun jan_12(view: android.view.View) {
        val taskler = Intent(this, tasksjan12::class.java)
        startActivity(taskler)
    }

    fun jan_13(view: android.view.View) {
        val taskler = Intent(this, tasksjan13::class.java)
        startActivity(taskler)
    }

    fun jan_14(view: android.view.View) {
        val taskler = Intent(this, tasksjan14::class.java)
        startActivity(taskler)
    }

    fun jan_15(view: android.view.View) {
        val taskler = Intent(this, tasksjan15::class.java)
        startActivity(taskler)
    }

    fun jan_16(view: android.view.View) {
        val taskler = Intent(this, tasksjan16::class.java)
        startActivity(taskler)
    }

    fun jan_17(view: android.view.View) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.celebration_jan_17, Celebration_jan_17.newInstance())
            .commit()
    }

    fun Create_task_jan_17(view: View) {
        val taskler = Intent(this, tasksjan17::class.java)
        startActivity(taskler)
    }

    fun Exit(view: View) {
        val intent: Intent = intent
        finish()
        startActivity(intent)
    }

    fun jan_18(view: android.view.View) {
        val taskler = Intent(this, tasksjan18::class.java)
        startActivity(taskler)
    }

    fun jan_19(view: android.view.View) {
        val taskler = Intent(this, tasksjan19::class.java)
        startActivity(taskler)
    }

    fun jan_20(view: android.view.View) {
        val taskler = Intent(this, tasksjan20::class.java)
        startActivity(taskler)
    }

    fun jan_21(view: android.view.View) {
        val taskler = Intent(this, tasksjan21::class.java)
        startActivity(taskler)
    }

    fun jan_22(view: android.view.View) {
        val taskler = Intent(this, tasksjan22::class.java)
        startActivity(taskler)
    }

    fun jan_23(view: android.view.View) {
        val taskler = Intent(this, tasksjan23::class.java)
        startActivity(taskler)
    }

    fun jan_24(view: android.view.View) {
        val taskler = Intent(this, tasksjan24::class.java)
        startActivity(taskler)
    }

    fun jan_25(view: android.view.View) {
        val taskler = Intent(this, tasksjan25::class.java)
        startActivity(taskler)
    }

    fun jan_26(view: android.view.View) {
        val taskler = Intent(this, tasksjan26::class.java)
        startActivity(taskler)
    }

    fun jan_27(view: android.view.View) {
        val taskler = Intent(this, tasksjan27::class.java)
        startActivity(taskler)
    }

    fun jan_28(view: android.view.View) {
        val taskler = Intent(this, tasksjan28::class.java)
        startActivity(taskler)
    }

    fun jan_29(view: android.view.View) {
        val taskler = Intent(this, tasksjan29::class.java)
        startActivity(taskler)
    }

    fun jan_30(view: android.view.View) {
        val taskler = Intent(this, tasksjan30::class.java)
        startActivity(taskler)
    }

    fun jan_31(view: android.view.View) {
        val taskler = Intent(this, tasksjan31::class.java)
        startActivity(taskler)
    }

    override fun onDestroy() {
        super.onDestroy()
        myDbManagerJan1.closeDb()
    }

}