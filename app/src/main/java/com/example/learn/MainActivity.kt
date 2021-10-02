package com.example.learn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    val lostArray= arrayOf(1000,1500,500,3000,5000,2000)
    val profitArray= arrayOf(500,15000,2500,600,1000,7700)
    val resultArray= ArrayList<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    val names=resources.getStringArray(R.array.nameArray)
    for ((index,name)in names.withIndex()){
        resultArray.add("Имя :$name - прибыль=${profitArray[index]-lostArray[index]}")
    Log.d("MyLog", "Статистика -/- ${resultArray[index]}")
    }
}
}