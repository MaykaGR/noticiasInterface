package com.example.noticias

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.example.noticias.ui.theme.NoticiasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NoticiasTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.tertiary
                ) {
                    Interfaz()
                }
            }
        }
    }
}

@Composable
fun Interfaz() {
    Surface(color = Color.Transparent) {
        Row(
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth(4f)
        )
        {
            Text(
                text = "ELIGE RESULTADO",
                modifier = Modifier
                    .size(200.dp)
                    .fillMaxWidth(4f)
                    .fillMaxHeight(4f),
                color = Color.Black,
                textDecoration = TextDecoration.Underline,
                //fontSize =
            )
        }
        Row(
            modifier = Modifier.fillMaxHeight(2f),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        )
        {
            Column {
                Row {
                    Text(text = "")
                }
                Row {
                    Button(
                        onClick = { /*TODO*/ }, modifier = Modifier.border(
                            width = 5.dp,
                            color = Color.Green, shape = CircleShape
                        )
                    ) {
                        Text(text = "1")
                    }
                }
                Row {
                    Text(text = "Victoria")
                }
            }
            Column {
                Row {
                    Text(text = "\n\n\n\n\n")
                }
                Row {
                    Button(
                        onClick = {/*TODO*/ }, modifier = Modifier.border(
                            width = 5.dp,
                            color = Color.Gray, shape = CircleShape
                        )
                    ) {
                        Text(text = "X")
                    }
                }
                Row {
                    Text(text = "Empate")
                }
            }
            Column {
                Row {
                    Text(text = "")
                }
                Row {
                    Button(
                        onClick = {/*TODO*/ }, modifier = Modifier.border(
                            width = 5.dp,
                            color = Color.Magenta, shape = CircleShape
                        )
                    ) {
                        Text(text = "2")
                    }
                }
                Row {
                    Text(text = "Derrota")
                }
            }
        }
        Row(verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.SpaceEvenly){

        }
    }

}
