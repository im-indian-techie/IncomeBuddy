package com.abana.incomebuddy.model.room.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Profile")
data class Profile(
    @PrimaryKey(autoGenerate = true)
    var id:Int?=null,

    @ColumnInfo(name = "name")
    var name: String,

    @ColumnInfo(name="email")
    var email:String,

    @ColumnInfo(name="profileImagePath")
    var profileImagePath: String,

    @ColumnInfo(name = "bankName")
    var bankName:String,

    @ColumnInfo(name="currentBalance")
    var currentBalance:Float,

    @ColumnInfo(name="initialBalance")
    var initialBalance:Float,

    @ColumnInfo(name="primaryBank")
    var primaryBank:Boolean
)
