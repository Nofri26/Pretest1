package com.squidward.tugas1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.buttonmulai)
        button.setOnClickListener {
            startActivity(Intent(this, LoginCode::class.java))
            //sabtu malam selesai menambah halamam utama
        }
    }
}
