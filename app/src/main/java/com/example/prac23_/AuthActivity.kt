package com.example.prac23_

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.OutlinedTextField
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.prac23_.ui.theme.Prac23_Theme
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.google.accompanist.pager.rememberPagerState

class AuthActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Prac23_Theme {
                Greeting()
            }
        }
    }

    @Composable
    fun Greeting() {
        var username = remember { mutableStateOf("")}
        val buttonEnabled = username.value.isNotEmpty()



        Box(modifier = Modifier.fillMaxSize().background(color = Color.White)){
            Text(
                text = "\uD83D\uDD90 Добро пожаловать!",
                modifier = Modifier.align(Alignment.TopStart).offset(0.dp,200.dp),
                style = TextStyle(fontSize = 24.sp)
            )
            Text(
                text = "Войдите, чтобы пользоваться функциями приложения",
                modifier = Modifier.align(Alignment.TopCenter).offset(0.dp,230.dp),
                style = TextStyle(fontSize = 15.sp)
            )

            Text(
                text = "Вход по E-mail",
                modifier = Modifier.align(Alignment.CenterStart).offset(58.dp, -35.dp),
                style = TextStyle(fontSize = 12.sp),
                color = colorResource(R.color.subtext)
            )
            OutlinedTextField(
                value = username.value,
                onValueChange = {username.value = it},
                label = { Text("E-mail")},
                modifier = Modifier.align(Alignment.Center)
            )

            Button(
                colors = ButtonDefaults.buttonColors(colorResource(R.color.text3)),
                content = { Text("Далее")},
                modifier = Modifier.width(270.dp).height(45.dp).offset(0.dp, 70.dp).align(Alignment.Center),
                enabled = buttonEnabled,
                onClick = {
                    val intent = Intent(applicationContext, MainActivity::class.java)
                    startActivity(intent)
                }
            )
            Text(
                text = "Или войдите с помощью",
                modifier = Modifier.align(Alignment.BottomCenter).offset(0.dp, -80.dp),
                color = colorResource(R.color.subtext)
            )
            Button(
                content = { Text("Войти с Яндекс")},
                modifier = Modifier.width(270.dp).height(45.dp).offset(0.dp,-20.dp).align(Alignment.BottomCenter),
                colors = ButtonDefaults.buttonColors(colorResource(R.color.subtext)),
                onClick = {

                }
            )
        }

    }



    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        Prac23_Theme {
            Greeting()
        }
    }
}