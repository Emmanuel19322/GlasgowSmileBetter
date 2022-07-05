package com.example.glasgowsmilebetter.di

import android.content.Context
import androidx.room.Room
import com.example.glasgowsmilebetter.data.GlasgowSmileDao
import com.example.glasgowsmilebetter.data.GlasgowSmileDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object AppModule {

    @Singleton
    @Provides
    fun provideGlasgowSmileDao(glasgowSmileDatabase: GlasgowSmileDatabase): GlasgowSmileDao
    = glasgowSmileDatabase.glasgowSDao()

    @Singleton
    @Provides
    fun provideAppDatabase(@ApplicationContext context: Context): GlasgowSmileDatabase
    = Room.databaseBuilder(
        context,
        GlasgowSmileDatabase::class.java,
        "glasgow_db")
        .fallbackToDestructiveMigration()
        .build()
}