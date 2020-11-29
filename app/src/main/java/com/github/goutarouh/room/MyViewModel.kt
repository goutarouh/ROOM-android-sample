package com.github.goutarouh.room

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.viewModelScope
import androidx.room.Room
import kotlinx.coroutines.*

class MyViewModel(application: Application) : AndroidViewModel(application), LifecycleObserver {

    private val context = getApplication<Application>().applicationContext

    private val job = Job()
    private val coroutineContext = Dispatchers.Default + job


    fun background() {
        viewModelScope.launch(coroutineContext) {
            addData()
        }
    }

    private fun addData() {
        val database = Room.databaseBuilder(context, UserDatabase::class.java, "user")
                .build()
        val userDao = database.userDao()
        val newUser = UserEntity(0, "hasegawa1")
        userDao.insert(newUser)
    }

    override fun onCleared() {
        super.onCleared()
        job.cancel()
    }

}