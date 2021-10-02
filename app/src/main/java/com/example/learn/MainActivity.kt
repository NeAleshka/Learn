package com.example.learn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    private val bad = 0..3
    private val normal = 4..6
    private val nice = 7..9
    private val excellent = 10
    private val gradeArray = arrayOf(4, 7, 3, 6, 10, 2)
    private val nameArray = arrayOf("Антон", "Егор", "Маша", "Светлана", "Юля", "Семен")
    private val badArray = ArrayList<String>()
    private val normalArray = ArrayList<String>()
    private val niceArray = ArrayList<String>()
    private val excellentArray = ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        for((index,name)in nameArray.withIndex()) {
           when(gradeArray[index]){
               in bad->badArray.add("Плохие оценки: Ученик: $name – ${gradeArray[index]}")
               in normal->normalArray.add("Нормальный оценки: Ученик: $name – ${gradeArray[index]}")
               in nice->niceArray.add("Хорошие оценки: Ученик: $name – ${gradeArray[index]}")
               excellent->excellentArray.add("Плохие оценки: Ученик: $name – ${gradeArray[index]}")
           }
        }
        badArray.forEach{Log.d("MyLog",it)}
        normalArray.forEach{Log.d("MyLog",it)}
        niceArray.forEach{Log.d("MyLog",it)}
        excellentArray.forEach{Log.d("MyLog",it)}
    }
}