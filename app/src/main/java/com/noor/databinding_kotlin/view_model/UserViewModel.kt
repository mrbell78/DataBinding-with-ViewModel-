package com.noor.databinding_kotlin.view_model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.noor.databinding_kotlin.model.User

class UserViewModel:ViewModel() {

    val user = MutableLiveData<User>()
    init {
        user.value = User("John Doe", "johndoe@example.com")
    }
}