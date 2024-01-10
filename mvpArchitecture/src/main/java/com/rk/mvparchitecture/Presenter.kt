package com.rk.mvparchitecture

class Presenter(var view: LoginContract.View): LoginContract.Presenter {
    val model = Model()

    override fun loginButtonClicked(userName: String, password: String) {
        if(model.login(userName,password)){
            view.successfulLogin()
        }else{
            view.invalidCredential()
        }
    }
}