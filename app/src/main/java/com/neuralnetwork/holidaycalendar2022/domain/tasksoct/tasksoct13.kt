package com.neuralnetwork.holidaycalendar2022.tasksoct

import android.os.Bundle
import android.view.KeyEvent
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.neuralnetwork.holidaycalendar2022.R
import com.neuralnetwork.holidaycalendar2022.db.MyDbHelperOct13
import com.neuralnetwork.holidaycalendar2022.db.MyDbManagerOct13
import kotlinx.android.synthetic.main.tasks.*

class tasksoct13: AppCompatActivity() {

    val myDbManagerOct13 = MyDbManagerOct13(this)
    val myDbHelperOct13 = MyDbHelperOct13(this)

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

        myDbManagerOct13.openDb()
        val dataList = myDbManagerOct13.readDbData()
        for (item in dataList) {
            edTitle.append(item)
            edTitle.append("\n")
        }

        supportActionBar?.hide()
    }

    override fun onBackPressed() { }

    fun onClickSave(view: android.view.View) {
        myDbManagerOct13.openDb()
        myDbManagerOct13.clearDb()
        myDbManagerOct13.insertToDb(edTitle.text.toString())
    }

    fun exiter(view: android.view.View) {
        this.finish()
    }

    override fun onDestroy() {
        super.onDestroy()
        myDbManagerOct13.closeDb()
    }



}