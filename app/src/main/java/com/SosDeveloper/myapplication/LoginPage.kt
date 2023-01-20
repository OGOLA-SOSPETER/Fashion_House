package com.SosDeveloper.myapplication

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.*
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.Visibility
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController


@Composable
fun LoginPage(navController: NavHostController){
    var userNameValue by rememberSaveable{ mutableStateOf("") }
    var passwordValue by rememberSaveable{ mutableStateOf("") }
    var email by rememberSaveable { mutableStateOf("") }
    val Context = LocalContext.current
    var passwordVisible by rememberSaveable { mutableStateOf(false) }
Column() {
    Image(painter = painterResource(id = R.drawable.kk),
        contentDescription = "Background Image",
        contentScale = ContentScale.Crop,
        modifier = Modifier.fillMaxHeight()
            .fillMaxWidth()
            .clip(RoundedCornerShape(10.dp))

    )
}
    Column(
        modifier = Modifier.padding(top = 70.dp, start = 10.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Welcome to My Wardrobe.",
            color = Color.DarkGray,
            fontSize = 15.sp,
            fontFamily = FontFamily.SansSerif,

        )
        Spacer(modifier = Modifier.height( 30.dp))
        Image(painter = painterResource(id = R.drawable.logcloth),
            contentDescription = "LoginImage",
            contentScale = ContentScale.Crop,
            modifier = Modifier.size(100.dp)
                .clip(RoundedCornerShape(13.dp))
        )
        Spacer(modifier = Modifier.height( 30.dp))
        OutlinedTextField(
            value = userNameValue,
            onValueChange = { userNameValue = it },
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth(),
            label = { Text(text = "Enter UserName") }

        )
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Enter Email") },
            placeholder = { Text(text = "example42@gmail.com ") },
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth(),
            textStyle = TextStyle(color = Color.Black, fontSize = 15.sp),
            singleLine = true,
        )

        OutlinedTextField(
            value = passwordValue,
            trailingIcon = {

                // Please provide localized description for accessibility services
                val description = if (passwordVisible) "Hide password" else "Show password"

                IconButton(onClick = {passwordVisible = !passwordVisible}){

                    if (passwordVisible)
                       Image(painter = painterResource(id = R.drawable.visibility), contentDescription = "Visibility on")
                    else
                        Image(painter = painterResource(id = R.drawable.visibility_off), contentDescription = "Visibility off")
                }
            },
            onValueChange = { passwordValue = it },
            label = { Text("Enter Password") },
            placeholder = { Text("Password") },
            maxLines = 1,
            visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)

        )



        Button(onClick = { navController.navigate("Dashboard") }) {
            Text(text = "Login")
        }
        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Or Login With",
            textAlign = TextAlign.Center,
            fontSize = 16.sp
        )
        Spacer(modifier = Modifier.height(30.dp))


        Row(modifier = Modifier.padding(start = 40.dp)) {
            Box {

                Image(
                    painter = painterResource(id = R.drawable.facebook),
                    contentDescription = "FaceBook Login",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .clip(RoundedCornerShape(14.dp))
                        .size(40.dp)

                )

            }
            Spacer(modifier = Modifier.width(20.dp))
            Box {

                Image(
                    painter = painterResource(id = R.drawable.emails),
                    contentDescription = "Email Login",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .clip(CircleShape)
                        .size(40.dp)

                )

            }
            Spacer(modifier = Modifier.width(20.dp))
            Box {

                Icon(
                    painter = painterResource(id = R.drawable.contact_phone),
                    contentDescription = "Phone Login",
                    modifier = Modifier
                        .clip(CircleShape)
                        .size(40.dp)

                )

            }
            Spacer(modifier = Modifier.width(30.dp))

        }
        Spacer(modifier = Modifier.height(30.dp))


        Spacer(modifier = Modifier.height(5.dp))
        Row {
            Text(
                text = "By Clicking Login You Accept our ",
            fontSize = 10.sp
                )

            ClickableText(AnnotatedString(" Terms and Conditions"),
                onClick = {
                    Toast.makeText(Context,"✌💫",Toast.LENGTH_LONG).show()
                },
                style = TextStyle(
                    fontSize = 10.sp,
                    fontFamily = FontFamily.Default,
                    color = Color.Blue,
                    textDecoration = TextDecoration.Underline
                )
            )
            Text(text = "And Our ", fontSize = 10.sp)
            ClickableText(AnnotatedString(" Privacy Policy"),
                onClick = {
                          Toast.makeText(Context,"👉👉",Toast.LENGTH_LONG).show()
                },
                style = TextStyle(
                    fontSize = 10.sp,
                    fontFamily = FontFamily.Default,
                    color = Color.Blue,
                    textDecoration = TextDecoration.Underline
                )
            )
        }
    }
}




@Preview
@Composable
fun LoginPreview(){
    LoginPage(navController = rememberNavController())
}