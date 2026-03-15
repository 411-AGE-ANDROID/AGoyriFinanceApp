package com.example.agoyrifinanceapp

import android.R
import androidx.compose.ui.graphics.Color
import com.example.agoyrifinanceapp.models.SummaryCard
import com.example.agoyrifinanceapp.models.Transaction
import com.example.agoyrifinanceapp.models.User

object datos {

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
        Transaction("Supermercado", "Despensa", 45.99, "10:30 AM", R.drawable.ic_menu_add),
        Transaction("Gasolinera", "Gasolina", -30.50, "12:15 PM", R.drawable.ic_menu_add),
        Transaction("Cafetería", "Comida y Bebidas", 5.75, "8:00 AM", R.drawable.ic_menu_add),
        Transaction(
            "Tienda de Electrónica",
            "Electrónica",
            120.00,
            "3:45 PM",
            R.drawable.ic_menu_add
        ),
        Transaction("Librería", "Libros", 25.99, "2:00 PM", R.drawable.ic_menu_add),
        Transaction("Restaurante", "Cenas", 60.00, "7:30 PM", R.drawable.ic_menu_add)
    )
}