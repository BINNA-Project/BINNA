package com.example.binnaapplicationn

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.binnaa.R

class Sub_categories : AppCompatActivity() {

    private lateinit var recyclerview : RecyclerView
    private lateinit var subCategoriesAdapter: SubCategoriesAdapter

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub_categories)


        recyclerview = findViewById(R.id.sub_recycler_list)
        recyclerview.setHasFixedSize(true)
        recyclerview.layoutManager = LinearLayoutManager(this)

        val sub_categories = arrayListOf<sub_categories_dataclass>()

        sub_categories.add(sub_categories_dataclass((R.drawable.img_2) , getString(R.string.Restaurants_text_view)))
        sub_categories.add(sub_categories_dataclass((R.drawable.img_1) , getString(R.string.Cafes_text_view)))
        sub_categories.add(sub_categories_dataclass((R.drawable.img_4) , getString(R.string.Parks_text_view)))
        sub_categories.add(sub_categories_dataclass((R.drawable.img_3) , getString(R.string.Amusement_Parks_text_view)))
        sub_categories.add(sub_categories_dataclass((R.drawable.img_5) , getString(R.string.Historical_text_view)))


        subCategoriesAdapter = SubCategoriesAdapter( this , sub_categories)
        recyclerview.adapter = subCategoriesAdapter






    }
}