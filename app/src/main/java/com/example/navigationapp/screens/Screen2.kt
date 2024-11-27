package com.example.navigationapp.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.navigationapp.components.BottomNavBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Screen2(navController: NavHostController, isDarkTheme: MutableState<Boolean>) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Настройки") },
                colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = MaterialTheme.colorScheme.primary)
            )
        },
        bottomBar = { BottomNavBar(navController) }
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .padding(16.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Переключить тему", style = MaterialTheme.typography.bodyLarge)
            Switch(
                checked = isDarkTheme.value,
                onCheckedChange = { isDarkTheme.value = it },
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}
