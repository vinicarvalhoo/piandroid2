package br.senac.vmedeiros

import android.content.Context
import androidx.appcompat.app.AlertDialog
import kotlin.coroutines.coroutineContext

 fun alert(title: String, msg:String, context:Context) {



    val builder = AlertDialog.Builder(context)

    builder
        .setTitle(title)
        .setMessage(msg)
        .setPositiveButton("ok", null)
        .create()
        .show()


}