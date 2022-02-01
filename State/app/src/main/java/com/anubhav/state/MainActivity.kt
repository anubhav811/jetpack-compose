package com.anubhav.state

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.anubhav.state.ui.theme.StateTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
         //   State describes how our UI looks at a "moment"
            // We can make our UI dynamic by using these "state" and
            // switching between them
            //  IMP : This is not the ideal way of handling states in bigger apps.

            Column (Modifier.fillMaxSize()){
                val color = remember {
                    mutableStateOf(Color.Yellow)    // i) this represents one state of the column that is
                }                                   // set to yellow and is mutable
                                                    // ii) "remember" is used to prevent resetting of state to "yellow" everytime
                                                    // the composable is called
                ColorBox(
                    Modifier.weight(1f).fillMaxSize()
                ){
                    color.value = it           // this is our lambda updateColor function that we created below
                }
            Box(modifier = Modifier
                .background(color.value)
                .weight(1f)
                .fillMaxSize())
        }}
    }
}

@SuppressLint("UnrememberedMutableState")
@Composable
fun ColorBox(
    modifier: Modifier = Modifier,
    updateColor:(Color) -> Unit    //  we donot wanna change the state i.e color in this case of our ColorBox
                                    // instead we want to change the state of our parent composable Column . So we have
                                    // So updateColor callback function is created
                                    // it takes Color value  and returns nothing therefore Unit.
){
    Box(modifier = modifier
        .background(Color.Red)
        .clickable {
            updateColor(Color(
                Random.nextFloat(),
                Random.nextFloat(),
                Random.nextFloat(),
                alpha = 1f
            ))
        })
}