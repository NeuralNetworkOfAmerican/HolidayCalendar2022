package com.neuralnetwork.holidaycalendar2022.db

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import com.neuralnetwork.holidaycalendar2022.data.db.MyDbNameClass

class MyDbManagerDec1(context: Context) {
    val myDbHelperDec1 = MyDbHelperDec1(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperDec1.writableDatabase
    }
    fun insertToDb(title: String){
        val values = ContentValues().apply {
            put(MyDbNameClass.COLUMN_NAME_TITLE, title)

        }
        db?.insert(MyDbNameClass.TABLE_NAME, null, values)
    }

    fun clearDb() {
        db?.delete(MyDbNameClass.TABLE_NAME, null, null)
    }

    // @SuppressLint("Range")
    @SuppressLint("Range")
    fun readDbData() : ArrayList<String>{
        val dataList = ArrayList<String>()
        val cursor = db?.query(MyDbNameClass.TABLE_NAME, null, null,
            null, null, null, null)

        while (cursor?.moveToNext()!!){
            val dataText = cursor.getString(cursor.getColumnIndex(MyDbNameClass.COLUMN_NAME_TITLE))
            dataList.add(dataText.toString())
        }
        cursor.close()
        return dataList
    }
    fun closeDb(){
        myDbHelperDec1.close()
    }

}

class MyDbManagerDec2(context: Context) {
    val myDbHelperDec2 = MyDbHelperDec2(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperDec2.writableDatabase
    }
    fun insertToDb(title: String){
        val values = ContentValues().apply {
            put(MyDbNameClass.COLUMN_NAME_TITLE, title)

        }
        db?.insert(MyDbNameClass.TABLE_NAME, null, values)
    }

    fun clearDb() {
        db?.delete(MyDbNameClass.TABLE_NAME, null, null)
    }

    // @SuppressLint("Range")
    @SuppressLint("Range")
    fun readDbData() : ArrayList<String>{
        val dataList = ArrayList<String>()
        val cursor = db?.query(MyDbNameClass.TABLE_NAME, null, null,
            null, null, null, null)

        while (cursor?.moveToNext()!!){
            val dataText = cursor.getString(cursor.getColumnIndex(MyDbNameClass.COLUMN_NAME_TITLE))
            dataList.add(dataText.toString())
        }
        cursor.close()
        return dataList
    }
    fun closeDb(){
        myDbHelperDec2.close()
    }

}

class MyDbManagerDec3(context: Context) {
    val myDbHelperDec3 = MyDbHelperDec3(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperDec3.writableDatabase
    }
    fun insertToDb(title: String){
        val values = ContentValues().apply {
            put(MyDbNameClass.COLUMN_NAME_TITLE, title)

        }
        db?.insert(MyDbNameClass.TABLE_NAME, null, values)
    }

    fun clearDb() {
        db?.delete(MyDbNameClass.TABLE_NAME, null, null)
    }

    // @SuppressLint("Range")
    @SuppressLint("Range")
    fun readDbData() : ArrayList<String>{
        val dataList = ArrayList<String>()
        val cursor = db?.query(MyDbNameClass.TABLE_NAME, null, null,
            null, null, null, null)

        while (cursor?.moveToNext()!!){
            val dataText = cursor.getString(cursor.getColumnIndex(MyDbNameClass.COLUMN_NAME_TITLE))
            dataList.add(dataText.toString())
        }
        cursor.close()
        return dataList
    }
    fun closeDb(){
        myDbHelperDec3.close()
    }

}

class MyDbManagerDec4(context: Context) {
    val myDbHelperDec4 = MyDbHelperDec4(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperDec4.writableDatabase
    }
    fun insertToDb(title: String){
        val values = ContentValues().apply {
            put(MyDbNameClass.COLUMN_NAME_TITLE, title)

        }
        db?.insert(MyDbNameClass.TABLE_NAME, null, values)
    }

    fun clearDb() {
        db?.delete(MyDbNameClass.TABLE_NAME, null, null)
    }

    // @SuppressLint("Range")
    @SuppressLint("Range")
    fun readDbData() : ArrayList<String>{
        val dataList = ArrayList<String>()
        val cursor = db?.query(MyDbNameClass.TABLE_NAME, null, null,
            null, null, null, null)

        while (cursor?.moveToNext()!!){
            val dataText = cursor.getString(cursor.getColumnIndex(MyDbNameClass.COLUMN_NAME_TITLE))
            dataList.add(dataText.toString())
        }
        cursor.close()
        return dataList
    }
    fun closeDb(){
        myDbHelperDec4.close()
    }

}

class MyDbManagerDec5(context: Context) {
    val myDbHelperDec5 = MyDbHelperDec5(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperDec5.writableDatabase
    }
    fun insertToDb(title: String){
        val values = ContentValues().apply {
            put(MyDbNameClass.COLUMN_NAME_TITLE, title)

        }
        db?.insert(MyDbNameClass.TABLE_NAME, null, values)
    }

    fun clearDb() {
        db?.delete(MyDbNameClass.TABLE_NAME, null, null)
    }

    // @SuppressLint("Range")
    @SuppressLint("Range")
    fun readDbData() : ArrayList<String>{
        val dataList = ArrayList<String>()
        val cursor = db?.query(MyDbNameClass.TABLE_NAME, null, null,
            null, null, null, null)

        while (cursor?.moveToNext()!!){
            val dataText = cursor.getString(cursor.getColumnIndex(MyDbNameClass.COLUMN_NAME_TITLE))
            dataList.add(dataText.toString())
        }
        cursor.close()
        return dataList
    }
    fun closeDb(){
        myDbHelperDec5.close()
    }

}

class MyDbManagerDec6(context: Context) {
    val myDbHelperDec6 = MyDbHelperDec6(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperDec6.writableDatabase
    }
    fun insertToDb(title: String){
        val values = ContentValues().apply {
            put(MyDbNameClass.COLUMN_NAME_TITLE, title)

        }
        db?.insert(MyDbNameClass.TABLE_NAME, null, values)
    }

    fun clearDb() {
        db?.delete(MyDbNameClass.TABLE_NAME, null, null)
    }

    // @SuppressLint("Range")
    @SuppressLint("Range")
    fun readDbData() : ArrayList<String>{
        val dataList = ArrayList<String>()
        val cursor = db?.query(MyDbNameClass.TABLE_NAME, null, null,
            null, null, null, null)

        while (cursor?.moveToNext()!!){
            val dataText = cursor.getString(cursor.getColumnIndex(MyDbNameClass.COLUMN_NAME_TITLE))
            dataList.add(dataText.toString())
        }
        cursor.close()
        return dataList
    }
    fun closeDb(){
        myDbHelperDec6.close()
    }

}

class MyDbManagerDec7(context: Context) {
    val myDbHelperDec7 = MyDbHelperDec7(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperDec7.writableDatabase
    }
    fun insertToDb(title: String){
        val values = ContentValues().apply {
            put(MyDbNameClass.COLUMN_NAME_TITLE, title)

        }
        db?.insert(MyDbNameClass.TABLE_NAME, null, values)
    }

    fun clearDb() {
        db?.delete(MyDbNameClass.TABLE_NAME, null, null)
    }

    // @SuppressLint("Range")
    @SuppressLint("Range")
    fun readDbData() : ArrayList<String>{
        val dataList = ArrayList<String>()
        val cursor = db?.query(MyDbNameClass.TABLE_NAME, null, null,
            null, null, null, null)

        while (cursor?.moveToNext()!!){
            val dataText = cursor.getString(cursor.getColumnIndex(MyDbNameClass.COLUMN_NAME_TITLE))
            dataList.add(dataText.toString())
        }
        cursor.close()
        return dataList
    }
    fun closeDb(){
        myDbHelperDec7.close()
    }

}

class MyDbManagerDec8(context: Context) {
    val myDbHelperDec8 = MyDbHelperDec8(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperDec8.writableDatabase
    }
    fun insertToDb(title: String){
        val values = ContentValues().apply {
            put(MyDbNameClass.COLUMN_NAME_TITLE, title)

        }
        db?.insert(MyDbNameClass.TABLE_NAME, null, values)
    }

    fun clearDb() {
        db?.delete(MyDbNameClass.TABLE_NAME, null, null)
    }

    // @SuppressLint("Range")
    @SuppressLint("Range")
    fun readDbData() : ArrayList<String>{
        val dataList = ArrayList<String>()
        val cursor = db?.query(MyDbNameClass.TABLE_NAME, null, null,
            null, null, null, null)

        while (cursor?.moveToNext()!!){
            val dataText = cursor.getString(cursor.getColumnIndex(MyDbNameClass.COLUMN_NAME_TITLE))
            dataList.add(dataText.toString())
        }
        cursor.close()
        return dataList
    }
    fun closeDb(){
        myDbHelperDec8.close()
    }

}

class MyDbManagerDec9(context: Context) {
    val myDbHelperDec9 = MyDbHelperDec9(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperDec9.writableDatabase
    }
    fun insertToDb(title: String){
        val values = ContentValues().apply {
            put(MyDbNameClass.COLUMN_NAME_TITLE, title)

        }
        db?.insert(MyDbNameClass.TABLE_NAME, null, values)
    }

    fun clearDb() {
        db?.delete(MyDbNameClass.TABLE_NAME, null, null)
    }

    // @SuppressLint("Range")
    @SuppressLint("Range")
    fun readDbData() : ArrayList<String>{
        val dataList = ArrayList<String>()
        val cursor = db?.query(MyDbNameClass.TABLE_NAME, null, null,
            null, null, null, null)

        while (cursor?.moveToNext()!!){
            val dataText = cursor.getString(cursor.getColumnIndex(MyDbNameClass.COLUMN_NAME_TITLE))
            dataList.add(dataText.toString())
        }
        cursor.close()
        return dataList
    }
    fun closeDb(){
        myDbHelperDec9.close()
    }

}

class MyDbManagerDec10(context: Context) {
    val myDbHelperDec10 = MyDbHelperDec10(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperDec10.writableDatabase
    }
    fun insertToDb(title: String){
        val values = ContentValues().apply {
            put(MyDbNameClass.COLUMN_NAME_TITLE, title)

        }
        db?.insert(MyDbNameClass.TABLE_NAME, null, values)
    }

    fun clearDb() {
        db?.delete(MyDbNameClass.TABLE_NAME, null, null)
    }

    // @SuppressLint("Range")
    @SuppressLint("Range")
    fun readDbData() : ArrayList<String>{
        val dataList = ArrayList<String>()
        val cursor = db?.query(MyDbNameClass.TABLE_NAME, null, null,
            null, null, null, null)

        while (cursor?.moveToNext()!!){
            val dataText = cursor.getString(cursor.getColumnIndex(MyDbNameClass.COLUMN_NAME_TITLE))
            dataList.add(dataText.toString())
        }
        cursor.close()
        return dataList
    }
    fun closeDb(){
        myDbHelperDec10.close()
    }

}

class MyDbManagerDec11(context: Context) {
    val myDbHelperDec11 = MyDbHelperDec11(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperDec11.writableDatabase
    }
    fun insertToDb(title: String){
        val values = ContentValues().apply {
            put(MyDbNameClass.COLUMN_NAME_TITLE, title)

        }
        db?.insert(MyDbNameClass.TABLE_NAME, null, values)
    }

    fun clearDb() {
        db?.delete(MyDbNameClass.TABLE_NAME, null, null)
    }

    // @SuppressLint("Range")
    @SuppressLint("Range")
    fun readDbData() : ArrayList<String>{
        val dataList = ArrayList<String>()
        val cursor = db?.query(MyDbNameClass.TABLE_NAME, null, null,
            null, null, null, null)

        while (cursor?.moveToNext()!!){
            val dataText = cursor.getString(cursor.getColumnIndex(MyDbNameClass.COLUMN_NAME_TITLE))
            dataList.add(dataText.toString())
        }
        cursor.close()
        return dataList
    }
    fun closeDb(){
        myDbHelperDec11.close()
    }

}

class MyDbManagerDec12(context: Context) {
    val myDbHelperDec12 = MyDbHelperDec12(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperDec12.writableDatabase
    }
    fun insertToDb(title: String){
        val values = ContentValues().apply {
            put(MyDbNameClass.COLUMN_NAME_TITLE, title)

        }
        db?.insert(MyDbNameClass.TABLE_NAME, null, values)
    }

    fun clearDb() {
        db?.delete(MyDbNameClass.TABLE_NAME, null, null)
    }

    // @SuppressLint("Range")
    @SuppressLint("Range")
    fun readDbData() : ArrayList<String>{
        val dataList = ArrayList<String>()
        val cursor = db?.query(MyDbNameClass.TABLE_NAME, null, null,
            null, null, null, null)

        while (cursor?.moveToNext()!!){
            val dataText = cursor.getString(cursor.getColumnIndex(MyDbNameClass.COLUMN_NAME_TITLE))
            dataList.add(dataText.toString())
        }
        cursor.close()
        return dataList
    }
    fun closeDb(){
        myDbHelperDec12.close()
    }

}

class MyDbManagerDec13(context: Context) {
    val myDbHelperDec13 = MyDbHelperDec13(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperDec13.writableDatabase
    }
    fun insertToDb(title: String){
        val values = ContentValues().apply {
            put(MyDbNameClass.COLUMN_NAME_TITLE, title)

        }
        db?.insert(MyDbNameClass.TABLE_NAME, null, values)
    }

    fun clearDb() {
        db?.delete(MyDbNameClass.TABLE_NAME, null, null)
    }

    // @SuppressLint("Range")
    @SuppressLint("Range")
    fun readDbData() : ArrayList<String>{
        val dataList = ArrayList<String>()
        val cursor = db?.query(MyDbNameClass.TABLE_NAME, null, null,
            null, null, null, null)

        while (cursor?.moveToNext()!!){
            val dataText = cursor.getString(cursor.getColumnIndex(MyDbNameClass.COLUMN_NAME_TITLE))
            dataList.add(dataText.toString())
        }
        cursor.close()
        return dataList
    }
    fun closeDb(){
        myDbHelperDec13.close()
    }

}

class MyDbManagerDec14(context: Context) {
    val myDbHelperDec14 = MyDbHelperDec14(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperDec14.writableDatabase
    }
    fun insertToDb(title: String){
        val values = ContentValues().apply {
            put(MyDbNameClass.COLUMN_NAME_TITLE, title)

        }
        db?.insert(MyDbNameClass.TABLE_NAME, null, values)
    }

    fun clearDb() {
        db?.delete(MyDbNameClass.TABLE_NAME, null, null)
    }

    // @SuppressLint("Range")
    @SuppressLint("Range")
    fun readDbData() : ArrayList<String>{
        val dataList = ArrayList<String>()
        val cursor = db?.query(MyDbNameClass.TABLE_NAME, null, null,
            null, null, null, null)

        while (cursor?.moveToNext()!!){
            val dataText = cursor.getString(cursor.getColumnIndex(MyDbNameClass.COLUMN_NAME_TITLE))
            dataList.add(dataText.toString())
        }
        cursor.close()
        return dataList
    }
    fun closeDb(){
        myDbHelperDec14.close()
    }

}

class MyDbManagerDec15(context: Context) {
    val myDbHelperDec15 = MyDbHelperDec15(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperDec15.writableDatabase
    }
    fun insertToDb(title: String){
        val values = ContentValues().apply {
            put(MyDbNameClass.COLUMN_NAME_TITLE, title)

        }
        db?.insert(MyDbNameClass.TABLE_NAME, null, values)
    }

    fun clearDb() {
        db?.delete(MyDbNameClass.TABLE_NAME, null, null)
    }

    // @SuppressLint("Range")
    @SuppressLint("Range")
    fun readDbData() : ArrayList<String>{
        val dataList = ArrayList<String>()
        val cursor = db?.query(MyDbNameClass.TABLE_NAME, null, null,
            null, null, null, null)

        while (cursor?.moveToNext()!!){
            val dataText = cursor.getString(cursor.getColumnIndex(MyDbNameClass.COLUMN_NAME_TITLE))
            dataList.add(dataText.toString())
        }
        cursor.close()
        return dataList
    }
    fun closeDb(){
        myDbHelperDec15.close()
    }

}

class MyDbManagerDec16(context: Context) {
    val myDbHelperDec16 = MyDbHelperDec16(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperDec16.writableDatabase
    }
    fun insertToDb(title: String){
        val values = ContentValues().apply {
            put(MyDbNameClass.COLUMN_NAME_TITLE, title)

        }
        db?.insert(MyDbNameClass.TABLE_NAME, null, values)
    }

    fun clearDb() {
        db?.delete(MyDbNameClass.TABLE_NAME, null, null)
    }

    // @SuppressLint("Range")
    @SuppressLint("Range")
    fun readDbData() : ArrayList<String>{
        val dataList = ArrayList<String>()
        val cursor = db?.query(MyDbNameClass.TABLE_NAME, null, null,
            null, null, null, null)

        while (cursor?.moveToNext()!!){
            val dataText = cursor.getString(cursor.getColumnIndex(MyDbNameClass.COLUMN_NAME_TITLE))
            dataList.add(dataText.toString())
        }
        cursor.close()
        return dataList
    }
    fun closeDb(){
        myDbHelperDec16.close()
    }

}

class MyDbManagerDec17(context: Context) {
    val myDbHelperDec17 = MyDbHelperDec17(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperDec17.writableDatabase
    }
    fun insertToDb(title: String){
        val values = ContentValues().apply {
            put(MyDbNameClass.COLUMN_NAME_TITLE, title)

        }
        db?.insert(MyDbNameClass.TABLE_NAME, null, values)
    }

    fun clearDb() {
        db?.delete(MyDbNameClass.TABLE_NAME, null, null)
    }

    // @SuppressLint("Range")
    @SuppressLint("Range")
    fun readDbData() : ArrayList<String>{
        val dataList = ArrayList<String>()
        val cursor = db?.query(MyDbNameClass.TABLE_NAME, null, null,
            null, null, null, null)

        while (cursor?.moveToNext()!!){
            val dataText = cursor.getString(cursor.getColumnIndex(MyDbNameClass.COLUMN_NAME_TITLE))
            dataList.add(dataText.toString())
        }
        cursor.close()
        return dataList
    }
    fun closeDb(){
        myDbHelperDec17.close()
    }

}

class MyDbManagerDec18(context: Context) {
    val myDbHelperDec18 = MyDbHelperDec18(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperDec18.writableDatabase
    }
    fun insertToDb(title: String){
        val values = ContentValues().apply {
            put(MyDbNameClass.COLUMN_NAME_TITLE, title)

        }
        db?.insert(MyDbNameClass.TABLE_NAME, null, values)
    }

    fun clearDb() {
        db?.delete(MyDbNameClass.TABLE_NAME, null, null)
    }

    // @SuppressLint("Range")
    @SuppressLint("Range")
    fun readDbData() : ArrayList<String>{
        val dataList = ArrayList<String>()
        val cursor = db?.query(MyDbNameClass.TABLE_NAME, null, null,
            null, null, null, null)

        while (cursor?.moveToNext()!!){
            val dataText = cursor.getString(cursor.getColumnIndex(MyDbNameClass.COLUMN_NAME_TITLE))
            dataList.add(dataText.toString())
        }
        cursor.close()
        return dataList
    }
    fun closeDb(){
        myDbHelperDec18.close()
    }

}

class MyDbManagerDec19(context: Context) {
    val myDbHelperDec19 = MyDbHelperDec19(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperDec19.writableDatabase
    }
    fun insertToDb(title: String){
        val values = ContentValues().apply {
            put(MyDbNameClass.COLUMN_NAME_TITLE, title)

        }
        db?.insert(MyDbNameClass.TABLE_NAME, null, values)
    }

    fun clearDb() {
        db?.delete(MyDbNameClass.TABLE_NAME, null, null)
    }

    // @SuppressLint("Range")
    @SuppressLint("Range")
    fun readDbData() : ArrayList<String>{
        val dataList = ArrayList<String>()
        val cursor = db?.query(MyDbNameClass.TABLE_NAME, null, null,
            null, null, null, null)

        while (cursor?.moveToNext()!!){
            val dataText = cursor.getString(cursor.getColumnIndex(MyDbNameClass.COLUMN_NAME_TITLE))
            dataList.add(dataText.toString())
        }
        cursor.close()
        return dataList
    }
    fun closeDb(){
        myDbHelperDec19.close()
    }

}

class MyDbManagerDec20(context: Context) {
    val myDbHelperDec20 = MyDbHelperDec20(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperDec20.writableDatabase
    }
    fun insertToDb(title: String){
        val values = ContentValues().apply {
            put(MyDbNameClass.COLUMN_NAME_TITLE, title)

        }
        db?.insert(MyDbNameClass.TABLE_NAME, null, values)
    }

    fun clearDb() {
        db?.delete(MyDbNameClass.TABLE_NAME, null, null)
    }

    // @SuppressLint("Range")
    @SuppressLint("Range")
    fun readDbData() : ArrayList<String>{
        val dataList = ArrayList<String>()
        val cursor = db?.query(MyDbNameClass.TABLE_NAME, null, null,
            null, null, null, null)

        while (cursor?.moveToNext()!!){
            val dataText = cursor.getString(cursor.getColumnIndex(MyDbNameClass.COLUMN_NAME_TITLE))
            dataList.add(dataText.toString())
        }
        cursor.close()
        return dataList
    }
    fun closeDb(){
        myDbHelperDec20.close()
    }

}

class MyDbManagerDec21(context: Context) {
    val myDbHelperDec21 = MyDbHelperDec21(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperDec21.writableDatabase
    }
    fun insertToDb(title: String){
        val values = ContentValues().apply {
            put(MyDbNameClass.COLUMN_NAME_TITLE, title)

        }
        db?.insert(MyDbNameClass.TABLE_NAME, null, values)
    }

    fun clearDb() {
        db?.delete(MyDbNameClass.TABLE_NAME, null, null)
    }

    // @SuppressLint("Range")
    @SuppressLint("Range")
    fun readDbData() : ArrayList<String>{
        val dataList = ArrayList<String>()
        val cursor = db?.query(MyDbNameClass.TABLE_NAME, null, null,
            null, null, null, null)

        while (cursor?.moveToNext()!!){
            val dataText = cursor.getString(cursor.getColumnIndex(MyDbNameClass.COLUMN_NAME_TITLE))
            dataList.add(dataText.toString())
        }
        cursor.close()
        return dataList
    }
    fun closeDb(){
        myDbHelperDec21.close()
    }

}

class MyDbManagerDec22(context: Context) {
    val myDbHelperDec22 = MyDbHelperDec22(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperDec22.writableDatabase
    }
    fun insertToDb(title: String){
        val values = ContentValues().apply {
            put(MyDbNameClass.COLUMN_NAME_TITLE, title)

        }
        db?.insert(MyDbNameClass.TABLE_NAME, null, values)
    }

    fun clearDb() {
        db?.delete(MyDbNameClass.TABLE_NAME, null, null)
    }

    // @SuppressLint("Range")
    @SuppressLint("Range")
    fun readDbData() : ArrayList<String>{
        val dataList = ArrayList<String>()
        val cursor = db?.query(MyDbNameClass.TABLE_NAME, null, null,
            null, null, null, null)

        while (cursor?.moveToNext()!!){
            val dataText = cursor.getString(cursor.getColumnIndex(MyDbNameClass.COLUMN_NAME_TITLE))
            dataList.add(dataText.toString())
        }
        cursor.close()
        return dataList
    }
    fun closeDb(){
        myDbHelperDec22.close()
    }

}

class MyDbManagerDec23(context: Context) {
    val myDbHelperDec23 = MyDbHelperDec23(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperDec23.writableDatabase
    }
    fun insertToDb(title: String){
        val values = ContentValues().apply {
            put(MyDbNameClass.COLUMN_NAME_TITLE, title)

        }
        db?.insert(MyDbNameClass.TABLE_NAME, null, values)
    }

    fun clearDb() {
        db?.delete(MyDbNameClass.TABLE_NAME, null, null)
    }

    // @SuppressLint("Range")
    @SuppressLint("Range")
    fun readDbData() : ArrayList<String>{
        val dataList = ArrayList<String>()
        val cursor = db?.query(MyDbNameClass.TABLE_NAME, null, null,
            null, null, null, null)

        while (cursor?.moveToNext()!!){
            val dataText = cursor.getString(cursor.getColumnIndex(MyDbNameClass.COLUMN_NAME_TITLE))
            dataList.add(dataText.toString())
        }
        cursor.close()
        return dataList
    }
    fun closeDb(){
        myDbHelperDec23.close()
    }

}

class MyDbManagerDec24(context: Context) {
    val myDbHelperDec24 = MyDbHelperDec24(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperDec24.writableDatabase
    }
    fun insertToDb(title: String){
        val values = ContentValues().apply {
            put(MyDbNameClass.COLUMN_NAME_TITLE, title)

        }
        db?.insert(MyDbNameClass.TABLE_NAME, null, values)
    }

    fun clearDb() {
        db?.delete(MyDbNameClass.TABLE_NAME, null, null)
    }

    // @SuppressLint("Range")
    @SuppressLint("Range")
    fun readDbData() : ArrayList<String>{
        val dataList = ArrayList<String>()
        val cursor = db?.query(MyDbNameClass.TABLE_NAME, null, null,
            null, null, null, null)

        while (cursor?.moveToNext()!!){
            val dataText = cursor.getString(cursor.getColumnIndex(MyDbNameClass.COLUMN_NAME_TITLE))
            dataList.add(dataText.toString())
        }
        cursor.close()
        return dataList
    }
    fun closeDb(){
        myDbHelperDec24.close()
    }

}

class MyDbManagerDec25(context: Context) {
    val myDbHelperDec25 = MyDbHelperDec25(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperDec25.writableDatabase
    }
    fun insertToDb(title: String){
        val values = ContentValues().apply {
            put(MyDbNameClass.COLUMN_NAME_TITLE, title)

        }
        db?.insert(MyDbNameClass.TABLE_NAME, null, values)
    }

    fun clearDb() {
        db?.delete(MyDbNameClass.TABLE_NAME, null, null)
    }

    // @SuppressLint("Range")
    @SuppressLint("Range")
    fun readDbData() : ArrayList<String>{
        val dataList = ArrayList<String>()
        val cursor = db?.query(MyDbNameClass.TABLE_NAME, null, null,
            null, null, null, null)

        while (cursor?.moveToNext()!!){
            val dataText = cursor.getString(cursor.getColumnIndex(MyDbNameClass.COLUMN_NAME_TITLE))
            dataList.add(dataText.toString())
        }
        cursor.close()
        return dataList
    }
    fun closeDb(){
        myDbHelperDec25.close()
    }

}

class MyDbManagerDec26(context: Context) {
    val myDbHelperDec26 = MyDbHelperDec26(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperDec26.writableDatabase
    }
    fun insertToDb(title: String){
        val values = ContentValues().apply {
            put(MyDbNameClass.COLUMN_NAME_TITLE, title)

        }
        db?.insert(MyDbNameClass.TABLE_NAME, null, values)
    }

    fun clearDb() {
        db?.delete(MyDbNameClass.TABLE_NAME, null, null)
    }

    // @SuppressLint("Range")
    @SuppressLint("Range")
    fun readDbData() : ArrayList<String>{
        val dataList = ArrayList<String>()
        val cursor = db?.query(MyDbNameClass.TABLE_NAME, null, null,
            null, null, null, null)

        while (cursor?.moveToNext()!!){
            val dataText = cursor.getString(cursor.getColumnIndex(MyDbNameClass.COLUMN_NAME_TITLE))
            dataList.add(dataText.toString())
        }
        cursor.close()
        return dataList
    }
    fun closeDb(){
        myDbHelperDec26.close()
    }

}

class MyDbManagerDec27(context: Context) {
    val myDbHelperDec27 = MyDbHelperDec27(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperDec27.writableDatabase
    }
    fun insertToDb(title: String){
        val values = ContentValues().apply {
            put(MyDbNameClass.COLUMN_NAME_TITLE, title)

        }
        db?.insert(MyDbNameClass.TABLE_NAME, null, values)
    }

    fun clearDb() {
        db?.delete(MyDbNameClass.TABLE_NAME, null, null)
    }

    // @SuppressLint("Range")
    @SuppressLint("Range")
    fun readDbData() : ArrayList<String>{
        val dataList = ArrayList<String>()
        val cursor = db?.query(MyDbNameClass.TABLE_NAME, null, null,
            null, null, null, null)

        while (cursor?.moveToNext()!!){
            val dataText = cursor.getString(cursor.getColumnIndex(MyDbNameClass.COLUMN_NAME_TITLE))
            dataList.add(dataText.toString())
        }
        cursor.close()
        return dataList
    }
    fun closeDb(){
        myDbHelperDec27.close()
    }

}

class MyDbManagerDec28(context: Context) {
    val myDbHelperDec28 = MyDbHelperDec28(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperDec28.writableDatabase
    }
    fun insertToDb(title: String){
        val values = ContentValues().apply {
            put(MyDbNameClass.COLUMN_NAME_TITLE, title)

        }
        db?.insert(MyDbNameClass.TABLE_NAME, null, values)
    }

    fun clearDb() {
        db?.delete(MyDbNameClass.TABLE_NAME, null, null)
    }

    // @SuppressLint("Range")
    @SuppressLint("Range")
    fun readDbData() : ArrayList<String>{
        val dataList = ArrayList<String>()
        val cursor = db?.query(MyDbNameClass.TABLE_NAME, null, null,
            null, null, null, null)

        while (cursor?.moveToNext()!!){
            val dataText = cursor.getString(cursor.getColumnIndex(MyDbNameClass.COLUMN_NAME_TITLE))
            dataList.add(dataText.toString())
        }
        cursor.close()
        return dataList
    }
    fun closeDb(){
        myDbHelperDec28.close()
    }

}

class MyDbManagerDec29(context: Context) {
    val myDbHelperDec29 = MyDbHelperDec29(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperDec29.writableDatabase
    }
    fun insertToDb(title: String){
        val values = ContentValues().apply {
            put(MyDbNameClass.COLUMN_NAME_TITLE, title)

        }
        db?.insert(MyDbNameClass.TABLE_NAME, null, values)
    }

    fun clearDb() {
        db?.delete(MyDbNameClass.TABLE_NAME, null, null)
    }

    // @SuppressLint("Range")
    @SuppressLint("Range")
    fun readDbData() : ArrayList<String>{
        val dataList = ArrayList<String>()
        val cursor = db?.query(MyDbNameClass.TABLE_NAME, null, null,
            null, null, null, null)

        while (cursor?.moveToNext()!!){
            val dataText = cursor.getString(cursor.getColumnIndex(MyDbNameClass.COLUMN_NAME_TITLE))
            dataList.add(dataText.toString())
        }
        cursor.close()
        return dataList
    }
    fun closeDb(){
        myDbHelperDec29.close()
    }

}

class MyDbManagerDec30(context: Context) {
    val myDbHelperDec30 = MyDbHelperDec30(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperDec30.writableDatabase
    }
    fun insertToDb(title: String){
        val values = ContentValues().apply {
            put(MyDbNameClass.COLUMN_NAME_TITLE, title)

        }
        db?.insert(MyDbNameClass.TABLE_NAME, null, values)
    }

    fun clearDb() {
        db?.delete(MyDbNameClass.TABLE_NAME, null, null)
    }

    // @SuppressLint("Range")
    @SuppressLint("Range")
    fun readDbData() : ArrayList<String>{
        val dataList = ArrayList<String>()
        val cursor = db?.query(MyDbNameClass.TABLE_NAME, null, null,
            null, null, null, null)

        while (cursor?.moveToNext()!!){
            val dataText = cursor.getString(cursor.getColumnIndex(MyDbNameClass.COLUMN_NAME_TITLE))
            dataList.add(dataText.toString())
        }
        cursor.close()
        return dataList
    }
    fun closeDb(){
        myDbHelperDec30.close()
    }

}

class MyDbManagerDec31(context: Context) {
    val myDbHelperDec31 = MyDbHelperDec31(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperDec31.writableDatabase
    }
    fun insertToDb(title: String){
        val values = ContentValues().apply {
            put(MyDbNameClass.COLUMN_NAME_TITLE, title)

        }
        db?.insert(MyDbNameClass.TABLE_NAME, null, values)
    }

    fun clearDb() {
        db?.delete(MyDbNameClass.TABLE_NAME, null, null)
    }

    // @SuppressLint("Range")
    @SuppressLint("Range")
    fun readDbData() : ArrayList<String>{
        val dataList = ArrayList<String>()
        val cursor = db?.query(MyDbNameClass.TABLE_NAME, null, null,
            null, null, null, null)

        while (cursor?.moveToNext()!!){
            val dataText = cursor.getString(cursor.getColumnIndex(MyDbNameClass.COLUMN_NAME_TITLE))
            dataList.add(dataText.toString())
        }
        cursor.close()
        return dataList
    }
    fun closeDb(){
        myDbHelperDec31.close()
    }
}