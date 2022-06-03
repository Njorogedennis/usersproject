package com.example.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import com.example.viewmodel.viewmodels.UserViewModel
import androidx.lifecycle.ViewModelProvider


class MainActivity : AppCompatActivity() {

    lateinit var userViewModel : UserViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.userViewModel = ViewModelProvider(this).get(UserViewModel::class.java)
        this.userViewModel.users.forEach{

        }

    }


}