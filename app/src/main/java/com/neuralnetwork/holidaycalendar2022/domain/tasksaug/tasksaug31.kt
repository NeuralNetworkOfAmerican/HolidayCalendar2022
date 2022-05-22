package com.neuralnetwork.holidaycalendar2022.tasksaug

import android.os.Bundle
import android.view.KeyEvent
import android.widget.EditText
import android.widget.TextView.OnEditorActionListener
import androidx.appcompat.app.AppCompatActivity
import com.neuralnetwork.holidaycalendar2022.R
import com.neuralnetwork.holidaycalendar2022.db.MyDbHelperAug31
import com.neuralnetwork.holidaycalendar2022.db.MyDbManagerAug31
import kotlinx.android.synthetic.main.tasks.*

class tasksaug31: AppCompatActivity() {

    val myDbManagerAug31 = MyDbManagerAug31(this)
    val myDbHelperAug31 = MyDbHelperAug31(this)

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

        myDbManagerAug31.openDb()
        val dataList = myDbManagerAug31.readDbData()
        for (item in dataList) {
            edTitle.append(item)
            edTitle.append("\n")
        }

        supportActionBar?.hide()
    }

    override fun onBackPressed() { }

    fun onClickSave(view: android.view.View) {
        myDbManagerAug31.openDb()
        myDbManagerAug31.clearDb()
        myDbManagerAug31.insertToDb(edTitle.text.toString())
    }

    fun exiter(view: android.view.View) {
        this.finish()
    }

    override fun onDestroy() {
        super.onDestroy()
        myDbManagerAug31.closeDb()
    }



}