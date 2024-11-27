package com.example.navigationapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigationapp.screens.Screen1
import com.example.navigationapp.screens.Screen2
import com.example.navigationapp.screens.Screen3

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigationApp()
        }
    }
}

@Composable
fun NavigationApp() {
    val isDarkTheme = remember { mutableStateOf(false) }
    val navController = rememberNavController()

    MaterialTheme(colorScheme = if (isDarkTheme.value) darkColorScheme() else lightColorScheme()) {
        NavHost(navController = navController, startDestination = "screen1") {
            composable("screen1") { Screen1(navController) }
            composable("screen2") { Screen2(navController, isDarkTheme) }
            composable("screen3") { Screen3(navController) }
        }
    }
}
