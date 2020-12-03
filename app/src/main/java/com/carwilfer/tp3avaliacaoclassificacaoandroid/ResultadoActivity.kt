package com.carwilfer.tp3avaliacaoclassificacaoandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_resultado.*

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val nome = (ModelAppActivity.basePrincipal["usuario_principal"] as ModelAppActivity.UsuarioData).nome
        var classificacao = 0
        for (i in 1..7) {
            classificacao += (ModelAppActivity.basePrincipal["resposta_principal_$i"] as ModelAppActivity.QuestionarioData).classificacao
        }

        when {
            classificacao <= 12 -> {
                textViewResultado.text = "Prezado $nome, você é considerado um investidor Conservador."
            }
            classificacao in 13..29 -> {
                textViewResultado.text = "Prezado $nome, parabéns, você é considerado um investidor Moderado."
            }
            else -> {
                textViewResultado.text = "Prezado $nome, meus parabéns! Você é considerado um investidor Arrojado!"
            }
        }
    }
}