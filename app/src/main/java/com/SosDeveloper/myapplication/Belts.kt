package com.SosDeveloper.myapplication

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Home
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
fun ScaffoldDemo(navController: NavHostController) {
    val materialBlue700= Color(0xFF1976D2)
    val scaffoldState = rememberScaffoldState(rememberDrawerState(DrawerValue.Open))
    Scaffold(
        scaffoldState = scaffoldState,
        topBar = { TopAppBar(title = {
            IconButton(onClick = { navController.navigate("Dashboard") }) {
                Icon(Icons.Default.ArrowBack,
                    contentDescription = "Back to homepage",
                    tint = Color.White)
            }
            Text(
                text = "Men's Waist Belt",
                fontSize = 14.sp,
                color = Color.White,
                modifier = Modifier.padding(start = 50.dp, end = 140.dp)

            ) }, elevation = 7.dp,backgroundColor = materialBlue700)  },
        floatingActionButtonPosition = FabPosition.End,
        floatingActionButton = { FloatingActionButton(onClick = {}){
            Icon(
                Icons.Filled.Add, contentDescription = "Add Page",
                tint = Color.White
            )
        } },

        content = {Modifier.padding(top = 34.dp)
            BeltPage(navController = rememberNavController())
             },

    )
}
@Composable
fun BeltPage(navController: NavHostController){
    Column {
        Image(painter = painterResource(id = R.drawable.rr1),
            contentDescription = "background",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
                .clip(RoundedCornerShape(1.dp))
        )
    }
    Column {
        LazyVerticalGrid(modifier = Modifier.padding(start = 20.dp), columns = GridCells.Adaptive(100.dp), content =
        {
            item {
                Box {
                    Column {
                        Image(painter = painterResource(id = R.drawable.b1),
                            contentDescription = "Belt",
                            Modifier.size(80.dp)
                        )

                        Text(text = "Belt")
                        Text(text = "$42")
                    }
                }
            }


            item {
                Box {
                    Column {
                        Image(painter = painterResource(id = R.drawable.b2),
                            contentDescription = "Belt",
                            Modifier.size(80.dp)
                        )

                        Text(text = "Belt")
                        Text(text = "$30")
                    }
                }
            }


            item {
                Box {
                    Column {
                        Image(painter = painterResource(id = R.drawable.b3),
                            contentDescription = "Belt",
                            Modifier.size(80.dp)
                        )

                        Text(text = "Belt")
                        Text(text = "$27")
                    }
                }
            }

            item {
                Box {
                    Column {
                        Image(painter = painterResource(id = R.drawable.b4),
                            contentDescription = "Belt",
                            Modifier.size(80.dp)
                        )

                        Text(text = "Belt")
                        Text(text = "$29")
                    }
                }
            }

            item {
                Box {
                    Column {
                        Image(painter = painterResource(id = R.drawable.b5),
                            contentDescription = "Belt",
                            Modifier.size(80.dp)
                        )

                        Text(text = "Belt")
                        Text(text = "$39")
                    }
                }
            }


            item {
                Box {
                    Column {
                        Image(painter = painterResource(id = R.drawable.b6),
                            contentDescription = "Belt",
                            Modifier.size(80.dp)
                        )

                        Text(text = "Belt")
                        Text(text = "$38")
                    }
                }
            }



            item {
                Box {
                    Column {
                        Image(painter = painterResource(id = R.drawable.b7),
                            contentDescription = "Belt",
                            Modifier.size(80.dp)
                        )

                        Text(text = "Belt")
                        Text(text = "$37")
                    }
                }
            }



            item {
                Box {
                    Column {
                        Image(painter = painterResource(id = R.drawable.b8),
                            contentDescription = "Belt",
                            Modifier.size(80.dp)
                        )

                        Text(text = "Belt")
                        Text(text = "$30")
                    }
                }
            }

            item {
                Box {
                    Column {
                        Image(painter = painterResource(id = R.drawable.b9),
                            contentDescription = "Belt",
                            Modifier.size(80.dp)
                        )

                        Text(text = "Belt")
                        Text(text = "$23")
                    }
                }
            }


            item {
                Box {
                    Column {
                        Image(painter = painterResource(id = R.drawable.b10),
                            contentDescription = "Belt",
                            Modifier.size(80.dp)
                        )

                        Text(text = "Belt")
                        Text(text = "$16")
                    }
                }
            }


            item {
                Box {
                    Column {
                        Image(painter = painterResource(id = R.drawable.b11),
                            contentDescription = "Belt",
                            Modifier.size(80.dp)
                        )

                        Text(text = "Belt")
                        Text(text = "$22")
                    }
                }
            }


            item {
                Box {
                    Column {
                        Image(painter = painterResource(id = R.drawable.b12),
                            contentDescription = "Belt",
                            Modifier.size(80.dp)
                        )

                        Text(text = "Belt")
                        Text(text = "$22")
                    }
                }
            }

            item {
                Box {
                    Column {
                        Image(painter = painterResource(id = R.drawable.b13),
                            contentDescription = "Belt",
                            Modifier.size(80.dp)
                        )

                        Text(text = "Belt")
                        Text(text = "$23")
                    }
                }
            }

            item {
                Box {
                    Column {
                        Image(painter = painterResource(id = R.drawable.b14),
                            contentDescription = "Belt",
                            Modifier.size(80.dp)
                        )

                        Text(text = "Belt")
                        Text(text = "$21")
                    }
                }
            }

            item {
                Box {
                    Column {
                        Image(painter = painterResource(id = R.drawable.b15),
                            contentDescription = "Belt",
                            Modifier.size(80.dp)
                        )

                        Text(text = "Belt")
                        Text(text = "$21")
                    }
                }
            }

            item {
                Box {
                    Column {
                        Image(painter = painterResource(id = R.drawable.b16),
                            contentDescription = "Belt",
                            Modifier.size(80.dp)
                        )

                        Text(text = "Belt")
                        Text(text = "$19")
                    }
                }
            }

            item {
                Box {
                    Column {
                        Image(painter = painterResource(id = R.drawable.b17),
                            contentDescription = "Belt",
                            Modifier.size(80.dp)
                        )

                        Text(text = "Belt")
                        Text(text = "$18")
                    }
                }
            }

            item {
                Box {
                    Column {
                        Image(painter = painterResource(id = R.drawable.b18),
                            contentDescription = "Belt",
                            Modifier.size(80.dp)
                        )

                        Text(text = "Belt")
                        Text(text = "$16")
                    }
                }
            }

            item {
                Box {
                    Column {
                        Image(painter = painterResource(id = R.drawable.b19),
                            contentDescription = "Belt",
                            Modifier.size(80.dp)
                        )

                        Text(text = "Belt")
                        Text(text = "$23")
                    }
                }
            }

            item {
                Box {
                    Column {
                        Image(painter = painterResource(id = R.drawable.b20),
                            contentDescription = "Belt",
                            Modifier.size(80.dp)
                        )

                        Text(text = "Belt")
                        Text(text = "$20")
                    }
                }
            }


        })

    }
}

@Preview
@Composable
fun Review(){
    ScaffoldDemo(navController = rememberNavController())
}


