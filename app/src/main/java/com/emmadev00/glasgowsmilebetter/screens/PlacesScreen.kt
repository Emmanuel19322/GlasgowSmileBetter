package com.emmadev00.glasgowsmilebetter.screens

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class PlacesScreen {

}

@Preview
@Composable
fun Header(){
   Surface(modifier = Modifier
       .fillMaxHeight()
       .fillMaxWidth()) {
       Scaffold(modifier = Modifier.padding(1.dp)
       ) {
           TopAppBar(modifier = Modifier.padding(1.dp),
               elevation = 4.dp,
                backgroundColor = Color.Gray
           ) {
               Text(
                   text = "Places",
                   modifier = Modifier.padding(start = 10.dp, top = 0.dp, end = 0.dp, bottom = 0.dp),
                   fontSize = MaterialTheme.typography.h5.fontSize,
                   fontWeight = FontWeight.Medium,
                   color = (Color.White)
               )
           }
       }
   }

}