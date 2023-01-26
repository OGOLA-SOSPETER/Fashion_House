package com.SosDeveloper.myapplication

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.SosDeveloper.myapplication.ui.theme.Purple500

@Composable
fun Briefcase(navController:  NavHostController){
    Column() {
        Image(painter = painterResource(id = R.drawable.kk1),
            contentDescription = "Background Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
                .clip(RoundedCornerShape(10.dp))

        )
    }
    val color= Color(0xFF1976D2)

    Column{
        TopAppBar(backgroundColor =color) {

            IconButton(onClick = { navController.navigate("Dashboard") }) {
                Icon(Icons.Default.ArrowBack, contentDescription = "Back to homepage",tint = Color.White)
            }

            Text(
                text = "Travel Suitcases",
                fontFamily = FontFamily.Monospace,
                fontSize = 16.sp,
                color = Color.White,
                modifier = Modifier.padding(start = 60.dp)

            )

        }

LazyVerticalGrid(columns = GridCells.Adaptive(100.dp),
    verticalArrangement = Arrangement.spacedBy(10.dp),
    horizontalArrangement = Arrangement.spacedBy(10.dp),
    modifier = Modifier.padding(20.dp),
    content = {

        item {
            Box(Modifier.padding(end = 2.dp, start = 1.dp)) {
                Column {
                    Image(painter = painterResource(id = R.drawable.scs2),
                        contentDescription = "suitcases",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(80.dp)
                            .clip(RoundedCornerShape(1.dp)))
                    Text(text = "Travel Bag\n\tStylish",
                        fontSize = 10.sp,
                        modifier = Modifier.padding(start = 15.dp))
                    Text(text = "$345", modifier = Modifier.padding(start = 30.dp))
                }
            }

        }

        item {
            Box(Modifier.padding(end = 2.dp, start = 1.dp)) {
                Column {
                    Image(painter = painterResource(id = R.drawable.scs3),
                        contentDescription = "suitcases",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(80.dp)
                            .clip(RoundedCornerShape(1.dp)))
                    Text(text = "Travel Bag\n\tStylish",
                        fontSize = 10.sp,
                        modifier = Modifier.padding(start = 15.dp))
                    Text(text = "$345", modifier = Modifier.padding(start = 30.dp))
                }
            }

        }

        item {
            Box(Modifier.padding(end = 2.dp, start = 1.dp)) {
                Column {
                    Image(painter = painterResource(id = R.drawable.scs14),
                        contentDescription = "suitcases",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(80.dp)
                            .clip(RoundedCornerShape(1.dp)))
                    Text(text = "Travel Bag\n\tStylish",
                        fontSize = 10.sp,
                        modifier = Modifier.padding(start = 15.dp))
                    Text(text = "$345", modifier = Modifier.padding(start = 30.dp))
                }
            }

        }

        item {
            Box(Modifier.padding(end = 2.dp, start = 1.dp)) {
                Column {
                    Image(painter = painterResource(id = R.drawable.scs6),
                        contentDescription = "suitcases",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(80.dp)
                            .clip(RoundedCornerShape(1.dp)))
                    Text(text = "Travel Bag\n\tStylish",
                        fontSize = 10.sp,
                        modifier = Modifier.padding(start = 15.dp))
                    Text(text = "$345", modifier = Modifier.padding(start = 30.dp))
                }
            }

        }

        item {
            Box(Modifier.padding(end = 2.dp, start = 1.dp)) {
                Column {
                    Image(painter = painterResource(id = R.drawable.scs7),
                        contentDescription = "suitcases",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(80.dp)
                            .clip(RoundedCornerShape(1.dp)))
                    Text(text = "Travel Bag\n\tStylish",
                        fontSize = 10.sp,
                        modifier = Modifier.padding(start = 15.dp))
                    Text(text = "$345", modifier = Modifier.padding(start = 30.dp))
                }
            }

        }

        item {
            Box(Modifier.padding(end = 2.dp, start = 1.dp)) {
                Column {
                    Image(painter = painterResource(id = R.drawable.scs8),
                        contentDescription = "suitcases",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(80.dp)
                            .clip(RoundedCornerShape(1.dp)))
                    Text(text = "Travel Bag\n\tStylish",
                        fontSize = 10.sp,
                        modifier = Modifier.padding(start = 15.dp))
                    Text(text = "$345", modifier = Modifier.padding(start = 30.dp))
                }
            }

        }

        item {
            Box(Modifier.padding(end = 2.dp, start = 1.dp)) {
                Column {
                    Image(painter = painterResource(id = R.drawable.scs9),
                        contentDescription = "suitcases",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(80.dp)
                            .clip(RoundedCornerShape(1.dp)))
                    Text(text = "Travel Bag\n\tStylish",
                        fontSize = 10.sp,
                        modifier = Modifier.padding(start = 15.dp))
                    Text(text = "$345", modifier = Modifier.padding(start = 30.dp))
                }
            }

        }

        item {
            Box(Modifier.padding(end = 2.dp, start = 1.dp)) {
                Column {
                    Image(painter = painterResource(id = R.drawable.scs10),
                        contentDescription = "suitcases",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(80.dp)
                            .clip(RoundedCornerShape(1.dp)))
                    Text(text = "Travel Bag\n\tStylish",
                        fontSize = 10.sp,
                        modifier = Modifier.padding(start = 15.dp))
                    Text(text = "$345", modifier = Modifier.padding(start = 30.dp))
                }
            }

        }

        item {
            Box(Modifier.padding(end = 2.dp, start = 1.dp)) {
                Column {
                    Image(painter = painterResource(id = R.drawable.scs11),
                        contentDescription = "suitcases",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(80.dp)
                            .clip(RoundedCornerShape(1.dp)))
                    Text(text = "Old is Gold",
                        fontSize = 10.sp,
                        modifier = Modifier.padding(start = 1.dp))
                    Text(text = "Kshs. 9999", modifier = Modifier.padding(start = 3.dp))
                }
            }

        }

        item {
            Box(Modifier.padding(end = 2.dp, start = 1.dp)) {
                Column {
                    Image(painter = painterResource(id = R.drawable.scs12),
                        contentDescription = "suitcases",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(80.dp)
                            .clip(RoundedCornerShape(1.dp)))
                    Text(text = "Green Flurvish Suitcase",
                        fontSize = 10.sp,
                        modifier = Modifier.padding(start = 15.dp))
                    Text(text = "Kshs. 6789", modifier = Modifier.padding(start = 3.dp))
                }
            }

        }

        item {
            Box(Modifier.padding(end = 2.dp, start = 1.dp)) {
                Column {
                    Image(painter = painterResource(id = R.drawable.scs13),
                        contentDescription = "suitcases",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(80.dp)
                            .clip(RoundedCornerShape(1.dp)))
                    Text(text = "Black Travel Bag\n" +
                            "3- Piece",
                        fontSize = 10.sp,
                        modifier = Modifier.padding(start = 1.dp))
                    Text(text = "Kshs.5678", modifier = Modifier.padding(start = 3.dp))
                }
            }

        }

        item {
            Box(Modifier.padding(end = 2.dp, start = 1.dp)) {
                Column {
                    Image(painter = painterResource(id = R.drawable.scs14),
                        contentDescription = "suitcases",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(80.dp)
                            .clip(RoundedCornerShape(1.dp)))
                    Text(text = "Brown Travel Bag",
                        fontSize = 10.sp,
                        modifier = Modifier.padding(start = 1.dp))
                    Text(text = "Kshs.3456", modifier = Modifier.padding(start = 3.dp))
                }
            }

        }


        item {
            Box(Modifier.padding(end = 2.dp, start = 1.dp)) {
                Column {
                    Image(painter = painterResource(id = R.drawable.bag1),
                        contentDescription = "suitcases",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(80.dp)
                            .clip(RoundedCornerShape(1.dp)))
                    Text(text = "Pioneer Brown Leather",
                        fontSize = 10.sp,
                        modifier = Modifier.padding(start = 1.dp))
                    Text(text = "Kshs.4800", modifier = Modifier.padding(start = 3.dp))
                }
            }

        }

        item {
            Box(Modifier.padding(end = 2.dp, start = 1.dp)) {
                Column {
                    Image(painter = painterResource(id = R.drawable.bag2),
                        contentDescription = "suitcases",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(80.dp)
                            .clip(RoundedCornerShape(1.dp)))
                    Text(text = "Executive Pvc Suitcase",
                        fontSize = 10.sp,
                        modifier = Modifier.padding(start = 1.dp))
                    Text(text = "Kshs.5342", modifier = Modifier.padding(start = 3.dp))
                }
            }

        }

        item {
            Box(Modifier.padding(end = 2.dp, start = 1.dp)) {
                Column {
                    Image(painter = painterResource(id = R.drawable.bag3),
                        contentDescription = "suitcases",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(80.dp)
                            .clip(RoundedCornerShape(1.dp)))
                    Text(text = "Pioneer PU Pioneer Leather Suitcase",
                        fontSize = 10.sp,
                        modifier = Modifier.padding(start = 1.dp))
                    Text(text = "Kshs.4897", modifier = Modifier.padding(start = 3.dp))
                }
            }

        }



        }
)
        val context = LocalContext.current
        val suitcaseLink = remember {
            Intent(Intent.ACTION_VIEW, Uri.parse("https://www.jumia.co.ke/catalog/?q=travel+suitcases"))
        }
        Box(modifier = Modifier.padding(start = 30.dp)) {
            Button(onClick = { context.startActivity(suitcaseLink) }) {
                Text(
                    "\t\t\t\tClick Me to View More \nSuitcases and pick one of your choice.",
                    fontWeight = FontWeight.ExtraLight,
                    fontSize = 17.sp,

                    )
            }
        }
    }

}
@Preview
@Composable
fun PreviewBrief(){
    Briefcase(navController = rememberNavController())
}