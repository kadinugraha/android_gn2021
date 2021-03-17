package id.ac.ukdw.pertemuan05_activity_gn2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val username = intent.getStringExtra("username")
        val tvGreetings = findViewById<TextView>(R.id.tvGreetings)
        tvGreetings.text = "Selamat datang $username"
    }
}