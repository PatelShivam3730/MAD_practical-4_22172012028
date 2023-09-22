package com.example.mad_practical_4_22172012028

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button:Button=findViewById(R.id.button1)
        val button1:Button=findViewById(R.id.button2)
        button.setOnClickListener{
            Intent(this,LoginActivity::class.java).also { startActivity(it) }
        }
        button1.setOnClickListener{
            Intent(this,activity_registration::class.java).also { startActivity(it) }
        }
    }


}
