package com.example.challenge2

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class TipTime : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tip_time)

        supportActionBar!!.setBackgroundDrawable(ColorDrawable(Color.parseColor("#0000FF")))
    }
}