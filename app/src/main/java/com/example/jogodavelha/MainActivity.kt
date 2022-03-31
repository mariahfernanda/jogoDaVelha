package com.example.jogodavelha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val start = findViewById<Button>(R.id.start) as Button

        start.setOnClickListener() {

            irParaTelaDificuldade()

        }
    }
    private fun irParaTelaDificuldade(){
        val telaDificuldade = Intent(this,tela_dificuldade::class.java)
        startActivity(telaDificuldade)
    }
}