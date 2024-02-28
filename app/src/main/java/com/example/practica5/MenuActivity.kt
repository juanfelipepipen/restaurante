package com.example.practica5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnAntojitos: Button = findViewById(R.id.buttonAntojitos)
        val btnEspecialidades: Button = findViewById(R.id.buttonEspecialidades)
        val btnConbinations: Button = findViewById(R.id.buttonCombinatios)
        val btnTortas: Button = findViewById(R.id.buttonTortas)
        val btnSopas: Button = findViewById(R.id.buttonSopas)
        val btnDrinks: Button = findViewById(R.id.buttonDriks)

        btnAntojitos.setOnClickListener {
            val intent = Intent(this, ProductosActivity::class.java);
            intent.putExtra("menuType", "Antojitos")
            startActivity(intent);
        }

        btnEspecialidades.setOnClickListener {
            val intent = Intent(this, ProductosActivity::class.java);
            intent.putExtra("menuType", "Especialidades")
            startActivity(intent);
        }

        btnConbinations.setOnClickListener {
            val intent = Intent(this, ProductosActivity::class.java);
            intent.putExtra("menuType", "Conbinations")
            startActivity(intent);
        }

        btnTortas.setOnClickListener {
            val intent = Intent(this, ProductosActivity::class.java);
            intent.putExtra("menuType", "Tortas")
            startActivity(intent);
        }

        btnSopas.setOnClickListener {
            val intent = Intent(this, ProductosActivity::class.java);
            intent.putExtra("menuType", "Sopas")
            startActivity(intent);
        }

        btnDrinks.setOnClickListener {
            val intent = Intent(this, ProductosActivity::class.java);
            intent.putExtra("menuType", "Drinks")
            startActivity(intent);
        }

    }
}