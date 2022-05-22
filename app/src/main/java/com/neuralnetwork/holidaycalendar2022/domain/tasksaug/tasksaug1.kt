package com.neuralnetwork.holidaycalendar2022.tasksaug

import android.os.Bundle
import android.view.KeyEvent
import android.widget.EditText
import android.widget.TextView.OnEditorActionListener
import androidx.appcompat.app.AppCompatActivity
import com.neuralnetwork.holidaycalendar2022.R
import com.neuralnetwork.holidaycalendar2022.db.MyDbHelperAug1
import com.neuralnetwork.holidaycalendar2022.db.MyDbManagerAug1
import kotlinx.android.synthetic.main.tasks.*

class tasksaug1: AppCompatActivity() {

    val myDbManagerAug1 = MyDbManagerAug1(this)
    val myDbHelperAug1 = MyDbHelperAug1(this)

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

        myDbManagerAug1.openDb()
        val dataList = myDbManagerAug1.readDbData()
        for (item in dataList) {
            edTitle.append(item)
            edTitle.append("\n")
        }

        supportActionBar?.hide()
    }

    override fun onBackPressed() { }

    fun onClickSave(view: android.view.View) {
        myDbManagerAug1.openDb()
        myDbManagerAug1.clearDb()
        myDbManagerAug1.insertToDb(edTitle.text.toString())
    }

    fun exiter(view: android.view.View) {
        this.finish()
    }

    override fun onDestroy() {
        super.onDestroy()
        myDbManagerAug1.closeDb()
    }



}