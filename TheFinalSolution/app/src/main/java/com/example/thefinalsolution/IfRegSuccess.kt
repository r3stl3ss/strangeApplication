package com.example.thefinalsolution

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_if_reg_success.*

class IfRegSuccess : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_if_reg_success)

        escape_button.setOnClickListener() {
            val escaped = Intent(this, MainActivity::class.java)
            startActivity(escaped)
        }
    }

}
