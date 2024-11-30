package com.example.mycityapp.placedesc

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mycityapp.R

class Kanazawaya : AppCompatActivity() {
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
        title.text = "Kanazawaya Coffee"
        description.text = "Location: 5-26 Marunouchi, Kanazawa, Ishikawa, Japan\n" +
                "Description: Tranquil modern space with a terrace for artisan coffees, teas, cakes & ice cream." +
        pic.setImageResource(R.drawable.cafe2)

    }
}