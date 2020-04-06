package com.squidward.tugas1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Biodata : AppCompatActivity() {
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biodata)
        button = findViewById(R.id.selanjutnya)
        button.setOnClickListener {
            startActivity(Intent(this, Sayhi::class.java))}
    }
}
