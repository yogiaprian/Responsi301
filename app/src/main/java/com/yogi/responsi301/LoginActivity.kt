package com.yogi.responsi301

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        val Email = findViewById<EditText>(R.id.user_name)
        val Password = findViewById<EditText>(R.id.password)



        btn_login.setOnClickListener {
            val email = Email.text.toString()
            val password = Password.text.toString()
            if (email.equals("yogiaprian22") && password.equals("yogiapriansyah22")){
                //toast("* success !", Toast.LENGTH_LONG)

                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            } else  {
                toast("Silahkan Masukan Dengan Benar !",Toast.LENGTH_LONG)
            }
        }
        btn_regis.setOnClickListener {
            intent = Intent(this,RegisterActivity::class.java)
            startActivity(intent)

        }
    }
    fun toast(message: String,lengthLong: Int=Toast.LENGTH_LONG){
        Toast.makeText(this,message,lengthLong).show()
    }

}