package com.example.miapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


import android.widget.Button
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonProductos=findViewById<Button>(R.id.buttonProductos)
        val buttonListas=findViewById<Button>(R.id.buttonListas)
        val buttonInformes=findViewById<Button>(R.id.buttonInformes)
        val buttonSalir=findViewById<Button>(R.id.buttonSalir)
        buttonProductos.setOnClickListener() {
            val intento= Intent(this,ProductosActivity::class.java)
            startActivity(intento)
        }
        buttonListas.setOnClickListener {
            val intentox= Intent(this,ListasActivity::class.java)
            startActivity(intentox)

        }
        buttonInformes.setOnClickListener {
            val intentoy= Intent(this,InformesActivity::class.java)
            startActivity(intentoy)
        }
        buttonSalir.setOnClickListener() {
            finish()
        }

    }
}