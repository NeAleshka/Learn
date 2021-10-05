package com.example.learn

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.learn.databinding.PlantItemBinding

class PlantAdapter:RecyclerView.Adapter<PlantAdapter.HolderPlant>() {
   private val listPlant=ArrayList<Plant>()
    class HolderPlant(item:View):RecyclerView.ViewHolder(item) {
    private val plantBinding=PlantItemBinding.bind(item)
    fun bind (plant: Plant)= with(plantBinding){
        imageView.setImageResource(plant.idImg)
        textView.text=plant.tittle
    }
}
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderPlant {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.plant_item,parent,false)
    return HolderPlant(view)
    }

    override fun onBindViewHolder(holder: HolderPlant, position: Int) {
        holder.bind(listPlant[position])
    }

    override fun getItemCount(): Int {
        return listPlant.size
    }
fun addPlant(plant: Plant){
    listPlant.add(plant)
    notifyDataSetChanged()
}

}