package com.example.dogglers.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dogglers.R
import com.example.dogglers.model.Dog

class ItemAdapter(private val context: Context,
                  private val Dataset: List<Dog>,
                  private val layoutTyp: Int): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
        val nametextView: TextView = view.findViewById(R.id.name_title)
        val agetextView: TextView = view.findViewById(R.id.age_display)
        val hobbytextView: TextView = view.findViewById(R.id.hobby_display)
        val dogImage: ImageView = view.findViewById(R.id.dodImg)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {

        var layoutSelector: Int = 0
        if (layoutTyp == 1)
            layoutSelector = R.layout.vertical_item_layout
        else if(layoutTyp == 2)
            layoutSelector = R.layout.horizontal_item_view
        else
            layoutSelector = R.layout.grid_item_layout



        val adapterLayout = LayoutInflater.from(parent.context)
                .inflate(layoutSelector,parent,false)

        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = Dataset[position]
        holder.nametextView.text = context.resources.getString(item.dogName)
        holder.agetextView.text = context.resources.getString(item.dogAge)
        holder.hobbytextView.text = context.resources.getString(item.dogHobbies)
        holder.dogImage.setImageResource(item.dogPic)
    }

    override fun getItemCount() = Dataset.size


}