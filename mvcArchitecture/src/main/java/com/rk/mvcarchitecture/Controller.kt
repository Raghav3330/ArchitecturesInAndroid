package com.rk.mvcarchitecture

class Controller(val activity: MainActivity) {

    val model: UserModel = UserModel(this)

    fun getUser(){
        model.getUser()
    }

    fun updateUser(name: String){
        activity.tv_user_name.text = name
    }
}