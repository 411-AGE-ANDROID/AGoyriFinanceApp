package com.example.agoyrifinanceapp.models

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

val currentUser = User(
    name = "Juan",
    currentBalance = 1500.0
)

val summaryCards = listOf(
    SummaryCard(
        title = "Actividad\nde la Semana",
        amount = 0.0,
        backgroundColor = Color(0xFFEBF4EF)
    ),
    SummaryCard(
        title = "Ventas",
        amount = 280.99,
        backgroundColor = Color(0xFFF3EAE0)
    ),
    SummaryCard(
        title = "Ganancias",
        amount = 280.99,
        backgroundColor = Color(0xFFEBE6F5)
    )
)

val recentTransactions = listOf(
    Transaction("Supermercado", "Despensa", 45.99, "10:30 AM", android.R.drawable.ic_menu_add),
    Transaction("Gasolinera", "Gasolina", -30.50, "12:15 PM", android.R.drawable.ic_menu_add),
    Transaction("Cafetería", "Comida y Bebidas", 5.75, "8:00 AM", android.R.drawable.ic_menu_add),
    Transaction("Tienda de Electrónica", "Electrónica", 120.00, "3:45 PM", android.R.drawable.ic_menu_add),
    Transaction("Librería", "Libros", 25.99, "2:00 PM", android.R.drawable.ic_menu_add),
    Transaction("Restaurante", "Cenas", 60.00, "7:30 PM", android.R.drawable.ic_menu_add)
)