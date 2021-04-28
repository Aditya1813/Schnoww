package com.example.schnoww

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler


class splashscreen : AppCompatActivity() {

private val SPLASJ_TIME: Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

       Handler().postDelayed( {
           startActivity(Intent(this,MainActivity::class.java))
           finish()
       }
       ,SPLASJ_TIME)


    }


}