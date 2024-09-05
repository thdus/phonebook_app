package com.example.phonebook_app

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PhoneBookDetail :AppCompatActivity(){
    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        setContentView(R.layout.activity_phone_book_detail)

        val name: String = intent.extras?.getString("name") ?: ""
        val number: String = intent.extras?.getString("number") ?: ""

        findViewById<TextView>(R.id.name).text = name
        findViewById<TextView>(R.id.number).text = number

    }
}