package com.example.dicefalahomar080425

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)

        val numEstratto = intent.getIntExtra("NUMERO", -1)
        val textView = findViewById<TextView>(R.id.SecondTextView)
        val back = findViewById<Button>(R.id.backbutton)

        textView.text = "n.estratto: $numEstratto"

        back.setOnClickListener(){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    }



