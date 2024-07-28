package com.example.taskmaneger

import android.os.Bundle
import androidx.compose.foundation.Image
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskmaneger.ui.theme.TaskManegerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TaskManegerTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    Task(
                        text1 = stringResource(R.string.text1_task),
                        text2 = stringResource(R.string.text2_task)
                    )
                }
            }
        }
    }
}

@Composable
fun Task(text1: String, text2: String) {
    val image = painterResource(R.drawable.ic_task_completed)
    Column(verticalArrangement = Arrangement.Center, modifier = Modifier) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
        )
        Text(
            text = text1,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(top = 24.dp, bottom = 8.dp)
                .align(alignment = Alignment.CenterHorizontally),
            textAlign = TextAlign.Center

        )
        Text(
            text = text2,
            fontSize = 16.sp,
            modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TaskManegerTheme {
        Task(text1 = stringResource(R.string.text1_task),
            text2 = stringResource(R.string.text2_task))
    }
}