package com.example.mycityapp

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mycityapp.model.Items
import com.example.mycityapp.R
import com.example.mycityapp.adapter.ItemView
import com.example.mycityapp.nearby.Cafe
import com.example.mycityapp.nearby.Parks
import com.example.mycityapp.nearby.Restaurants
import com.example.mycityapp.nearby.TouristSpots

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val title: TextView = findViewById(R.id.screenTitle)
        title.text = "Kanazawa Guide"

        val rvAboutMe: RecyclerView = findViewById(R.id.lister)
        rvAboutMe.layoutManager = LinearLayoutManager(this)

        val cafe = listOf(
            Items(R.drawable.curioespresso, "Nearby Cafe") {
                val intent = Intent(this, Cafe::class.java)
                startActivity(intent)
            },
        )
        val parks = listOf(
            Items(R.drawable.park1, "Nearby Parks") {
                val intent = Intent(this, Parks::class.java)
                startActivity(intent)
            },
        )
        val restaurant = listOf(
            Items(R.drawable.res1, "Nearby Restaurants") {
                val intent = Intent(this, Restaurants::class.java)
                startActivity(intent)
            },
        )
        val tourist = listOf(
            Items(R.drawable.ts1, "Tourist Spots") {
                val intent = Intent(this, TouristSpots::class.java)
                startActivity(intent)
            },
        )

        val arrList = cafe + parks + restaurant + tourist

        rvAboutMe.adapter = ItemView(arrList)
    }
}
