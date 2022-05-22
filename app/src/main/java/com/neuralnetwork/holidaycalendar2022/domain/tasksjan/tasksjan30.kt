package com.neuralnetwork.holidaycalendar2022.tasksjan

import android.os.Bundle
import android.view.KeyEvent
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.neuralnetwork.holidaycalendar2022.R
import com.neuralnetwork.holidaycalendar2022.db.MyDbHelperJan30
import com.neuralnetwork.holidaycalendar2022.db.MyDbManagerJan30
import kotlinx.android.synthetic.main.tasks.*

class tasksjan30: AppCompatActivity() {

    val myDbManagerJan30 = MyDbManagerJan30(this)
    val myDbHelperJan30 = MyDbHelperJan30(this)

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

        myDbManagerJan30.openDb()
        val dataList = myDbManagerJan30.readDbData()
        for (item in dataList) {
            edTitle.append(item)
            edTitle.append("\n")
        }

        supportActionBar?.hide()
    }

    override fun onBackPressed() { }

    fun onClickSave(view: android.view.View) {
        myDbManagerJan30.openDb()
        myDbManagerJan30.clearDb()
        myDbManagerJan30.insertToDb(edTitle.text.toString())
    }

    fun exiter(view: android.view.View) {
        this.finish()
    }

    override fun onDestroy() {
        super.onDestroy()
        myDbManagerJan30.closeDb()
    }
}