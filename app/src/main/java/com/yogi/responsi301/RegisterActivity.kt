package com.yogi.responsi301

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_preview.*
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val Name=findViewById<EditText>(R.id.editText)
        val NIM=findViewById<EditText>(R.id.editText6)
        val Study=findViewById<EditText>(R.id.editText7)
        val Faculty=findViewById<EditText>(R.id.editText8)
        val Date=findViewById<EditText>(R.id.editText2)
        val Address=findViewById<EditText>(R.id.editText5)

        button_preview.setOnClickListener {
            val name=Name.text.toString()
            val nim=NIM.text.toString()
            val study=Study.text.toString()
            val faculty=Faculty.text.toString()
            val date=Date.text.toString()
            val address=Address.text.toString()

            val intent= Intent(this,View::class.java)
            intent.putExtra("nama",name)
            intent.putExtra("nim",nim)
            intent.putExtra("prodi",study)
            intent.putExtra("fakultas",faculty)
            intent.putExtra("ttl",date)
            intent.putExtra("alamat",address)
            startActivity(intent)
        }

    }
}
