package com.rk.mvparchitecture.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.rk.mvparchitecture.MainActivity
import com.rk.mvparchitecture.Model
import com.rk.mvparchitecture.R
import com.rk.mvparchitecture.UserLogin
import com.rk.mvparchitecture.users
import kotlinx.coroutines.MainScope
import kotlin.math.sign

class SignupFragment : Fragment() {
    private lateinit var username: EditText
    private lateinit var password: EditText
    private lateinit var signup: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_signup, container, false)
        username = view.findViewById(R.id.et_create_username)
        password = view.findViewById(R.id.et_create_password)
        signup = view.findViewById(R.id.bt_signup)
        clickEvents()
        return view
    }

    private fun clickEvents() {
        signup.setOnClickListener {
            users.add(
                UserLogin(
                username.text.toString(),
                password.text.toString()
                )
            )
            MainActivity.navController?.let {
                it.popBackStack()
                it.navigate(R.id.loginFragment)
            }
        }
    }
}