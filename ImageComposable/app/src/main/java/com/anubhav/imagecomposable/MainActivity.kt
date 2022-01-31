package com.anubhav.imagecomposable

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.anubhav.imagecomposable.ui.theme.ImageComposableTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                val painter = painterResource(id = R.drawable.modi)
            val description = "Mudi sad . very sad"
            val title = "Modi sed , cry coming"
            Box(modifier = Modifier.fillMaxWidth(0.5f).padding(16.dp))
            ImageCard(painter = painter,
                contentDescription =description
                , title = title)
        }
    }
}

//We are creating a composable function for our image card
//Normal functions are in camelCase but Composable functions
//start with a capital letter
@Composable
fun ImageCard(
    painter : Painter,             // used to load or show our drawable
    contentDescription : String,   // a short description of the subject of the card . For visually impaired
    title : String,                // title for card
    modifier:Modifier = Modifier    // off course ! for the modifying dimensions and other cool stuff
){
    Card(
        modifier = modifier.fillMaxWidth(),
        shape= RoundedCornerShape(10.dp),
        elevation = 10.dp // will give some shadow look
    ) {
        Box(modifier = Modifier.height(150.dp)){
            Image(
                painter= painter,
                contentDescription = contentDescription,
                contentScale = ContentScale.Crop  // same as centerCrop
            )
            Box(modifier = Modifier
                .fillMaxSize()
                .padding(12.dp),
                contentAlignment = Alignment.BottomStart)
            {
                Text(title,style = TextStyle(color = Color.White,fontSize = 16.sp))
            }
        }
    }
}