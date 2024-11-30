package com.example.mycityapp.placedesc

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mycityapp.R

class SteakRokkakudo : AppCompatActivity() {
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
        title.text = "Steak Rokkakudo"
        description.text = "Located near Omicho Market, a short walk from Kanazawa Castle and central attractions. It’s in a bustling area perfect for food lovers\n" +
                "Description: A legendary spot for premium Noto Wagyu beef, grilled to perfection on teppan grills. Renowned for its tender, flavorful steaks in a cozy setting." +
                pic.setImageResource(R.drawable.res3)

    }
}