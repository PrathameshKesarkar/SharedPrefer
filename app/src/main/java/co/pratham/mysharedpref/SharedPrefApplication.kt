package co.pratham.mysharedpref

import android.app.Application
import androidx.room.Room
import co.pratham.mysharedpref.database.PrefDatabase

class SharedPrefApplication: Application() {

    lateinit var prefWrapper:PreferenceWrapper
    override fun onCreate() {
        super.onCreate()
        prefWrapper =  PreferenceWrapper(Room.databaseBuilder(this,PrefDatabase::class.java,"pref-db")
            .allowMainThreadQueries().build().prefDAO())


    }
}