package com.example.practica5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val button: Button = findViewById(R.id.button2);

        button.setOnClickListener {
            var intent = Intent(this, MenuActivity::class.java)
            startActivity(intent);
        }
    }
}