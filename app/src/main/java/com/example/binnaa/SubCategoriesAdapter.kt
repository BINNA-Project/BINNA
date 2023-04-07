package com.example.binnaapplicationn

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.binnaa.R

class SubCategoriesAdapter (val context: Context  , private val subcategories_list : ArrayList<sub_categories_dataclass>):
    RecyclerView.Adapter<SubCategoriesAdapter.SubcategoriesViewHolder>() {

        class SubcategoriesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
            val  image : ImageView = itemView.findViewById(R.id.restaurant_image) as ImageView
            val textView : TextView = itemView.findViewById(R.id.restaurant_text) as TextView

        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SubcategoriesViewHolder {
        val sub_view = LayoutInflater.from(parent.context).inflate(R.layout.activity_sub_categories , parent , false)
        return SubCategoriesAdapter.SubcategoriesViewHolder(sub_view)
    }


    override fun onBindViewHolder(holder: SubcategoriesViewHolder, position: Int) {
        val subcategories = subcategories_list[position]
        holder.image.setImageResource(subcategories.C_image)
        holder.textView.text = subcategories.C_name
    }

    override fun getItemCount(): Int {
        return subcategories_list.size
    }



}