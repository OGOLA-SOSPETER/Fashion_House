package com.SosDeveloper.myapplication

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.sharp.ArrowBack
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


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun HeelsPage(navController: NavHostController) {
    val materialBlue700= Color(0xFF1976D2)
    val scaffoldState = rememberScaffoldState(rememberDrawerState(DrawerValue.Open))
    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            TopAppBar(title = {
                    IconButton(onClick = { navController.navigate("Dashboard") }) {
                        Icon(Icons.Sharp.ArrowBack,
                            contentDescription = "Back To Home",
                            tint = Color.White
                        )
                    }
                    Text("Women FootWear",
                        fontSize = 15.sp, color = Color.White,
                        modifier = Modifier.offset(30.dp)

                    )

            }, elevation = 20.dp,backgroundColor = materialBlue700)  },
            content = {
                ManPage(navController = rememberNavController())
            }
    )
        }

    @Composable
    fun ManPage(navController: NavHostController) {
    Column {
            Image(painter = painterResource(id = R.drawable.rr4),
                contentDescription = "background",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(1.dp))
            )
        }
    Column {


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
                    "make the wearer appear taller, and accentuate the calf muscle.",
                fontSize = 14.sp,
                modifier = Modifier.padding(start = 4.dp,top = 5.dp,bottom = 5.dp)
            )
            LazyVerticalGrid(columns = GridCells.Fixed(2),
                horizontalArrangement = Arrangement.spacedBy(15.dp),
                verticalArrangement = Arrangement.spacedBy(15.dp),
                modifier = Modifier.padding(start = 5.dp, top = 8.dp),
                content = {
                    item {
                        Box(Modifier.padding(end = 1.dp)) {
                            Column {
                                Image(painter = painterResource(id = R.drawable.h1),
                                    contentDescription = " High heels",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .size(150.dp)
                                        .clip(RoundedCornerShape(9.dp))
                                )
                                Text(text = "Black High Heels with " +
                                        "pointed tips and heels\n" +
                                        " Mostly used for weddings and ceremonies\n" +
                                        "These shoes are won by adult ladies or" +
                                        "women." +
                                        "\nNot to be won by young girls",
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
                                        .size(150.dp)
                                        .clip(RoundedCornerShape(9.dp)))
                                Text(text = "Silk and BlackHigh Heels\n" +
                                        "Matches well with black dress and" +
                                        "a silk top." +
                                        "\nCan also fit well with a brown dress or a silk dress." +
                                        "\nNot suitable for tall women.",
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
                                        .size(150.dp)
                                        .clip(RoundedCornerShape(9.dp)))
                                Text(text = "Red High Raised Shoes\n" +
                                        "Clads well with red dresses and white tops.\n" +
                                        "Can be won with a black dress/ skirt too.",
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
                                        .size(150.dp)
                                        .clip(RoundedCornerShape(9.dp)))
                                Text(text = "Black Heels\n"+
                                    "Not suitable for tall ladies.",
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
                                        .size(150.dp)
                                        .clip(RoundedCornerShape(9.dp)))
                                Text(text = "Red High Heels with a Golden touch\n" +
                                        "The person wearing to choose the outfit that matches perfectly." +
                                        "\nMostly used for events.",
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
                                        .size(150.dp)
                                        .clip(RoundedCornerShape(9.dp)))
                                Text(text = "Brown Raised Shoes\n" +
                                        "Can be used for office wear." +
                                        "Also good for functions and events.",
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
                                        .size(150.dp)
                                        .clip(RoundedCornerShape(9.dp)))
                                Text(text = "Yellow High Heels\n" +
                                        "Walk with CAUTION!!!!",
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
                                        .size(150.dp)
                                        .clip(RoundedCornerShape(9.dp)))
                                Text(text = "Classic High Heels" +
                                        "\nA good wear.\n" +
                                        "Can be won by young ladies.",
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
                                        .size(150.dp)
                                        .clip(RoundedCornerShape(9.dp)))
                                Text(text = " Blue High Heels\n" +
                                        "Wear with care!!!",
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
                                        .clip(RoundedCornerShape(9.dp)))
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
                                        .size(150.dp)
                                        .clip(RoundedCornerShape(9.dp)))
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
                                        .size(150.dp)
                                        .clip(RoundedCornerShape(9.dp)))
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
                                        .size(150.dp)
                                        .clip(RoundedCornerShape(9.dp)))
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
                                        .clip(RoundedCornerShape(9.dp)))
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
                                        .size(150.dp)
                                        .clip(RoundedCornerShape(9.dp)))
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