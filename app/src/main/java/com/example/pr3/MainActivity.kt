package com.example.pr3

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Half.toFloat
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button : ImageView = findViewById(R.id.imageView)
        val textView : TextView = findViewById(R.id.textView2)

        button.setOnClickListener {
            val STR : Int =  textView.getText().toString().toInt() + 1
            textView.text = "${STR}"
        }


    }
}