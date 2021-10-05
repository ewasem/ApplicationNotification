package com.ewapps.applicationnotification

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btnSend: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSend = findViewById(R.id.btn_send_notification)

        btnSend.setOnClickListener {
            this.showNotification("12340", "Bootcamp Kotlin", "Kotlin curso android")
        }
    }
}