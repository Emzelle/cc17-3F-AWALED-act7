package com.example.mycityapp.placedesc

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mycityapp.R

class KenrokuenGarden : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.desc)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val title: TextView = findViewById(R.id.title)
        val description: TextView = findViewById(R.id.description)
        val pic: ImageView = findViewById(R.id.img)
        title.text = "Kenroku-en Garden"
        description.text = "Location: Central Kanazawa, adjacent to Kanazawa Castle. Easily accessible from major tourist areas. It's a centerpiece of the city and a must-visit\n" +
                "Description: This iconic garden is one of Japan's most famous, renowned for its historical Edo-period design. It features expansive grounds with seasonal blooms, ponds, teahouses, and beautifully maintained landscapes. It’s adjacent to Kanazawa Castle Park, making it convenient for a combined visit." +
                pic.setImageResource(R.drawable.park1)

    }
}

