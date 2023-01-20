package com.SosDeveloper.myapplication


import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController



@Composable
fun SettingsPage(navController: NavHostController) {
    Column(modifier = Modifier.background(color = Color.White).border(width = 2.dp,color = Color.Black)){
        TopAppBar(
            title = {
                Text("MY Settings", color = Color.Black)
            },
            elevation = 4.dp,
            backgroundColor = Color.Transparent,
            //backgroundColor = MaterialTheme.colors.background,
            navigationIcon = {
                IconButton(onClick = { navController.navigate("Dashboard") }) {
                    Icon(Icons.Filled.ArrowBack, null, modifier = Modifier.size(20.dp))
                }
            },

            )

        Box(
            Modifier
                .background(color = Color.White)
                .fillMaxSize()
                .padding(20.dp)
        ) {
            Column {
                val Context = LocalContext.current
                val Context1 = LocalContext.current
                val Context2 = LocalContext.current
                val Context3 = LocalContext.current
                val Context4 = LocalContext.current

                Row {
                    Icon(
                        Icons.Filled.Settings,
                        contentDescription = "General Settings",
                        tint = Color.Black
                    )
                    Spacer(modifier = Modifier.width(20.dp))
                    ClickableText(
                        text = AnnotatedString("General"),
                        onClick = {}
                    )
                }
                Spacer(modifier = Modifier.height(5.dp))
                Divider(modifier = Modifier
                    .width(400.dp)
                    .padding(end = 10.dp), color = Color.Gray)
                Spacer(modifier = Modifier.height(20.dp))
                Row {
                    Icon(Icons.Filled.Call,
                        contentDescription = "Sounds",
                        tint = Color.Black)
                    Spacer(modifier = Modifier.width(20.dp))
                    ClickableText(
                        text = AnnotatedString("Sounds"),
                        onClick = {
                            Toast.makeText(Context1,"Baad Sound?\nA little Longer🎼🎶🎙!",
                                Toast.LENGTH_LONG).show()
                        }
                    )
                }

                Spacer(modifier = Modifier.height(5.dp))
                Divider(modifier = Modifier
                    .width(400.dp)
                    .padding(end = 10.dp), color = Color.Gray)
                Spacer(modifier = Modifier.height(20.dp))
                Row {
                    Image(painter = painterResource(R.drawable.w),
                        contentDescription = "App Language")
                    Spacer(modifier = Modifier.width(20.dp))
                    ClickableText(
                        text = AnnotatedString("App Language"),
                        onClick = {
                            Toast.makeText(Context2,"Language trends soon✌!",
                                Toast.LENGTH_LONG).show()
                        }
                    )
                }

                Spacer(modifier = Modifier.height(5.dp))
                Divider(modifier = Modifier
                    .width(400.dp)
                    .padding(end = 10.dp), color = Color.Gray)
                Spacer(modifier = Modifier.height(20.dp))
                Row {
                    Image(painter = painterResource(R.drawable.backup),
                        contentDescription = "Backup")
                    Spacer(modifier = Modifier.width(20.dp))
                    ClickableText(
                        text = AnnotatedString("Backup"),
                        onClick = {
                            Toast.makeText(Context3,"Backing Up soon!😘",
                                Toast.LENGTH_LONG).show()
                        }
                    )
                }

                Spacer(modifier = Modifier.height(5.dp))
                Divider(modifier = Modifier
                    .width(400.dp)
                    .padding(end = 10.dp), color = Color.Gray)
                Spacer(modifier = Modifier.height(20.dp))
                Row {
                    Image(painter = painterResource(R.drawable.lock),
                        contentDescription = "Privacy"
                    )
                    Spacer(modifier = Modifier.width(20.dp))
                    ClickableText(
                        text = AnnotatedString("Privacy Center"),
                        modifier = Modifier.padding(top = 4.dp),
                        onClick = {
                            Toast.makeText(Context4,"Coming Up soon!",
                                Toast.LENGTH_LONG).show()}
                    )
                }

                Spacer(modifier = Modifier.height(5.dp))
                Divider(modifier = Modifier
                    .width(400.dp)
                    .padding(end = 10.dp), color = Color.Gray)
                Spacer(modifier = Modifier.height(20.dp))
                Row {
                    Icon(Icons.Default.Person,"Person")
                    Spacer(modifier = Modifier.width(20.dp))
                    ClickableText(
                        text = AnnotatedString("About Developer"),
                        modifier = Modifier.padding(top = 4.dp),
                        onClick = {
                           navController.navigate("About")}
                    )
                }
                Spacer(modifier = Modifier.height(5.dp))
                Divider(modifier = Modifier
                    .width(400.dp)
                    .padding(end = 10.dp), color = Color.Gray)
                Spacer(modifier = Modifier.height(20.dp))
            }
        }
    }


}

@Preview
@Composable
fun SettingsPreview(){
    SettingsPage(navController = rememberNavController())
}