package com.example.mycityapp.placedesc

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mycityapp.R

class Blanket : AppCompatActivity() {
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
        title.text = "Blanket Cafe"
        description.text = "Location: 12-2 Oyamamachi, Kanazawa, Ishikawa 920-0918, Japan\n" +
                "Description: Blanket Cafe in Kanazawa has gained a reputation as one of the top five coffee shops in the area. The atmosphere is described as calm and cozy, making it a perfect spot to relax. The menu offers a variety of coffee options to suit different tastes, and their Tiramisu, cookies, and biscotti are highly recommended. Run by a young couple, this charming cafe serves excellent coffee with carefully crafted cappuccinos and espressos." +
        pic.setImageResource(R.drawable.curioespresso)

    }
}

