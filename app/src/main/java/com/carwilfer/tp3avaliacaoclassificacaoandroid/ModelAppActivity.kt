package com.carwilfer.tp3avaliacaoclassificacaoandroid

import android.app.Application

class ModelAppActivity : Application() {

    companion object {
        val basePrincipal = hashMapOf<String, Any>()
    }

    data class QuestionarioData(
        val questionario: Int,
        val classificacao: Int
    )

    data class UsuarioData(
        val idade: String,
        val nome: String,
        val email: String,
        val password: String
    )
}