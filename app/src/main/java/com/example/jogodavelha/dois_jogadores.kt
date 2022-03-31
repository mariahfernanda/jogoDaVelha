package com.example.jogodavelha

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class dois_jogadores : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dois_jogadores)
    }
    fun btClick(view: View) {
        val btSelecionado = view as Button
        var cellId = 0

        when (btSelecionado.id) {
            R.id.bu1 -> cellId = 1
            R.id.bu2 -> cellId = 2
            R.id.bu3 -> cellId = 3
            R.id.bu4 -> cellId = 4
            R.id.bu5 -> cellId = 5
            R.id.bu6 -> cellId = 6
            R.id.bu7 -> cellId = 7
            R.id.bu8 -> cellId = 8
            R.id.bu9 -> cellId = 9
        }

        //Toast.makeText(this, "ID: " + cellId, Toast.LENGTH_SHORT).show()
        playGame(cellId, btSelecionado)

    }

    //Array´s vai guardar as jogadas de cada jogador
    var player1 = ArrayList<Int>()
    var player2 = ArrayList<Int>()
    //Turno do jagador
    var activityPlayer = 1

    fun playGame(cellId:Int, btSelecionado:Button){

        if (activityPlayer ==1){
            btSelecionado.text = "X"
            btSelecionado.setBackgroundColor(Color.TRANSPARENT)
            player1.add(cellId)
            activityPlayer = 2
        }else{
            btSelecionado.text = "O"
            btSelecionado.setBackgroundColor(Color.TRANSPARENT)
            player2.add(cellId)
            activityPlayer = 1
        }
        btSelecionado.isEnabled = false
        checkWiner()
    }

    fun checkWiner(){
        var winer = -1

        //horizontal1
        if (player1.contains(1) && player1.contains(2) && player1.contains(3)){
            winer = 1
        }

        if (player2.contains(1) && player2.contains(2) && player2.contains(3)){
            winer = 2
        }


        //horizontal2
        if (player1.contains(4) && player1.contains(5) && player1.contains(6)){
            winer = 1
        }

        if (player2.contains(4) && player2.contains(5) && player2.contains(6)){
            winer = 2
        }

        //horizontal3
        if (player1.contains(7) && player1.contains(8) && player1.contains(9)){
            winer = 1
        }

        if (player2.contains(7) && player2.contains(8) && player2.contains(9)){
            winer = 2
        }

        ////////////////////////////////////////////////////////////////////////

        //coluna1
        if (player1.contains(1) && player1.contains(4) && player1.contains(7)){
            winer = 1
        }

        if (player2.contains(1) && player2.contains(4) && player2.contains(7)){
            winer = 2
        }


        //coluna2
        if (player1.contains(2) && player1.contains(5) && player1.contains(8)){
            winer = 1
        }

        if (player2.contains(2) && player2.contains(5) && player2.contains(8)){
            winer = 2
        }

        //coluna3
        if (player1.contains(3) && player1.contains(6) && player1.contains(9)){
            winer = 1
        }

        if (player2.contains(3) && player2.contains(6) && player2.contains(9)){
            winer = 2
        }

        ////////////////////////////////////////////////////////////////////////

        //vetical1
        if (player1.contains(1) && player1.contains(5) && player1.contains(9)){
            winer = 1
        }

        if (player2.contains(1) && player2.contains(5) && player2.contains(9)){
            winer = 2
        }

        //vertical2
        if (player1.contains(3) && player1.contains(5) && player1.contains(7)){
            winer = 1
        }

        if (player2.contains(3) && player2.contains(5) && player2.contains(7)){
            winer = 2
        }




        //WINER
        if (winer != -1){
            if (winer == 1){
                AlertDialog
                    .Builder(this)
                    .setTitle("X GANHOU")
                    .setPositiveButton("OK"){_,_ -> }
                    .setNegativeButton("sair"){_,_ -> finish()}
                    .show()
            }else{
                AlertDialog
                    .Builder(this)
                    .setTitle("O GANHOU")
                    .setPositiveButton("OK"){_,_ -> }
                    .setNegativeButton("sair"){_,_ -> finish()}
                    .show()
            }
        }
    }


}