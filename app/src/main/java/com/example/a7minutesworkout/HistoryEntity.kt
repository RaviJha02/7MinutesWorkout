package com.example.a7minutesworkout

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "history-table")
class HistoryEntity(
    @PrimaryKey
    val date:String
)