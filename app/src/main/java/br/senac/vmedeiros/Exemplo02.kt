package br.senac.vmedeiros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_exemplo02.*

class Exemplo02 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exemplo02)


        btnEnviar.setOnClickListener {
            var genero = ""
            when(rgGenero.checkedRadioButtonId){
                R.id.rbMasc -> {genero="Sr "}
                R.id.rbFem -> {genero="Sra "}

            }

            alert("Bem Vindo" , "Olá, " + genero + " " + etName.text, this)



        }
    }
}
