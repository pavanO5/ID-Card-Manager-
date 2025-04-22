package com.example.project

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv1 = findViewById<TextView>(R.id.tv89)
        val name = intent.getStringExtra("NAME")
        tv1.text = "WELCOME $name Lets Find Your ID card"

        val btn = findViewById<Button>(R.id.button)
        val btn2 = findViewById<Button>(R.id.button2)
        val et2 = findViewById<EditText>(R.id.et2)
        btn.setOnClickListener {
            val regdNum = et2.text.toString().trim()

            when (regdNum) {
                "230101120013" -> {
                    val intent = Intent(this, MainActivity2::class.java)
                    startActivity(intent)
                }

                "230101120017" -> {
                    val intent = Intent(this, MainActivity3::class.java)
                    startActivity(intent)
                }

                "230101120025" -> {
                    val intent = Intent(this, MainActivity4::class.java)
                    startActivity(intent)
                }

                "230101120004" -> {
                    val intent = Intent(this, MainActivity5::class.java)
                    startActivity(intent)
                }

                else -> {
                    Toast.makeText(this, "Invalid Registration Number", Toast.LENGTH_SHORT).show()
                }
            }

        }

        btn2.setOnClickListener {
            val intent = Intent(this, MainActivity6::class.java)
            startActivity(intent)
        }
    }
}

