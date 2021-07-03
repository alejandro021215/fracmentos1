package com.example.fracmentos1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.fracmentos1.fracmentos.NavegadorFragment
import com.example.fracmentos1.fracmentos.PrimerFragment
import com.example.fracmentos1.fracmentos.SegundoFragment

class MainActivity : AppCompatActivity() {
    lateinit var btnFragmento1:Button
    lateinit var btnFragmento2:Button
    lateinit var btnNavegador:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnFragmento1 = findViewById(R.id.btnF1)
        btnFragmento2 = findViewById(R.id.btnF2)
        btnNavegador = findViewById(R.id.btnNavegador)


        btnFragmento1.setOnClickListener {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.contenedor,PrimerFragment.newInstance("ndo","dsf"))
                    .commitNow()
        }

        btnFragmento2.setOnClickListener {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.contenedor,SegundoFragment.newInstance("ndo","dsf"))
                    .commitNow()
        }
        btnNavegador.setOnClickListener {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.contenedor,NavegadorFragment.newInstance("https://google.com"))
                    .commitNow()
        }

        //argumentos para la funcion
        sumarNumeros(1, 2)
    }
    //son parametros
    fun sumarNumeros(numero1:Int, numero2:Int){

    }
}