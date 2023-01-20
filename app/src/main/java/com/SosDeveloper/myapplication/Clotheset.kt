package com.SosDeveloper.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
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
fun FootWear(navController: NavHostController) {
    val colored = Purple500
    Column {
        Image(painter = painterResource(id = R.drawable.rr),
            contentDescription = "background",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
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
                Text("Ankle Socks.",
                    fontSize = 17.sp,
                    modifier = Modifier.padding(start = 5.dp)

                )
                Divider(modifier = Modifier
                    .width(300.dp)
                    .padding(top = 10.dp, start = 10.dp), color = Color.LightGray)
            }
            Text(text = "They are not long, typically reaching" +
                    " just below or above the ankle." +
                    "Anklets are sometimes folded or cuffed over.",
                fontSize = 10.sp,
                modifier = Modifier.padding(start = 4.dp)
            )
            LazyVerticalGrid(columns = GridCells.Fixed(4),
                horizontalArrangement = Arrangement.spacedBy(10.dp),
                verticalArrangement = Arrangement.spacedBy(10.dp),
                modifier = Modifier.padding(start = 5.dp, top = 8.dp),
                content = {
                    item {
                        Box(Modifier.padding(end = 1.dp)) {
                            Column {
                                Image(painter = painterResource(id = R.drawable.sk1),
                                    contentDescription = "socks",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .size(100.dp)
                                        .clip(RoundedCornerShape(5.dp))
                                )
                                Text(text = "Socks",
                                    modifier = Modifier.padding(start = 2.dp))
                                Text(text = "$3", modifier = Modifier.padding(start = 30.dp))
                            }
                        }

                    }
                    item {
                        Box(Modifier.padding(end = 9.dp)) {
                            Column {
                                Image(painter = painterResource(id = R.drawable.sk2),
                                    contentDescription = "socks",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .size(100.dp)
                                        .clip(RoundedCornerShape(5.dp)))
                                Text(text = "Socks",
                                    modifier = Modifier.padding(start = 2.dp))
                                Text(text = "$7", modifier = Modifier.padding(start = 30.dp))
                            }
                        }

                    }
                    item {
                        Box(Modifier.padding(end = 1.dp)) {
                            Column {
                                Image(painter = painterResource(id = R.drawable.sk3),
                                    contentDescription = "socks",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .size(100.dp)
                                        .clip(RoundedCornerShape(5.dp)))
                                Text(text = " Socks",
                                    modifier = Modifier.padding(start = 1.dp))
                                Text(text = "$4", modifier = Modifier.padding(start = 30.dp))
                            }
                        }

                    }

                    item {
                        Box(Modifier.padding(end = 1.dp)) {
                            Column {
                                Image(painter = painterResource(id = R.drawable.sk4),
                                    contentDescription = "socks",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .size(100.dp)
                                        .clip(RoundedCornerShape(5.dp)))
                                Text(text = "Socks",
                                    modifier = Modifier.padding(start = 3.dp))
                                Text(text = "$6", modifier = Modifier.padding(start = 30.dp))
                            }
                        }

                    }

                    item {
                        Box(Modifier.padding(end = 1.dp)) {
                            Column {
                                Image(painter = painterResource(id = R.drawable.sk5),
                                    contentDescription = "socks",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .size(100.dp)
                                        .clip(RoundedCornerShape(5.dp)))
                                Text(text = "Socks",
                                    modifier = Modifier.padding(start = 3.dp))
                                Text(text = "$8", modifier = Modifier.padding(start = 30.dp))
                            }
                        }

                    }

                    item {
                        Box(Modifier.padding(end = 1.dp)) {
                            Column {
                                Image(painter = painterResource(id = R.drawable.sk6),
                                    contentDescription = "socks",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .size(100.dp)
                                        .clip(RoundedCornerShape(5.dp)))
                                Text(text = "Socks",
                                    modifier = Modifier.padding(start = 3.dp))
                                Text(text = "$9", modifier = Modifier.padding(start = 30.dp))
                            }
                        }

                    }

                    item {
                        Box(Modifier.padding(end = 1.dp)) {
                            Column {
                                Image(painter = painterResource(id = R.drawable.sk7),
                                    contentDescription = "socks",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .size(100.dp)
                                        .clip(RoundedCornerShape(5.dp)))
                                Text(text = "Socks",
                                    modifier = Modifier.padding(start = 3.dp))
                                Text(text = "$8", modifier = Modifier.padding(start = 30.dp))
                            }
                        }

                    }

                    item {
                        Box(Modifier.padding(end = 1.dp)) {
                            Column {
                                Image(painter = painterResource(id = R.drawable.sk8),
                                    contentDescription = "socks",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .size(100.dp)
                                        .clip(RoundedCornerShape(5.dp)))
                                Text(text = " Socks",
                                    modifier = Modifier.padding(start = 3.dp))
                                Text(text = "$5", modifier = Modifier.padding(start = 30.dp))
                            }
                        }

                    }


                    item {
                        Box(Modifier.padding(end = 1.dp)) {
                            Column {
                                Image(painter = painterResource(id = R.drawable.sk9),
                                    contentDescription = "socks",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .size(100.dp)
                                        .clip(RoundedCornerShape(5.dp)))
                                Text(text = " Socks",
                                    modifier = Modifier.padding(start = 3.dp))
                                Text(text = "$6", modifier = Modifier.padding(start = 30.dp))
                            }
                        }

                    }


                    item {
                        Box(Modifier.padding(end = 1.dp)) {
                            Column {
                                Image(painter = painterResource(id = R.drawable.sk10),
                                    contentDescription = "socks",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .size(100.dp)
                                        .clip(RoundedCornerShape(5.dp)))
                                Text(text = "Socks",
                                    modifier = Modifier.padding(start = 3.dp))
                                Text(text = "$6", modifier = Modifier.padding(start = 30.dp))
                            }
                        }

                    }


                    item {
                        Box(Modifier.padding(end = 1.dp)) {
                            Column {
                                Image(painter = painterResource(id = R.drawable.sk11),
                                    contentDescription = "socks",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .size(100.dp)
                                        .clip(RoundedCornerShape(5.dp)))
                                Text(text = " Socks",
                                    modifier = Modifier.padding(start = 3.dp))
                                Text(text = "$5", modifier = Modifier.padding(start = 30.dp))
                            }
                        }

                    }



                    item {
                        Box(Modifier.padding(end = 1.dp)) {
                            Column {
                                Image(painter = painterResource(id = R.drawable.sk12),
                                    contentDescription = "socks",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .size(100.dp)
                                        .clip(RoundedCornerShape(5.dp)))
                                Text(text = "Socks",
                                    modifier = Modifier.padding(start = 3.dp))
                                Text(text = "$5", modifier = Modifier.padding(start = 30.dp))
                            }
                        }

                    }




                    item {
                        Box(Modifier.padding(end = 1.dp)) {
                            Column {
                                Image(painter = painterResource(id = R.drawable.sk13),
                                    contentDescription = "socks",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .size(100.dp)
                                        .clip(RoundedCornerShape(5.dp)))
                                Text(text = "Socks",
                                    modifier = Modifier.padding(start = 3.dp))
                                Text(text = "$7", modifier = Modifier.padding(start = 30.dp))
                            }
                        }

                    }
                    item {
                        Box(Modifier.padding(end = 1.dp)) {
                            Column {
                                Image(painter = painterResource(id = R.drawable.sk14),
                                    contentDescription = "socks",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .size(100.dp)
                                        .clip(RoundedCornerShape(5.dp)))
                                Text(text = "Socks",
                                    modifier = Modifier.padding(start = 3.dp))
                                Text(text = "$5", modifier = Modifier.padding(start = 30.dp))
                            }
                        }

                    }

                }
            )
            LazyColumn {
                item {
                    FullWear(navController = rememberNavController())
                }
            }
        }



    }
}

@Preview
@Composable
fun PreviewSoc(){
    FootWear(navController = rememberNavController())
}


@Composable
fun FullWear(navController: NavHostController){

    Column(modifier = Modifier.padding(start = 20.dp,top = 50.dp)) {

        Row {
            Text("Full Length Socks.",
                fontSize = 17.sp,
                modifier = Modifier.padding(start = 5.dp)

            )
            Divider(modifier = Modifier
                .width(200.dp)
                .padding(top = 10.dp, start = 10.dp), color = Color.LightGray)
        }
        Text(text = "They are  usually long.\n" +
                "Cover from the Toe Nails to the Knee Level. Usually won by men with" +
                "official clothing. Women also wear them during cold seasons",
            fontSize = 10.sp,
            modifier = Modifier.padding(start = 4.dp)
        )
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier.padding(start = 5.dp, top = 10.dp),
            content = {
                item {
                    Image(painter = painterResource(id = R.drawable.sk4),
                        contentDescription = "socks",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(100.dp)
                            .clip(RoundedCornerShape(5.dp))
                    )
                }
                item {
                    Text(text = "Socks",
                        modifier = Modifier.padding(start = 2.dp))
                    Text(text = "$33", modifier = Modifier.padding(start = 30.dp))
                }
            }
        )

        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier.padding(start = 5.dp, top = 10.dp),
            content = {

                item {

                    Image(painter = painterResource(id = R.drawable.sk5),
                        contentDescription = "socks",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(100.dp)
                            .clip(RoundedCornerShape(5.dp)))
                }
                    item{
                            Text(text = "Socks",
                                modifier = Modifier.padding(start = 2.dp))
                            Text(text = "$20", modifier = Modifier.padding(start = 30.dp))
                        }
                    }

        )
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier.padding(start = 5.dp, top = 10.dp),
            content = {
                item {

                    Image(painter = painterResource(id = R.drawable.sk6),
                        contentDescription = "socks",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(100.dp)
                            .clip(RoundedCornerShape(5.dp)))
                }
                item{
                            Text(text = "Socks",
                                modifier = Modifier.padding(start = 1.dp))
                            Text(text = "$40", modifier = Modifier.padding(start = 30.dp))
                        }
                    }
        )
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier.padding(start = 5.dp, top = 10.dp),
            content = {
                item {

                    Image(painter = painterResource(id = R.drawable.sk9),
                        contentDescription = "socks",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(100.dp)
                            .clip(RoundedCornerShape(5.dp)))
                }
                        item{
                            Text(text = "Socks",
                                modifier = Modifier.padding(start = 3.dp))
                            Text(text = "$36", modifier = Modifier.padding(start = 30.dp))
                        }
                    }

        )
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier.padding(start = 5.dp, top = 10.dp),
            content = {
                item {

                    Image(painter = painterResource(id = R.drawable.sk11),
                        contentDescription = "socks",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(100.dp)
                            .clip(RoundedCornerShape(5.dp)))
                }
                item{
                            Text(text = "Socks",
                                modifier = Modifier.padding(start = 3.dp))
                            Text(text = "$22", modifier = Modifier.padding(start = 30.dp))
                        }
                    }

        )
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier.padding(start = 5.dp, top = 10.dp),
            content = {

                item {
                    Image(painter = painterResource(id = R.drawable.sk1),
                        contentDescription = "socks",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(100.dp)
                            .clip(RoundedCornerShape(5.dp)))
                }
                item{
                            Text(text = " Socks",
                                modifier = Modifier.padding(start = 3.dp))
                            Text(text = "$28", modifier = Modifier.padding(start = 30.dp))
                        }
                    }

        )
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier.padding(start = 5.dp, top = 10.dp),
            content = {
                item {

                    Image(painter = painterResource(id = R.drawable.sk13),
                        contentDescription = "socks",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(100.dp)
                            .clip(RoundedCornerShape(5.dp)))
                }
                item{
                            Text(text = " Socks",
                                modifier = Modifier.padding(start = 3.dp))
                            Text(text = "$39", modifier = Modifier.padding(start = 30.dp))
                        }
                    }

        )
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier.padding(start = 5.dp, top = 10.dp),
            content = {
                item {

                    Image(painter = painterResource(id = R.drawable.sk14),
                        contentDescription = "socks",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(100.dp)
                            .clip(RoundedCornerShape(5.dp)))
                }
                item{
                            Text(text = " Socks",
                                modifier = Modifier.padding(start = 3.dp))
                            Text(text = "$44", modifier = Modifier.padding(start = 30.dp))
                        }
                    }

        )

        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier.padding(start = 5.dp, top = 10.dp),
            content = {
                item {

                    Image(painter = painterResource(id = R.drawable.sk15),
                        contentDescription = "socks",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(100.dp)
                            .clip(RoundedCornerShape(5.dp)))
                }
                item{
                            Text(text = "Stripped Socks",
                                modifier = Modifier.padding(start = 3.dp))
                            Text(text = "$44", modifier = Modifier.padding(start = 30.dp))
                        }
                    }

    )

        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier.padding(start = 5.dp, top = 10.dp),
            content = {
                item {

                    Image(painter = painterResource(id = R.drawable.sk3),
                        contentDescription = "socks",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(100.dp)
                            .clip(RoundedCornerShape(5.dp)))
                }
                item{
                            Text(text = " Socks",
                                modifier = Modifier.padding(start = 3.dp))
                            Text(text = "$44", modifier = Modifier.padding(start = 30.dp))
                        }
                    }

        )

        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier.padding(start = 5.dp, top = 10.dp),
            content = {
                item {

                    Image(painter = painterResource(id = R.drawable.sk5),
                        contentDescription = "socks",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(100.dp)
                            .clip(RoundedCornerShape(5.dp)))
                }
                item{
                            Text(text = "Grey Socks",
                                modifier = Modifier.padding(start = 3.dp))
                            Text(text = "$44", modifier = Modifier.padding(start = 30.dp))
                        }
                    }

        )


        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier.padding(start = 5.dp, top = 10.dp),
            content = {
                item {

                    Image(painter = painterResource(id = R.drawable.sk6),
                        contentDescription = "socks",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(100.dp)
                            .clip(RoundedCornerShape(5.dp)))
                }
                item{
                            Text(text = " Socks",
                                modifier = Modifier.padding(start = 3.dp))
                            Text(text = "$44", modifier = Modifier.padding(start = 30.dp))
                        }
                    }

        )
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier.padding(start = 5.dp, top = 10.dp),
            content = {

                item {

                    Image(painter = painterResource(id = R.drawable.sk11),
                        contentDescription = "socks",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(100.dp)
                            .clip(RoundedCornerShape(5.dp)))
                }
                item{
                            Text(text = "Patched Socks",
                                modifier = Modifier.padding(start = 3.dp))
                            Text(text = "$44", modifier = Modifier.padding(start = 30.dp))
                        }
                    }
        )
                }


            }
