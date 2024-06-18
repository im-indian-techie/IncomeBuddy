package com.abana.incomebuddy.model.room.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.abana.incomebuddy.model.room.entities.Budget

@Dao
interface BudgetDao {
    @Insert(onConflict =OnConflictStrategy.IGNORE)
    suspend fun insertBudget(budget: Budget)

    @Query("SELECT * FROM BUDGET ORDER BY id DESC")
    suspend fun getAllData():LiveData<List<Budget>>
}