package com.neuralnetwork.holidaycalendar2022.db

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import com.neuralnetwork.holidaycalendar2022.data.db.MyDbNameClass

class MyDbManagerFeb1(context: Context) {
    val myDbHelperFeb1 = MyDbHelperFeb1(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperFeb1.writableDatabase
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
        myDbHelperFeb1.close()
    }

}

class MyDbManagerFeb2(context: Context) {
    val myDbHelperFeb2 = MyDbHelperFeb2(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperFeb2.writableDatabase
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
        myDbHelperFeb2.close()
    }

}

class MyDbManagerFeb3(context: Context) {
    val myDbHelperFeb3 = MyDbHelperFeb3(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperFeb3.writableDatabase
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
        myDbHelperFeb3.close()
    }

}

class MyDbManagerFeb4(context: Context) {
    val myDbHelperFeb4 = MyDbHelperFeb4(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperFeb4.writableDatabase
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
        myDbHelperFeb4.close()
    }

}

class MyDbManagerFeb5(context: Context) {
    val myDbHelperFeb5 = MyDbHelperFeb5(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperFeb5.writableDatabase
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
        myDbHelperFeb5.close()
    }

}

class MyDbManagerFeb6(context: Context) {
    val myDbHelperFeb6 = MyDbHelperFeb6(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperFeb6.writableDatabase
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
        myDbHelperFeb6.close()
    }

}

class MyDbManagerFeb7(context: Context) {
    val myDbHelperFeb7 = MyDbHelperFeb7(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperFeb7.writableDatabase
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
        myDbHelperFeb7.close()
    }

}

class MyDbManagerFeb8(context: Context) {
    val myDbHelperFeb8 = MyDbHelperFeb8(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperFeb8.writableDatabase
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
        myDbHelperFeb8.close()
    }

}

class MyDbManagerFeb9(context: Context) {
    val myDbHelperFeb9 = MyDbHelperFeb9(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperFeb9.writableDatabase
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
        myDbHelperFeb9.close()
    }

}

class MyDbManagerFeb10(context: Context) {
    val myDbHelperFeb10 = MyDbHelperFeb10(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperFeb10.writableDatabase
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
        myDbHelperFeb10.close()
    }

}

class MyDbManagerFeb11(context: Context) {
    val myDbHelperFeb11 = MyDbHelperFeb11(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperFeb11.writableDatabase
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
        myDbHelperFeb11.close()
    }

}

class MyDbManagerFeb12(context: Context) {
    val myDbHelperFeb12 = MyDbHelperFeb12(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperFeb12.writableDatabase
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
        myDbHelperFeb12.close()
    }

}

class MyDbManagerFeb13(context: Context) {
    val myDbHelperFeb13 = MyDbHelperFeb13(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperFeb13.writableDatabase
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
        myDbHelperFeb13.close()
    }

}

class MyDbManagerFeb14(context: Context) {
    val myDbHelperFeb14 = MyDbHelperFeb14(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperFeb14.writableDatabase
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
        myDbHelperFeb14.close()
    }

}

class MyDbManagerFeb15(context: Context) {
    val myDbHelperFeb15 = MyDbHelperFeb15(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperFeb15.writableDatabase
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
        myDbHelperFeb15.close()
    }

}

class MyDbManagerFeb16(context: Context) {
    val myDbHelperFeb16 = MyDbHelperFeb16(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperFeb16.writableDatabase
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
        myDbHelperFeb16.close()
    }

}

class MyDbManagerFeb17(context: Context) {
    val myDbHelperFeb17 = MyDbHelperFeb17(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperFeb17.writableDatabase
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
        myDbHelperFeb17.close()
    }

}

class MyDbManagerFeb18(context: Context) {
    val myDbHelperFeb18 = MyDbHelperFeb18(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperFeb18.writableDatabase
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
        myDbHelperFeb18.close()
    }

}

class MyDbManagerFeb19(context: Context) {
    val myDbHelperFeb19 = MyDbHelperFeb19(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperFeb19.writableDatabase
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
        myDbHelperFeb19.close()
    }

}

class MyDbManagerFeb20(context: Context) {
    val myDbHelperFeb20 = MyDbHelperFeb20(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperFeb20.writableDatabase
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
        myDbHelperFeb20.close()
    }

}

class MyDbManagerFeb21(context: Context) {
    val myDbHelperFeb21 = MyDbHelperFeb21(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperFeb21.writableDatabase
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
        myDbHelperFeb21.close()
    }

}

class MyDbManagerFeb22(context: Context) {
    val myDbHelperFeb22 = MyDbHelperFeb22(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperFeb22.writableDatabase
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
        myDbHelperFeb22.close()
    }

}

class MyDbManagerFeb23(context: Context) {
    val myDbHelperFeb23 = MyDbHelperFeb23(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperFeb23.writableDatabase
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
        myDbHelperFeb23.close()
    }

}

class MyDbManagerFeb24(context: Context) {
    val myDbHelperFeb24 = MyDbHelperFeb24(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperFeb24.writableDatabase
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
        myDbHelperFeb24.close()
    }

}

class MyDbManagerFeb25(context: Context) {
    val myDbHelperFeb25 = MyDbHelperFeb25(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperFeb25.writableDatabase
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
        myDbHelperFeb25.close()
    }

}

class MyDbManagerFeb26(context: Context) {
    val myDbHelperFeb26 = MyDbHelperFeb26(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperFeb26.writableDatabase
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
        myDbHelperFeb26.close()
    }

}

class MyDbManagerFeb27(context: Context) {
    val myDbHelperFeb27 = MyDbHelperFeb27(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperFeb27.writableDatabase
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
        myDbHelperFeb27.close()
    }

}

class MyDbManagerFeb28(context: Context) {
    val myDbHelperFeb28 = MyDbHelperFeb28(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperFeb28.writableDatabase
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
        myDbHelperFeb28.close()
    }

}