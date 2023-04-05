package co.pratham.mysharedpref.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [KeyEntity::class], version = 1)
public abstract class PrefDatabase:RoomDatabase() {
    abstract fun prefDAO():PreferenceDao
}