package br.senac.vmedeiros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      btnMsg.setOnClickListener {

          alert("bem vindo","Ola " + etName.text +" " + etSobrenome.text, this)
      }

    }

}
