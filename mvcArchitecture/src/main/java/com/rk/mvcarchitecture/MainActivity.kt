package com.rk.mvcarchitecture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tv_user_name: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val controller = Controller(this)

        tv_user_name = findViewById(R.id.user_name)
        tv_user_name.setOnClickListener {
            controller.getUser()
        }
    }
}