package com.SosDeveloper.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.sharp.ExitToApp
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.SosDeveloper.myapplication.ui.theme.Purple500


@Composable
fun HeelsPage(navController: NavHostController) {
    val colored = Purple500

    Column {
            Image(painter = painterResource(id = R.drawable.rr4),
                contentDescription = "background",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxHeight().fillMaxWidth()
                    .clip(RoundedCornerShape(1.dp))
            )
        }
    Column {
        TopAppBar(backgroundColor = colored) {
            Column (modifier = Modifier.padding(start = 170.dp)){
                IconButton(onClick = { navController.navigate("Dashboard") }) {
                    Icon(Icons.Sharp.ExitToApp, contentDescription = "Back To Home",
                        tint = Color.White
                    )
                }
                Text("Back To Home", fontSize = 10.sp, color = Color.White)
            }
        }

        Column(modifier = Modifier.padding(start = 20.dp,top = 20.dp)) {

            Row {
                Text("Women's Heels",
                    fontSize = 17.sp,
                    modifier = Modifier.padding(start = 5.dp)

                )
                Divider(modifier = Modifier
                    .width(300.dp)
                    .padding(top = 10.dp, start = 10.dp), color = Color.LightGray)
            }
            Text(text = "They are also known as high heels, " +
                    "are a type of shoe with an angled sole. " +
                    "The heel in such shoes is raised above the ball of the foot. " +
                    "High heels cause the legs to appear longer, " +
                    "make the wearer appear taller, and accentuate the calf muscle",
                fontSize = 10.sp,
                modifier = Modifier.padding(start = 4.dp)
            )
            LazyVerticalGrid(columns = GridCells.Adaptive(90.dp),
                horizontalArrangement = Arrangement.spacedBy(15.dp),
                verticalArrangement = Arrangement.spacedBy(15.dp),
                modifier = Modifier.padding(start = 5.dp, top = 8.dp),
                content = {
                    item {
                        Box(Modifier.padding(end = 1.dp)) {
                            Column {
                                Image(painter = painterResource(id = R.drawable.h1),
                                    contentDescription = "High Heels",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .size(100.dp)
                                        .clip(RoundedCornerShape(5.dp))
                                )
                                Text(text = "High Heels",
                                    modifier = Modifier.padding(start = 2.dp))
                                Text(text = "$33", modifier = Modifier.padding(start = 30.dp))
                            }
                        }

                    }
                    item {
                        Box(Modifier.padding(end = 9.dp)) {
                            Column {
                                Image(painter = painterResource(id = R.drawable.h2),
                                    contentDescription = "High Heels",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .size(100.dp)
                                        .clip(RoundedCornerShape(5.dp)))
                                Text(text = "High Heels",
                                    modifier = Modifier.padding(start = 2.dp))
                                Text(text = "$20", modifier = Modifier.padding(start = 30.dp))
                            }
                        }

                    }
                    item {
                        Box(Modifier.padding(end = 1.dp)) {
                            Column {
                                Image(painter = painterResource(id = R.drawable.h3),
                                    contentDescription = "High Heels",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .size(100.dp)
                                        .clip(RoundedCornerShape(5.dp)))
                                Text(text = "High Heels",
                                    modifier = Modifier.padding(start = 1.dp))
                                Text(text = "$40", modifier = Modifier.padding(start = 30.dp))
                            }
                        }

                    }

                    item {
                        Box(Modifier.padding(end = 1.dp)) {
                            Column {
                                Image(painter = painterResource(id = R.drawable.h4),
                                    contentDescription = "High Heels",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .size(100.dp)
                                        .clip(RoundedCornerShape(5.dp)))
                                Text(text = "High Heels",
                                    modifier = Modifier.padding(start = 3.dp))
                                Text(text = "$36", modifier = Modifier.padding(start = 30.dp))
                            }
                        }

                    }

                    item {
                        Box(Modifier.padding(end = 1.dp)) {
                            Column {
                                Image(painter = painterResource(id = R.drawable.h5),
                                    contentDescription = "High Heels",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .size(100.dp)
                                        .clip(RoundedCornerShape(5.dp)))
                                Text(text = "High Heels",
                                    modifier = Modifier.padding(start = 3.dp))
                                Text(text = "$22", modifier = Modifier.padding(start = 30.dp))
                            }
                        }

                    }

                    item {
                        Box(Modifier.padding(end = 1.dp)) {
                            Column {
                                Image(painter = painterResource(id = R.drawable.h6),
                                    contentDescription = "High Heels",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .size(100.dp)
                                        .clip(RoundedCornerShape(5.dp)))
                                Text(text = "High Heels",
                                    modifier = Modifier.padding(start = 3.dp))
                                Text(text = "$28", modifier = Modifier.padding(start = 30.dp))
                            }
                        }

                    }

                    item {
                        Box(Modifier.padding(end = 1.dp)) {
                            Column {
                                Image(painter = painterResource(id = R.drawable.h7),
                                    contentDescription = "High Heels",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .size(100.dp)
                                        .clip(RoundedCornerShape(5.dp)))
                                Text(text = "High Heels",
                                    modifier = Modifier.padding(start = 3.dp))
                                Text(text = "$39", modifier = Modifier.padding(start = 30.dp))
                            }
                        }

                    }

                    item {
                        Box(Modifier.padding(end = 1.dp)) {
                            Column {
                                Image(painter = painterResource(id = R.drawable.h8),
                                    contentDescription = "High Heels",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .size(100.dp)
                                        .clip(RoundedCornerShape(5.dp)))
                                Text(text = "High Heels",
                                    modifier = Modifier.padding(start = 3.dp))
                                Text(text = "$44", modifier = Modifier.padding(start = 30.dp))
                            }
                        }

                    }


                    item {
                        Box(Modifier.padding(end = 1.dp)) {
                            Column {
                                Image(painter = painterResource(id = R.drawable.h9),
                                    contentDescription = "High Heels",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .size(100.dp)
                                        .clip(RoundedCornerShape(5.dp)))
                                Text(text = "High Heels",
                                    modifier = Modifier.padding(start = 3.dp))
                                Text(text = "$44", modifier = Modifier.padding(start = 30.dp))
                            }
                        }

                    }


                    item {
                        Box(Modifier.padding(end = 1.dp)) {
                            Column {
                                Image(painter = painterResource(id = R.drawable.h10),
                                    contentDescription = "High Heels",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .size(100.dp)
                                        .clip(RoundedCornerShape(5.dp)))
                                Text(text = "High Heels",
                                    modifier = Modifier.padding(start = 3.dp))
                                Text(text = "$44", modifier = Modifier.padding(start = 30.dp))
                            }
                        }

                    }


                    item {
                        Box(Modifier.padding(end = 1.dp)) {
                            Column {
                                Image(painter = painterResource(id = R.drawable.h11),
                                    contentDescription = "High Heels",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .size(100.dp)
                                        .clip(RoundedCornerShape(5.dp)))
                                Text(text = "High Heels",
                                    modifier = Modifier.padding(start = 3.dp))
                                Text(text = "$44", modifier = Modifier.padding(start = 30.dp))
                            }
                        }

                    }



                    item {
                        Box(Modifier.padding(end = 1.dp)) {
                            Column {
                                Image(painter = painterResource(id = R.drawable.h12),
                                    contentDescription = "High Heels",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .size(100.dp)
                                        .clip(RoundedCornerShape(5.dp)))
                                Text(text = "High Heels",
                                    modifier = Modifier.padding(start = 3.dp))
                                Text(text = "$44", modifier = Modifier.padding(start = 30.dp))
                            }
                        }

                    }




                    item {
                        Box(Modifier.padding(end = 1.dp)) {
                            Column {
                                Image(painter = painterResource(id = R.drawable.h13),
                                    contentDescription = "High Heels",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .size(100.dp)
                                        .clip(RoundedCornerShape(5.dp)))
                                Text(text = "High Heels",
                                    modifier = Modifier.padding(start = 3.dp))
                                Text(text = "$44", modifier = Modifier.padding(start = 30.dp))
                            }
                        }

                    }


                    item {
                        Box(Modifier.padding(end = 1.dp)) {
                            Column {
                                Image(painter = painterResource(id = R.drawable.h14),
                                    contentDescription = "High Heels",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .size(100.dp)
                                        .clip(RoundedCornerShape(5.dp)))
                                Text(text = "High Heels",
                                    modifier = Modifier.padding(start = 3.dp))
                                Text(text = "$44", modifier = Modifier.padding(start = 30.dp))
                            }
                        }

                    }


                    item {
                        Box(Modifier.padding(end = 1.dp)) {
                            Column {
                                Image(painter = painterResource(id = R.drawable.h15),
                                    contentDescription = "High Heels",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .size(100.dp)
                                        .clip(RoundedCornerShape(5.dp)))
                                Text(text = "High Heels",
                                    modifier = Modifier.padding(start = 3.dp))
                                Text(text = "$44", modifier = Modifier.padding(start = 30.dp))
                            }
                        }

                    }















                }
            )
        }
    }
}

@Preview
@Composable
fun PreviewHeels(){
    HeelsPage(navController = rememberNavController())
}