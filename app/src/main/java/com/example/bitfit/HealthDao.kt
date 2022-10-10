package com.example.bitfit

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface HealthDao {
    @Query("SELECT * FROM health")
    fun getAll(): List<Health>

    @Insert
    fun insertAll(healths: List<Health>)

    @Insert
    fun insert(health: Health)
}