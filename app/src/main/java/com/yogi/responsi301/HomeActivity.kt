package com.yogi.responsi301

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*
import java.util.ArrayList

class HomeActivity : AppCompatActivity() {
    var listMakanan= ArrayList<Makanan>()
    var adapter:Adapter?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        listMakanan.add(
            Makanan("Gado-gado","adalah salah satu makanan yang berasal dari Indonesia yang berupa sayur-sayuran yang direbus dan dicampur jadi satu, dengan bumbu kacang atau saus dari kacang tanah dan yang dihaluskan disertai irisan telur dan pada umumnya banyak yang menambahkan kentang rebus yang sudah dihaluskan untuk saus gado gado kentang rebus dimasak bersamaan dengan bumbu kacang kemudian di atasnya ditaburi bawang goreng.",R.drawable.gadogado)
        )
        listMakanan.add(
            Makanan("Gudek","makanan khas Yogyakarta dan Jawa Tengah yang terbuat dari nangka muda yang dimasak dengan santan. Perlu waktu berjam-jam untuk membuat masakan ini. ",R.drawable.gudek)
        )
        listMakanan.add(
            Makanan("Geprek","Tentu saja, karena cita rasa masakan ayam geprek didominasi dengan rasa pedas dari sambal gepreknya. Banyak resep ayam geprek yang ada saat ini dengan berbagai variasi sambal geprek yang menggoda selera.",R.drawable.geprek)
        )
        listMakanan.add(
            Makanan("Sate Maringgi","sate ini merupakan sate khas Purwakarta, tapi karena memang enak makanya kini buka cabangnya di Jakarta Selatan. ",R.drawable.sate)
        )
        listMakanan.add(
            Makanan("Ayam Malaya","Masuk di kawasan menteng, ada satu resto yang wajib kamu coba yaitu Ayam Malaya Resto. Lokasinya ada di Jalan Lombok, Menteng, Jakarta Pusat. Resto tersebut tidak hanya menyediakan ayam malaya tapi juga ada nasi goreng gila, sate ayam dan roti bakar.",R.drawable.ayam)
        )
        listMakanan.add(
            Makanan("Nasi Empal pengampon","Rasa daging empalnya yang gurih dan manis pasti membuat kamu ketagihan pengen mencobanya lagi. Bagaimana? Kamu tertark untuk mencobanya, silahkan datang saja ke Jalan Pengampon II No. 3, Surabaya Pusat.",R.drawable.empal)
                    )
                    adapter= Adapter(listMakanan,this)
        listview.adapter=adapter
    }
}

