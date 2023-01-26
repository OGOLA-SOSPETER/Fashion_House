package com.SosDeveloper.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Wardrobe(){

        Image(painter = painterResource(id = R.drawable.rr4),
            contentDescription = "background",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .height(170.dp)
                .fillMaxWidth()
                .clip(RoundedCornerShape(1.dp))
        )

    Column(modifier = Modifier.padding(start = 20.dp, top = 5.dp)){
        Box (modifier = Modifier.border(width = 3.dp, color = Color.Blue)){
        Text("Select your most prefered item from the Closet:")

        val handler = LocalUriHandler.current
        Row {

            Column(modifier = Modifier.width(100.dp).padding(start = 10.dp)) {
                Spacer(modifier = Modifier.height(35.dp))
                    ClickableText(
                        text = AnnotatedString("Trousers"),
                        onClick = { handler.openUri("https://www.jumia.co.ke/catalog/?q=men++trousers") }
                    )
                Spacer(modifier = Modifier.height(10.dp))

                    ClickableText(
                        text = AnnotatedString("Shirts"),
                        onClick = { handler.openUri("https://www.jumia.co.ke/catalog/?q=men++shirts") }
                    )
                Spacer(modifier = Modifier.height(10.dp))

                    ClickableText(
                        text = AnnotatedString("Vests"),
                        onClick = { handler.openUri("https://www.jumia.co.ke/catalog/?q=men++vests") }
                    )
                Spacer(modifier = Modifier.height(10.dp))

                    ClickableText(
                        text = AnnotatedString("T- Shirts"),
                        onClick = { handler.openUri("https://www.jumia.co.ke/catalog/?q=men++tshirts") }
                    )
                Spacer(modifier = Modifier.height(10.dp))

            }
                Spacer(modifier = Modifier.width(70.dp))
                Column(modifier = Modifier.width(100.dp)) {
                    Spacer(modifier = Modifier.height(24.dp))

                    ClickableText(
                        text = AnnotatedString("Dresses"),
                        onClick = { handler.openUri("https://www.jumia.co.ke/womens-dresses/") }
                    )
                    Spacer(modifier = Modifier.height(10.dp))

                    ClickableText(
                        text = AnnotatedString("Skirts"),
                        onClick = { handler.openUri("https://www.jumia.co.ke/womens-skirts/") }
                    )
                    Spacer(modifier = Modifier.height(10.dp))

                    ClickableText(
                        text = AnnotatedString("Blouses"),
                        onClick = { handler.openUri("https://www.jumia.co.ke/womens-blouses/") }
                    )
                    Spacer(modifier = Modifier.height(10.dp))

                    ClickableText(
                        text = AnnotatedString("Stockings"),
                        onClick = { handler.openUri("https://www.jumia.co.ke/womens-stockings/") }
                    )
                    Spacer(modifier = Modifier.height(10.dp))

                    ClickableText(
                        text = AnnotatedString("Sweaters"),
                        onClick = { handler.openUri("https://www.jumia.co.ke/catalog/?q=sweaters") }
                    )
                    Spacer(modifier = Modifier.height(10.dp))


                }
            }
        }

    }
}

@Preview
@Composable
fun PreviewWardrobe(){
    Wardrobe()
}