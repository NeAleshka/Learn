package com.example.learn
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.learn.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(R.layout.activity_main) {
private val imgList= listOf(
    R.drawable.plant_1,
    R.drawable.plant_2,
    R.drawable.plant_3,
    R.drawable.plant_4)
    private var index=0
    private val mainActivity: ActivityMainBinding by viewBinding()
private val adapter=PlantAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        unit()

    }
private fun unit(){
    mainActivity.apply {
        rcView.layoutManager=GridLayoutManager(this@MainActivity,3)
        rcView.adapter=adapter
        button.setOnClickListener{
            if (index>3) index=0
        val plant=Plant(imgList[index],"Plant $index")
        adapter.addPlant(plant)
            index++
        }
    }
}
}