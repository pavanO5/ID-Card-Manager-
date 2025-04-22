package com.example.project

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity

class MainActivity6 : AppCompatActivity() {

    private var selectedImageUri: Uri? = null
    private lateinit var imageView: ImageView

    // 🔹 Declare Activity Result Launcher at the TOP of the class (outside onCreate)
    private val pickImageLauncher = registerForActivityResult(ActivityResultContracts.GetContent()) { uri: Uri? ->
        if (uri != null) {
            selectedImageUri = uri
            imageView.setImageURI(uri)  // Show selected image in ImageView
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        val et1 = findViewById<EditText>(R.id.et1)
        val et2 = findViewById<EditText>(R.id.et2)
        val et3 = findViewById<EditText>(R.id.et3)
        val et4 = findViewById<EditText>(R.id.et4)
        val btn = findViewById<Button>(R.id.bt1)
        val pickImageButton = findViewById<Button>(R.id.button3)
        imageView = findViewById(R.id.imageView5)

        // 🔹 Open image picker when the button is clicked
        pickImageButton.setOnClickListener {
            pickImageLauncher.launch("image/*")
        }

        // 🔹 Send data to MainActivity2
        btn.setOnClickListener {
            val name = et1.text.toString()
            val regd = et2.text.toString()
            val phone = et3.text.toString()
            val branch = et4.text.toString()

            val intent = Intent(this, MainActivity7::class.java)
            intent.putExtra("NAME", name)
            intent.putExtra("REGD_NUM", regd)
            intent.putExtra("Phone_Num", phone)
            intent.putExtra("Branch", branch)

            // Pass image URI if selected
            selectedImageUri?.let {
                intent.putExtra("ImageUri", it.toString())
            }

            startActivity(intent)
        }
    }
}
