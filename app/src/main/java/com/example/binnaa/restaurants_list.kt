package com.example.binnaapplicationn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.binnaa.R

class restaurants_list : AppCompatActivity() {

    private lateinit var recyclerView : RecyclerView
    //private  var restaurants: ArrayList<restaurants_list_dataclass>()
    private lateinit var restaurantsAdapter: RestaurantsAdapter
    private  lateinit var searchView: SearchView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurants_list)



         recyclerView = findViewById(R.id.recycler_restaurants_list)
         searchView = findViewById(R.id.search_view)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)



         val restaurants = arrayListOf<restaurants_list_dataclass>()

        restaurants.add(restaurants_list_dataclass( (R.drawable.img_7) , getString(R.string.kfc_text_view)) )
        restaurants.add(restaurants_list_dataclass( (R.drawable.img_8) , getString(R.string.mac_text_view)) )
        restaurants.add(restaurants_list_dataclass( (R.drawable.img_10) , getString(R.string.burgerking_text_view)) )
        restaurants.add(restaurants_list_dataclass( (R.drawable.img_9) , getString(R.string.hardees_text_view)) )

        restaurantsAdapter = RestaurantsAdapter( this , restaurants)
        recyclerView.adapter = restaurantsAdapter



        addDataToList()



    }





    private fun addDataToList(){



    }






}