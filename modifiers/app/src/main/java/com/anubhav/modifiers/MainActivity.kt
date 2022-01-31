package com.anubhav.modifiers

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import com.anubhav.modifiers.ui.theme.ModifiersTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        // Modifiers are basically used to modify properties of any composable
            Column(
                // IMPORTANT these functions below are applied sequentially
                // diff order of functions can result to diff results

                modifier = Modifier
                    .fillMaxHeight(0.5f)
                    .background(Color.Green)
                    .fillMaxWidth()
                    .border(3.dp,Color.Red, RectangleShape)
                    .padding(5.dp)
                    .border(3.dp,Color.Black, RectangleShape)
                    .padding(5.dp)
                    .border(3.dp,Color.Blue,RectangleShape)
                    .padding(10.dp)
            ){

                // offset is similar to margin however it doesn't pushes the neighbouring
                // elements , instead it may overlap them

                Text("Hello",modifier = Modifier
                    .border(5.dp,Color.Yellow)
                    .padding(50.dp)
                    .border(2.dp,Color.Magenta, RectangleShape)
                    .padding(100.dp)
                    .clickable {
                        Log.d("asd","Text tapped")
                    })
                Spacer(modifier = Modifier.height(50.dp))
                Text("World")
            }
        }
    }
}


