package com.carwilfer.tp3avaliacaoclassificacaoandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var HintEditTextNumberIdade = editTextNumberIdade.text
        editTextNumberIdade.hint = "26 anos"

        editTextTextPersonNome.addTextChangedListener(
            object : TextWatcher{
                override fun afterTextChanged(s: Editable?) {
                   //
                }

                override fun beforeTextChanged(
                    s: CharSequence?,
                    start: Int,
                    count: Int,
                    after: Int
                ) {
                   //
                }

                override fun onTextChanged(text: CharSequence?, start: Int, before: Int, count: Int) {
               textViewMutavel.text = text
                }

            }
        )
        var HintEditTextTextPersonNome = editTextTextPersonNome.text
        editTextTextPersonNome.hint = "Carlos Ferreira"


        buttonIniciar.setOnClickListener{
            ModelAppActivity.basePrincipal["usuario_principal"] = ModelAppActivity.UsuarioData(
                editTextNumberIdade.text.toString(),
                editTextTextPersonNome.text.toString(),
                editTextTextEmailAddress.text.toString(),
                editTextTextPassword.text.toString()
            )
            startActivity(Intent(this, TodasPerguntasActivity::class.java))
        }
    }
}