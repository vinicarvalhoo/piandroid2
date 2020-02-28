package br.senac.vmedeiros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main_soma.*

class MainSoma : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_soma)

        btnSomar.setOnClickListener {


            val val1 =etvalor1.text.toString().toDouble()
            val val2= etvalor2.text.toString().toDouble()

 val result = val1 +val2

            alert("Bem vindo" , "resultado: " + result, this)
        }
    }
}
