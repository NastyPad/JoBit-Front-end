package com.example.jobit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Update_Ads : AppCompatActivity() {
    lateinit var tvCerrar: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_update_ads)
        tvCerrar = findViewById(R.id.tvClose)

        tvCerrar.setOnClickListener {
            val home: Intent = Intent(this, Activity_Home_Applicant::class.java)
            startActivity(home)
        }
    }
}