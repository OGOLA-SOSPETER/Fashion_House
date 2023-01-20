package com.SosDeveloper.myapplication

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.SosDeveloper.myapplication.ui.theme.Purple500

@Composable
fun ShirtsPage(navController: NavHostController){
    val colored = Purple500
    TopAppBar(backgroundColor =colored) {
        Text(
            text = "Shirts👕👚",
            fontFamily = FontFamily.Monospace,
            fontSize = 14.sp,
            color = Color.White,
            modifier = Modifier.padding(start = 50.dp,end = 140.dp)

        )

        IconButton(onClick = { navController.navigate("Dashboard") }) {
            Icon(Icons.Default.ArrowForward, contentDescription = "Back to homepage", tint = Color.White)
        }
    }
}

@Preview
@Composable
fun PreviewShirts(){
    ShirtsPage(navController = rememberNavController())
}