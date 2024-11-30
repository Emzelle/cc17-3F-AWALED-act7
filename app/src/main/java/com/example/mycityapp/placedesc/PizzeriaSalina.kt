package com.example.mycityapp.placedesc

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mycityapp.R

class PizzeriaSalina : AppCompatActivity() {
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
        title.text = "Pizzeria Salina"
        description.text = "Situated in the Korinbo District, Kanazawa’s downtown shopping and dining hub. Close to department stores and cultural sites like the 21st Century Museum of Contemporary Art\u200B\n" +
                "Description: Offers authentic Naples-style wood-fired pizzas, such as Margherita and Biancaneve, made with local Ishikawa ingredients. A favorite among locals and tourists alike." +
                pic.setImageResource(R.drawable.res2)

    }
}