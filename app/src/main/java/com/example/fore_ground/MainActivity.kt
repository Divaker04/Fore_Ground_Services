package com.example.fore_ground

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var buttonStart:Button
    lateinit var buttonStop:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonStart=findViewById(R.id.start)
        buttonStop=findViewById(R.id.stop)

        buttonStart.setOnClickListener(View.OnClickListener {
            startService(Intent(this, ForegroundService::class.java))

        })
        buttonStop.setOnClickListener(View.OnClickListener {
            stopService(Intent(this, ForegroundService::class.java))

        })
    }
    }
