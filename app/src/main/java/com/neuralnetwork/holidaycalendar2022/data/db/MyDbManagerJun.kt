package com.neuralnetwork.holidaycalendar2022.db

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import com.neuralnetwork.holidaycalendar2022.data.db.MyDbNameClass

class MyDbManagerJun1(context: Context) {
    val myDbHelperJun1 = MyDbHelperJun1(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperJun1.writableDatabase
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
        myDbHelperJun1.close()
    }

}

class MyDbManagerJun2(context: Context) {
    val myDbHelperJun2 = MyDbHelperJun2(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperJun2.writableDatabase
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
        myDbHelperJun2.close()
    }

}

class MyDbManagerJun3(context: Context) {
    val myDbHelperJun3 = MyDbHelperJun3(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperJun3.writableDatabase
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
        myDbHelperJun3.close()
    }

}

class MyDbManagerJun4(context: Context) {
    val myDbHelperJun4 = MyDbHelperJun4(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperJun4.writableDatabase
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
        myDbHelperJun4.close()
    }

}

class MyDbManagerJun5(context: Context) {
    val myDbHelperJun5 = MyDbHelperJun5(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperJun5.writableDatabase
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
        myDbHelperJun5.close()
    }

}

class MyDbManagerJun6(context: Context) {
    val myDbHelperJun6 = MyDbHelperJun6(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperJun6.writableDatabase
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
        myDbHelperJun6.close()
    }

}

class MyDbManagerJun7(context: Context) {
    val myDbHelperJun7 = MyDbHelperJun7(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperJun7.writableDatabase
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
        myDbHelperJun7.close()
    }

}

class MyDbManagerJun8(context: Context) {
    val myDbHelperJun8 = MyDbHelperJun8(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperJun8.writableDatabase
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
        myDbHelperJun8.close()
    }

}

class MyDbManagerJun9(context: Context) {
    val myDbHelperJun9 = MyDbHelperJun9(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperJun9.writableDatabase
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
        myDbHelperJun9.close()
    }

}

class MyDbManagerJun10(context: Context) {
    val myDbHelperJun10 = MyDbHelperJun10(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperJun10.writableDatabase
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
        myDbHelperJun10.close()
    }

}

class MyDbManagerJun11(context: Context) {
    val myDbHelperJun11 = MyDbHelperJun11(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperJun11.writableDatabase
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
        myDbHelperJun11.close()
    }

}

class MyDbManagerJun12(context: Context) {
    val myDbHelperJun12 = MyDbHelperJun12(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperJun12.writableDatabase
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
        myDbHelperJun12.close()
    }

}

class MyDbManagerJun13(context: Context) {
    val myDbHelperJun13 = MyDbHelperJun13(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperJun13.writableDatabase
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
        myDbHelperJun13.close()
    }

}

class MyDbManagerJun14(context: Context) {
    val myDbHelperJun14 = MyDbHelperJun14(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperJun14.writableDatabase
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
        myDbHelperJun14.close()
    }

}

class MyDbManagerJun15(context: Context) {
    val myDbHelperJun15 = MyDbHelperJun15(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperJun15.writableDatabase
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
        myDbHelperJun15.close()
    }

}

class MyDbManagerJun16(context: Context) {
    val myDbHelperJun16 = MyDbHelperJun16(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperJun16.writableDatabase
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
        myDbHelperJun16.close()
    }

}

class MyDbManagerJun17(context: Context) {
    val myDbHelperJun17 = MyDbHelperJun17(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperJun17.writableDatabase
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
        myDbHelperJun17.close()
    }

}

class MyDbManagerJun18(context: Context) {
    val myDbHelperJun18 = MyDbHelperJun18(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperJun18.writableDatabase
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
        myDbHelperJun18.close()
    }

}

class MyDbManagerJun19(context: Context) {
    val myDbHelperJun19 = MyDbHelperJun19(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperJun19.writableDatabase
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
        myDbHelperJun19.close()
    }

}

class MyDbManagerJun20(context: Context) {
    val myDbHelperJun20 = MyDbHelperJun20(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperJun20.writableDatabase
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
        myDbHelperJun20.close()
    }

}

class MyDbManagerJun21(context: Context) {
    val myDbHelperJun21 = MyDbHelperJun21(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperJun21.writableDatabase
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
        myDbHelperJun21.close()
    }

}

class MyDbManagerJun22(context: Context) {
    val myDbHelperJun22 = MyDbHelperJun22(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperJun22.writableDatabase
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
        myDbHelperJun22.close()
    }

}

class MyDbManagerJun23(context: Context) {
    val myDbHelperJun23 = MyDbHelperJun23(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperJun23.writableDatabase
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
        myDbHelperJun23.close()
    }

}

class MyDbManagerJun24(context: Context) {
    val myDbHelperJun24 = MyDbHelperJun24(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperJun24.writableDatabase
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
        myDbHelperJun24.close()
    }

}

class MyDbManagerJun25(context: Context) {
    val myDbHelperJun25 = MyDbHelperJun25(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperJun25.writableDatabase
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
        myDbHelperJun25.close()
    }

}

class MyDbManagerJun26(context: Context) {
    val myDbHelperJun26 = MyDbHelperJun26(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperJun26.writableDatabase
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
        myDbHelperJun26.close()
    }

}

class MyDbManagerJun27(context: Context) {
    val myDbHelperJun27 = MyDbHelperJun27(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperJun27.writableDatabase
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
        myDbHelperJun27.close()
    }

}

class MyDbManagerJun28(context: Context) {
    val myDbHelperJun28 = MyDbHelperJun28(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperJun28.writableDatabase
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
        myDbHelperJun28.close()
    }

}

class MyDbManagerJun29(context: Context) {
    val myDbHelperJun29 = MyDbHelperJun29(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperJun29.writableDatabase
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
        myDbHelperJun29.close()
    }

}

class MyDbManagerJun30(context: Context) {
    val myDbHelperJun30 = MyDbHelperJun30(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelperJun30.writableDatabase
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
        myDbHelperJun30.close()
    }

}