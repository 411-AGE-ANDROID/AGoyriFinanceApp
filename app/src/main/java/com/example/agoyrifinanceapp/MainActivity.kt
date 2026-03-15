package com.example.agoyrifinanceapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.agoyrifinanceapp.Components.HeaderSection
import com.example.agoyrifinanceapp.Components.SummaryCardsSection
import com.example.agoyrifinanceapp.Components.TransactionsSection
import com.example.agoyrifinanceapp.models.currentUser
import com.example.agoyrifinanceapp.models.recentTransactions
import com.example.agoyrifinanceapp.models.summaryCards
import com.example.agoyrifinanceapp.ui.theme.AGoyriFinanceAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AGoyriFinanceAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    HomeScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFFAFAFA))
    ) {
        HeaderSection(user = currentUser)
        Spacer(modifier = Modifier.height(8.dp))
        SummaryCardsSection(cards = summaryCards)
        Spacer(modifier = Modifier.height(16.dp))
        TransactionsSection(transactions = recentTransactions)
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    AGoyriFinanceAppTheme {
        HomeScreen()
    }
}