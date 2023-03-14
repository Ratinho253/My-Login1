package br.senai.sp.jandira.mylogin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
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
                    .height(210.dp)
            ) {
                Image(painter = painterResource(id = R.drawable.paris), contentDescription = "")
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(15.dp),
                    horizontalAlignment = Alignment.End
                ) {
                    Column() {
                        Image(
                            painter = painterResource(
                                id = R.drawable.susanna_profile
                            ),
                            contentDescription = "",
                            modifier = Modifier
                                .clip(
                                    RoundedCornerShape(
                                        280.dp
                                    )
                                )
                                .height(61.dp)
                        )
                        Text(text = "ihdivbdih")
                    }
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        verticalArrangement = Arrangement.Bottom
                    ) {
                        Row() {
                            Icon(
                                painter = painterResource(id = R.drawable.baseline_location_on_24),
                                contentDescription = ""

                            )
                            Text(text = "dvjnkjfdbvkjd")
                        }
                        Column() {
                            Text(text = "dvbksdvkjsbd")
                        }

                    }
                }

            }
        }
    }
}

