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
import com.neuralnetwork.holidaycalendar2022.presentation.fragments.Celebration_jun_19
import com.neuralnetwork.holidaycalendar2022.presentation.fragments.Celebration_jun_20
import com.neuralnetwork.holidaycalendar2022.tasksfeb.tasksfeb21
import com.neuralnetwork.holidaycalendar2022.tasksjun.*

class June : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_june)

        supportActionBar?.hide()
    }

    fun jun_1(view: android.view.View) {
        val taskler = Intent(this, tasksjun1::class.java)
        startActivity(taskler)
    }

    fun jun_2(view: android.view.View) {
        val taskler = Intent(this, tasksjun2::class.java)
        startActivity(taskler)
    }

    fun jun_5(view: android.view.View) {
        val taskler = Intent(this, tasksjun5::class.java)
        startActivity(taskler)
    }

    fun jun_4(view: android.view.View) {
        val taskler = Intent(this, tasksjun4::class.java)
        startActivity(taskler)
    }

    fun jun_3(view: android.view.View) {
        val taskler = Intent(this, tasksjun3::class.java)
        startActivity(taskler)
    }

    fun jun_6(view: android.view.View) {
        val taskler = Intent(this, tasksjun6::class.java)
        startActivity(taskler)
    }

    fun jun_7(view: android.view.View) {
        val taskler = Intent(this, tasksjun7::class.java)
        startActivity(taskler)
    }

    fun jun_8(view: android.view.View) {
        val taskler = Intent(this, tasksjun8::class.java)
        startActivity(taskler)
    }

    fun jun_9(view: android.view.View) {
        val taskler = Intent(this, tasksjun9::class.java)
        startActivity(taskler)
    }

    fun jun_10(view: android.view.View) {
        val taskler = Intent(this, tasksjun10::class.java)
        startActivity(taskler)
    }

    fun jun_11(view: android.view.View) {
        val taskler = Intent(this, tasksjun11::class.java)
        startActivity(taskler)
    }

    fun jun_12(view: android.view.View) {
        val taskler = Intent(this, tasksjun12::class.java)
        startActivity(taskler)
    }

    fun jun_13(view: android.view.View) {
        val taskler = Intent(this, tasksjun13::class.java)
        startActivity(taskler)
    }

    fun jun_14(view: android.view.View) {
        val taskler = Intent(this, tasksjun14::class.java)
        startActivity(taskler)
    }

    fun jun_15(view: android.view.View) {
        val taskler = Intent(this, tasksjun15::class.java)
        startActivity(taskler)
    }

    fun jun_16(view: android.view.View) {
        val taskler = Intent(this, tasksjun16::class.java)
        startActivity(taskler)
    }

    fun jun_19(view: android.view.View) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.celebration_jun_19, Celebration_jun_19.newInstance())
            .commit()
    }

        fun Create_task_jun_19(view: View) {
        val taskler = Intent(this, tasksjun19::class.java)
        startActivity(taskler)
        }
        fun jun_18(view: android.view.View) {
            val taskler = Intent(this, tasksjun18::class.java)
            startActivity(taskler)
        }

        fun jun_17(view: android.view.View) {
            val taskler = Intent(this, tasksjun17::class.java)
            startActivity(taskler)
        }

        fun jun_20(view: android.view.View) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.celebration_jun_20, Celebration_jun_20.newInstance())
                .commit()
        }

        fun Create_task_jun_20(view: View) {
        val taskler = Intent(this, tasksjun20::class.java)
        startActivity(taskler)
        }

        fun jun_30(view: android.view.View) {
            val taskler = Intent(this, tasksjun30::class.java)
            startActivity(taskler)
        }

        fun jun_29(view: android.view.View) {
            val taskler = Intent(this, tasksjun29::class.java)
            startActivity(taskler)
        }

        fun jun_28(view: android.view.View) {
            val taskler = Intent(this, tasksjun28::class.java)
            startActivity(taskler)
        }

        fun jun_27(view: android.view.View) {
            val taskler = Intent(this, tasksjun27::class.java)
            startActivity(taskler)
        }

        fun jun_26(view: android.view.View) {
            val taskler = Intent(this, tasksjun26::class.java)
            startActivity(taskler)
        }

        fun jun_25(view: android.view.View) {
            val taskler = Intent(this, tasksjun25::class.java)
            startActivity(taskler)
        }

        fun jun_24(view: android.view.View) {
            val taskler = Intent(this, tasksjun24::class.java)
            startActivity(taskler)
        }

        fun jun_23(view: android.view.View) {
            val taskler = Intent(this, tasksjun23::class.java)
            startActivity(taskler)
        }

        fun jun_22(view: android.view.View) {
            val taskler = Intent(this, tasksjun22::class.java)
            startActivity(taskler)
        }

        fun jun_21(view: android.view.View) {
            val taskler = Intent(this, tasksjun21::class.java)
            startActivity(taskler)
        }

    fun Exit(view: View){
        val intent: Intent = intent
        finish()
        startActivity(intent)
    }
}