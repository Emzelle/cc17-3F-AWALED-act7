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
import com.example.mycityapp.placedesc.KanazawaCastle
import com.example.mycityapp.placedesc.KenrokuenGarden
import com.example.mycityapp.placedesc.OyamaShrine
import com.example.mycityapp.placedesc.Utatsuyama

class Parks : AppCompatActivity() {
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
        title.text = "Nearby Parks "

        val rvRestaurant: RecyclerView = findViewById(R.id.lister)
        rvRestaurant.layoutManager = LinearLayoutManager(this)

        val arrList = listOf(
            Items(R.drawable.park1, "Kenroku-en Garden") {
                val intent = Intent(this, KenrokuenGarden::class.java)
                startActivity(intent)
            },
            Items(R.drawable.park2, "Kanazawa Castle Park") {
                val intent = Intent(this, KanazawaCastle::class.java)
                startActivity(intent)
            },
            Items(R.drawable.park3, "Utatsuyama Park") {
                val intent = Intent(this, Utatsuyama::class.java)
                startActivity(intent)
            },
            Items(R.drawable.park4, "Oyama Shrine Garden") {
                val intent = Intent(this, OyamaShrine::class.java)
                startActivity(intent)
            }
        )

        rvRestaurant.adapter = ItemView(arrList)
    }
}
