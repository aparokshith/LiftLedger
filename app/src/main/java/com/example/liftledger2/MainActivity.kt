package com.example.liftledger2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.liftledger2.ui.theme.LiftLedger2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LiftLedger2Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    greetingImage("World",modifier = Modifier.padding(16.dp))

                }

            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Row(modifier = Modifier) {
    Column (modifier = Modifier.padding(start = 16.dp)){
        Text(
            text = "Hello $name!",
            modifier = modifier
                .padding(16.dp)
                .align(androidx.compose.ui.Alignment.CenterHorizontally),
            fontSize = 24.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = "Good morning $name!",
            modifier = modifier
                .padding(16.dp)
                .align(androidx.compose.ui.Alignment.CenterHorizontally)
        )
    }
    Column(modifier = Modifier.padding(top = 50.dp)) {
        Text(
            text = "Hello $name!",
            modifier = modifier

                .align(androidx.compose.ui.Alignment.CenterHorizontally),
            fontSize = 24.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = "Good morning $name!",
            modifier = modifier
                .align(androidx.compose.ui.Alignment.CenterHorizontally)
        )

    }
        }

}
@Composable
fun greetingImage(name: String, modifier: Modifier = Modifier){
    val image = painterResource(id = R.drawable.androidparty)
    Box(modifier = modifier) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = modifier,
            contentScale = ContentScale.Crop,
            alpha = 0.5F
        )
        Greeting(name = name)
    }

}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LiftLedger2Theme {
        greetingImage("World")
    }

}

