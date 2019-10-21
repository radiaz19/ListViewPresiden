package com.example.inten

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_activitykedua.*

class Activitykedua : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        // super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_kedua)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activitykedua)

        val bundle: Bundle? = intent.extras
        val id = bundle?.get("id_value")
        val language = bundle?.get("language_value")
        Toast.makeText(applicationContext,id.toString()+""+language,Toast.LENGTH_LONG) .show()
        btn_back.setOnClickListener(){
            intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}
