package com.example.agoyrifinanceapp

import androidx.compose.ui.graphics.Color

data class User(
    val name: String,
    val currentBalance: Double
)

data class SummaryCard(
    val title: String,
    val amount: Double,
    val backgroundColor: Color
)

data class Transaction(
    val merchantName: String,
    val category: String,
    val amount: Double,
    val time: String,
    val iconResId: Int
)