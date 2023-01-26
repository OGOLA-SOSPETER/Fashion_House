package com.SosDeveloper.myapplication

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.SosDeveloper.myapplication.ui.theme.Purple500
import kotlinx.coroutines.launch

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ShirtsPage(navController: NavHostController){
    val materialBlue700= Color(0xFF1976D2)
    val scaffoldState = rememberScaffoldState(rememberDrawerState(DrawerValue.Open))
    Scaffold(
    scaffoldState = scaffoldState,
    topBar = {
    TopAppBar(title =  {
        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                Icons.Filled.ArrowBack,contentDescription = "Back Arrow",
                tint = Color.White
            )
        }
        Text(text = "My Shirts", color = Color.White,
        modifier = Modifier.offset(50.dp)
            )


    }, elevation = 7.dp,backgroundColor = materialBlue700)},
        content = {
                  Shirts(navController = rememberNavController())

        },
    )
    }

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun Shirts(navController: NavHostController){
Column {
    Card(

        contentColor = Color.DarkGray,
        shape = RoundedCornerShape(15.dp),
        border = BorderStroke(width = 1.dp, color = Color.Black),
        modifier = Modifier
            .offset(20.dp, 10.dp)
            .background(color = MaterialTheme.colors.primary)
    ) {
        Column {
            Image(painter = painterResource(id = R.drawable.s1), contentDescription = "shirt")
            Text(text = AnnotatedString("Green Leafy Floral Slim Fit"))
            Text(text = "Description:", fontWeight = FontWeight.Bold,
                color = Color.Black)
            Text(text = "Color: Green\n" +
                    "Design: Floral\n" +
                    "Type of sleeve :Short sleeve\n" +
                    "Type of wear:Casual\n" +
                    "Type of collar : Turn down collar")
        }
    }
    Wardrobe()
}
}


@Preview
@Composable
fun PreviewShirts(){
    ShirtsPage(navController = rememberNavController())
}


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun TryNew(){

    val scaffoldState = rememberBackdropScaffoldState(
        BackdropValue.Concealed
    )
    val scope = rememberCoroutineScope()
    BackdropScaffold(
        scaffoldState = scaffoldState,
        appBar = {
            TopAppBar(
                title = { Text("Backdrop") },
                navigationIcon = {
                    if (scaffoldState.isConcealed) {
                        IconButton(
                            onClick = {
                                scope.launch { scaffoldState.reveal() }
                            }
                        ) {
                            Icon(
                                Icons.Default.Menu,
                                contentDescription = "Menu"
                            )
                        }
                    } else {
                        IconButton(
                            onClick = {
                                scope.launch { scaffoldState.conceal() }
                            }
                        ) {
                            Icon(
                                Icons.Default.Close,
                                contentDescription = "Close"
                            )
                        }
                    }
                },
                elevation = 0.dp,
                backgroundColor = Color.Transparent
            )
        },
        backLayerContent = {
            // Back layer content
        },
        frontLayerContent = {
            // Front layer content
        }
    )
}