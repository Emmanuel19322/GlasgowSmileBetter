package com.emmadev00.glasgowsmilebetter.screens

import android.content.ContentValues.TAG
import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.glasgowsmilebetter.ui.theme.GlasgowSmileBetterTheme


@Composable
fun LocalPlaces(content: @Composable () -> Unit) {
    GlasgowSmileBetterTheme() {
        Scaffold(topBar = {
            TopAppBar(backgroundColor = Color.Gray,
                elevation = 5.dp) {
                Text("Offline Places")

            }
        },) {
            content()
        }
    }
}

@Composable
fun PlacesRow(place: String,
              onItemClick: (String) -> Unit = {} ) {
    Card(modifier = Modifier
        .padding(4.dp)
        .fillMaxWidth()
        .height(200.dp)
        .clickable {
                    onItemClick(place)
        },
        shape = RoundedCornerShape(corner = CornerSize(16.dp)),
        elevation = 6.dp) {
        Row(verticalAlignment = Alignment.Bottom, horizontalArrangement = Arrangement.End ) {


            Text(text = place)
        }


    }
}

@Composable
fun MainContent(placesList: List<String> = listOf(
    "George Square",
    "Glasgow Cathedral",
    "Kelvingrove Art Gallery and Museum",
    "Glasgow Science Center & Glasgow Tower",
    "Glasgow Botanic Garden",
    "The Lighthouse")) {
    Column(modifier = Modifier.padding(12.dp)) {
        LazyColumn{
            items(items = placesList) {
                PlacesRow(place = it){
                    place ->
                    Log.d(TAG, "MainContent: $place")
                }
            }
        }
    }

}