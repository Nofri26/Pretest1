package com.squidward.tugas1

/*
* NIM   : 10117139
* Nama  : Nofrizal
* Kelas : AKB-4 / IF-4
* Tugas : AKB Pemanasan 1
*
* Update :
* - 4 April =
*       - Membuat Halaman Awal
* - 5 april =
*       - Membuat halaman kedua (login)
*       - Upload Github
* - 6 april =
*       - Membuat Halaman 3 dan 4
*       - Membuat EditText pada Kode Keluarga menjadi Capslock
*   8 april =
*       - Menambahkan Detail Lainya
*
* */
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
