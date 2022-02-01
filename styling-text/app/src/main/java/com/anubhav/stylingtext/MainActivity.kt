package com.anubhav.stylingtext

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.anubhav.stylingtext.ui.theme.StylingTextTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Box(modifier = Modifier
                .fillMaxSize()
                .background(Color.Magenta)){
                Text(
                    text = buildAnnotatedString {
                                                withStyle(
                                                    style = SpanStyle(
                                                        color = Color.Black,
                                                        fontSize = 50.sp,
                                                        textDecoration = TextDecoration.Underline

                                                    )
                                                ){
                                                    append("A")
                                                }
                        append("nubhav ")
                        withStyle(
                            style = SpanStyle(
                                color = Color.Black,
                                fontSize = 50.sp,
                                        textDecoration = TextDecoration.Underline

                            )
                        ){
                            append("C")
                        }
                        append("hachra")
                    },
                    color= Color.White,
                    fontSize = 30.sp,
                )
            }
        }
    }
}