package com.example.mandarsmsapp

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var launchButton: Button
    private lateinit var sendButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        launchButton = findViewById(R.id.btn_launch)
        launchButton.setOnClickListener { v ->
            lanzarActividad(v)
        }
        sendButton = findViewById(R.id.btn_sendmes)
        sendButton.setOnClickListener { v ->
            mandarMensaje(v)
        }
    }

    fun lanzarActividad(view: View) {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse("https://www.cebem.net")
        startActivity(intent)
    }

    fun mandarMensaje(view: View) {
        val textMessage = "esto es un mensaje"
        val uri = Uri.parse("smsto:" + "123456789")
        val intent = Intent(Intent.ACTION_SENDTO, uri)
        intent.putExtra(Intent.EXTRA_TEXT, textMessage)
        startActivity(intent)
    }
}