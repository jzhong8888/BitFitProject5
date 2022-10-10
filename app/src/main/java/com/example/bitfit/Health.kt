package com.example.bitfit

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName ="health")
data class Health (
    @ColumnInfo(name = "hoursOfSleep") val hoursOfSleep: String,
    @ColumnInfo(name = "date") val date: String,
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
        )