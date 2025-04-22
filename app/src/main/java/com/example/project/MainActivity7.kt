package com.example.project

import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)

        val tv1 = findViewById<TextView>(R.id.tv1)
        val tv2 = findViewById<TextView>(R.id.tv2)
        val tv3 = findViewById<TextView>(R.id.tv3)
        val tv4 = findViewById<TextView>(R.id.tv4)
        val imageView = findViewById<ImageView>(R.id.imageView)

        val name = intent.getStringExtra("NAME")
        val regd = intent.getStringExtra("REGD_NUM")
        val phone = intent.getStringExtra("Phone_Num")
        val branch = intent.getStringExtra("Branch")
        val imageUriString = intent.getStringExtra("ImageUri")

        tv1.text = " $name "
        tv2.text = " $regd "
        tv3.text = "  $phone"
        tv4.text = "  $branch"

        // 🔹 Load image if it's not null
        if (!imageUriString.isNullOrEmpty()) {
            val imageUri = Uri.parse(imageUriString)
            imageView.setImageURI(imageUri)
        }
    }
}
