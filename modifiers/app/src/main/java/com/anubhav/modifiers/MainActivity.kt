package com.anubhav.modifiers

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
                modifier = Modifier
                    .fillMaxHeight(0.5f)
                    .background(Color.Green)
                    .fillMaxWidth()
                    .border(6.dp,Color.Red, RectangleShape)
            ){

                // offset is similar to margin however it doesn't pushes the neighbouring
                // elements , instead it may overlap them

                Text("Hello")
                Spacer(modifier = Modifier.height(50.dp))
                Text("World")
            }
        }
    }
}


