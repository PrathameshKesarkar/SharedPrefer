package co.pratham.mysharedpref.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "KeyEntity")
data class KeyEntity(
    @PrimaryKey
    @ColumnInfo(name = "key") val key:String,
    @ColumnInfo(name = "value")val value:String
)