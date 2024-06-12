package com.example.gson

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.gson.Gson

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // JSON string
        val jsonString = """
            {
                "name": "John Doe",
                "age": 30,
                "email": "john.doe@example.com"
            }
        """

        // Create Gson instance
        val gson = Gson()

        // Parse JSON to User object
        val user: User = gson.fromJson(jsonString, User::class.java)

        // Find TextView and set its text
        val textView: TextView = findViewById(R.id.textView)
        textView.text = "Name: ${user.name}, Age: ${user.age}, Email: ${user.email}"
    }
}
