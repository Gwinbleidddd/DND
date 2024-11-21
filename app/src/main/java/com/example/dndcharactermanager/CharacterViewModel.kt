package com.example.dndcharactermanager.ui

import android.view.View
import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData

class AddCharacterViewModel : ViewModel() {
    val characterName = MutableLiveData<String>()
    val characterClass = MutableLiveData<String>()
    val characterRace = MutableLiveData<String>()
    val characterDescription = MutableLiveData<String>()

    // Метод для сохранения персонажа
    fun saveCharacter(view: View) {
        // Логика для сохранения персонажа
        // Например, логирование введенных данных
        println("Character Saved: $characterName, $characterClass, $characterRace, $characterDescription")
    }
}
