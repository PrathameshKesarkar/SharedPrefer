package co.pratham.mysharedpref.view

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import co.pratham.mysharedpref.R
import co.pratham.mysharedpref.SharedPrefApplication

class MainActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val returnValue = (applicationContext as SharedPrefApplication).prefWrapper.getInteger("alpha",12)
        Log.d("beta",returnValue.toString())
    }
}