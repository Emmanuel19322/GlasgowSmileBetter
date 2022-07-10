package com.emmadev00.glasgowsmilebetter.navigation

import com.example.glasgowsmilebetter.screens.PlacesScreen
import java.lang.IllegalArgumentException


enum class Screens {
    PlacesScreen,
    SplashScreen,
    TrackerScreen,
    SettingsScreen,
    LocalPlacesScreen,
    LocalPlacesDetailScreen;
    companion object
        fun fromRoute(route: String?): Screens
        = when (route?.substringBefore("/")) {
            SplashScreen.name -> SplashScreen
            PlacesScreen.name -> PlacesScreen
            TrackerScreen.name -> TrackerScreen
            SettingsScreen.name -> SettingsScreen
            LocalPlacesScreen.name -> LocalPlacesScreen
            LocalPlacesDetailScreen.name -> LocalPlacesDetailScreen
            null -> PlacesScreen
            else -> throw IllegalArgumentException("Route $route is not recognised")
        }
}