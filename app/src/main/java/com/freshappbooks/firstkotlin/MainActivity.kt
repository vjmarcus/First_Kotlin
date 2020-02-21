package com.freshappbooks.firstkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var editText: EditText
    private lateinit var buttonSave: Button
    private lateinit var textViewName: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText = findViewById(R.id.editText)
        buttonSave = findViewById(R.id.buttonSave)
        textViewName = findViewById(R.id.textViewName)
    }
}
