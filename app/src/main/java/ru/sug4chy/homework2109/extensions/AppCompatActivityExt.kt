package ru.sug4chy.homework2109.extensions

import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

fun AppCompatActivity.findButtonById(id: Int): Button = findViewById(id)

fun AppCompatActivity.findTextViewById(id: Int): TextView = findViewById(id)