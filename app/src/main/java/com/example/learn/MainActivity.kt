package com.example.learn
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.learn.databinding.ActivityMainBinding
import kotlin.math.pow
import kotlin.math.sqrt
class MainActivity : AppCompatActivity(R.layout.activity_main) {
    private val mainActivity: ActivityMainBinding by viewBinding()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainActivity.button.setOnClickListener {
            if(!isFieldEmpty()){
            val result=getString(R.string.textRes)+getResult()
            mainActivity.tVResult.text=result
                Log.d("MyLog",result)
            }
        }
    }
    private fun isFieldEmpty():Boolean {
        mainActivity.apply {
        if(edA.text.isNullOrEmpty()) edA.error=getText(R.string.masErrorA)
        if(edB.text.isNullOrEmpty()) edB.error=getText(R.string.masErrorB)
            return edA.text.isNullOrEmpty()|| edB.text.isNullOrEmpty()
        }
    }
private fun getResult():String{
    val a:Double
    val b:Double
    mainActivity.apply {
        a=edA.text.toString().toDouble()
        b=edB.text.toString().toDouble()
    }
    val result=sqrt((a.pow(2))+(b.pow(2)))
    return ("%.2f".format(result))
}
}