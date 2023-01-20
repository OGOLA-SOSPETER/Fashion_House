package com.SosDeveloper.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun AboutApp(navController: NavHostController) {
    Column {


        Column(
            //modifier = Modifier.background(color = Color.Blue),
            verticalArrangement = Arrangement.Center
        ) {


            TopAppBar(backgroundColor = Color.White) {
                Text(
                    text = "About Developer",
                    color = Color.Blue,
                    modifier = Modifier.padding(start = 90.dp,end = 50.dp)

                )
                IconButton(onClick = { navController.navigate("Dashboard") }) {
                    Icon(Icons.Filled.ArrowForward, "BackIcon", tint = Color.Blue)
                }
            }


            val myImage = painterResource(id = R.drawable.alx)
            Box {

                Column(modifier = Modifier) {

                    Row(modifier = Modifier.padding(top = 3.dp, start = 140.dp)) {
                        Image(
                            painter = myImage,
                            contentDescription = "Developer's image",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clip(CircleShape)
                                .height(50.dp)
                                .width(50.dp)
                        )
                    }

                }
            }
            Text(
                text = "Developer's Contact Information:",
                fontSize = 20.sp,
                textAlign = TextAlign.Center,
                color = Color.Black,
                modifier = Modifier.padding(start = 40.dp)
            )
            Divider(
                modifier = Modifier
                    .width(400.dp)
                    .padding(end = 10.dp), color = Color.LightGray
            )

            Box(modifier = Modifier.padding(top = 20.dp, bottom = 20.dp, start = 70.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.emails),
                    contentScale = ContentScale.Crop,
                    contentDescription = "Email link.",
                    modifier = Modifier
                        .size(30.dp)
                        .clip(CircleShape)

                )
                Column(modifier = Modifier.padding(start = 50.dp, top = 5.dp)) {
                    ClickableText(
                        text = AnnotatedString("Reach Out to Us Via Email"),
                        onClick = { navController.navigate("Emails") },
                        style = androidx.compose.ui.text.TextStyle(
                            fontSize = 15.sp,

                            )

                    )
                }
            }
            Divider(
                modifier = Modifier
                    .width(400.dp)
                    .padding(end = 10.dp), color = Color.LightGray
            )
            Box(modifier = Modifier.padding(top = 20.dp, bottom = 20.dp, start = 70.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.facebook),
                    contentDescription = "Facebook",
                    modifier = Modifier.size(25.dp)

                )
                Column(modifier = Modifier.padding(start = 50.dp, top = 3.dp)) {
                    ClickableText(
                        text = AnnotatedString("Get Us on FaceBook"),
                        onClick = { navController.navigate("FaceBook") },
                        style = androidx.compose.ui.text.TextStyle(
                            fontSize = 15.sp,

                            )

                    )
                }

            }
            Divider(
                modifier = Modifier
                    .width(400.dp)
                    .padding(end = 10.dp), color = Color.LightGray
            )

            Box(modifier = Modifier.padding(top = 20.dp, bottom = 20.dp, start =70.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.instagram),
                    contentDescription = "Instagram",
                    modifier = Modifier.size(30.dp)

                )
                Column(modifier = Modifier.padding(start = 50.dp, top = 3.dp)) {
                    ClickableText(
                        text = AnnotatedString("Follow us on Instagram"),
                        onClick = {},
                        style = androidx.compose.ui.text.TextStyle(
                            fontSize = 15.sp,

                            )

                    )
                }
            }
            Divider(
                modifier = Modifier
                    .width(400.dp)
                    .padding(end = 10.dp), color = Color.LightGray
            )

            Box(modifier = Modifier.padding(top = 20.dp, bottom = 20.dp, start = 70.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.whatsapp),
                    contentScale = ContentScale.Crop,
                    contentDescription = "WhatsApp",
                    modifier = Modifier
                        .size(40.dp)
                        .clip(CircleShape)

                )
                Column(modifier = Modifier.padding(start = 50.dp, top = 3.dp)) {
                    ClickableText(
                        text = AnnotatedString("Let's Chat on WhatsApp"),
                        onClick = {},
                        style = androidx.compose.ui.text.TextStyle(
                            fontSize = 15.sp,

                            )

                    )
                }
            }
            Divider(
                modifier = Modifier
                    .width(400.dp)
                    .padding(end = 10.dp), color = Color.LightGray
            )
            Box(modifier = Modifier.padding(top = 20.dp, bottom = 20.dp, start = 70.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.linkedin),
                    contentScale = ContentScale.Crop,
                    contentDescription = "linkedIn",
                    modifier = Modifier
                        .size(40.dp)
                        .clip(CircleShape)

                )
                Column(modifier = Modifier.padding(start = 50.dp, top = 3.dp)) {
                    ClickableText(
                        text = AnnotatedString("We're also on LinkedIn"),
                        onClick = {},
                        style = androidx.compose.ui.text.TextStyle(
                            fontSize = 15.sp,

                            )

                    )
                }
            }

            Divider(
                modifier = Modifier
                    .width(400.dp)
                    .padding(end = 10.dp), color = Color.LightGray
            )
        }
    }
}
@Preview
@Composable
fun Preview(){
    AboutApp(navController = rememberNavController())
}

