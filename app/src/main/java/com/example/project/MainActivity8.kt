package com.example.project

import android.app.DatePickerDialog
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.Button
import android.widget.EditText
import java.util.Calendar

class MainActivity8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main8)

        val btn = findViewById<Button>(R.id.but)
        val et1 = findViewById<EditText>(R.id.et21)

        btn.setOnClickListener {
            val name = et1.text.toString()
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("NAME", name)
            startActivity(intent)
        }

        // 👇 Date of Birth logic starts here
        val etDob = findViewById<EditText>(R.id.etDob)

        etDob.setOnClickListener {
            val calendar = Calendar.getInstance()
            val year = calendar.get(Calendar.YEAR)
            val month = calendar.get(Calendar.MONTH)
            val day = calendar.get(Calendar.DAY_OF_MONTH)

            val datePickerDialog = DatePickerDialog(
                this,
                { _, selectedYear, selectedMonth, selectedDay ->
                    val dob = "${selectedDay}/${selectedMonth + 1}/${selectedYear}"
                    etDob.setText(dob)
                },
                year,
                month,
                day
            )

            // Optional: prevent selecting future dates
            datePickerDialog.datePicker.maxDate = System.currentTimeMillis()

            datePickerDialog.show()
        }
    }
}


