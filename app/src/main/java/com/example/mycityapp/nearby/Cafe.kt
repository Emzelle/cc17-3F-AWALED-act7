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
import com.example.mycityapp.placedesc.Blanket
import com.example.mycityapp.placedesc.Curioespresso
import com.example.mycityapp.placedesc.Kanazawaya

class Cafe : AppCompatActivity() {
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
        title.text = "Nearby Cafe"

        val rvCoffee: RecyclerView = findViewById(R.id.lister)
        rvCoffee.layoutManager = LinearLayoutManager(this)

        val arrList = listOf(
            Items(R.drawable.curioespresso, "Curio Espresso and Vintage Design") {
                val intent = Intent(this, Curioespresso::class.java)
                startActivity(intent)
            },
            Items(R.drawable.cafe2, "Kanazawaya") {
                val intent = Intent(this, Kanazawaya::class.java)
                startActivity(intent)
            },
            Items(R.drawable.cafe3, "Blanket Cafe") {
                val intent = Intent(this, Blanket::class.java)
                startActivity(intent)
            }
        )

        rvCoffee.adapter = ItemView(arrList)
    }
}
