package br.senai.sp.jandira.mylogin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.senai.sp.jandira.mylogin.ui.theme.MyLoginTheme

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyLoginTheme {
                Home()
            }
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun Home() {
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(220.dp)
            ) {
                Image(
                    painter = painterResource(
                        id = R.drawable.paris
                    ),
                    contentDescription = ""
                )
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(15.dp),
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.End
                    ) {
                        Image(
                            painter = painterResource(
                                id = R.drawable.susanna_profile
                            ),
                            contentDescription = "",
                            modifier = Modifier
                                .clip(
                                    RoundedCornerShape(280.dp)
                                )
                                .height(61.dp)
                        )
                        Text(
                            text = "Susanna Hoffs",
                            color = Color.White
                        )
                    }
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.Start
                    ) {
                        Row() {
                            Icon(
                                painter = painterResource(id = R.drawable.baseline_location_on_24),
                                contentDescription = "",
                                tint = Color.White
                            )
                            Text(
                                text = "You're in Paris",
                                modifier = Modifier
                                    .padding(start = 3.dp),
                                color = Color.White
                            )
                        }
                        Column() {
                            Text(
                                text = "My Trips",
                                color = Color.White
                            )
                        }

                    }
                }

            }
            Box(
                modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxSize()
                ) {
                    Row(modifier = Modifier
                        .width(109.dp)
                        .height(64.dp)
                        .background(Color.Black)
                    ) {
                        Column() {
                            Icon(
                                painter = painterResource(id = R.drawable.baseline_location_on_24),
                                contentDescription = "",
                                tint = Color.White
                            )
                            Text(
                                text = "Montain",
                                color = Color.White
                            )
                        }
                    }
                    Row(modifier = Modifier
                        .width(109.dp)
                        .height(64.dp)
                        .background(Color.Black)
                    ) {
                        Column() {
                            Icon(
                                painter = painterResource(id = R.drawable.baseline_location_on_24),
                                contentDescription = "",
                                tint = Color.White
                            )
                            Text(
                                text = "Snow",
                                color = Color.White
                            )
                        }
                    }
                }
            }
        }
    }
}

