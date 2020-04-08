package com.squidward.tugas1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Biodata : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var editText: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biodata)
        button = findViewById(R.id.selanjutnya)
        editText = findViewById(R.id.namafield)


        button.setOnClickListener {
            val intent = Intent(this, Sayhi::class.java)
            //mengirin isi field ke class sayhi
            intent.putExtra("nama", editText.text.toString())
            startActivity(intent)

        }
    }
}
