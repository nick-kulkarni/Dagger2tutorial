package com.example.dagger2tutorial

import android.util.Log
import javax.inject.Inject

class UserRepository @Inject constructor(){

    fun saveUser(email: String, password: String) {
        Log.d("MainActivity", "User saved in DB")
    }
}