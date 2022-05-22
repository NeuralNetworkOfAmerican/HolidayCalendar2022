package com.neuralnetwork.holidaycalendar2022.tasksdec

import android.os.Bundle
import android.view.KeyEvent
import android.widget.EditText
import android.widget.TextView.OnEditorActionListener
import androidx.appcompat.app.AppCompatActivity
import com.neuralnetwork.holidaycalendar2022.R
import com.neuralnetwork.holidaycalendar2022.db.MyDbHelperDec30
import com.neuralnetwork.holidaycalendar2022.db.MyDbManagerDec30
import kotlinx.android.synthetic.main.tasks.*

class tasksdec30: AppCompatActivity() {

    val myDbManagerDec30 = MyDbManagerDec30(this)
    val myDbHelperDec30 = MyDbHelperDec30(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tasks)

        val edittext: EditText = findViewById(R.id.edTitle)

        edittext.setOnEditorActionListener(OnEditorActionListener { v, actionId, event ->
            if (event != null && event.keyCode === KeyEvent.KEYCODE_ENTER) {
                edittext.setSelection(0)
                if (edittext.text.length == 0) {
                    edittext.append("□ \t")
                    edittext.clearFocus()
                } else {
                    edittext.append("\n□ \t")
                    edittext.clearFocus()
                }
                return@OnEditorActionListener true
            }
            false
        })

        myDbManagerDec30.openDb()
        val dataList = myDbManagerDec30.readDbData()
        for (item in dataList) {
            edTitle.append(item)
            edTitle.append("\n")
        }

        supportActionBar?.hide()
    }

    override fun onBackPressed() { }

    fun onClickSave(view: android.view.View) {
        myDbManagerDec30.openDb()
        myDbManagerDec30.clearDb()
        myDbManagerDec30.insertToDb(edTitle.text.toString())
    }

    fun exiter(view: android.view.View) {
        this.finish()
    }

    override fun onDestroy() {
        super.onDestroy()
        myDbManagerDec30.closeDb()
    }



}