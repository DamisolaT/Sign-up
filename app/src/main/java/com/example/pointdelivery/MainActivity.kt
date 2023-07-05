package com.example.pointdelivery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.SignUpbtn)

        button.setOnClickListener{
            Toast.makeText(this,"Already have an account? Sign in ",Toast.LENGTH_SHORT).show()
        }

    }
}