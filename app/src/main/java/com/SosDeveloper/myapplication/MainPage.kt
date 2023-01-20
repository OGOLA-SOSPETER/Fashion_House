package com.SosDeveloper.myapplication

import android.content.Intent
import android.net.Uri
import android.widget.ImageButton
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun MainPage(navController: NavHostController){

    Column() {
        Image(painter = painterResource(id = R.drawable.kk),
            contentDescription = "Background Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
                .clip(RoundedCornerShape(10.dp))

        )
    }
var mainMenu by remember{ mutableStateOf(false) }
    val context  = LocalContext.current
    Column(Modifier.padding(10.dp)) {
        TopAppBar(backgroundColor = Color.White) {
            IconButton(onClick = { mainMenu = !mainMenu }) {
                Icon(Icons.Filled.Menu, contentDescription = "Menu Icon", tint = Color.Blue)
            }
            Text(text = "FashionRoom",
                fontFamily = FontFamily.Serif,
                fontSize = 16.sp,
                color = Color.Blue,
                modifier = Modifier.padding(start = 20.dp, end = 20.dp)
            )
            IconButton(onClick = { navController.navigate("settings") }) {
                Icon(
                    Icons.Filled.Settings,
                    contentDescription = "App Settings",
                    tint = Color.Blue,
                    modifier = Modifier
                        .size(20.dp)

                )
            }
       
            val intent = remember {
                Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.jumia.co.ke/catalog/?q=men+official+clothes"))
            }
            IconButton(onClick = { context.startActivity(intent) }) {
                Image(
                    painter = painterResource(id = R.drawable.w),
                    contentDescription = "Webpage",
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .size(20.dp)
                        .clip(CircleShape)

                )
            }

            IconButton(onClick = { navController.navigate("Login") }) {
                Icon(Icons.Default.ArrowForward,
                    contentDescription = "Back to Login",
                    tint = Color.Blue,
                    modifier = Modifier
                        .padding(start = 30.dp)
                )
            }
            DropdownMenu(expanded = mainMenu,
                onDismissRequest = { mainMenu = !mainMenu }) {
                DropdownMenuItem(onClick = {  }) {
                    ClickableText(text = AnnotatedString("Men Wear"),
                        onClick = {
                            run { navController.navigate("") }
                            Toast.makeText(context, "Coming Soon", Toast.LENGTH_LONG).show()
                        })
                }


                DropdownMenuItem(onClick = { navController.navigate("") }) {
                    ClickableText(text = AnnotatedString("Women Parlour"),
                        onClick = {
                            Toast.makeText(context, "Coming Soon", Toast.LENGTH_LONG).show()
                        })
                }

                DropdownMenuItem(onClick = {  }) {
                    ClickableText(text = AnnotatedString("Children Wear"),
                        onClick = {
                            run { navController.navigate("trousers") }
                            Toast.makeText(context, "Trousers😀😀😘", Toast.LENGTH_LONG).show()
                        })
                }



                DropdownMenuItem(onClick = {
                    navController.navigate("settings")
                }) {
                    ClickableText(text = AnnotatedString("Settings"),
                        onClick = {
                            Toast.makeText(context, "Coming Soon", Toast.LENGTH_LONG).show()
                        })
                }
            }
        }
        LazyRow(
            content = {
                item {
                    Button(
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = Color.LightGray,
                            contentColor = Color.Blue),
                        onClick = {
                            run { navController.navigate("briefcases") }
                            Toast.makeText(context, "Under Development😄😃", Toast.LENGTH_LONG)
                                .show()

                        },
                        modifier = Modifier.clip(RoundedCornerShape(10.dp))

                    ) {
                        Text(
                            text = "SuitCases",
                            fontSize = 12.sp,
                        )
                    }
                }

                item {
                    Button(
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = Color.LightGray,
                            contentColor = Color.Blue),
                        onClick = {
                            run { navController.navigate("Trousers") }
                            Toast.makeText(context, "Trousers😀😀😘", Toast.LENGTH_LONG).show()

                        },
                        modifier = Modifier.clip(RoundedCornerShape(10.dp))
                    ) {
                        Text(
                            text = "Trousers",
                            fontSize = 12.sp,
                        )
                    }
                }

                item {
                    Button(
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = Color.LightGray,
                            contentColor = Color.Blue),
                        onClick = { navController.navigate("suits") },
                        modifier = Modifier.clip(RoundedCornerShape(10.dp))
                    ) {
                        Text(
                            text = "Suits",
                            fontSize = 12.sp,
                        )
                    }
                }

                item {
                    Button(
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = Color.LightGray,
                            contentColor = Color.Blue),
                        onClick = { navController.navigate("footwear") },
                        modifier = Modifier.clip(RoundedCornerShape(10.dp))
                    ) {
                        Text(
                            text = "Socks",
                            fontSize = 12.sp,
                        )
                    }
                }

                item {
                    Button(
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = Color.LightGray,
                            contentColor = Color.Blue),
                        onClick = { navController.navigate("shoes") },
                        modifier = Modifier.clip(RoundedCornerShape(10.dp))
                    ) {
                        Text(
                            text = "Shoes",
                            fontSize = 12.sp,
                        )
                    }
                }

                item {
                    Button(
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = Color.LightGray,
                            contentColor = Color.Blue),
                        onClick = { navController.navigate("heels") },
                        modifier = Modifier.clip(RoundedCornerShape(10.dp))
                    ) {
                        Text(
                            text = "WomenWear\nHeels",
                            fontSize = 12.sp,
                        )
                    }
                }
                item {
                    Button(
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = Color.LightGray,
                            contentColor = Color.Blue),
                        onClick = { navController.navigate("handbag") },
                        modifier = Modifier.clip(RoundedCornerShape(10.dp))
                    ) {
                        Text(
                            text = "Handbags",
                            fontSize = 12.sp,
                        )
                    }
                }

                item {
                    Button(
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = Color.LightGray,
                            contentColor = Color.Blue),
                        onClick = { navController.navigate("belt") },
                        modifier = Modifier.clip(RoundedCornerShape(10.dp))
                    ) {
                        Text(
                            text = "Belts",
                            fontSize = 12.sp,
                        )
                    }
                }

                item {
                    Button(
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = Color.LightGray,
                            contentColor = Color.Blue),
                        onClick = { navController.navigate("bedding") },
                        modifier = Modifier.clip(RoundedCornerShape(10.dp))
                    ) {
                        Text(
                            text = "Bedding",
                            fontSize = 12.sp,
                        )
                    }
                }

            },
            horizontalArrangement = Arrangement.spacedBy(7.dp)
        )
        MainPageGrid(navController = rememberNavController())
        Wardrobe()
    }
}

@Preview
@Composable
fun MainPagePreview(){
    MainPage(navController = rememberNavController())
}