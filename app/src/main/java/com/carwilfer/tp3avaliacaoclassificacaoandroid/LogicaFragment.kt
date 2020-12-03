package com.carwilfer.tp3avaliacaoclassificacaoandroid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.RadioGroup
import androidx.navigation.NavController
import androidx.navigation.findNavController

abstract class LogicaFragment : Fragment() {

    var numeroQuestionario: Int = 0
    var classificacaoNoQuestionario: Int = 0
    var questionario = 0
    var classificacao = 0

    lateinit var navController: NavController

    fun processData(scoreList: List<Int>) {
        when (view?.findViewById<RadioGroup>(R.id.radioGroupDaPergunta)?.checkedRadioButtonId) {
            R.id.radioButton1DaPergunta -> {
                questionario = 1
                classificacao = scoreList[0]
            }
            R.id.radioButton2DaPergunta -> {
                questionario = 2
                classificacao = scoreList[1]
            }
            R.id.radioButton3DaPergunta -> {
                questionario = 3
                classificacao = scoreList[2]
            }
            R.id.radioButton4DaPergunta -> {
                questionario = 4
                classificacao = scoreList[3]
            }
            R.id.radioButton4DaPergunta -> {
                questionario = 5
                classificacao = scoreList[4]
            }
        }
        ModelAppActivity.basePrincipal["resposta_principal_$numeroQuestionario"] = ModelAppActivity.QuestionarioData(
            questionario,
            classificacao
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = view.findNavController()
    }

}


