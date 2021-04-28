package com.example.schnoww

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.cardview.widget.CardView
import java.net.URI

public class MainActivity : AppCompatActivity()  {



    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cardView1 =findViewById<CardView>(R.id.romantic)

        cardView1.setOnClickListener{
            val intent = Intent(this,MapsActivity1::class.java)
            startActivity(intent)

        }


        val cardView2 =findViewById<CardView>(R.id.sport)

        cardView2.setOnClickListener{
            val intent2 = Intent(this,MapsActivity2::class.java)
            startActivity(intent2)


        }


        val cardView3 =findViewById<CardView>(R.id.adr)

        cardView3.setOnClickListener{
            val intent3 = Intent(this,MapsActivity3::class.java)
            startActivity(intent3)

        }


        val cardView4 =findViewById<CardView>(R.id.grace)

        cardView4.setOnClickListener{
            val intent4 = Intent(this,MapsActivity4::class.java)
            startActivity(intent4)

        }



        val cardView5 =findViewById<CardView>(R.id.shop)

        cardView5.setOnClickListener{
            val intent5 = Intent(this,MapsActivity5::class.java)
            startActivity(intent5)

        }


        val cardview6=findViewById<CardView>(R.id.treasure)

        cardview6.setOnClickListener{
            gotoURL()
        }



    }

    private fun gotoURL() {
        val url = Uri.parse("https://www.instagram.com/sociablethunderbay/?hl=en")

        startActivity(Intent(Intent.ACTION_VIEW,url))
    }


}


