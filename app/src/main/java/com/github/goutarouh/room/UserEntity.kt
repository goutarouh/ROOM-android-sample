package com.github.goutarouh.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class UserEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    @ColumnInfo(name = "first_name")
    val firstName: String?
)