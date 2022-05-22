package com.neuralnetwork.holidaycalendar2022.tasksjan

import android.os.Bundle
import android.view.KeyEvent
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.neuralnetwork.holidaycalendar2022.R
import com.neuralnetwork.holidaycalendar2022.db.MyDbHelperJan17
import com.neuralnetwork.holidaycalendar2022.db.MyDbManagerJan17
import kotlinx.android.synthetic.main.tasks.*

class tasksjan17: AppCompatActivity() {

    val myDbManagerJan17 = MyDbManagerJan17(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tasks)

        val edittext: EditText = findViewById(R.id.edTitle)

        edittext.setOnEditorActionListener(TextView.OnEditorActionListener { v, actionId, event ->
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

        myDbManagerJan17.openDb()
        val dataList = myDbManagerJan17.readDbData()
        for (item in dataList) {
            edTitle.append(item)
            edTitle.append("\n")
        }

        supportActionBar?.hide()
    }

    fun onClickSave(view: android.view.View) {
        myDbManagerJan17.openDb()
        myDbManagerJan17.clearDb()
        myDbManagerJan17.insertToDb(edTitle.text.toString())
    }

    fun exiter(view: android.view.View) {
        this.finish()
    }

    override fun onBackPressed() { }

    override fun onDestroy() {
        super.onDestroy()
        myDbManagerJan17.closeDb()
    }

}