package com.example.bitfit

import android.content.ClipData
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val newEntry = findViewById<Button>(R.id.newEntry)

        newEntry.setOnClickListener {
            val i = Intent(this@MainActivity, DetailActivity::class.java)
            this.startActivity(i)
        }





    }
}