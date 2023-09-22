package com.example.mad_practical_4_22172012028

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class activity_registration : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        val button: Button =findViewById(R.id.button1)
        button.setOnClickListener{
            Intent(this,LoginActivity::class.java).also { startActivity(it) }
        }
    }
}