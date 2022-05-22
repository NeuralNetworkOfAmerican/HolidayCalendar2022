package com.neuralnetwork.holidaycalendar2022.db

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import com.neuralnetwork.holidaycalendar2022.data.db.MyDbNameClass

class MyDbManagerOct1(context: Context) {
    val myDbHelperOct1 = MyDbHelperOct1(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperOct1.writableDatabase
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
        myDbHelperOct1.close()
    }

}

class MyDbManagerOct2(context: Context) {
    val myDbHelperOct2 = MyDbHelperOct2(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperOct2.writableDatabase
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
        myDbHelperOct2.close()
    }

}

class MyDbManagerOct3(context: Context) {
    val myDbHelperOct3 = MyDbHelperOct3(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperOct3.writableDatabase
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
        myDbHelperOct3.close()
    }

}

class MyDbManagerOct4(context: Context) {
    val myDbHelperOct4 = MyDbHelperOct4(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperOct4.writableDatabase
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
        myDbHelperOct4.close()
    }

}

class MyDbManagerOct5(context: Context) {
    val myDbHelperOct5 = MyDbHelperOct5(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperOct5.writableDatabase
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
        myDbHelperOct5.close()
    }

}

class MyDbManagerOct6(context: Context) {
    val myDbHelperOct6 = MyDbHelperOct6(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperOct6.writableDatabase
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
        myDbHelperOct6.close()
    }

}

class MyDbManagerOct7(context: Context) {
    val myDbHelperOct7 = MyDbHelperOct7(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperOct7.writableDatabase
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
        myDbHelperOct7.close()
    }

}

class MyDbManagerOct8(context: Context) {
    val myDbHelperOct8 = MyDbHelperOct8(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperOct8.writableDatabase
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
        myDbHelperOct8.close()
    }

}

class MyDbManagerOct9(context: Context) {
    val myDbHelperOct9 = MyDbHelperOct9(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperOct9.writableDatabase
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
        myDbHelperOct9.close()
    }

}

class MyDbManagerOct10(context: Context) {
    val myDbHelperOct10 = MyDbHelperOct10(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperOct10.writableDatabase
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
        myDbHelperOct10.close()
    }

}

class MyDbManagerOct11(context: Context) {
    val myDbHelperOct11 = MyDbHelperOct11(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperOct11.writableDatabase
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
        myDbHelperOct11.close()
    }

}

class MyDbManagerOct12(context: Context) {
    val myDbHelperOct12 = MyDbHelperOct12(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperOct12.writableDatabase
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
        myDbHelperOct12.close()
    }

}

class MyDbManagerOct13(context: Context) {
    val myDbHelperOct13 = MyDbHelperOct13(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperOct13.writableDatabase
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
        myDbHelperOct13.close()
    }

}

class MyDbManagerOct14(context: Context) {
    val myDbHelperOct14 = MyDbHelperOct14(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperOct14.writableDatabase
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
        myDbHelperOct14.close()
    }

}

class MyDbManagerOct15(context: Context) {
    val myDbHelperOct15 = MyDbHelperOct15(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperOct15.writableDatabase
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
        myDbHelperOct15.close()
    }

}

class MyDbManagerOct16(context: Context) {
    val myDbHelperOct16 = MyDbHelperOct16(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperOct16.writableDatabase
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
        myDbHelperOct16.close()
    }

}

class MyDbManagerOct17(context: Context) {
    val myDbHelperOct17 = MyDbHelperOct17(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperOct17.writableDatabase
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
        myDbHelperOct17.close()
    }

}

class MyDbManagerOct18(context: Context) {
    val myDbHelperOct18 = MyDbHelperOct18(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperOct18.writableDatabase
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
        myDbHelperOct18.close()
    }

}

class MyDbManagerOct19(context: Context) {
    val myDbHelperOct19 = MyDbHelperOct19(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperOct19.writableDatabase
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
        myDbHelperOct19.close()
    }

}

class MyDbManagerOct20(context: Context) {
    val myDbHelperOct20 = MyDbHelperOct20(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperOct20.writableDatabase
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
        myDbHelperOct20.close()
    }

}

class MyDbManagerOct21(context: Context) {
    val myDbHelperOct21 = MyDbHelperOct21(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperOct21.writableDatabase
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
        myDbHelperOct21.close()
    }

}

class MyDbManagerOct22(context: Context) {
    val myDbHelperOct22 = MyDbHelperOct22(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperOct22.writableDatabase
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
        myDbHelperOct22.close()
    }

}

class MyDbManagerOct23(context: Context) {
    val myDbHelperOct23 = MyDbHelperOct23(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperOct23.writableDatabase
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
        myDbHelperOct23.close()
    }

}

class MyDbManagerOct24(context: Context) {
    val myDbHelperOct24 = MyDbHelperOct24(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperOct24.writableDatabase
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
        myDbHelperOct24.close()
    }

}

class MyDbManagerOct25(context: Context) {
    val myDbHelperOct25 = MyDbHelperOct25(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperOct25.writableDatabase
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
        myDbHelperOct25.close()
    }

}

class MyDbManagerOct26(context: Context) {
    val myDbHelperOct26 = MyDbHelperOct26(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperOct26.writableDatabase
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
        myDbHelperOct26.close()
    }

}

class MyDbManagerOct27(context: Context) {
    val myDbHelperOct27 = MyDbHelperOct27(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperOct27.writableDatabase
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
        myDbHelperOct27.close()
    }

}

class MyDbManagerOct28(context: Context) {
    val myDbHelperOct28 = MyDbHelperOct28(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperOct28.writableDatabase
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
        myDbHelperOct28.close()
    }

}

class MyDbManagerOct29(context: Context) {
    val myDbHelperOct29 = MyDbHelperOct29(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperOct29.writableDatabase
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
        myDbHelperOct29.close()
    }

}

class MyDbManagerOct30(context: Context) {
    val myDbHelperOct30 = MyDbHelperOct30(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperOct30.writableDatabase
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
        myDbHelperOct30.close()
    }

}

class MyDbManagerOct31(context: Context) {
    val myDbHelperOct31 = MyDbHelperOct31(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperOct31.writableDatabase
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
        myDbHelperOct31.close()
    }
}