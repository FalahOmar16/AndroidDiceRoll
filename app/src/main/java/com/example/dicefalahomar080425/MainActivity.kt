package com.example.dicefalahomar080425
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var btnlancia= findViewById<Button>(R.id.bottonelancia)
        var img= findViewById<ImageView>(R.id.imgviewdice)
        var text= findViewById<TextView>(R.id.titletextview)
        btnlancia.setOnClickListener(View.OnClickListener {
            var miotoast= Toast.makeText(this, "dado tratto :0" , Toast.LENGTH_LONG )
            miotoast.show()
        })
    }
}