package br.senac.vmedeiros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_exemplo01_check_box.*

class Exemplo01CheckBox : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exemplo01_check_box)

    btnEnviar.setOnClickListener {

        var msg = """ Nome: ${etName.text}
            |Telefone: ${etTelefone.text}
            |Email: ${etEmail.text}
            |
            |Preferencias de Contato
            """.trimMargin("|")

        if(cbTelefone.isChecked){

            msg +="\n -Telefone"
        }
        if(cbEmail.isChecked){

            msg +="\n -Email"
        }


alert("Dados", msg, this)



    }



    }
}
