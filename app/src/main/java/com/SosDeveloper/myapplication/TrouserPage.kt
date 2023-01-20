package com.SosDeveloper.myapplication

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.SosDeveloper.myapplication.ui.theme.Purple500

@Composable
fun TrouserPage(navController: NavHostController) {
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
            Text(
                text = "Men_Wear.\t\tDesigner Trousers",
                fontSize = 16.sp,
                color = Color.White,
                modifier = Modifier.padding(start = 30.dp, end = 50.dp)

            )
            IconButton(onClick = { navController.navigate("Dashboard") }) {
                Icon(Icons.Default.ArrowForward,
                    contentDescription = "Back to homepage",
                    tint = Color.White)
            }
        }
        Column(modifier = Modifier.padding(start = 20.dp,end = 20.dp)) {
            Row(Modifier.padding(start = 5.dp), horizontalArrangement = Arrangement.spacedBy(13.dp)) {
                val context = LocalContext.current
                val smart = remember { Intent(Intent.ACTION_VIEW, Uri.parse("https://www.jumia.co.ke/catalog/?q=men+official+trousers")) }
                val trousers = remember { Intent(Intent.ACTION_VIEW, Uri.parse("https://www.jumia.co.ke/catalog/?q=men++trousers")) }
                val pyjamers = remember { Intent(Intent.ACTION_VIEW, Uri.parse("https://www.jumia.co.ke/catalog/?q=men+pyjamers+trousers")) }

                Button(onClick = { context.startActivity(smart) }) {
                    Text(text = "Smart&Sharp", fontSize = 14.sp, color = Color.White)
                }
                Button(onClick = { context.startActivity(trousers) }) {
                    Text(text = "Trousers", fontSize = 14.sp, color = Color.White)
                }
                Button(onClick = { context.startActivity(pyjamers) }) {
                    Text(text = "Pyjamers", fontSize = 14.sp, color = Color.White)
                }
            }
            LazyVerticalGrid(columns = GridCells.Adaptive(100.dp),
                verticalArrangement = Arrangement.spacedBy(5.dp),
                horizontalArrangement = Arrangement.spacedBy(5.dp),
                content =
                {
                    item {
                        Box(modifier = Modifier
                            .border(width = 2.dp,
                                color = Color.White,
                                shape = RoundedCornerShape(4.dp))
                        ) {
                            Column {
                                Image(
                                    painter = painterResource(id = R.drawable.t1),
                                    contentDescription = "Trouser."
                                )

                                Text(
                                    text = "Fashion Mens Casual Trousers Jogger Sports Sweat Pants Official - Grey",
                                    fontSize = 8.sp,
                                    modifier = Modifier.padding(start = 10.dp)
                                )
                                Box(modifier = Modifier.padding(start = 20.dp)) {
                                    Column {
                                        Text("KSh 940", fontSize = 7.sp)
                                        Text("KSh 1,843",
                                            fontSize = 7.sp,
                                            textDecoration = TextDecoration.LineThrough)
                                        Text("-49%", fontSize = 7.sp)
                                    }
                                }
                            }
                        }
                    }

                    item {
                        Box(modifier = Modifier
                            .border(width = 2.dp,
                                color = Color.White,
                                shape = RoundedCornerShape(4.dp))
                        ) {
                            Column {
                                Image(
                                    painter = painterResource(id = R.drawable.t2),
                                    contentDescription = "Trouser."
                                )
                                Text(text = "Fashion Soft Khaki Men's Trouser Stretch Slim Fit Official Casual- Navy Blue+Free Pair Of Socks",
                                    fontSize = 8.sp, modifier = Modifier.padding(start = 10.dp))
                                Box(modifier = Modifier.padding(start = 20.dp)) {
                                    Column {
                                        Text("KSh 999 - KSh 1,149", fontSize = 7.sp)
                                        Text("KSh 1,199 - KSh 1,800", fontSize = 7.sp,
                                            textDecoration = TextDecoration.LineThrough)
                                        Text("-45%", fontSize = 6.sp)
                                    }
                                }
                            }
                        }
                    }


                    item {
                        Box(modifier = Modifier
                            .border(width = 2.dp,
                                color = Color.White,
                                shape = RoundedCornerShape(4.dp))
                        ) {
                            Column {
                                Image(
                                    painter = painterResource(id = R.drawable.t3),
                                    contentDescription = "Trouser."
                                )
                                Text(text = "Fashion 4Pack, Soft Khaki Men's Trouser Slim Fit Official Casual- Green,Navy blue,Beige&Maroon",
                                    fontSize = 8.sp, modifier = Modifier.padding(start = 10.dp))
                                Box(modifier = Modifier.padding(start = 20.dp)) {
                                    Column {
                                        Text("KSh 3,899 - KSh 4,399", fontSize = 7.sp)
                                        Text("KSh 4,149 - KSh 4,599", fontSize = 7.sp,
                                            textDecoration = TextDecoration.LineThrough)
                                        Text("-9%", fontSize = 6.sp)
                                    }
                                }
                            }
                        }
                    }

                    item {
                        Box(modifier = Modifier
                            .border(width = 2.dp,
                                color = Color.White,
                                shape = RoundedCornerShape(4.dp))
                        ) {
                            Column {
                                Image(
                                    painter = painterResource(id = R.drawable.t4),
                                    contentDescription = "Trouser."
                                )
                                Text(text = "Fashion Hard Khaki Men's Trouser Official /Casual- Beige",
                                    fontSize = 8.sp, modifier = Modifier.padding(start = 10.dp))
                                Box(modifier = Modifier.padding(start = 20.dp)) {
                                    Column {
                                        Text("KSh 999 - KSh 1,095", fontSize = 7.sp)
                                        Text("KSh 1,019 - KSh 1,499", fontSize = 7.sp,
                                            textDecoration = TextDecoration.LineThrough)
                                        Text("-33%", fontSize = 6.sp)
                                    }
                                }
                            }
                        }
                    }


                    item {
                        Box(modifier = Modifier
                            .border(width = 2.dp,
                                color = Color.White,
                                shape = RoundedCornerShape(4.dp))
                        ) {
                            Column {
                                Image(
                                    painter = painterResource(id = R.drawable.t5),
                                    contentDescription = "Trouser."
                                )
                                Text(text = "Fashion Slim Fit Official Casual Khaki Trouser-Black",
                                    fontSize = 8.sp, modifier = Modifier.padding(start = 10.dp))
                                Box(modifier = Modifier.padding(start = 20.dp)) {
                                    Column {
                                        Text("KSh 1,299", fontSize = 7.sp)
                                        Text("KSh 2,000",
                                            fontSize = 7.sp,
                                            textDecoration = TextDecoration.LineThrough)
                                        Text("-35%", fontSize = 6.sp)
                                    }
                                }
                            }
                        }
                    }

                    item {
                        Box(modifier = Modifier
                            .border(width = 2.dp,
                                color = Color.White,
                                shape = RoundedCornerShape(4.dp))
                        ) {
                            Column {
                                Image(
                                    painter = painterResource(id = R.drawable.t6),
                                    contentDescription = "Trouser."
                                )
                                Text(text = "Fashion Official Turkey Trouser Pant -dark Grey",
                                    fontSize = 8.sp, modifier = Modifier.padding(start = 10.dp))
                                Box(modifier = Modifier.padding(start = 20.dp)) {
                                    Column {
                                        Text("KSh 1,299", fontSize = 7.sp)
                                        Text("KSh 1,800",
                                            fontSize = 7.sp,
                                            textDecoration = TextDecoration.LineThrough)
                                        Text("-28%", fontSize = 6.sp)
                                    }
                                }
                            }
                        }
                    }



                    item {
                        Box(modifier = Modifier
                            .border(width = 2.dp,
                                color = Color.White,
                                shape = RoundedCornerShape(4.dp))
                        ) {
                            Column {
                                Image(
                                    painter = painterResource(id = R.drawable.t7),
                                    contentDescription = "Trouser."
                                )
                                Text(text = "Fashion 2 Pack Classic Turkey Men's Formal Official Trousers",
                                    fontSize = 8.sp, modifier = Modifier.padding(start = 10.dp))
                                Box(modifier = Modifier.padding(start = 20.dp)) {
                                    Column {
                                        Text("KSh 2,199 - KSh 2,299", fontSize = 7.sp)
                                        Text("KSh 3,500",
                                            fontSize = 7.sp,
                                            textDecoration = TextDecoration.LineThrough)
                                        Text("-37%", fontSize = 6.sp)
                                    }
                                }
                            }
                        }
                    }


                    item {
                        Box(modifier = Modifier
                            .border(width = 2.dp,
                                color = Color.White,
                                shape = RoundedCornerShape(4.dp))
                        ) {
                            Column {
                                Image(
                                    painter = painterResource(id = R.drawable.t8),
                                    contentDescription = "Trouser."
                                )
                                Text(text = "Fashion 4Pack, Soft Khaki Men's Trouser Slim Fit Official Casual- Black,Navy blue,Chocolate&Maroon",
                                    fontSize = 8.sp, modifier = Modifier.padding(start = 10.dp))
                                Box(modifier = Modifier.padding(start = 20.dp)) {
                                    Column {
                                        Text("KSh 3,899 - KSh 4,395", fontSize = 7.sp)
                                        Text("KSh 3,999 - KSh 4,399", fontSize = 7.sp,
                                            textDecoration = TextDecoration.LineThrough)
                                        Text("-5%", fontSize = 6.sp)
                                    }
                                }
                            }
                        }
                    }


                    item {
                        Box(modifier = Modifier
                            .border(width = 2.dp,
                                color = Color.White,
                                shape = RoundedCornerShape(4.dp))
                        ) {
                            Column {
                                Image(
                                    painter = painterResource(id = R.drawable.t9),
                                    contentDescription = "Trouser."
                                )
                                Text(text = "Fashion 2Pack, Soft Khaki Men's Trouser Slim Fit Official Casual- Grey&NavyBlue",
                                    fontSize = 8.sp, modifier = Modifier.padding(start = 10.dp))
                                Box(modifier = Modifier.padding(start = 20.dp)) {
                                    Column {
                                        Text("KSh 1,999 - KSh 2,295", fontSize = 7.sp)
                                        Text("KSh 2,149 - KSh 2,299", fontSize = 7.sp,
                                            textDecoration = TextDecoration.LineThrough)
                                        Text("-7%", fontSize = 6.sp)
                                    }
                                }
                            }
                        }
                    }

                    item {
                        Box(modifier = Modifier
                            .border(width = 2.dp,
                                color = Color.White,
                                shape = RoundedCornerShape(4.dp))
                        ) {
                            Column {
                                Image(
                                    painter = painterResource(id = R.drawable.t10),
                                    contentDescription = "Trouser."
                                )
                                Text(text = "Fashion Soft Khaki Men's Trouser Stretch Official Casual",
                                    fontSize = 8.sp, modifier = Modifier.padding(start = 10.dp))
                                Box(modifier = Modifier.padding(start = 20.dp)) {
                                    Column {
                                        Text("KSh 999 - KSh 1,049", fontSize = 7.sp)
                                        Text("KSh 1,800",
                                            fontSize = 7.sp,
                                            textDecoration = TextDecoration.LineThrough)
                                        Text("-45%", fontSize = 6.sp)
                                    }
                                }
                            }
                        }
                    }


                    item {
                        Box(modifier = Modifier
                            .border(width = 2.dp,
                                color = Color.White,
                                shape = RoundedCornerShape(4.dp))
                        ) {
                            Column {
                                Image(
                                    painter = painterResource(id = R.drawable.t11),
                                    contentDescription = "Trouser."
                                )
                                Text(text = "Fashion Official Trouser Pant -Black-Slim Fit Office Wear Men",
                                    fontSize = 8.sp, modifier = Modifier.padding(start = 10.dp))
                                Box(modifier = Modifier.padding(start = 20.dp)) {
                                    Column {
                                        Text("KSh 1,149 - KSh 1,299", fontSize = 7.sp)
                                        Text("KSh 1,199 - KSh 1,800", fontSize = 7.sp,
                                            textDecoration = TextDecoration.LineThrough)
                                        Text("-28%", fontSize = 6.sp)
                                    }
                                }
                            }
                        }
                    }


                    item {
                        Box(modifier = Modifier
                            .border(width = 2.dp,
                                color = Color.White,
                                shape = RoundedCornerShape(4.dp))
                        ) {
                            Column {
                                Image(
                                    painter = painterResource(id = R.drawable.t12),
                                    contentDescription = "Trouser."
                                )
                                Text(text = "Fashion Official Trouser Pant-Dark Grey",
                                    fontSize = 8.sp, modifier = Modifier.padding(start = 10.dp))
                                Box(modifier = Modifier.padding(start = 20.dp)) {
                                    Column {
                                        Text("KSh 1,299", fontSize = 7.sp)
                                        Text("KSh 1,800",
                                            fontSize = 7.sp,
                                            textDecoration = TextDecoration.LineThrough)
                                        Text("-28%", fontSize = 6.sp)
                                    }
                                }
                            }
                        }
                    }



                    item {
                        Box(modifier = Modifier
                            .border(width = 2.dp,
                                color = Color.White,
                                shape = RoundedCornerShape(4.dp))
                        ) {
                            Column {
                                Image(
                                    painter = painterResource(id = R.drawable.t13),
                                    contentDescription = "Trouser."
                                )
                                Text(text = "Fashion 4Pack, Khaki Men's Trouser Slim Fit Official Casual- Green,Navy blue,Beige&Maroon",
                                    fontSize = 8.sp, modifier = Modifier.padding(start = 10.dp))
                                Box(modifier = Modifier.padding(start = 20.dp)) {
                                    Column {
                                        Text("KSh 3,499 - KSh 3,999", fontSize = 7.sp)
                                        Text("KSh 6,000",
                                            fontSize = 7.sp,
                                            textDecoration = TextDecoration.LineThrough)
                                        Text("-42%", fontSize = 6.sp)
                                    }
                                }
                            }
                        }
                    }

                    item {
                        Box(modifier = Modifier
                            .border(width = 2.dp,
                                color = Color.White,
                                shape = RoundedCornerShape(4.dp))
                        ) {
                            Column {
                                Image(
                                    painter = painterResource(id = R.drawable.t14),
                                    contentDescription = "Trouser."
                                )
                                Text(text = "Fashion 2Pack, Soft Khaki Men's Trouser Slim Fit Official Casual- Grey&Chocolate",
                                    fontSize = 8.sp, modifier = Modifier.padding(start = 10.dp))
                                Box(modifier = Modifier.padding(start = 20.dp)) {
                                    Column {
                                        Text("KSh 1,999 - KSh 2,298", fontSize = 7.sp)
                                        Text("KSh 2,149 - KSh 2,299", fontSize = 7.sp,
                                            textDecoration = TextDecoration.LineThrough)
                                        Text("-9%", fontSize = 6.sp)
                                    }
                                }
                            }
                        }
                    }


                    item {
                        Box(modifier = Modifier
                            .border(width = 2.dp,
                                color = Color.White,
                                shape = RoundedCornerShape(4.dp))
                        ) {
                            Column {
                                Image(
                                    painter = painterResource(id = R.drawable.t15),
                                    contentDescription = "Trouser."
                                )
                                Text(text = "Fashion 5 Pack Slim Fit Official Casual Khaki Trouser",
                                    fontSize = 8.sp, modifier = Modifier.padding(start = 10.dp))
                                Box(modifier = Modifier.padding(start = 20.dp)) {
                                    Column {
                                        Text("KSh 6,200", fontSize = 7.sp)
                                        Text("KSh 7,000",
                                            fontSize = 7.sp,
                                            textDecoration = TextDecoration.LineThrough)
                                        Text("-11%", fontSize = 6.sp)
                                    }
                                }
                            }
                        }
                    }

                    item {
                        Box(modifier = Modifier
                            .border(width = 2.dp,
                                color = Color.White,
                                shape = RoundedCornerShape(4.dp))
                        ) {
                            Column {
                                Image(
                                    painter = painterResource(id = R.drawable.t16),
                                    contentDescription = "Trouser."
                                )
                                Text(text = "Fashion Men Khaki Trousers Stretch Slim Fit-official, Casual",
                                    fontSize = 8.sp, modifier = Modifier.padding(start = 10.dp))
                                Box(modifier = Modifier.padding(start = 20.dp)) {
                                    Column {
                                        Text("KSh 1,277 - KSh 1,399", fontSize = 7.sp)
                                        Text("KSh 1,500",
                                            fontSize = 7.sp,
                                            textDecoration = TextDecoration.LineThrough)
                                        Text("-15%", fontSize = 6.sp)
                                    }
                                }
                            }
                        }
                    }

                    item {
                        Box(modifier = Modifier
                            .border(width = 2.dp,
                                color = Color.White,
                                shape = RoundedCornerShape(4.dp))
                        ) {
                            Column {
                                Image(
                                    painter = painterResource(id = R.drawable.t17),
                                    contentDescription = "Trouser."
                                )
                                Text(text = "Fashion 2 Pack Turkey Men's Formal Official Trousers",
                                    fontSize = 8.sp, modifier = Modifier.padding(start = 10.dp))
                                Box(modifier = Modifier.padding(start = 20.dp)) {
                                    Column {
                                        Text("KSh 2,199 - KSh 2,449", fontSize = 7.sp)
                                        Text("KSh 2,499",
                                            fontSize = 7.sp,
                                            textDecoration = TextDecoration.LineThrough)
                                        Text("-12%", fontSize = 6.sp)
                                    }
                                }
                            }
                        }
                    }



                    item {
                        Box(modifier = Modifier
                            .border(width = 2.dp,
                                color = Color.White,
                                shape = RoundedCornerShape(4.dp))
                        ) {
                            Column {
                                Image(
                                    painter = painterResource(id = R.drawable.t18),
                                    contentDescription = "Trouser."
                                )
                                Text(text = "Fashion Men's Official Trousers- 3Pack",
                                    fontSize = 8.sp, modifier = Modifier.padding(start = 10.dp))
                                Box(modifier = Modifier.padding(start = 20.dp)) {
                                    Column {
                                        Text("KSh 3,349", fontSize = 7.sp)
                                        Text("KSh 6,000",
                                            fontSize = 7.sp,
                                            textDecoration = TextDecoration.LineThrough)
                                        Text("-44%", fontSize = 6.sp)
                                    }
                                }
                            }
                        }
                    }



                    item {
                        Box(modifier = Modifier
                            .border(width = 2.dp,
                                color = Color.White,
                                shape = RoundedCornerShape(4.dp))
                        ) {
                            Column {
                                Image(
                                    painter = painterResource(id = R.drawable.t19),
                                    contentDescription = "Trouser."
                                )
                                Text(text = "Fashion Turkey Official Trouser Pant",
                                    fontSize = 8.sp, modifier = Modifier.padding(start = 10.dp))
                                Box(modifier = Modifier.padding(start = 20.dp)) {
                                    Column {
                                        Text("KSh 1,249 - KSh 1,299", fontSize = 7.sp)
                                        Text("KSh 1,800",
                                            fontSize = 7.sp,
                                            textDecoration = TextDecoration.LineThrough)
                                        Text("-31%", fontSize = 6.sp)
                                    }
                                }
                            }
                        }
                    }




                    item {
                        Box(modifier = Modifier
                            .border(width = 2.dp,
                                color = Color.White,
                                shape = RoundedCornerShape(4.dp))
                        ) {
                            Column {
                                Image(
                                    painter = painterResource(id = R.drawable.t20),
                                    contentDescription = "Trouser."
                                )
                                Text(text = "Fashion Soft Khaki Men's Trouser Stretch Official Casual",
                                    fontSize = 8.sp, modifier = Modifier.padding(start = 10.dp))
                                Box(modifier = Modifier.padding(start = 20.dp)) {
                                    Column {
                                        Text("KSh 989 - KSh 1,099", fontSize = 7.sp)
                                        Text("KSh 989 - KSh 1,500", fontSize = 7.sp,
                                            textDecoration = TextDecoration.LineThrough)
                                        Text("-27%", fontSize = 6.sp)
                                    }
                                }
                            }
                        }
                    }


                    item {
                        Box(modifier = Modifier
                            .border(width = 2.dp,
                                color = Color.White,
                                shape = RoundedCornerShape(4.dp))
                        ) {
                            Column {
                                Image(
                                    painter = painterResource(id = R.drawable.t21),
                                    contentDescription = "Trouser."
                                )
                                Text(text = "Fashion Soft Khaki Men's Trouser Stretch Official Casual",
                                    fontSize = 8.sp, modifier = Modifier.padding(start = 10.dp))
                                Box(modifier = Modifier.padding(start = 20.dp)) {
                                    Column {
                                        Text("KSh 999 - KSh 1,149", fontSize = 7.sp)
                                        Text("KSh 1,099 - KSh 1,800", fontSize = 7.sp,
                                            textDecoration = TextDecoration.LineThrough)
                                        Text("-45%", fontSize = 6.sp)
                                    }
                                }
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
fun PreviewTrouser(){
   TrouserPage(navController = rememberNavController())
}