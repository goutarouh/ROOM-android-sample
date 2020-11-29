package com.github.goutarouh.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UserDao {
    @Insert
    fun insert(user: UserEntity)

    @Query("select * from users")
    fun getAll(): List<UserEntity>
}