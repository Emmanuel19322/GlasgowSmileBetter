package com.emmadev00.glasgowsmilebetter.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.glasgowsmilebetter.navigation.Screens

class GlasgowSmileComponents {
 @Composable
 fun BottomNavBar(
        modifier: Modifier = Modifier,
        navController: NavController,
        activeScreen: MutableState<String>
    ) {
        val darkTheme: Boolean = isSystemInDarkTheme()
        var background = Color.Transparent
        var discoveryTint: Color
        var placesTint: Color
        var trackTint: Color
        var settingsTint: Color

        if (!darkTheme) {
            background = Color(0xFFE3E3E3)
        }
        if (!darkTheme) {
            discoveryTint = Color.Black
            if (activeScreen.value == Screens.SplashScreen.name) {
                discoveryTint = Color.Gray
            }
            placesTint = Color.Black
            if (activeScreen.value == Screens.PlacesScreen.name) {
                placesTint = Color.Gray
            }
            trackTint = Color.Black
            if (activeScreen.value == Screens.TrackerScreen.name) {
                trackTint = Color.Gray
            }
            settingsTint = Color.Black
            if (activeScreen.value == Screens.SettingsScreen.name) {
                settingsTint = Color.Gray
            }
        } else {
            discoveryTint = Color.Gray
            if (activeScreen.value == Screens.SplashScreen.name) {
                discoveryTint = Color.Black
            }
            placesTint = Color.Gray
            if (activeScreen.value == Screens.PlacesScreen.name) {
                placesTint = Color.Black
            }
            trackTint = Color.Gray
            if (activeScreen.value == Screens.TrackerScreen.name) {
                trackTint = Color.Black
            }
            settingsTint = Color.Gray
            if (activeScreen.value == Screens.SettingsScreen.name) {
                settingsTint = Color.Black
            }
        }
     Card(
         modifier = Modifier
             .padding(start = 50.dp, end = 50.dp, top = 20.dp, bottom = 20.dp),
         elevation = 1.dp,
         shape = CircleShape.copy(all = CornerSize(100)),
     ) {

         Surface(color = background) {
             Row(
                 modifier = modifier
                     .clip(shape = CircleShape)
                     .background(Color.Transparent)
                     .padding(top = 10.dp, bottom = 10.dp),
                 horizontalArrangement = Arrangement.SpaceEvenly,
             ) {
                 Icon(
                     imageVector = Icons.Filled.History,
                     contentDescription = "Discovery",
                     modifier = Modifier
                         .clickable {
                             if (activeScreen.value != Screens.SplashScreen.name) {
                                 navController.navigate(route = Screens.SplashScreen.name)
                                 activeScreen.value = Screens.SplashScreen.name
                             }
                         }
                         .scale(1.2f),
                     tint = discoveryTint
                 )
                 Icon(
                     imageVector = Icons.Filled.LocationSearching,
                     contentDescription = "Places",
                     modifier = Modifier
                         .clickable {
                             if (activeScreen.value != Screens.PlacesScreen.name) {
                                 navController.navigate(route = Screens.PlacesScreen.name)
                                 activeScreen.value = Screens.PlacesScreen.name
                             }
                         }
                         .scale(1.2f),
                     tint = placesTint
                 )
                 Icon(
                     imageVector = Icons.Filled.AddTask,
                     contentDescription = "Track",
                     modifier = Modifier
                         .clickable {
                             if (activeScreen.value != Screens.TrackerScreen.name) {
                                 navController.navigate(route = Screens.TrackerScreen.name)
                                 activeScreen.value = Screens.TrackerScreen.name
                             }
                         }
                         .scale(1.2f),
                     tint = trackTint
                 )
                 Icon(
                     imageVector = Icons.Filled.Settings,
                     contentDescription = "Settings",
                     modifier = Modifier
                         .clickable {
                             if (activeScreen.value != Screens.SettingsScreen.name) {
                                 navController.navigate(route = Screens.SettingsScreen.name)
                                 activeScreen.value = Screens.SettingsScreen.name
                             }
                         }
                         .scale(1.2f),
                     tint = settingsTint
                 )
             }
         }
     }
    }


}