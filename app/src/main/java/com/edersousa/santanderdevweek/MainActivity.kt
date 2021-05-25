package com.edersousa.santanderdevweek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        minhaIdade()
        // DEC VARIAVEIS
            //val = não muda
            //var = mutavel
        var contador : Int = 10
            contador = 11

        val contador2 : Int = 11
            contador = 12

        // SEGURANÇA Nula
        val languange : String? = null

        // CONDICIONAIS
        var idade = 20
        if(idade > 18) {
            println("Você é maior de idade")
        } else {
            println("Você é menor de idade")
        }

        val minhaIdade : String = if(idade > 18) {
            "Você é maior de idade"
        } else {
            "Você é menor de idade"
        }

        // when
        val minhaIdade2 = when {
            idade > 18 -> "Você é maior de idade"
            else -> "Você é menor de idade"
        }

        val medicamento = Medicamento("Teste 1", "2x ao dia")
        medicamento.formula
    }

    /*fun minhaIdade() : String {
        return "Minha idade é 18"
    }*/
    fun minhaIdade() : String =
        "Minha idade é 18"
}