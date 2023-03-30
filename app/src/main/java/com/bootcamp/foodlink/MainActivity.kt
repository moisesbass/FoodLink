package com.bootcamp.foodlink

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btnCambiarActivity: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCambiarActivity = findViewById<Button>(R.id.btnCambiarActivity)
        btnCambiarActivity.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                startActivity(Intent(this@MainActivity, MainActivity2::class.java))
            }
        })
    }
}
