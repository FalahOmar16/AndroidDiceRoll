
    package com.example.dicefalahomar080425
    import android.content.Intent
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
    import android.os.Handler
    import android.os.Looper



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnLancia = findViewById<Button>(R.id.bottonelancia)
        val img = findViewById<ImageView>(R.id.imgviewdice)
        val text = findViewById<TextView>(R.id.titletextview)

        btnLancia.setOnClickListener {
            val valore = estrai()

            Toast.makeText(this, "Dado tratto :0 : $valore", Toast.LENGTH_SHORT).show()

            text.text = "Hai lanciato: $valore"

            val resource = when (valore) {
                1 -> R.drawable.dice_face_1
                2 -> R.drawable.dice_face_2
                3 -> R.drawable.dice_face_3
                4 -> R.drawable.dice_face_4
                5 -> R.drawable.dice_face_5
                6 -> R.drawable.dice_face_6
                else -> R.drawable.dices
            }

            img.setImageResource(resource)
            Handler(Looper.getMainLooper()).postDelayed({
                lanciaIntent(valore)
            }, 1000)
        }
    }

    private fun estrai(): Int {
        return (1..6).random()
    }

    private fun lanciaIntent(valoreEstratto: Int) {
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("NUMERO", valoreEstratto)
        startActivity(intent)
    }
}

