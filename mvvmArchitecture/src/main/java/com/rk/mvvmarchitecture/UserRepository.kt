package com.rk.mvvmarchitecture

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import kotlinx.coroutines.delay

class UserRepository {
//     private val _data = MutableLiveData(listOf(
//            UserModel("Raghav",23),
//            UserModel("Pavin",25),
//            UserModel("Jega",30),
//            UserModel("Arun",35)
//     ))
//
//    val data: LiveData<List<UserModel>>
//        get() = _data

    private val data = listOf(
        UserModel("Raghav",23),
        UserModel("Pavin",25),
        UserModel("Jega",30),
        UserModel("Arun",35)
    )

    suspend fun fetchData(): List<UserModel>{
        delay(5000L)
        return data
    }
}