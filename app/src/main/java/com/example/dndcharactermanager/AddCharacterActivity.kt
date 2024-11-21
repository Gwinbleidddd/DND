package com.example.dndcharactermanager

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.dndcharactermanager.databinding.ActivityAddCharacterBinding
import com.example.dndcharactermanager.ui.AddCharacterViewModel

class AddCharacterActivity : AppCompatActivity() {

    // Привязываем ViewModel
    private val viewModel: AddCharacterViewModel by viewModels()

    private lateinit var binding: ActivityAddCharacterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Привязываем layout с помощью DataBinding
        binding = DataBindingUtil.setContentView(this, R.layout.activity_add_character)

        // Привязываем ViewModel
        binding.viewModel = viewModel
        binding.lifecycleOwner = this  // Обеспечиваем, что LiveData будет обновлять UI

        // Логика для установки данных (если требуется)
    }
}
