package com.example.prac23_

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.ImageLoader
import coil.compose.rememberImagePainter
import coil.decode.SvgDecoder
import coil.imageLoader
import coil.request.ImageRequest
import com.example.prac23_.ui.theme.Prac23_Theme
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.google.accompanist.pager.rememberPagerState

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Prac23_Theme {
                Greeting()
            }
        }
    }
    @OptIn(ExperimentalPagerApi::class)
    @Composable
    fun Greeting() {
        Box(modifier = Modifier.fillMaxSize().background(color = Color.White)){
            val pagerState = rememberPagerState()

            HorizontalPager(
                count = 3,
                state = pagerState,
                modifier = Modifier.fillMaxSize()
            ) {page ->
                when (page) {
                    0 -> Screen1()
                    1 -> Screen2()
                    2 -> Screen3()
                }
            }
            HorizontalPagerIndicator(
                pagerState = pagerState,
                modifier = Modifier.align(Alignment.Center).padding(16.dp),
                activeColor = MaterialTheme.colorScheme.primary,
                inactiveColor = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.3f),
                indicatorHeight = 8.dp,
                indicatorWidth = 8.dp, spacing = 8.dp
            )
        }

    }

    @Composable
    fun Screen1() {
        Box(modifier = Modifier.fillMaxSize().background(color = Color.White)){
            Image(
                contentDescription = "",
                modifier = Modifier.align(Alignment.TopEnd).offset(0.dp, 30.dp),
                painter = painterResource(R.drawable.shape)
            )
            Text(
                text = "Пропустить",
                color = colorResource(R.color.text3),
                style = TextStyle(fontSize = 20.sp),
                modifier = Modifier.align(Alignment.TopStart).offset(30.dp, 30.dp)
                    .clickable {
                        val intent = Intent(applicationContext, SecondScreen::class.java)
                        startActivity(intent)
                    }
            )
            Text(
                text = "Анализы",
                modifier = Modifier.align(Alignment.Center).offset(0.dp, -120.dp),
                color = colorResource(R.color.text),
                style = TextStyle(fontSize = 24.sp)
            )
            Text(
                text = "Экспресс сбор и получение проб",
                modifier = Modifier.align(Alignment.Center).offset(0.dp, -60.dp),
                color = colorResource(R.color.text2),
                style = TextStyle(fontSize = 14.sp)
            )
            Image(
                contentDescription = "",
                modifier = Modifier.align(Alignment.BottomCenter).offset(0.dp, -90.dp),
                painter = painterResource(R.drawable.paintone)
            )
        }
    }


    @Composable
    fun Screen2() {
        Box(modifier = Modifier.fillMaxSize().background(color = Color.White)){
            Image(
                contentDescription = "",
                modifier = Modifier.align(Alignment.TopEnd).offset(0.dp, 30.dp),
                painter = painterResource(R.drawable.shape)
            )
            Text(
                text = "Пропустить",
                color = colorResource(R.color.text3),
                style = TextStyle(fontSize = 20.sp),
                modifier = Modifier.align(Alignment.TopStart).offset(30.dp, 30.dp)
                    .clickable {
                        val intent = Intent(applicationContext, SecondScreen::class.java)
                        startActivity(intent)
                    }
            )
            Text(
                text = "Уведомления",
                modifier = Modifier.align(Alignment.Center).offset(0.dp, -120.dp),
                color = colorResource(R.color.text),
                style = TextStyle(fontSize = 24.sp)
            )
            Text(
                text = "Вы быстро узнаете о результатах",
                modifier = Modifier.align(Alignment.Center).offset(0.dp, -60.dp),
                color = colorResource(R.color.text2),
                style = TextStyle(fontSize = 14.sp)
            )
            Image(
                contentDescription = "",
                modifier = Modifier.align(Alignment.BottomCenter).offset(0.dp, -90.dp),
                painter = painterResource(R.drawable.second)
            )
        }
    }

    @Composable
    fun Screen3() {
        Box(modifier = Modifier.fillMaxSize().background(color = Color.White)){
            Image(
                contentDescription = "",
                modifier = Modifier.align(Alignment.TopEnd).offset(0.dp, 30.dp),
                painter = painterResource(R.drawable.shape)
            )
            Text(
                text = "Завершить",
                color = colorResource(R.color.text3),
                style = TextStyle(fontSize = 20.sp),
                modifier = Modifier.align(Alignment.TopStart).offset(30.dp, 30.dp)
                    .clickable {
                        val intent = Intent(applicationContext, SecondScreen::class.java)
                        startActivity(intent)
                    }
            )
            Text(
                text = "Мониторинг",
                modifier = Modifier.align(Alignment.Center).offset(0.dp, -120.dp),
                color = colorResource(R.color.text),
                style = TextStyle(fontSize = 24.sp)
            )
            Text(
                text = "Наши врачи всегда наблюдают\nза вашими показателями здоровья",
                modifier = Modifier.align(Alignment.Center).offset(0.dp, -60.dp),
                color = colorResource(R.color.text2),
                style = TextStyle(fontSize = 14.sp, textAlign = TextAlign.Center)
            )
            Image(
                contentDescription = "",
                modifier = Modifier.align(Alignment.BottomCenter).offset(0.dp, -90.dp),
                painter = painterResource(R.drawable.third)
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

