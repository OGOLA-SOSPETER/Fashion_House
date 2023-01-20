package com.SosDeveloper.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.SosDeveloper.myapplication.ui.theme.Purple500

@Composable
fun BeddingPage(navController: NavHostController) {
    Column {
        Image(painter = painterResource(id = R.drawable.kk),
            contentDescription = "background",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxHeight().fillMaxWidth()
                .clip(RoundedCornerShape(1.dp))
        )
    }
    Column {
        Column {
            TopAppBar(modifier = Modifier.background(
                    brush = Brush.verticalGradient(
                        colors = listOf(Color(0x33FFFFFF), Color.White)
                    )
                    )) {
                Text(
                    text = "Bedding🛌🛏",
                    fontFamily = FontFamily.Monospace,
                    fontSize = 14.sp,
                    color = Color.White,
                    modifier = Modifier
                        .padding(start = 50.dp, end = 140.dp)


                )
                IconButton(onClick = { navController.navigate("Dashboard") }) {
                    Icon(Icons.Default.ArrowForward,
                        contentDescription = "Back to homepage",
                        tint = Color.White)
                }
            }

        }

            LazyVerticalGrid(modifier = Modifier.padding(start = 20.dp),
                columns = GridCells.Adaptive(100.dp),
                content =
                {
                    item {
                        Box(modifier = Modifier.border(width = 2.dp,color = Color.White)) {
                            Column(modifier = Modifier.padding(start = 5.dp)) {
                                Image(painter = painterResource(id = R.drawable.bd1),
                                    contentDescription = "Bedding",
                                    Modifier.size(80.dp)
                                )

                                Text(text = "Executive Bed\nSoft and High Density")
                                Text(text = "$678")
                            }
                        }
                    }


                    item {
                        Box (modifier = Modifier.border(width = 2.dp,color = Color.White)){
                            Column(modifier = Modifier.padding(start = 5.dp)) {
                                Image(painter = painterResource(id = R.drawable.bd2),
                                    contentDescription = "Bedding",
                                    Modifier.size(80.dp)
                                )

                                Text(text = "Executive Bed\nSoft and High Density")
                                Text(text = "$678")
                            }
                        }
                    }


                    item {
                        Box (modifier = Modifier.border(width = 2.dp,color = Color.White)){
                            Column (modifier = Modifier.padding(start = 5.dp)){
                                Image(painter = painterResource(id = R.drawable.bd3),
                                    contentDescription = "Bedding",
                                    Modifier.size(80.dp)
                                )

                                Text(text = "Executive Bed\nSoft and High Density")
                                Text(text = "$678")
                            }
                        }
                    }

                    item {
                        Box (modifier = Modifier.border(width = 2.dp,color = Color.White)){
                            Column(modifier = Modifier.padding(start = 5.dp)) {
                                Image(painter = painterResource(id = R.drawable.bd4),
                                    contentDescription = "Bedding",
                                    Modifier.size(80.dp)
                                )

                                Text(text = "Executive Bed\nSoft and High Density")
                                Text(text = "$678")
                            }
                        }
                    }

                    item {
                        Box(modifier = Modifier.border(width = 2.dp,color = Color.White)) {
                            Column (modifier = Modifier.padding(start = 5.dp)){
                                Image(painter = painterResource(id = R.drawable.bd5),
                                    contentDescription = "Bedding",
                                    Modifier.size(80.dp)
                                )

                                Text(text = "Executive Bed\nSoft and High Density")
                                Text(text = "$678")
                            }
                        }
                    }


                    item {
                        Box (modifier = Modifier.border(width = 2.dp,color = Color.White)){
                            Column (modifier = Modifier.padding(start = 5.dp)){
                                Image(painter = painterResource(id = R.drawable.bd6),
                                    contentDescription = "Bedding",
                                    Modifier.size(80.dp)
                                )

                                Text(text = "Executive Bed\nSoft and High Density")
                                Text(text = "$678")
                            }
                        }
                    }



                    item {
                        Box (modifier = Modifier.border(width = 2.dp,color = Color.White)){
                            Column(modifier = Modifier.padding(start = 5.dp)) {
                                Image(painter = painterResource(id = R.drawable.bd7),
                                    contentDescription = "Bedding",
                                    Modifier.size(80.dp)
                                )

                                Text(text = "Executive Bed\nSoft and High Density")
                                Text(text = "$678")
                            }
                        }
                    }



                    item {
                        Box(modifier = Modifier.border(width = 2.dp,color = Color.White)) {
                            Column(modifier = Modifier.padding(start = 5.dp)) {
                                Image(painter = painterResource(id = R.drawable.bd8),
                                    contentDescription = "Bedding",
                                    Modifier.size(80.dp)
                                )

                                Text(text = "Executive Bed\nSoft and High Density")
                                Text(text = "$678")
                            }
                        }
                    }

                    item {
                        Box (modifier = Modifier.border(width = 2.dp,color = Color.White)){
                            Column (modifier = Modifier.padding(start = 5.dp)){
                                Image(painter = painterResource(id = R.drawable.bd9),
                                    contentDescription = "Bedding",
                                    Modifier.size(80.dp)
                                )

                                Text(text = "Executive Bed\nSoft and High Density")
                                Text(text = "$678")
                            }
                        }
                    }


                    item {
                        Box (modifier = Modifier.border(width = 2.dp,color = Color.White)){
                            Column(modifier = Modifier.padding(start = 5.dp)) {
                                Image(painter = painterResource(id = R.drawable.bd10),
                                    contentDescription = "Bedding",
                                    Modifier.size(80.dp)
                                )

                                Text(text = "Executive Bed\nSoft and High Density")
                                Text(text = "$678")
                            }
                        }
                    }


                    item {
                        Box (modifier = Modifier.border(width = 2.dp,color = Color.White)){
                            Column (modifier = Modifier.padding(start = 5.dp)){
                                Image(painter = painterResource(id = R.drawable.bd11),
                                    contentDescription = "Bedding",
                                    Modifier.size(80.dp)
                                )

                                Text(text = "Executive Bed\nSoft and High Density")
                                Text(text = "$678")
                            }
                        }
                    }


                    item {
                        Box (modifier = Modifier.border(width = 2.dp,color = Color.White)){
                            Column(modifier = Modifier.padding(start = 5.dp)) {
                                Image(painter = painterResource(id = R.drawable.bd12),
                                    contentDescription = "Bedding",
                                    Modifier.size(80.dp)
                                )

                                Text(text = "Executive Bed\nSoft and High Density")
                                Text(text = "$678")
                            }
                        }
                    }

                    item {
                        Box(modifier = Modifier.border(width = 2.dp,color = Color.White)) {
                            Column (modifier = Modifier.padding(start = 5.dp)){
                                Image(painter = painterResource(id = R.drawable.bd13),
                                    contentDescription = "Bedding",
                                    Modifier.size(80.dp)
                                )

                                Text(text = "Executive Bed\nSoft and High Density")
                                Text(text = "$678")
                            }
                        }
                    }

                    item {
                        Box(modifier = Modifier.border(width = 2.dp,color = Color.White)) {
                            Column(modifier = Modifier.padding(start = 5.dp)) {
                                Image(painter = painterResource(id = R.drawable.bd14),
                                    contentDescription = "Bedding",
                                    Modifier.size(80.dp)
                                )

                                Text(text = "Executive Bed\nSoft and High Density")
                                Text(text = "$678")
                            }
                        }
                    }

                    item {
                        Box (modifier = Modifier.border(width = 2.dp,color = Color.White)){
                            Column(modifier = Modifier.padding(start = 5.dp)) {
                                Image(painter = painterResource(id = R.drawable.bd15),
                                    contentDescription = "Bedding",
                                    Modifier.size(80.dp)
                                )

                                Text(text = "Executive Bed\nSoft and High Density")
                                Text(text = "$678")
                            }
                        }
                    }

                    item {
                        Box (modifier = Modifier.border(width = 2.dp,color = Color.White)){
                            Column(modifier = Modifier.padding(start = 5.dp)) {
                                Image(painter = painterResource(id = R.drawable.bd12),
                                    contentDescription = "Bedding",
                                    Modifier.size(80.dp)
                                )

                                Text(text = "Executive Bed\nSoft and High Density")
                                Text(text = "$678")
                            }
                        }
                    }

                    item {
                        Box (modifier = Modifier.border(width = 2.dp,color = Color.White)){
                            Column (modifier = Modifier.padding(start = 5.dp)){
                                Image(painter = painterResource(id = R.drawable.bd16),
                                    contentDescription = "Bedding",
                                    Modifier.size(80.dp)
                                )

                                Text(text = "Executive Bed\nSoft and High Density")
                                Text(text = "$678")
                            }
                        }
                    }

                    item {
                        Box (modifier = Modifier.border(width = 2.dp,color = Color.White)){
                            Column(modifier = Modifier.padding(start = 5.dp)) {
                                Image(painter = painterResource(id = R.drawable.bd17),
                                    contentDescription = "Bedding",
                                    Modifier.size(80.dp)
                                )

                                Text(text = "Executive Bed\nSoft and High Density")
                                Text(text = "$678")
                            }
                        }
                    }

                    item {
                        Box(modifier = Modifier.border(width = 2.dp,color = Color.White)) {
                            Column (modifier = Modifier.padding(start = 5.dp)){
                                Image(painter = painterResource(id = R.drawable.bd20),
                                    contentDescription = "Bedding",
                                    Modifier.size(80.dp)
                                )

                                Text(text = "Executive Bed\nSoft and High Density")
                                Text(text = "$678")
                            }
                        }
                    }

                    item {
                        Box(modifier = Modifier.border(width = 2.dp,color = Color.White)) {
                            Column (modifier = Modifier.padding(start = 5.dp)){
                                Image(painter = painterResource(id = R.drawable.bd19),
                                    contentDescription = "Bedding",
                                    Modifier.size(80.dp)
                                )

                                Text(text = "Executive Bed\nSoft and High Density")
                                Text(text = "$678")
                            }
                        }
                    }


                })
        }


}
@Preview
@Composable
fun PreviewBedding(){
    BeddingPage(navController = rememberNavController())
}