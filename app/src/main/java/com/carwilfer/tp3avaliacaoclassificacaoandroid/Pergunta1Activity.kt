package com.carwilfer.tp3avaliacaoclassificacaoandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_pergunta1.*

class Pergunta1Activity : AppCompatActivity() {
    var resposta = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pergunta1)

      /*  radioButton1DaPergunta1.setOnClickListener {
            actionBtnSelecionaResposta(it)

        }
        radioButton2DaPergunta1.setOnClickListener {
            actionBtnSelecionaResposta(it)

        }
        radioButton3DaPergunta1.setOnClickListener {
            actionBtnSelecionaResposta(it)

        }
        radioButton4DaPergunta1.setOnClickListener {
            actionBtnSelecionaResposta(it)

        }*/
    }

    fun actionBtnSelecionaResposta(view: View){
        when (view.id){
            R.id.radioButton1DaPergunta1 -> resposta = 0
            R.id.radioButton2DaPergunta1 -> resposta = 2
            R.id.radioButton3DaPergunta1 -> resposta = 3
            R.id.radioButton4DaPergunta1 -> resposta = 4
        }
    }

}