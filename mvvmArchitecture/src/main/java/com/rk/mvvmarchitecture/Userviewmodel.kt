package com.rk.mvvmarchitecture

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class Userviewmodel(application: Application): AndroidViewModel(application) {
    private val _data = MutableLiveData<List<UserModel>>()
    val data: LiveData<List<UserModel>>
        get() = _data

    fun getUsers(){
        viewModelScope.launch {
            _data.value = UserRepository().fetchData()
        }

        //    viewModelScope.launch {
        //        UserRepository().data.observeForever {
        //            _data.value = it
        //        }
        //    }
    }

}