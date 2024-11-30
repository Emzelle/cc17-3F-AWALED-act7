package com.example.mycityapp.placedesc

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mycityapp.R

class KanazawaCastle : AppCompatActivity() {
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
        title.text = "Kanazawa Castle Park"
        description.text = "Location: Beside Kenroku-en Garden, in the heart of Kanazawa. Both are part of the same cultural and historical area\n" +
                "Description: Located next to Kenroku-en, this park surrounds the reconstructed Kanazawa Castle. It's a great spot for walking, with open green spaces, historic gates, and structures that showcase traditional Japanese architecture." +
                pic.setImageResource(R.drawable.park2)

    }
}

