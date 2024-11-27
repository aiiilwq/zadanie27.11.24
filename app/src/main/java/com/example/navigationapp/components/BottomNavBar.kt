package com.example.navigationapp.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun BottomNavBar(navController: NavHostController) {
    NavigationBar {
        NavigationBarItem(
            icon = { Icon(Icons.Filled.Home, contentDescription = "Экран 1") },
            label = { Text("Заметка для задач") },
            selected = false,
            onClick = { navController.navigate("screen1") }
        )
        NavigationBarItem(
            icon = { Icon(Icons.Filled.Settings, contentDescription = "Экран 2") },
            label = { Text("Настройки") },
            selected = false,
            onClick = { navController.navigate("screen2") }
        )
        NavigationBarItem(
            icon = { Icon(Icons.Filled.Info, contentDescription = "Экран 3") },
            label = { Text("Случайный факт") },
            selected = false,
            onClick = { navController.navigate("screen3") }
        )
    }
}
