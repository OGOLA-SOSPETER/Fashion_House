package com.SosDeveloper.myapplication

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun WelcomePage(navController:NavHostController){
    Image(painter = painterResource(id = R.drawable.rr),
        contentDescription = "Launcher",
    Modifier.fillMaxSize()
        )
    Column {
        val context = LocalContext.current
IconButton(modifier = Modifier.padding(start = 100.dp,top = 300.dp),onClick = {
    run {
        Color.Red
        navController.navigate("Dashboard")
        Toast.makeText(context,"Welcome",Toast.LENGTH_LONG).show()
    }
})
{
    Icon(Icons.Filled.ArrowForward,
        contentDescription = "forward",
        Modifier.size(40.dp)
            .clip(CircleShape)
    )
}

}
        }




@Preview
@Composable
fun WelcomePreview(){
    WelcomePage(navController = rememberNavController())
}