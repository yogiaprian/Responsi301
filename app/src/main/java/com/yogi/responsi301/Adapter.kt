package com.yogi.responsi301

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.item.view.*
import java.util.ArrayList

class Adapter(private val listMakanan: ArrayList<Makanan>, private val context: Context?) : BaseAdapter() {

    @SuppressLint("ViewHolder", "InflateParams")
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val makanan=listMakanan[p0]
        val inflator=context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE)as LayoutInflater
        val myView=inflator.inflate(R.layout.item,null)
        myView.makanan.setImageResource(makanan.gambar!!)
        myView.judul.text=makanan.nama!!
        myView.deskripsi.text=makanan.deskripsi!!
        myView.setOnClickListener {
            val intent=Intent(context,MakanEnak::class.java)
            intent.putExtra("makanan",makanan.gambar!!)
            intent.putExtra("judul",makanan.nama!!)
            intent.putExtra("deskripsi",makanan.deskripsi!!)
            context.startActivity(intent)
        }
        return myView
    }

    override fun getItem(p0: Int): Any {
        return listMakanan[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getCount(): Int {
        return listMakanan.size
    }

}