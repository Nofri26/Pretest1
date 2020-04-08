package com.squidward.tugas1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_sayhi.*

class Sayhi : AppCompatActivity() {

    lateinit var beres : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sayhi)
        beres = findViewById(R.id.beres)
        val name = intent.getStringExtra("nama")
        beres.text = "Beres! Sekarang "+name+" udah bisa ngecek penggunaan HP "+name+ " tiap hari buat bantu "+name+" ngatur waktu :)"
    }
}
