package com.example.dndcharactermanager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.dndcharactermanager.databinding.ActivityMainBinding  // Импортируем биндинг для activity_main.xml

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding  // Используем ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)  // Связываем layout с DataBinding
    }
}




