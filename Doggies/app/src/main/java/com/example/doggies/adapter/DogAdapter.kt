package com.example.doggies.adapter

import android.content.Context
import android.icu.lang.UCharacter.GraphemeClusterBreak.V
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.doggies.R
import com.example.doggies.model.Dog

class DogAdapter(
    private val context: Context,
    private val dataSet: List<Dog>
): RecyclerView.Adapter <DogAdapter.ItemViewHolder>(){

    class ItemViewHolder(private val view : View):RecyclerView.ViewHolder(view){
        val nameText : TextView = view.findViewById(R.id.name)
        val ageText : TextView = view.findViewById(R.id.age)
        val hobbyText : TextView = view.findViewById(R.id.hobby)
        val dogImage: ImageView = view.findViewById(R.id.dogPic)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.vertical_view,parent,false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataSet[position]
        holder.nameText.text = item.name
        holder.ageText.text = item.age
        holder.hobbyText.text = item.hobby
        holder.dogImage.setImageResource(item.dogImage)
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }


}