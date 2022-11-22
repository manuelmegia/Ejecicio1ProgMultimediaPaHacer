package com.manumegia.ejecicio1progmultimedia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private var onCreate = 0
    private var onStart = 1
    private var onResume = 2
    private var onPause = 3
    private var onRestart = 4
    private var onStop = 5
    private var onDestroy = 6


    private lateinit var contenido: EditText
    private lateinit var contenido2: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("onCreate $onCreate")

        contenido = findViewById(R.id.editText)
        contenido2 = findViewById(R.id.editText2)
    }

    override fun onStart() {
        super.onStart()
        println("onStart $onStart")
    }

    override fun onResume() {
        super.onResume()
        println("onResume $onResume")
    }

    override fun onPause() {
        super.onPause()
        println("onPause $onPause")
    }

    override fun onRestart() {
        super.onRestart()
        println("onRestart $onRestart")
    }

    override fun onStop() {
        super.onStop()
        println("onStop $onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy $onDestroy")
    }

    override fun onSaveInstanceState(savedInstanceState: Bundle) {
        super.onSaveInstanceState(savedInstanceState)
        savedInstanceState.putString("Nombre", contenido.text.toString())
        savedInstanceState.putString("Apellido", contenido2.text.toString())


    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        contenido.setText(savedInstanceState.getString("Nombre"))
        contenido2.setText(savedInstanceState.getString("Apellido"))

    }
}