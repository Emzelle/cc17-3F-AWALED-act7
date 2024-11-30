package com.example.mycityapp.placedesc

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mycityapp.R

class Curioespresso : AppCompatActivity() {
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
        title.text = "Curio Espresso and Vintage Design"
        description.text = "Location: Yasuecho neighborhood, near Kanazawa Castle and the railway station.\n" +
                "Description: his cafe blends a vintage American design with Kanazawa’s charm. Its glass-paneled exterior includes broad windows and double doors, giving it a welcoming feel." +
                " Inside, it features retro decor and a menu with excellent espresso options and light meals like sandwiches. " +
                "Perfect for coffee enthusiasts and those appreciating vintage aesthetics.\n"
        pic.setImageResource(R.drawable.curioespresso)

    }
}