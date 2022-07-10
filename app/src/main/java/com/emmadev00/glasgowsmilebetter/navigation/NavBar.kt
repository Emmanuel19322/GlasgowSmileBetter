package com.emmadev00.glasgowsmilebetter.navigation

import android.window.SplashScreenView
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController
import com.example.glasgowsmilebetter.ui.theme.GlasgowSmileBetterTheme
import com.example.glasgowsmilebetter.viewmodel.PlacesViewModel
import com.example.glasgowsmilebetter.viewmodel.SettingsViewModel
import com.example.glasgowsmilebetter.viewmodel.TrackViewModel


@Composable
fun NavBar() {
    val navController = rememberNavController()
    val activeScreen = remember {
        mutableStateOf(Screens.SplashScreen)
    }

    GlasgowSmileBetterTheme() {
        Surface(color = MaterialTheme.colors.background) {
            val placesViewModel: ViewModel = viewModel()
            val splashViewModel: ViewModel  = viewModel()
            val trackViewModel: ViewModel = viewModel()
            val settingsViewModel: ViewModel = viewModel()

            }
        }
    }
