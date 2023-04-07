package com.example.binnaapplicationn

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.binnaa.R

class RestaurantsAdapter ( val context :Context , private val restaurantsList:ArrayList<restaurants_list_dataclass>) :
      RecyclerView.Adapter<RestaurantsAdapter.RestaurantViewHolder>()
     {


        class RestaurantViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView){

           // val cardView : CardView = itemView.findViewById(R.id.restaurant_places_cardview) as CardView
            val  image : ImageView = itemView.findViewById(R.id.kfc_image) as ImageView
            val textView : TextView = itemView.findViewById(R.id.kfc_text) as TextView

        }

         override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantViewHolder {
             val rest_view = LayoutInflater.from(parent.context).inflate(R.layout.restaurants_places , parent , false)
             return RestaurantViewHolder(rest_view)
         }

         override fun onBindViewHolder(holder: RestaurantViewHolder, position: Int) {
             val restaurant = restaurantsList[position]
             holder.image.setImageResource(restaurant.Image)
             holder.textView.text = restaurant.name

             //clicking on image to go to another intent "layout"

            /* holder.image.setOnClickListener{
                startActivity(Intent(this , Restaurant_details::class.java))

             }*/

             when(position){
                // item view 3moman 3lshan lma ygy ydos 3ala ay mkan fl card msh lazim name aw image
                 0 -> { holder.itemView.setOnClickListener {
                   val i = Intent( context , Restaurant_details::class.java)

                     //context 3lshan hia ely mkan this fl main activity bta3y msh hainfa3 ast5dim this hena 3lshan dah adapter msh main
                     context.startActivity(i)
                 } }

                 else->{
                     Toast.makeText(context, "Not Available", Toast.LENGTH_LONG).show()

                 }


             }




         }

         override fun getItemCount(): Int {
            return restaurantsList.size
         }

     }