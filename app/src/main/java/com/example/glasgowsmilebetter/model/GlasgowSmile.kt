package com.example.glasgowsmilebetter.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "Glasgow_SB")
data class GlasgowSmile(
    @PrimaryKey
    val id: UUID = UUID.randomUUID()

)
