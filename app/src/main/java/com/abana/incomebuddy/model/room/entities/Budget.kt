package com.abana.incomebuddy.model.room.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "BUDGET")
data class Budget(
    @PrimaryKey(autoGenerate = true)
    var id:Int?=null,

    @ColumnInfo(name = "date")
    var date:String,

    @ColumnInfo(name = "bankName")
    var bankName:String,

    @ColumnInfo(name = "amount")
    var amount:Float,

    @ColumnInfo(name = "purpose")
    var purpose:String,

    @ColumnInfo(name = "creditOrDebit")
    var creditOrDebit:String
)