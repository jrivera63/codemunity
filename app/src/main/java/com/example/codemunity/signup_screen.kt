package com.example.codemunity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class signup_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup_screen)

        val createAccnt = findViewById<Button>(R.id.btnCreateAccount)

        createAccnt.setOnClickListener{
            val intent = Intent(this,timeline_screen::class.java)
            startActivity(intent)
        }
    }
}