package com.SosDeveloper.myapplication


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
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
fun HandbagPage(navController: NavHostController){
    Column() {
        Image(painter = painterResource(id = R.drawable.kk),
            contentDescription = "Background Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxHeight()
                .fillMaxWidth()
                .clip(RoundedCornerShape(10.dp))

        )
    }
val colored = Purple500
    Column {
        TopAppBar(backgroundColor = colored) {
            Text(
                text = "BackPacks",
                fontSize = 14.sp,
                color = Color.White,
                modifier = Modifier.padding(start = 50.dp, end = 140.dp)

            )
            IconButton(onClick = { navController.navigate("Dashboard") }) {
                Icon(Icons.Default.ArrowForward,
                    contentDescription = "Back to homepage",
                    tint = Color.White)
            }
        }

        LazyVerticalGrid(modifier = Modifier.padding(start = 20.dp), columns = GridCells.Adaptive(100.dp), content =
        {
            item {
                Box {
                    Column {
                        Image(painter = painterResource(id = R.drawable.bg1),
                            contentDescription = "Handbag",
                            Modifier.size(80.dp)
                        )

                        Text(text = "Handbag")
                        Text(text = "$42")
                    }
                }
            }


            item {
                Box {
                    Column {
                        Image(painter = painterResource(id = R.drawable.bg2),
                            contentDescription = "Handbag",
                            Modifier.size(80.dp)
                        )

                        Text(text = "Handbag")
                        Text(text = "$30")
                    }
                }
            }


            item {
                Box {
                    Column {
                        Image(painter = painterResource(id = R.drawable.bg3),
                            contentDescription = "Handbag",
                            Modifier.size(80.dp)
                        )

                        Text(text = "Handbag")
                        Text(text = "$27")
                    }
                }
            }

            item {
                Box {
                    Column {
                        Image(painter = painterResource(id = R.drawable.bg4),
                            contentDescription = "Handbag",
                            Modifier.size(80.dp)
                        )

                        Text(text = "Handbag")
                        Text(text = "$29")
                    }
                }
            }

            item {
                Box {
                    Column {
                        Image(painter = painterResource(id = R.drawable.bg5),
                            contentDescription = "Handbag",
                            Modifier.size(80.dp)
                        )

                        Text(text = "Handbag")
                        Text(text = "$39")
                    }
                }
            }


            item {
                Box {
                    Column {
                        Image(painter = painterResource(id = R.drawable.bg6),
                            contentDescription = "Handbag",
                            Modifier.size(80.dp)
                        )

                        Text(text = "Handbag")
                        Text(text = "$38")
                    }
                }
            }



            item {
                Box {
                    Column {
                        Image(painter = painterResource(id = R.drawable.bg7),
                            contentDescription = "Handbag",
                            Modifier.size(80.dp)
                        )

                        Text(text = "Handbag")
                        Text(text = "$37")
                    }
                }
            }



            item {
                Box {
                    Column {
                        Image(painter = painterResource(id = R.drawable.bg8),
                            contentDescription = "Handbag",
                            Modifier.size(80.dp)
                        )

                        Text(text = "Handbag")
                        Text(text = "$30")
                    }
                }
            }

            item {
                Box {
                    Column {
                        Image(painter = painterResource(id = R.drawable.bg9),
                            contentDescription = "Handbag",
                            Modifier.size(80.dp)
                        )

                        Text(text = "Handbag")
                        Text(text = "$23")
                    }
                }
            }


            item {
                Box {
                    Column {
                        Image(painter = painterResource(id = R.drawable.bg10),
                            contentDescription = "Handbag",
                            Modifier.size(80.dp)
                        )

                        Text(text = "Handbag")
                        Text(text = "$16")
                    }
                }
            }


            item {
                Box {
                    Column {
                        Image(painter = painterResource(id = R.drawable.bg11),
                            contentDescription = "Handbag",
                            Modifier.size(80.dp)
                        )

                        Text(text = "Handbag")
                        Text(text = "$22")
                    }
                }
            }


            item {
                Box {
                    Column {
                        Image(painter = painterResource(id = R.drawable.bg12),
                            contentDescription = "Handbag",
                            Modifier.size(80.dp)
                        )

                        Text(text = "Handbag")
                        Text(text = "$22")
                    }
                }
            }

            item {
                Box {
                    Column {
                        Image(painter = painterResource(id = R.drawable.bg13),
                            contentDescription = "Handbag",
                            Modifier.size(80.dp)
                        )

                        Text(text = "Handbag")
                        Text(text = "$23")
                    }
                }
            }

            item {
                Box {
                    Column {
                        Image(painter = painterResource(id = R.drawable.bg14),
                            contentDescription = "Handbag",
                            Modifier.size(80.dp)
                        )

                        Text(text = "Handbag")
                        Text(text = "$21")
                    }
                }
            }

            item {
                Box {
                    Column {
                        Image(painter = painterResource(id = R.drawable.bg15),
                            contentDescription = "Handbag",
                            Modifier.size(80.dp)
                        )

                        Text(text = "Handbag")
                        Text(text = "$21")
                    }
                }
            }

            item {
                Box {
                    Column {
                        Image(painter = painterResource(id = R.drawable.bg16),
                            contentDescription = "Handbag",
                            Modifier.size(80.dp)
                        )

                        Text(text = "Handbag")
                        Text(text = "$19")
                    }
                }
            }

            item {
                Box {
                    Column {
                        Image(painter = painterResource(id = R.drawable.bg17),
                            contentDescription = "Handbag",
                            Modifier.size(80.dp)
                        )

                        Text(text = "Handbag")
                        Text(text = "$18")
                    }
                }
            }

            item {
                Box {
                    Column {
                        Image(painter = painterResource(id = R.drawable.bg18),
                            contentDescription = "Handbag",
                            Modifier.size(80.dp)
                        )

                        Text(text = "Handbag")
                        Text(text = "$16")
                    }
                }
            }

            item {
                Box {
                    Column {
                        Image(painter = painterResource(id = R.drawable.bg19),
                            contentDescription = "Handbag",
                            Modifier.size(80.dp)
                        )

                        Text(text = "Handbag")
                        Text(text = "$23")
                    }
                }
            }

            item {
                Box {
                    Column {
                        Image(painter = painterResource(id = R.drawable.bg20),
                            contentDescription = "Handbag",
                            Modifier.size(80.dp)
                        )

                        Text(text = "Handbag")
                        Text(text = "$20")
                    }
                }
            }


        })

    }
}

@Preview
@Composable
fun PreviewBag(){
    HandbagPage(navController = rememberNavController())
}