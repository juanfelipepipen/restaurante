package com.example.practica5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btnAntojitos: Button = findViewById(R.id.buttonAntojitos) as Button
        var btnEspecialidades: Button = findViewById(R.id.buttonEspecialidades) as Button
        var btnConbinations: Button = findViewById(R.id.buttonCombinatios) as Button
        var btnTortas: Button = findViewById(R.id.buttonTortas) as Button
        var btnSopas: Button = findViewById(R.id.buttonSopas) as Button
        var btnDrinks: Button = findViewById(R.id.buttonDriks) as Button

        btnAntojitos.setOnClickListener{
            var intent: Intent = Intent(this,ProductosActivity::class.java);
            intent.putExtra("menuType","Antojitos")
            startActivity(intent);
        }

        btnEspecialidades.setOnClickListener{
            var intent: Intent = Intent(this,ProductosActivity::class.java);
            intent.putExtra("menuType","Especialidades")
            startActivity(intent);
        }

        btnConbinations.setOnClickListener{
            var intent: Intent = Intent(this,ProductosActivity::class.java);
            intent.putExtra("menuType","Conbinations")
            startActivity(intent);
        }

        btnTortas.setOnClickListener{
            var intent: Intent = Intent(this,ProductosActivity::class.java);
            intent.putExtra("menuType","Tortas")
            startActivity(intent);
        }

        btnSopas.setOnClickListener{
            var intent: Intent = Intent(this,ProductosActivity::class.java);
            intent.putExtra("menuType","Sopas")
            startActivity(intent);
        }

        btnDrinks.setOnClickListener{
            var intent: Intent = Intent(this,ProductosActivity::class.java);
            intent.putExtra("menuType","Drinks")
            startActivity(intent);
        }

    }
}