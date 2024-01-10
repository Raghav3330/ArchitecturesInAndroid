package com.rk.mvparchitecture.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.rk.mvparchitecture.LoginContract
import com.rk.mvparchitecture.MainActivity
import com.rk.mvparchitecture.Presenter
import com.rk.mvparchitecture.R

class LoginFragment : Fragment(),LoginContract.View {
    private lateinit var username: EditText
    private lateinit var password: EditText
    private lateinit var login: Button

    private lateinit var presenter: Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_login, container, false)
        username = view.findViewById(R.id.et_username)
        password = view.findViewById(R.id.et_password)
        login = view.findViewById(R.id.bt_login)

        presenter = Presenter(this)
        clickEvents()
        // Inflate the layout for this fragment
        return view
    }

    private fun clickEvents() {
        login.setOnClickListener {
            presenter.loginButtonClicked(username.text.toString(),password.text.toString())
        }
    }

    override fun invalidCredential() {
        MainActivity.navController?.let {
            it.popBackStack()
            it.navigate(R.id.signupFragment)
        }
        Toast.makeText(requireContext(),"Invalid Credentials", Toast.LENGTH_LONG).show()
    }

    override fun successfulLogin() {
        MainActivity.navController?.let {
            it.popBackStack()
            it.navigate(R.id.dashboardFragment)
        }
        Toast.makeText(requireContext(),"Successful login", Toast.LENGTH_LONG).show()
    }

}