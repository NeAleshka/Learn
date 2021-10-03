package com.example.learn

import android.util.Log

class User( var name:String, var id:String, var age:Int) {
    fun addAge(years:Int){
    age=age.plus(years)
    }
fun log(){
    Log.d("MyLog","Name:$name id:$id age:$age")
}
}