package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Recuperar componentes edittext
        //criar variavel e associar componente de UI <Edittext>
        //recuperar botao da tela
        //colocar acao botao
        //recuperar texto digitado

        val edtpeso = findViewById<TextInputEditText>(R.id.edittext_peso)
        val edtaltura = findViewById<TextInputEditText>(R.id.edittext_altura)
        val btncalcular = findViewById<Button>(R.id.button_calcular)

        btncalcular.setOnClickListener {
            val peso = edtpeso.text
            val altura = edtaltura.text
            println ("foda-se"+altura +peso)

        }
    }
}