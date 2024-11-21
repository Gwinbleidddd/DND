package com.example.dndcharactermanager.ui.theme

import androidx.databinding.BindingAdapter
import android.widget.TextView

// Пример использования цвета для TextView
val colorPrimary = "#6200EE"
val colorPrimaryDark = "#3700B3"
val colorAccent = "#03DAC6"

// Пример биндинга для TextView
@BindingAdapter("android:textColor")
fun setTextColor(view: TextView, color: String) {
    view.setTextColor(android.graphics.Color.parseColor(color))
}
