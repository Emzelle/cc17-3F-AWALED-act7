package com.example.mycityapp.placedesc

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mycityapp.R

class Fuwari : AppCompatActivity() {
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
        title.text = "Fuwari"
        description.text = "Located near Omicho Market, a short walk from Kanazawa Castle and central attractions. It’s in a bustling area perfect for food lovers\n" +
                "Description: A small yet popular spot near Omicho Market, known for its fresh sashimi and aromatic charcoal-grilled seafood platters. Reservations are recommended due to its limited seating." +
                pic.setImageResource(R.drawable.res1)

    }
}