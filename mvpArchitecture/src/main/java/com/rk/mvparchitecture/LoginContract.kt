package com.rk.mvparchitecture

interface LoginContract {
    interface View{
        fun invalidCredential()
        fun successfulLogin()
    }

    interface Presenter{
        fun loginButtonClicked(userName: String, password: String)
    }

    interface Model{
        fun login(userName: String, password: String): Boolean
    }
}