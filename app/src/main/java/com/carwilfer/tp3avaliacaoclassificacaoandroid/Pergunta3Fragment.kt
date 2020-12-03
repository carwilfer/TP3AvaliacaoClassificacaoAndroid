package com.carwilfer.tp3avaliacaoclassificacaoandroid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class Pergunta3Fragment : LogicaFragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        numeroQuestionario = 1
        classificacaoNoQuestionario = 0
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(
            R.layout.fragment_pergunta3,
            container,
            false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.buttonProximoDaPergunta)?.setOnClickListener {
            processData(listOf(0, 1, 2, 4))
            findNavController().navigate(R.id.action_pergunta3Fragment_to_pergunta4Fragment)
        }
    }

}