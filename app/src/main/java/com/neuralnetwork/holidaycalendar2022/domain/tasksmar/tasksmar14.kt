package com.neuralnetwork.holidaycalendar2022.tasksmar

import android.os.Bundle
import android.view.KeyEvent
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.neuralnetwork.holidaycalendar2022.R
import com.neuralnetwork.holidaycalendar2022.db.MyDbHelperMar14
import com.neuralnetwork.holidaycalendar2022.db.MyDbManagerMar14
import kotlinx.android.synthetic.main.tasks.*

class tasksmar14: AppCompatActivity() {

    val myDbManagerMar14 = MyDbManagerMar14(this)
    val myDbHelperMar14 = MyDbHelperMar14(this)

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

        myDbManagerMar14.openDb()
        val dataList = myDbManagerMar14.readDbData()
        for (item in dataList) {
            edTitle.append(item)
            edTitle.append("\n")
        }

        supportActionBar?.hide()
    }

    override fun onBackPressed() { }

    fun onClickSave(view: android.view.View) {
        myDbManagerMar14.openDb()
        myDbManagerMar14.clearDb()
        myDbManagerMar14.insertToDb(edTitle.text.toString())
    }

    fun exiter(view: android.view.View) {
        this.finish()
    }

    override fun onDestroy() {
        super.onDestroy()
        myDbManagerMar14.closeDb()
    }



}