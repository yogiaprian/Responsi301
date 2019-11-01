package com.yogi.responsi301

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_makan_enak.*
import kotlinx.android.synthetic.main.item.*

class MakanEnak : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_makan_enak)

        val bundle: Bundle?=intent.extras
        val gambar = bundle!!.get("makanan") as Int
        val nama=bundle.get("judul") as String
        val deskripsi=bundle.get("deskripsi") as String

        fotoMakanan.setImageResource(gambar)
        namaMakanan.text=nama
        detailMakanan.text=deskripsi
    }
}
