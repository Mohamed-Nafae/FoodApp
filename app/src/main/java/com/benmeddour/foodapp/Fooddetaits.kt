package com.benmeddour.foodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.TextView
import java.util.zip.Inflater

class Fooddetaits : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fooddetaits)
        val bandle =intent.extras
        findViewById<ImageView>(R.id.imageView).setImageResource(bandle!!.getInt("img"))
        findViewById<TextView>(R.id.textView).text = bandle!!.getString("title")
        findViewById<TextView>(R.id.textView2).text = bandle!!.getString("desc")
    }
}