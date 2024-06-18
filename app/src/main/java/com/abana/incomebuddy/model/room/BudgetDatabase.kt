package com.abana.incomebuddy.model.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.abana.incomebuddy.model.room.dao.BudgetDao
import com.abana.incomebuddy.model.room.dao.ProfileDao
import com.abana.incomebuddy.model.room.entities.Budget
import com.abana.incomebuddy.model.room.entities.Profile

@Database(entities = [Budget::class,Profile::class], version = 1,)
abstract class BudgetDatabase: RoomDatabase() {
    abstract fun getBudgetDao():BudgetDao
    abstract fun getProfileDao():ProfileDao
}
