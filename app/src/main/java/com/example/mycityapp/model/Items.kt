package com.example.mycityapp.model

import android.view.View

data class Items(
    val imageResId: Int,
    val name: String,
    val onClickListener: (View) -> Unit
)
