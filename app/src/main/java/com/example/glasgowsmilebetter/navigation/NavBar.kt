package com.example.glasgowsmilebetter.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.navigation.compose.rememberNavController


@Composable
fun NavBar() {
    val navController = rememberNavController()
    val activeScreen = remember {
        mutableStateOf(Screens.PlacesScreen)
    }
}