package com.example.weather

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WeatherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather)

        val weatherAdapter = WeatherAdapter(
            listOf(
                DailyWeather("Пн", true, -25),
                DailyWeather("Вт", false, -20),
                DailyWeather("Ср", true, -15),
                DailyWeather("Чт", false, -10),
                DailyWeather("Пт", true, +5),
                DailyWeather("Сб", false, +10),
                DailyWeather("Вс", false, +25),
            )
        )

        val rvWeather = findViewById<RecyclerView>(R.id.rvWeather)
        rvWeather.adapter = weatherAdapter

        val button: Button = findViewById(R.id.btBack)
        button.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
    }