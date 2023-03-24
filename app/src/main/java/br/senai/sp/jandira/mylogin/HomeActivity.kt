package br.senai.sp.jandira.mylogin

import android.os.Bundle
import android.security.AttestedKeyPair
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.mylogin.dao.repository.ProductRepository
import br.senai.sp.jandira.mylogin.model.Product
import br.senai.sp.jandira.mylogin.ui.theme.MyLoginTheme

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyLoginTheme {
                Home(ProductRepository.getProductList())
            }
        }
    }
}

//@Preview(showSystemUi = true, showBackground = true)

@Composable
fun Home(products: List<Product>) {
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
                                //verificar essa borda
                                .border(BorderStroke(4.dp, Color.White))
                        )
                        Text(
                            text = "Susanna Hoffs",
                            color = Color.White,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.W400
                        )
                    }
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.Start
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                painter = painterResource(id = R.drawable.baseline_location_on_24),
                                contentDescription = "",
                                tint = Color.White
                            )
                            Text(
                                text = "You're in Paris",
                                modifier = Modifier
                                    .padding(start = 3.dp),
                                color = Color.White,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.W400
                            )
                        }
                        Column(modifier = Modifier.padding(start = 24.dp)) {
                            Text(
                                text = "My Trips",
                                color = Color.White,
                                fontSize = 24.sp,
                                fontWeight = FontWeight.W700
                            )
                        }

                    }
                }

            }
            Spacer(modifier = Modifier.height(5.dp))
            Surface(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                Column(
                    modifier = Modifier
                    .fillMaxSize()
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(100.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column() {
                            Text(
                                text = "Categories:",
                                modifier = Modifier
                                    .padding(start = 17.dp)
                            )
                            Spacer(modifier = Modifier.height(7.dp))
                            LazyRow(
                                modifier = Modifier
                                    .padding(start = 19.dp)
                            ) {
                                items(products) { product ->
                                    Card(
                                        modifier = Modifier
                                            .width(109.dp)
                                            .height(64.dp),
                                        backgroundColor = colorResource(id = R.color.pink_login)

                                    ) {
                                        Column(
                                            modifier = Modifier.fillMaxSize(),
                                            verticalArrangement = Arrangement.Center,
                                            horizontalAlignment = Alignment.CenterHorizontally
                                        ) {
                                            Icon(
                                                painter = product.image
                                                    ?: painterResource(id = R.drawable.baseline_lock_24),
                                                contentDescription = "",
                                                tint = Color.White
                                            )
                                            Text(
                                                text = product.name,
                                                color = Color.White
                                            )
                                        }
                                    }
                                    Spacer(modifier = Modifier.width(8.dp))
                                }
                            }

                        }
                    }
                    //
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(80.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        OutlinedTextField(
                            value = "",
                            onValueChange = {},
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(
                                    start = 16.dp,
                                    end = 17.dp
                                ),
                            shape = RoundedCornerShape(16.dp),
                            label = {
                                Text(text = "Search your destinity")
                            },
                            leadingIcon = {
                                Icon(
                                    painter = painterResource(
                                        id = R.drawable.baseline_search_24
                                    ),
                                    contentDescription = "",
                                    tint = Color.Gray
                                )
                            }


                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    MyLoginTheme {
        Home(ProductRepository.getProductList())
    }
}

