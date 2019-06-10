package cl.luckio.itunestest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import cl.luckio.domain.Location

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val locations = emptyArray<Location>()
        Log.d("Data", locations.toString())
    }
}
