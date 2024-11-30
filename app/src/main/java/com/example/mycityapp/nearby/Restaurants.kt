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
import com.example.mycityapp.placedesc.Fuwari
import com.example.mycityapp.placedesc.Kenrokutei
import com.example.mycityapp.placedesc.PizzeriaSalina
import com.example.mycityapp.placedesc.SteakRokkakudo

class Restaurants : AppCompatActivity() {
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
        title.text = "Nearby Restaurants"

        val rvRestaurant: RecyclerView = findViewById(R.id.lister)
        rvRestaurant.layoutManager = LinearLayoutManager(this)

        val arrList = listOf(
            Items(R.drawable.res1, "Fuwari") {
                val intent = Intent(this, Fuwari::class.java)
                startActivity(intent)
            },
            Items(R.drawable.res2, "Pizzeria Salina") {
                val intent = Intent(this, PizzeriaSalina::class.java)
                startActivity(intent)
            },
            Items(R.drawable.res3, "Steak Rokkakudo") {
                val intent = Intent(this, SteakRokkakudo::class.java)
                startActivity(intent)
            },
            Items(R.drawable.res4, "Kenrokutei") {
                val intent = Intent(this, Kenrokutei::class.java)
                startActivity(intent)
            }
        )

        rvRestaurant.adapter = ItemView(arrList)
    }
}
