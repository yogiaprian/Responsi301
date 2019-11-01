package com.yogi.responsi301

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_preview.*
import kotlinx.android.synthetic.main.activity_register.*

class View : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preview)

        //val intent = intent
        val name = intent.getStringExtra("name")
        val nim = intent.getStringExtra("nim")
        val study = intent.getStringExtra("study")
        val faculty = intent.getStringExtra("faculty")
        val date = intent.getStringExtra("date")
        val address = intent.getStringExtra("address")

        val hasil = findViewById<TextView>(R.id.textView5)
        hasil.text =
            "Nama : " + name + "\nNIM : " + nim + "\nProdi : " + study + "\nFakultas ; " + faculty + "\nTTL : " + date + "\nAlamat : " + address






    }
}