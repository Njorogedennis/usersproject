package com.example.viewmodel.viewmodels

import androidx.lifecycle.ViewModel
import com.example.viewmodel.models.User

class UserViewModel : ViewModel() {

    lateinit var users : MutableList<User>

    init {
        this.users = mutableListOf()
        this.users.add(User("343434", "Felix Okoth"))
    }


}