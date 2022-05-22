package com.neuralnetwork.holidaycalendar2022.db

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import com.neuralnetwork.holidaycalendar2022.data.db.MyDbNameClass

class MyDbManagerApr1(context: Context) {
    val myDbHelperApr1 = MyDbHelperApr1(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperApr1.writableDatabase
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
        myDbHelperApr1.close()
    }

}

class MyDbManagerApr2(context: Context) {
    val myDbHelperApr2 = MyDbHelperApr2(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperApr2.writableDatabase
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
        myDbHelperApr2.close()
    }

}

class MyDbManagerApr3(context: Context) {
    val myDbHelperApr3 = MyDbHelperApr3(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperApr3.writableDatabase
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
        myDbHelperApr3.close()
    }

}

class MyDbManagerApr4(context: Context) {
    val myDbHelperApr4 = MyDbHelperApr4(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperApr4.writableDatabase
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
        myDbHelperApr4.close()
    }

}


class MyDbManagerApr5(context: Context) {
    val myDbHelperApr5 = MyDbHelperApr5(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperApr5.writableDatabase
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
        myDbHelperApr5.close()
    }

}

class MyDbManagerApr6(context: Context) {
    val myDbHelperApr6 = MyDbHelperApr6(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperApr6.writableDatabase
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
        myDbHelperApr6.close()
    }

}

class MyDbManagerApr7(context: Context) {
    val myDbHelperApr7 = MyDbHelperApr7(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperApr7.writableDatabase
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
        myDbHelperApr7.close()
    }

}

class MyDbManagerApr8(context: Context) {
    val myDbHelperApr8 = MyDbHelperApr8(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperApr8.writableDatabase
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
        myDbHelperApr8.close()
    }

}

class MyDbManagerApr9(context: Context) {
    val myDbHelperApr9 = MyDbHelperApr9(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperApr9.writableDatabase
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
        myDbHelperApr9.close()
    }

}

class MyDbManagerApr10(context: Context) {
    val myDbHelperApr10 = MyDbHelperApr10(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperApr10.writableDatabase
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
        myDbHelperApr10.close()
    }

}

class MyDbManagerApr11(context: Context) {
    val myDbHelperApr11 = MyDbHelperApr11(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperApr11.writableDatabase
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
        myDbHelperApr11.close()
    }

}

class MyDbManagerApr12(context: Context) {
    val myDbHelperApr12 = MyDbHelperApr12(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperApr12.writableDatabase
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
        myDbHelperApr12.close()
    }

}

class MyDbManagerApr13(context: Context) {
    val myDbHelperApr13 = MyDbHelperApr13(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperApr13.writableDatabase
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
        myDbHelperApr13.close()
    }

}

class MyDbManagerApr14(context: Context) {
    val myDbHelperApr14 = MyDbHelperApr14(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperApr14.writableDatabase
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
        myDbHelperApr14.close()
    }

}

class MyDbManagerApr15(context: Context) {
    val myDbHelperApr15 = MyDbHelperApr15(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperApr15.writableDatabase
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
        myDbHelperApr15.close()
    }

}

class MyDbManagerApr16(context: Context) {
    val myDbHelperApr16 = MyDbHelperApr16(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperApr16.writableDatabase
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
        myDbHelperApr16.close()
    }

}

class MyDbManagerApr17(context: Context) {
    val myDbHelperApr17 = MyDbHelperApr17(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperApr17.writableDatabase
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
        myDbHelperApr17.close()
    }

}

class MyDbManagerApr18(context: Context) {
    val myDbHelperApr18 = MyDbHelperApr18(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperApr18.writableDatabase
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
        myDbHelperApr18.close()
    }

}

class MyDbManagerApr19(context: Context) {
    val myDbHelperApr19 = MyDbHelperApr19(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperApr19.writableDatabase
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
        myDbHelperApr19.close()
    }

}

class MyDbManagerApr20(context: Context) {
    val myDbHelperApr20 = MyDbHelperApr20(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperApr20.writableDatabase
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
        myDbHelperApr20.close()
    }

}

class MyDbManagerApr21(context: Context) {
    val myDbHelperApr21 = MyDbHelperApr21(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperApr21.writableDatabase
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
        myDbHelperApr21.close()
    }

}

class MyDbManagerApr22(context: Context) {
    val myDbHelperApr22 = MyDbHelperApr22(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperApr22.writableDatabase
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
        myDbHelperApr22.close()
    }

}

class MyDbManagerApr23(context: Context) {
    val myDbHelperApr23 = MyDbHelperApr23(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperApr23.writableDatabase
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
        myDbHelperApr23.close()
    }

}

class MyDbManagerApr24(context: Context) {
    val myDbHelperApr24 = MyDbHelperApr24(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperApr24.writableDatabase
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
        myDbHelperApr24.close()
    }

}

class MyDbManagerApr25(context: Context) {
    val myDbHelperApr25 = MyDbHelperApr25(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperApr25.writableDatabase
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
        myDbHelperApr25.close()
    }

}

class MyDbManagerApr26(context: Context) {
    val myDbHelperApr26 = MyDbHelperApr26(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperApr26.writableDatabase
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
        myDbHelperApr26.close()
    }

}

class MyDbManagerApr27(context: Context) {
    val myDbHelperApr27 = MyDbHelperApr27(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperApr27.writableDatabase
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
        myDbHelperApr27.close()
    }

}

class MyDbManagerApr28(context: Context) {
    val myDbHelperApr28 = MyDbHelperApr28(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperApr28.writableDatabase
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
        myDbHelperApr28.close()
    }

}

class MyDbManagerApr29(context: Context) {
    val myDbHelperApr29 = MyDbHelperApr29(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperApr29.writableDatabase
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
        myDbHelperApr29.close()
    }

}

class MyDbManagerApr30(context: Context) {
    val myDbHelperApr30 = MyDbHelperApr30(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperApr30.writableDatabase
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
        myDbHelperApr30.close()
    }

}