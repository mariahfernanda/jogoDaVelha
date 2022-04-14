package com.example.jogodavelha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class tela_dificuldade : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_dificuldade)

        val facil = findViewById<Button>(R.id.facil)
        val medio = findViewById<Button>(R.id.medio)
        val dificil = findViewById<Button>(R.id.dificil)
        val doisJogadores = findViewById<Button>(R.id.doisjogadores) as Button

        doisJogadores.setOnClickListener() {

            irParaDoisJogadores()

        }

        facil.setOnClickListener(){
            irParaModoFacil()
        }

        medio.setOnClickListener(){
            irParaModoMedio()
        }

        dificil.setOnClickListener(){
            irParaModoDificil()
        }

    }
    private fun irParaDoisJogadores(){
        val doisJogadores = Intent(this, dois_jogadores::class.java)
        startActivity(doisJogadores)

    }

    private fun irParaModoFacil(){
        val facil = Intent(this, modo_facil::class.java)
        startActivity(facil)
    }

    private fun irParaModoMedio(){
        val medio = Intent(this, modo_medio::class.java)
        startActivity(medio)
    }

    private fun irParaModoDificil(){
        val dificil = Intent(this, modo_difiicl::class.java)
        startActivity(dificil)
    }
}