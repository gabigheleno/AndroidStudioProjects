package com.generation.diceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        /* findViewById() */

        val buttonD6 = findViewById<Button>(R.id.buttonD6)

        buttonD6.setOnClickListener {
          //  Toast.makeText(, this, "Botão clicado!", Toast.LENGTH_SHORT).show()

            rolarDados(6)
        }

        val buttonD12 = findViewById<Button>(R.id.button12)

        buttonD12.setOnClickListener {
            rolarDados(12)
        }

        val buttonD20 = findViewById<Button>(R.id.buttonD20)

        buttonD20.setOnClickListener {
            rolarDados(20)
        }

    }

    private fun rolarDados(lados: Int) {
        val rolagem = (1 .. lados).random()

        val textDado = findViewById<TextView>(R.id.textDado)

        textDado.text = rolagem.toString()
    }
}