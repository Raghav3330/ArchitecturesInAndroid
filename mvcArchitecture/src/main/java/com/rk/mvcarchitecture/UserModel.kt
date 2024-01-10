package com.rk.mvcarchitecture

class UserModel(val controller: Controller) {

    val data = listOf(
        "Raghav","Praveen","Ashwin","Ragul"
    )

    fun getUser(){
         controller.updateUser(data[kotlin.random.Random.nextInt(data.size)])
    }
}