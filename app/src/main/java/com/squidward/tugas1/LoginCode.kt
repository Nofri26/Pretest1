package com.squidward.tugas1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.InputFilter
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import androidx.core.text.HtmlCompat
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_login_code.*

class LoginCode : AppCompatActivity() {
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_code)
        val html =
            "Dengan menekan tombol masuk berarti Anda menyetujui <b>Ketentuan Pengguna</b> dan <b>Kebijakan Data</b> kami"
        textView4.text = HtmlCompat.fromHtml(html, HtmlCompat.FROM_HTML_MODE_LEGACY)
        //minggu selesai 2 halaman dan menyempurnakan lagi.

        button = findViewById(R.id.buttonmasuk)
        button.setOnClickListener {
            startActivity(Intent(this, Biodata::class.java))}
            //sabtu malam selesai menambah halamam utama

            inputcode.addTextChangedListener(object : TextWatcher {

                override fun onTextChanged(arg0: CharSequence, arg1: Int, arg2: Int, arg3: Int) {

                }

                override fun beforeTextChanged(
                    arg0: CharSequence, arg1: Int, arg2: Int,
                    arg3: Int
                ) {
                }

                override fun afterTextChanged(et: Editable) {
                    var s = et.toString()
                    if (s != s.toUpperCase()) {
                        s = s.toUpperCase()
                        inputcode.setText(s)
                        inputcode.setSelection(inputcode.length()) //fix reverse texting
                    }
                }
            })
    }
}



