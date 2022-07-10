package com.emmadev00.glasgowsmilebetter.data

import androidx.room.Dao
import androidx.room.Query
import com.example.glasgowsmilebetter.model.GlasgowSmile
import kotlinx.coroutines.flow.Flow

@Dao
interface GlasgowSmileDao {

    @Query("SELECT * from Glasgow_SB")
     fun getPlace(): Flow<List<GlasgowSmile>>

    @Query("SELECT * from Glasgow_SB where id =:id")
    suspend fun getPlaceById(id: String): GlasgowSmile
}
