package com.rk.mvparchitecture

val users = mutableListOf(
    UserLogin("raghav","12345")
)
class Model : LoginContract.Model{
    override fun login(userName: String, password: String): Boolean {
        for (user in users){
            if(user.name == userName && password == user.password){
                return true
            }
        }
        return false
    }
}