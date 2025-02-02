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
            val peso : Float = edtpeso.text.toString().toFloat()
            val altura : Float = edtaltura.text.toString().toFloat()

            val alturaQ2 = altura * altura
            val resultado = peso / alturaQ2
            println ("imc " + resultado)

        }
    }
}