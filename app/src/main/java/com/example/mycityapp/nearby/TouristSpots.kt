package com.example.mycityapp.nearby

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mycityapp.model.Items
import com.example.mycityapp.R
import com.example.mycityapp.adapter.ItemView
import com.example.mycityapp.placedesc.Higashi
import com.example.mycityapp.placedesc.Museum
import com.example.mycityapp.placedesc.Nagamachi

class TouristSpots : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val title: TextView = findViewById(R.id.screenTitle)
        title.text = "Tourist Spots "

        val rvRestaurant: RecyclerView = findViewById(R.id.lister)
        rvRestaurant.layoutManager = LinearLayoutManager(this)

        val arrList = listOf(
            Items(R.drawable.ts1, "Higashi Chaya District") {
                val intent = Intent(this, Higashi::class.java)
                startActivity(intent)
            },
            Items(R.drawable.ts2, "21st Century Museum of Contemporary Art") {
                val intent = Intent(this, Museum::class.java)
                startActivity(intent)
            },
            Items(R.drawable.ts3, "Nagamachi Samurai District") {
                val intent = Intent(this, Nagamachi::class.java)
                startActivity(intent)
            }
        )

        rvRestaurant.adapter = ItemView(arrList)
    }
}
