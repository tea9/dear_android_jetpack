package com.example.ui.home

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.bean.User


class HomeViewModel : ViewModel() {
    // TODO: Implement the ViewModel

    private var users: MutableLiveData<List<User>>? = null
    fun getUsers(): LiveData<List<User>> {
        if (users == null) {
            users = MutableLiveData()
            loadUsers()
        }
        return users!!
    }

    private fun loadUsers() {
        // Do an asynchronous operation to fetch users.
    }
}
