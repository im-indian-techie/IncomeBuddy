package com.abana.incomebuddy.di

import android.content.Context
import androidx.room.Room
import com.abana.incomebuddy.model.room.BudgetDatabase
import com.abana.incomebuddy.util.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun providesBudgetDatabase(@ApplicationContext context: Context)
    =Room.databaseBuilder(context,BudgetDatabase::class.java,Constants.DATABASE_NAME).build()

    @Provides
    @Singleton
    fun providesBudgetDao(db:BudgetDatabase)=db.getBudgetDao()

    @Provides
    @Singleton
    fun providesProfileDao(db:BudgetDatabase)=db.getProfileDao()

}