package com.example.mad_practical_4_22172012028

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val button: Button =findViewById(R.id.button2)
        button.setOnClickListener{
            Intent(this,activity_registration::class.java).also { startActivity(it) }
        }

    }

}
