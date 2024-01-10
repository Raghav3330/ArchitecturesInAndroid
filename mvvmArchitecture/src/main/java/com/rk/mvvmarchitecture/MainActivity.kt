package com.rk.mvvmarchitecture

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.rk.architectureexample.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewmodel = ViewModelProvider(this)[Userviewmodel::class.java]

        viewmodel.getUsers()

        viewmodel.data.observe(this){
            val text = findViewById<TextView>(R.id.view_text)
            text.text = it[0].toString()
        }
    }
}