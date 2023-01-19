package com.arcadix.reusablecomponentsbase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        val usernamefield = findViewById<InputComponent>(R.id.userid)

        val passwordfield = findViewById<InputComponent>(R.id.password)

        button.setOnClickListener{
            onLoginClick()
        }

    }
    private fun onLoginClick(){

            val intent = Intent(this, Contact::class.java)
            startActivity(intent)
            finish()
    }
}