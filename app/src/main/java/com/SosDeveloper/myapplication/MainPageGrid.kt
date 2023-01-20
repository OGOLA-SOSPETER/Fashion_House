package com.SosDeveloper.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun MainPageGrid(navController: NavHostController){
Column(Modifier.verticalScroll(state = ScrollState(2), enabled = true)){
    Row {
     Text( "Polo Necks",
         fontSize = 17.sp, fontFamily = FontFamily.Monospace,
         modifier = Modifier.padding(start = 5.dp)

     )
        Divider(modifier = Modifier
            .width(300.dp)
            .padding(top = 10.dp, start = 10.dp), color = Color.LightGray)
    }
    Text(text = "Refers to a short-sleeved, collarless undershirt or" +
            " any outer shirt of a similar design. " +
            "It got its name because it resembles the capital letter T in shape.",
        fontSize = 10.sp,
        modifier = Modifier.padding(start = 4.dp)
        )
                  LazyRow(
                      horizontalArrangement = Arrangement.spacedBy(10.dp),
                      modifier = Modifier.padding(start = 5.dp,top = 8.dp),
                      content = {
                      item {
                          Box(Modifier.padding(end = 9.dp)) {
                              Column {
                                  Image(painter = painterResource(id = R.drawable.s1),
                                      contentDescription = "shirt",
                                      contentScale = ContentScale.Crop,
                                      modifier = Modifier
                                          .size(100.dp)
                                          .clip(RoundedCornerShape(5.dp))
                                      )
                                  Text(text = "White Polo Neck\n(Long-Sleeved)",
                                      modifier = Modifier.padding(start = 2.dp))
                                  Text(text = "$33", modifier = Modifier.padding(start = 30.dp))
                              }
                          }
                          Divider( modifier = Modifier
                              .height(100.dp)
                              .width(1.dp), color = Color.Gray)

                      }
                      item {
                          Box(Modifier.padding(end = 9.dp)) {
                              Column {
                                  Image(painter = painterResource(id = R.drawable.s2),
                                      contentDescription = "shirt",
                                      contentScale = ContentScale.Crop,
                                      modifier = Modifier
                                          .size(100.dp)
                                          .clip(RoundedCornerShape(5.dp)))
                                  Text(text = "White Polo Neck\n(Short Sleeved)",
                                      modifier = Modifier.padding(start = 2.dp))
                                  Text(text = "$20", modifier = Modifier.padding(start = 30.dp))
                              }
                          }
                          Divider( modifier = Modifier
                              .height(100.dp)
                              .width(1.dp), color = Color.Gray)

                      }
                      item {
                          Box(Modifier.padding(end = 9.dp)) {
                              Column {
                                  Image(painter = painterResource(id = R.drawable.s3),
                                      contentDescription = "shirt",
                                      contentScale = ContentScale.Crop,
                                      modifier = Modifier
                                          .size(100.dp)
                                          .clip(RoundedCornerShape(5.dp)))
                                  Text(text = "Color Polo Neck\n(Black,Red,Blue)",
                                      modifier = Modifier.padding(start = 1.dp))
                                  Text(text = "$40", modifier = Modifier.padding(start = 30.dp))
                              }
                          }
                          Divider( modifier = Modifier
                              .height(100.dp)
                              .width(1.dp), color = Color.Gray)

                      }

                      item {
                          Box (Modifier.padding(end = 9.dp)){
                              Column {
                                  Image(painter = painterResource(id = R.drawable.s4),
                                      contentDescription = "shirt",
                                      contentScale = ContentScale.Crop,
                                      modifier = Modifier
                                          .size(100.dp)
                                          .clip(RoundedCornerShape(5.dp)))
                                  Text(text = "Black Polo Neck\n(Short Sleeved)",
                                      modifier = Modifier.padding(start = 3.dp))
                                  Text(text = "$36", modifier = Modifier.padding(start = 30.dp))
                              }
                          }
                          Divider( modifier = Modifier
                              .height(100.dp)
                              .width(1.dp), color = Color.Gray)

                      }

                          item {
                              Box (Modifier.padding(end = 9.dp)){
                                  Column {
                                      Image(painter = painterResource(id = R.drawable.s5),
                                          contentDescription = "shirt",
                                          contentScale = ContentScale.Crop,
                                          modifier = Modifier
                                              .size(100.dp)
                                              .clip(RoundedCornerShape(5.dp)))
                                      Text(text = "Red Polo Neck\n(Short Sleeved)",
                                          modifier = Modifier.padding(start = 3.dp))
                                      Text(text = "$22", modifier = Modifier.padding(start = 30.dp))
                                  }
                              }
                              Divider( modifier = Modifier
                                  .height(100.dp)
                                  .width(1.dp), color = Color.Gray)

                          }

                          item {
                              Box (Modifier.padding(end = 9.dp)){
                                  Column {
                                      Image(painter = painterResource(id = R.drawable.s6),
                                          contentDescription = "shirt",
                                          contentScale = ContentScale.Crop,
                                          modifier = Modifier
                                              .size(100.dp)
                                              .clip(RoundedCornerShape(5.dp)))
                                      Text(text = "White Polo Neck\n(Short Sleeved)",
                                          modifier = Modifier.padding(start = 3.dp))
                                      Text(text = "$28", modifier = Modifier.padding(start = 30.dp))
                                  }
                              }
                              Divider( modifier = Modifier
                                  .height(100.dp)
                                  .width(1.dp), color = Color.Gray)

                          }

                          item {
                              Box (Modifier.padding(end = 9.dp)){
                                  Column {
                                      Image(painter = painterResource(id = R.drawable.s7),
                                          contentDescription = "shirt",
                                          contentScale = ContentScale.Crop,
                                          modifier = Modifier
                                              .size(100.dp)
                                              .clip(RoundedCornerShape(5.dp)))
                                      Text(text = "Pink Polo Neck\n(Short Sleeved)",
                                          modifier = Modifier.padding(start = 3.dp))
                                      Text(text = "$39", modifier = Modifier.padding(start = 30.dp))
                                  }
                              }
                              Divider( modifier = Modifier
                                  .height(100.dp)
                                  .width(1.dp), color = Color.Gray)

                          }

                          item {
                              Box (Modifier.padding(end = 9.dp)){
                                  Column {
                                      Image(painter = painterResource(id = R.drawable.s8),
                                          contentDescription = "shirt",
                                          contentScale = ContentScale.Crop,
                                          modifier = Modifier
                                              .size(100.dp)
                                              .clip(RoundedCornerShape(5.dp)))
                                      Text(text = "Red,Yellow,Blue Polo Neck\n(Short Sleeved)",
                                          modifier = Modifier.padding(start = 3.dp))
                                      Text(text = "$44", modifier = Modifier.padding(start = 30.dp))
                                  }
                              }
                              Divider( modifier = Modifier
                                  .height(100.dp)
                                  .width(1.dp), color = Color.Gray)

                          }

                  })
    Divider(modifier = Modifier
        .width(550.dp)
        .padding(top = 10.dp, start = 10.dp), color = Color.LightGray)


Spacer(modifier = Modifier.height(10.dp))
    Row {
        Text( "Shorts",
            fontSize = 17.sp, fontFamily = FontFamily.Monospace,
            modifier = Modifier.padding(start = 5.dp)

        )
        Divider(modifier = Modifier
            .width(300.dp)
            .padding(top = 10.dp, start = 10.dp), color = Color.LightGray)
    }
    Text(text = "They are called \"shorts\" because" +
            " they are a shortened version of trousers," +
            " which cover the entire leg, but not the foot. " +
            "Shorts are typically worn in warm weather or in an " +
            "environment where comfort" +
            " and airflow are more important than the protection of the legs.",
        fontSize = 10.sp,
        modifier = Modifier.padding(start = 4.dp)
        )
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        modifier = Modifier.padding(start = 5.dp,top = 10.dp),
        content = {
            item {
                Box(Modifier.padding(end = 9.dp)) {
                    Column {
                        Image(painter = painterResource(id = R.drawable.st1),
                            contentDescription = "short",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(100.dp)
                                .clip(RoundedCornerShape(5.dp))
                        )
                        Text(text = "White Shorts\n(Men-Wear)",
                            modifier = Modifier.padding(start = 12.dp))
                        Text(text = "$53", modifier = Modifier.padding(start = 34.dp))
                    }
                }
                Divider( modifier = Modifier
                    .height(100.dp)
                    .width(1.dp), color = Color.Gray)

            }
            item {
                Box(Modifier.padding(end = 9.dp)) {
                    Column {
                        Image(painter = painterResource(id = R.drawable.st2),
                            contentDescription = "short",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(100.dp)
                                .clip(RoundedCornerShape(5.dp)))
                        Text(text = "Blue-Shorts\n(Men-Wear)",
                            modifier = Modifier.padding(start = 12.dp))
                        Text(text = "$78", modifier = Modifier.padding(start = 34.dp))
                    }
                }
                Divider( modifier = Modifier
                    .height(100.dp)
                    .width(1.dp), color = Color.Gray)

            }
            item {
                Box(Modifier.padding(end = 9.dp)) {
                    Column {
                        Image(painter = painterResource(id = R.drawable.st3),
                            contentDescription = "short",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(100.dp)
                                .clip(RoundedCornerShape(5.dp)))
                        Text(text = "Grey Shorts\n(Men-Wear)",
                            modifier = Modifier.padding(start = 12.dp))
                        Text(text = "$66", modifier = Modifier.padding(start = 34.dp))
                    }
                }
                Divider( modifier = Modifier
                    .height(100.dp)
                    .width(1.dp), color = Color.Gray)

            }

            item {
                Box (Modifier.padding(end = 9.dp)){
                    Column {
                        Image(painter = painterResource(id = R.drawable.st4),
                            contentDescription = "short",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(100.dp)
                                .clip(RoundedCornerShape(5.dp)))
                        Text(text = "Black Shorts\n(Men Wear)",
                            modifier = Modifier.padding(start = 12.dp))
                        Text(text = "$39", modifier = Modifier.padding(start = 34.dp))
                    }
                }
                Divider( modifier = Modifier
                    .height(100.dp)
                    .width(1.dp), color = Color.Gray)

            }

            item {
                Box (Modifier.padding(end = 9.dp)){
                    Column {
                        Image(painter = painterResource(id = R.drawable.st5),
                            contentDescription = "short",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(100.dp)
                                .clip(RoundedCornerShape(5.dp)))
                        Text(text = "White/Blue Short\n(Men Wear)",
                            modifier = Modifier.padding(start = 10.dp))
                        Text(text = "$25", modifier = Modifier.padding(start = 34.dp))
                    }
                }
                Divider( modifier = Modifier
                    .height(100.dp)
                    .width(1.dp), color = Color.Gray)

            }

            item {
                Box (Modifier.padding(end = 9.dp)){
                    Column {
                        Image(painter = painterResource(id = R.drawable.st6),
                            contentDescription = "short",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(100.dp)
                                .clip(RoundedCornerShape(5.dp)))
                        Text(text = "Brown Short\n(Men Wear)",
                            modifier = Modifier.padding(start = 12.dp))
                        Text(text = "$98", modifier = Modifier.padding(start = 34.dp))
                    }
                }
                Divider( modifier = Modifier
                    .height(100.dp)
                    .width(1.dp), color = Color.Gray)

            }

            item {
                Box (Modifier.padding(end = 9.dp)){
                    Column {
                        Image(painter = painterResource(id = R.drawable.st7),
                            contentDescription = "short",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(100.dp)
                                .clip(RoundedCornerShape(5.dp)))
                        Text(text = "Black Short\n(Men Wear)",
                            modifier = Modifier.padding(start = 12.dp))
                        Text(text = "$43", modifier = Modifier.padding(start = 34.dp))
                    }
                }
                Divider( modifier = Modifier
                    .height(100.dp)
                    .width(1.dp), color = Color.Gray)

            }
        })
    Divider(modifier = Modifier
        .width(550.dp)
        .padding(top = 10.dp, start = 10.dp), color = Color.LightGray)


    Spacer(modifier = Modifier.height(10.dp))
    Row {
        Text( "Trousers",
            fontSize = 17.sp, fontFamily = FontFamily.Monospace,
            modifier = Modifier.padding(start = 5.dp)

        )
        Divider(modifier = Modifier
            .width(300.dp)
            .padding(top = 10.dp, start = 10.dp), color = Color.LightGray)
    }
    Text(text = "Are an item of clothing worn from the waist to" +
            " anywhere between the knees and the ankles, " +
            "covering both legs separately",
        fontSize = 10.sp,
        modifier = Modifier.padding(start = 4.dp)
    )
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        modifier = Modifier.padding(start = 5.dp,top = 10.dp),
        content = {
            item {
                Box(Modifier.padding(end = 9.dp)) {
                    Column {
                        Image(painter = painterResource(id = R.drawable.ts1),
                            contentDescription = "trouser",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(100.dp)
                                .clip(RoundedCornerShape(5.dp))
                        )
                        Text(text = "Blue Trousers\n(Men-Wear)",
                            modifier = Modifier.padding(start = 12.dp))
                        Text(text = "$53", modifier = Modifier.padding(start = 34.dp))
                    }
                }
                Divider( modifier = Modifier
                    .height(100.dp)
                    .width(1.dp), color = Color.Gray)

            }
            item {
                Box(Modifier.padding(end = 9.dp)) {
                    Column {
                        Image(painter = painterResource(id = R.drawable.ts2),
                            contentDescription = "short",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(100.dp)
                                .clip(RoundedCornerShape(5.dp)))
                        Text(text = "Grey Trousers\n(Men-Wear)",
                            modifier = Modifier.padding(start = 12.dp))
                        Text(text = "$78", modifier = Modifier.padding(start = 34.dp))
                    }
                }
                Divider( modifier = Modifier
                    .height(100.dp)
                    .width(1.dp), color = Color.Gray)

            }
            item {
                Box(Modifier.padding(end = 9.dp)) {
                    Column {
                        Image(painter = painterResource(id = R.drawable.ts3),
                            contentDescription = "short",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(100.dp)
                                .clip(RoundedCornerShape(5.dp)))
                        Text(text = "Brown Trousers\n(Men-Wear)",
                            modifier = Modifier.padding(start = 12.dp))
                        Text(text = "$66", modifier = Modifier.padding(start = 34.dp))
                    }
                }
                Divider( modifier = Modifier
                    .height(100.dp)
                    .width(1.dp), color = Color.Gray)

            }

            item {
                Box (Modifier.padding(end = 9.dp)){
                    Column {
                        Image(painter = painterResource(id = R.drawable.ts4),
                            contentDescription = "short",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(100.dp)
                                .clip(RoundedCornerShape(5.dp)))
                        Text(text = "Black Trousers\n(Men Wear)",
                            modifier = Modifier.padding(start = 12.dp))
                        Text(text = "$39", modifier = Modifier.padding(start = 34.dp))
                    }
                }
                Divider( modifier = Modifier
                    .height(100.dp)
                    .width(1.dp), color = Color.Gray)

            }

            item {
                Box (Modifier.padding(end = 9.dp)){
                    Column {
                        Image(painter = painterResource(id = R.drawable.ts5),
                            contentDescription = "short",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(100.dp)
                                .clip(RoundedCornerShape(5.dp)))
                        Text(text = "Grey Trousers\n(Men Wear)",
                            modifier = Modifier.padding(start = 10.dp))
                        Text(text = "$25", modifier = Modifier.padding(start = 34.dp))
                    }
                }
                Divider( modifier = Modifier
                    .height(100.dp)
                    .width(1.dp), color = Color.Gray)

            }

            item {
                Box (Modifier.padding(end = 9.dp)){
                    Column {
                        Image(painter = painterResource(id = R.drawable.ts6),
                            contentDescription = "short",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(100.dp)
                                .clip(RoundedCornerShape(5.dp)))
                        Text(text = "Black Trousers\n(Men Wear)",
                            modifier = Modifier.padding(start = 12.dp))
                        Text(text = "$98", modifier = Modifier.padding(start = 34.dp))
                    }
                }
                Divider( modifier = Modifier
                    .height(100.dp)
                    .width(1.dp), color = Color.Gray)

            }

            item {
                Box (Modifier.padding(end = 9.dp)){
                    Column {
                        Image(painter = painterResource(id = R.drawable.ts7),
                            contentDescription = "short",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(100.dp)
                                .clip(RoundedCornerShape(5.dp)))
                        Text(text = "Brown Trousers\n(Men Wear)",
                            modifier = Modifier.padding(start = 12.dp))
                        Text(text = "$43", modifier = Modifier.padding(start = 34.dp))
                    }
                }
                Divider( modifier = Modifier
                    .height(100.dp)
                    .width(1.dp), color = Color.Gray)

            }
        })


    Row {
        Text( "Official Shirts",
            fontSize = 17.sp, fontFamily = FontFamily.Monospace,
            modifier = Modifier.padding(start = 5.dp)

        )
        Divider(modifier = Modifier
            .width(300.dp)
            .padding(top = 10.dp, start = 10.dp), color = Color.LightGray)
    }
    Text(text = " A shirt is more specifically a garment with a collar, " +
            "sleeves with cuffs, " +
            "and a full vertical opening with buttons or snaps",
        fontSize = 10.sp,
        modifier = Modifier.padding(start = 4.dp)
    )
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        modifier = Modifier.padding(start = 5.dp,top = 8.dp),
        content = {
            item {
                Box(Modifier.padding(end = 9.dp)) {
                    Column {
                        Image(painter = painterResource(id = R.drawable.q1),
                            contentDescription = "shirt",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(100.dp)
                                .clip(RoundedCornerShape(5.dp))
                        )
                        Text(text = "5-Piece Official Wear",
                            modifier = Modifier.padding(start = 2.dp))
                        Text(text = "$33", modifier = Modifier.padding(start = 30.dp))
                    }
                }
                Divider( modifier = Modifier
                    .height(100.dp)
                    .width(1.dp), color = Color.Gray)

            }
            item {
                Box(Modifier.padding(end = 9.dp)) {
                    Column {
                        Image(painter = painterResource(id = R.drawable.q2),
                            contentDescription = "shirt",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(100.dp)
                                .clip(RoundedCornerShape(5.dp)))
                        Text(text = "White Official Wear",
                            modifier = Modifier.padding(start = 2.dp))
                        Text(text = "$20", modifier = Modifier.padding(start = 30.dp))
                    }
                }
                Divider( modifier = Modifier
                    .height(100.dp)
                    .width(1.dp), color = Color.Gray)

            }
            item {
                Box(Modifier.padding(end = 9.dp)) {
                    Column {
                        Image(painter = painterResource(id = R.drawable.q3),
                            contentDescription = "shirt",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(100.dp)
                                .clip(RoundedCornerShape(5.dp)))
                        Text(text = "Executive Official Wear",
                            modifier = Modifier.padding(start = 1.dp))
                        Text(text = "$40", modifier = Modifier.padding(start = 30.dp))
                    }
                }
                Divider( modifier = Modifier
                    .height(100.dp)
                    .width(1.dp), color = Color.Gray)

            }

            item {
                Box (Modifier.padding(end = 9.dp)){
                    Column {
                        Image(painter = painterResource(id = R.drawable.q4),
                            contentDescription = "shirt",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(100.dp)
                                .clip(RoundedCornerShape(5.dp)))
                        Text(text = "Blue Official Wear",
                            modifier = Modifier.padding(start = 3.dp))
                        Text(text = "$36", modifier = Modifier.padding(start = 30.dp))
                    }
                }
                Divider( modifier = Modifier
                    .height(100.dp)
                    .width(1.dp), color = Color.Gray)

            }

            item {
                Box (Modifier.padding(end = 9.dp)){
                    Column {
                        Image(painter = painterResource(id = R.drawable.q5),
                            contentDescription = "shirt",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(100.dp)
                                .clip(RoundedCornerShape(5.dp)))
                        Text(text = "Blue Official Wear",
                            modifier = Modifier.padding(start = 3.dp))
                        Text(text = "$22", modifier = Modifier.padding(start = 30.dp))
                    }
                }
                Divider( modifier = Modifier
                    .height(100.dp)
                    .width(1.dp), color = Color.Gray)

            }

            item {
                Box (Modifier.padding(end = 9.dp)){
                    Column {
                        Image(painter = painterResource(id = R.drawable.q6),
                            contentDescription = "shirt",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(100.dp)
                                .clip(RoundedCornerShape(5.dp)))
                        Text(text = "Pink,Black,Blue,\nMaroon Official Wear",
                            modifier = Modifier.padding(start = 3.dp))
                        Text(text = "$28", modifier = Modifier.padding(start = 30.dp))
                    }
                }
                Divider( modifier = Modifier
                    .height(100.dp)
                    .width(1.dp), color = Color.Gray)

            }

            item {
                Box (Modifier.padding(end = 9.dp)){
                    Column {
                        Image(painter = painterResource(id = R.drawable.q7),
                            contentDescription = "shirt",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(100.dp)
                                .clip(RoundedCornerShape(5.dp)))
                        Text(text = "Official Wear",
                            modifier = Modifier.padding(start = 3.dp))
                        Text(text = "$39", modifier = Modifier.padding(start = 30.dp))
                    }
                }
                Divider( modifier = Modifier
                    .height(100.dp)
                    .width(1.dp), color = Color.Gray)

            }

            item {
                Box (Modifier.padding(end = 9.dp)){
                    Column {
                        Image(painter = painterResource(id = R.drawable.q8),
                            contentDescription = "shirt",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(100.dp)
                                .clip(RoundedCornerShape(5.dp)))
                        Text(text = "Blue,Black,Pink\n Official Wear",
                            modifier = Modifier.padding(start = 3.dp))
                        Text(text = "$44", modifier = Modifier.padding(start = 30.dp))
                    }
                }
                Divider( modifier = Modifier
                    .height(100.dp)
                    .width(1.dp), color = Color.Gray)

            }



            item {
                Box (Modifier.padding(end = 9.dp)){
                    Column {
                        Image(painter = painterResource(id = R.drawable.q9),
                            contentDescription = "shirt",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(100.dp)
                                .clip(RoundedCornerShape(5.dp)))
                        Text(text = "Blue ,Black,Pink\n Official Wear)",
                            modifier = Modifier.padding(start = 3.dp))
                        Text(text = "$44", modifier = Modifier.padding(start = 30.dp))
                    }
                }
                Divider( modifier = Modifier
                    .height(100.dp)
                    .width(1.dp), color = Color.Gray)

            }

            item {
                Box (Modifier.padding(end = 9.dp)){
                    Column {
                        Image(painter = painterResource(id = R.drawable.q10),
                            contentDescription = "shirt",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(100.dp)
                                .clip(RoundedCornerShape(5.dp)))
                        Text(text = "Blue Official Wear",
                            modifier = Modifier.padding(start = 3.dp))
                        Text(text = "$44", modifier = Modifier.padding(start = 30.dp))
                    }
                }
                Divider( modifier = Modifier
                    .height(100.dp)
                    .width(1.dp), color = Color.Gray)

            }

            item {
                Box (Modifier.padding(end = 9.dp)){
                    Column {
                        Image(painter = painterResource(id = R.drawable.q11),
                            contentDescription = "shirt",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(100.dp)
                                .clip(RoundedCornerShape(5.dp)))
                        Text(text = "Official Wear)",
                            modifier = Modifier.padding(start = 3.dp))
                        Text(text = "$44", modifier = Modifier.padding(start = 30.dp))
                    }
                }
                Divider( modifier = Modifier
                    .height(100.dp)
                    .width(1.dp), color = Color.Gray)

            }
        })

Divider(modifier = Modifier
.width(550.dp)
.padding(top = 10.dp, start = 10.dp), color = Color.LightGray)


    Row {
        Text( "Sneaker Rubbers",
            fontSize = 17.sp, fontFamily = FontFamily.Monospace,
            modifier = Modifier.padding(start = 5.dp)

        )
        Divider(modifier = Modifier
            .width(300.dp)
            .padding(top = 10.dp, start = 10.dp), color = Color.LightGray)
    }
    Text(text = " Sneakers (also called trainers, athletic shoes, tennis shoes, gym shoes, kicks, sport shoes, flats, running shoes, or runners) are shoes primarily designed for sports or other forms of physical exercise, " +
            "but which are now also widely used for everyday casual wear.",
        fontSize = 10.sp,
        modifier = Modifier.padding(start = 4.dp)
    )
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        modifier = Modifier.padding(start = 5.dp,top = 8.dp),
        content = {
            item {
                Box(Modifier.padding(end = 9.dp)) {
                    Column {
                        Image(painter = painterResource(id = R.drawable.r1),
                            contentDescription = "rubbers",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(100.dp)
                                .clip(RoundedCornerShape(5.dp))
                        )
                        Text(text = "Spiky Sneakers",
                            modifier = Modifier.padding(start = 2.dp))
                        Text(text = "$77", modifier = Modifier.padding(start = 30.dp))
                    }
                }
                Divider( modifier = Modifier
                    .height(100.dp)
                    .width(1.dp), color = Color.Gray)

            }
            item {
                Box(Modifier.padding(end = 9.dp)) {
                    Column {
                        Image(painter = painterResource(id = R.drawable.r2),
                            contentDescription = "rubbers",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(100.dp)
                                .clip(RoundedCornerShape(5.dp)))
                        Text(text = "Spiky Rubbers",
                            modifier = Modifier.padding(start = 2.dp))
                        Text(text = "$45", modifier = Modifier.padding(start = 30.dp))
                    }
                }
                Divider( modifier = Modifier
                    .height(100.dp)
                    .width(1.dp), color = Color.Gray)

            }
            item {
                Box(Modifier.padding(end = 9.dp)) {
                    Column {
                        Image(painter = painterResource(id = R.drawable.r3),
                            contentDescription = "rubbers",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(100.dp)
                                .clip(RoundedCornerShape(5.dp)))
                        Text(text = "New Arrival",
                            modifier = Modifier.padding(start = 1.dp))
                        Text(text = "$80", modifier = Modifier.padding(start = 30.dp))
                    }
                }
                Divider( modifier = Modifier
                    .height(100.dp)
                    .width(1.dp), color = Color.Gray)

            }

            item {
                Box (Modifier.padding(end = 9.dp)){
                    Column {
                        Image(painter = painterResource(id = R.drawable.r4),
                            contentDescription = "rubbers",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(100.dp)
                                .clip(RoundedCornerShape(5.dp)))
                        Text(text = "White Sneakers",
                            modifier = Modifier.padding(start = 3.dp))
                        Text(text = "$66", modifier = Modifier.padding(start = 30.dp))
                    }
                }
                Divider( modifier = Modifier
                    .height(100.dp)
                    .width(1.dp), color = Color.Gray)

            }

            item {
                Box (Modifier.padding(end = 9.dp)){
                    Column {
                        Image(painter = painterResource(id = R.drawable.r5),
                            contentDescription = "rubbers",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(100.dp)
                                .clip(RoundedCornerShape(5.dp)))
                        Text(text = "Bumper Sneakers",
                            modifier = Modifier.padding(start = 3.dp))
                        Text(text = "$58", modifier = Modifier.padding(start = 30.dp))
                    }
                }
                Divider( modifier = Modifier
                    .height(100.dp)
                    .width(1.dp), color = Color.Gray)

            }

            item {
                Box (Modifier.padding(end = 9.dp)){
                    Column {
                        Image(painter = painterResource(id = R.drawable.r6),
                            contentDescription = "rubbers",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(100.dp)
                                .clip(RoundedCornerShape(5.dp)))
                        Text(text = "RAO Splashy",
                            modifier = Modifier.padding(start = 3.dp))
                        Text(text = "$99", modifier = Modifier.padding(start = 30.dp))
                    }
                }
                Divider( modifier = Modifier
                    .height(100.dp)
                    .width(1.dp), color = Color.Gray)

            }

            item {
                Box (Modifier.padding(end = 9.dp)){
                    Column {
                        Image(painter = painterResource(id = R.drawable.r7),
                            contentDescription = "rubbers",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(100.dp)
                                .clip(RoundedCornerShape(5.dp)))
                        Text(text = "Blue Sneakers",
                            modifier = Modifier.padding(start = 3.dp))
                        Text(text = "$39", modifier = Modifier.padding(start = 30.dp))
                    }
                }
                Divider( modifier = Modifier
                    .height(100.dp)
                    .width(1.dp), color = Color.Gray)

            }

            item {
                Box (Modifier.padding(end = 9.dp)){
                    Column {
                        Image(painter = painterResource(id = R.drawable.r2),
                            contentDescription = "rubbers",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(100.dp)
                                .clip(RoundedCornerShape(5.dp)))
                        Text(text = "Up for Grabs",
                            modifier = Modifier.padding(start = 3.dp))
                        Text(text = "$123", modifier = Modifier.padding(start = 30.dp))
                    }
                }
                Divider( modifier = Modifier
                    .height(100.dp)
                    .width(1.dp), color = Color.Gray)

            }

        }
    )



}


}



@Preview
@Composable
fun PreviewMain(){
    MainPageGrid(navController = rememberNavController())
}