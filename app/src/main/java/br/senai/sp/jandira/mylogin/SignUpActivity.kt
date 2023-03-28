package br.senai.sp.jandira.mylogin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.mylogin.components.BottomShape
import br.senai.sp.jandira.mylogin.components.TopShape
import br.senai.sp.jandira.mylogin.ui.theme.MyLoginTheme
import androidx.compose.material.CheckboxColors as CheckboxColors

class SignUpActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyLoginTheme {
                LoginRegister()
            }
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun LoginRegister() {
    Surface(
        modifier = Modifier.fillMaxSize(),
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            //Header
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                TopShape()
            }

            Spacer(modifier = Modifier.height(10.dp))

            //Form
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(17.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            )
            {
                Text(
                    text = stringResource(id = R.string.sign_up),
                    color = colorResource(id = R.color.pink_login),
                    fontSize = 32.sp,
                    fontWeight = FontWeight.W700
                )
                Text(
                    text = stringResource(id = R.string.create_new),
                    color = Color.Gray,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.W400
                )
                //

                Box(
                    modifier = Modifier.size(100.dp),
                    contentAlignment = Alignment.BottomEnd
                ){
                    Card(
                        modifier = Modifier
                            .size(100.dp)
                            .align(Alignment.Center),
                        shape = CircleShape,
                        border = BorderStroke(
                            width = 2.dp,
                            Brush.horizontalGradient(
                                listOf(
                                    colorResource(id = R.color.pink_login),
                                    Color.White
                                )
                            )
                        )
                    ) {
                        Image(
                            painter = painterResource(
                                id = R.drawable.baseline_person_24
                            ),
                            contentDescription = "",
                            colorFilter = ColorFilter.tint(colorResource(id = R.color.pink_login)),
                            modifier = Modifier.size(64.dp)
                        )
                    }
                    Image(
                        painter = painterResource(
                            id = R.drawable.camera
                        ),
                        contentDescription = "",
                        modifier = Modifier
                            .align(alignment = Alignment.BottomEnd)
                            .offset(x = 5.dp, y = 5.dp)
                            .size(28.dp),
                    )
//                    Card(
//                        modifier = Modifier
//                            .size(50.dp)
//                            .align(alignment = Alignment.BottomEnd)
//                            .offset(x = 15.dp),
//                        shape = CircleShape,
//                        backgroundColor = Color.Red
//                    ) {
//                        Icon(
//                            //imageVector = Icons.Default.Call,
//                            painter = painterResource(
//                                id = R.drawable.baseline_photo_camera_24
//                            ),
//                            contentDescription = "",
//                            modifier = Modifier.size(28.dp)
//                        )
//                    }

                }
                Spacer(modifier = Modifier.height(25.dp))

                OutlinedTextField(
                    value = "Susanna Hoffs",
                    onValueChange = {},
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    label = {
                        Text(
                            text = stringResource(id = R.string.username)
                        )
                    },
                    leadingIcon = {
                        Icon(
                            painter = painterResource(
                                id = R.drawable.baseline_person_24
                            ),
                            contentDescription = "",
                            tint = colorResource(id = R.color.pink_login)
                        )
                    }
                )

                Spacer(modifier = Modifier.height(21.dp))

                OutlinedTextField(
                    value = "99999-0987",
                    onValueChange = {},
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    label = {
                        Text(
                            text = stringResource(id = R.string.phone)
                        )
                    },
                    leadingIcon = {
                        Icon(
                            painter = painterResource(
                                id = R.drawable.baseline_phone_iphone_24
                            ),
                            contentDescription = "",
                            tint = colorResource(id = R.color.pink_login)
                        )
                    }
                )

                Spacer(modifier = Modifier.height(21.dp))

                OutlinedTextField(
                    value = "susanna@email.com ",
                    onValueChange = {},
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    label = {
                        Text(
                            text = stringResource(id = R.string.email)
                        )
                    },
                    leadingIcon = {
                        Icon(
                            painter = painterResource(
                                id = R.drawable.baseline_email_24
                            ),
                            contentDescription = "",
                            tint = colorResource(id = R.color.pink_login)
                        )
                    }
                )

                Spacer(modifier = Modifier.height(21.dp))

                OutlinedTextField(
                    value = "************",
                    onValueChange = {},
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    label = {
                        Text(
                            text = stringResource(id = R.string.password)
                        )
                    },
                    leadingIcon = {
                        Icon(
                            painter = painterResource(
                                id = R.drawable.baseline_lock_24
                            ),
                            contentDescription = "",
                            tint = colorResource(id = R.color.pink_login)
                        )
                    }
                )

                Spacer(modifier = Modifier.height(21.dp))
                
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.Start
                ) {
                    Row() {
                       Checkbox(
                           checked = false,
                           onCheckedChange = {}
                       )
                        Row(Modifier.padding(top = 14.dp)) {
                            Text(
                                text = stringResource(id = R.string.over_18)
                            )
                        }
                    }

                }

                Spacer(modifier = Modifier.height(23.dp))

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Button(
                        onClick = { /*TODO*/ },
                        shape = RoundedCornerShape(16.dp),
                        colors = ButtonDefaults.buttonColors(colorResource(id = R.color.pink_login)),
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(48.dp)
                    )
                    {
                        Text(
                            text = stringResource(id = R.string.create_account).uppercase(),
                            color = Color.White
                        )
                    }
                }

                Spacer(modifier = Modifier.height(31.dp))

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.End
                ) {
                    Row() {
                        Text(
                            text = stringResource(id = R.string.already_have_account)
                        )
                        Row(
                            modifier = Modifier.padding(start = 3.dp)
                        ) {
                            Text(
                                text = stringResource(id = R.string.sign_in),
                                color = colorResource(id = R.color.pink_login)
                            )
                        }
                    }
                }
                //
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Start
            ) {
                BottomShape()
            }
        }

    }
}