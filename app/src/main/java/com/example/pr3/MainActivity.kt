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


public var STR : Int = 0
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button : ImageView = findViewById(R.id.imageView)
        val textView : TextView = findViewById(R.id.textView2)
        textView.text = "${STR}"

        button.setOnClickListener {
            STR = STR + 1
            textView.text = "${STR}"
        }


    }
}