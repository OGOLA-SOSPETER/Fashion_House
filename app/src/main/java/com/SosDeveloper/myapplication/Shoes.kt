package com.SosDeveloper.myapplication


import android.content.Intent
import android.net.Uri
import android.view.View
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.ButtonDefaults.elevation
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.SosDeveloper.myapplication.ui.theme.Purple500
import kotlin.text.Typography

@Composable
fun ShoesPage(navController: NavHostController){
    val color= Color(0xFF1976D2)
    Column {
        Image(painter = painterResource(id = R.drawable.rr1),
            contentDescription = "Background",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
                .clip(RoundedCornerShape(10.dp))
        )
    }
    TopAppBar(backgroundColor = color) {
        Text(
            text = "Men Shoes",
            style = MaterialTheme.typography.h1,
            fontSize = 14.sp,
            color = Color.White,
            modifier = Modifier.padding(start = 50.dp, end = 140.dp)

        )
        IconButton(onClick = { navController.navigate("Dashboard") }) {
            Icon(Icons.Default.ArrowForward,
                contentDescription = "Back to homepage",
                tint = Color.White)
        }
    }
    Column(modifier = Modifier.padding(end = 5.dp,top = 10.dp, bottom = 5.dp)) {

Row(Modifier.padding(start = 20.dp,top= 60.dp), horizontalArrangement = Arrangement.spacedBy(13.dp)) {
    val context = LocalContext.current
    val intent = remember { Intent(Intent.ACTION_VIEW, Uri.parse("https://www.jumia.co.ke/catalog/?q=men+official+shoes")) }
    val officialShoe = remember { Intent(Intent.ACTION_VIEW, Uri.parse("https://www.jumia.co.ke/catalog/?q=official+shoes+for+mens")) }
    val rubberShoe = remember { Intent(Intent.ACTION_VIEW, Uri.parse("https://www.jumia.co.ke/catalog/?q=rubber+shoes+for+mens")) }

    Button(onClick = { context.startActivity(officialShoe) }) {
        Text(text = "Officials", fontSize = 16.sp, color = Color.White,
            style = MaterialTheme.typography.button

        )
    }


    Button(onClick = {

        context.startActivity(intent) }) {
        Text(text = "Shoe Store", fontSize = 16.sp, color = Color.White,
            style = MaterialTheme.typography.button

        )
    }
    Button(onClick = { context.startActivity(rubberShoe) }) {
        Text(text = "Rubbers", fontSize = 16.sp, color = Color.White,
        style = MaterialTheme.typography.button
            )
    }
}
       LazyColumn(modifier = Modifier.padding(start = 5.dp),content =
        {
            item {

                Box (modifier = Modifier
                    .border(width = 2.dp,
                        color = Color.Gray,
                        shape = RoundedCornerShape(8.dp))
                    .padding(9.dp)
                    .width(400.dp)){
                    Column() {


                        Row(modifier = Modifier.padding(start = 50.dp)) {
                            Image(painter = painterResource(id = R.drawable.ms1),
                                contentDescription = "Men-shoe",
                                Modifier.size(250.dp)
                            )
                        }

                        Text(text = "Official Private Black Smart Official Shoes") 
                        Text(text = "PRODUCT DETAILS", fontWeight = FontWeight.Bold)
                                Text("Black official shoes are very nice shoes when it comes to office field and school " +
                                "wears the shoes are made with black leather and rubber sole ")
                        Text(text = "KSh 1,850", fontWeight = FontWeight.Bold)
                                Text("KSh 1,950", fontWeight = FontWeight.Bold, textDecoration = TextDecoration.LineThrough )
                                Text("-5%\n", fontWeight = FontWeight.Bold)
                        Spacer(modifier = Modifier.height(5.dp))
                        Box (modifier = Modifier
                            .border(width = 2.dp,
                                color = Color.Gray,
                                shape = RoundedCornerShape(8.dp))
                            .fillMaxWidth()) {
                            Column {
                                Text(text = "\nSPECIFICATIONS\n",
                                    modifier = Modifier.padding(start = 100.dp, ),
                                    fontWeight = FontWeight.Bold)
                                Text(
                                    "SKU: OF439FS0DSN9QNAFAMZ\n" +
                                            "Model: Leather\n" +
                                            "Production Country: Kenya\n" +
                                            "Size (L x W x H cm): 40 to 48+\n" +
                                            "Weight (kg): 1.5\n" +
                                            "Main Material: Leather\n",
                                    modifier = Modifier.padding(start = 60.dp))
                            }
                        }
                        Spacer(modifier = Modifier.height( 20.dp))
                    }
                }
                Spacer(modifier = Modifier.height(30.dp))
            }

            item {
                Box (modifier = Modifier
                    .border(width = 2.dp,
                        color = Color.Gray,
                        shape = RoundedCornerShape(8.dp))
                    .padding(9.dp)
                    .width(400.dp)){
                    Column {
                        Row(modifier = Modifier.padding(start = 110.dp)) {
                            Image(painter = painterResource(id = R.drawable.ms2),
                                contentDescription = "Men-shoe",
                                Modifier.size(150.dp)
                            )
                        }
                        Text(text = "Fashion Mens Loafers Shoes Official Leather Loafer Casual Shoes Comfortable Shoes-Black")
                        Text(text = "PRODUCT DETAILS", fontWeight = FontWeight.Bold)
                        Text("Midsole Material:EVA\n" +
                                "Season:Summer, Spring, Autumn\n" +
                                "Type:Comfortable Mens Shoes Casual\n" +
                                "Outsole Material:PVC\n" +
                                "Upper Material:cotton\n" +
                                "Lining Material:Cotton Fabric\n" +
                                "Feature:Fashion Trend, Anti-Odor, Light Weight, Breathable, Anti-Slippery, Anti-slip, Anti-Static, Lighted, Hard-Wearing, Height Increasing\n" +
                                "colors:Black\n" +
                                "size:40-44\n" +
                                "Style:Running shoes, Slip-On, Loafers, Walking Shoes, Causal Sports")
                        Text(text = "KSh 899 - KSh 999", fontWeight = FontWeight.Bold)
                        Text("KSh 1,200", fontWeight = FontWeight.Bold, textDecoration = TextDecoration.LineThrough )
                        Text("-25%\n", fontWeight = FontWeight.Bold)
                        Box (modifier = Modifier
                            .border(width = 2.dp,
                                color = Color.Gray,
                                shape = RoundedCornerShape(8.dp))
                            .fillMaxWidth()) {
                            Column {

                                Text(text = "\nSPECIFICATIONS\n",
                                    modifier = Modifier.padding(start = 100.dp, ),
                                    fontWeight = FontWeight.Bold)
                                Text(   "SKU: FA113FS1B3Q6HNAFAMZ\n" +
                                        "Model: LTA20\n" +
                                        "Production Country: China\n" +
                                        "Size (L x W x H cm): 40;41;42;43;44\n" +
                                        "Weight (kg): 0.02\n" +
                                        "Main Material: EVA",
                                    modifier = Modifier.padding(start = 60.dp))
                            }
                        }
                        Spacer(modifier = Modifier.height( 20.dp))
                    }
                }
                Spacer(modifier = Modifier.height( 30.dp))
            }



            item {
                Box (modifier = Modifier
                    .border(width = 2.dp,
                        color = Color.Gray,
                        shape = RoundedCornerShape(8.dp))
                    .padding(9.dp)
                    .width(400.dp)){
                    Column {
                        Row(modifier = Modifier.padding(start = 80.dp, top = 5.dp)) {
                            Image(painter = painterResource(id = R.drawable.ms3),
                                contentDescription = "Men-shoe",
                                Modifier.size(150.dp)
                            )
                        }
                        Text(text = "Fashion Mens Official Genuine Leather Loafers Shoes - Brown")
                        Text(text = "\nPRODUCT DETAILS", fontWeight = FontWeight.Bold)
                        Text("Daily Fashion How about bringing fashion into every day casual wear? We have planned ahead and done that for you! With our large variety of colors, the variety of shoes bring casual to the next level. The canvas rubber, solid colored sole provides a cool look to our solid shoes and brings class into every day wear.\n" +
                                "Comfort HavenMeet the Quick Easy Shoes and experience perfect comfort in your daily wear. Sacrificing comfort for beauty is a thing of the past. We ensure you look like a proper gentleman while your feet celebrate with thanks.\n" +
                                "Perfect Fit With a perfect fit, you’re bound to steal the show! The shoes fit perfectly and looks amazing on practically any size. No more loose backs and wide sides. Comes in fitting-sizes for a better fit. Kindly get your size correctly by looking at the stated sizing origin.\n" +
                                "Top Quality Made of the finest top quality material, We won’t compromise quality. The strong rubber sole won't scrape off the bottom and prevents embarrassing slips while you’re out.\n" +
                                "Customer Service We strive toward our mission for ultimate customer satisfaction. Our goal is to provide our customers with a most pleasant experience. With the return policy in place we make sure that you get satisfied.")
                        Text(text = "KSh 1,270", fontWeight = FontWeight.Bold)
                        Text("KSh 1,599",
                            fontWeight = FontWeight.Bold,
                            textDecoration = TextDecoration.LineThrough)
                        Text("-21%\n", fontWeight = FontWeight.Bold)
                        Spacer(modifier = Modifier.height(5.dp))
                        Box(modifier = Modifier
                            .border(width = 2.dp,
                                color = Color.Gray,
                                shape = RoundedCornerShape(8.dp))
                            .fillMaxWidth()) {
                            Column {
                                Text(text = "\nSPECIFICATIONS\n",
                                    modifier = Modifier.padding(start = 100.dp, ),
                                    fontWeight = FontWeight.Bold)
                                Text(
                                    "SKU: FA113FS1BNHNHNAFAMZ\n" +
                                            "Model: formal\n" +
                                            "Production Country: Kenya\n" +
                                            "Weight (kg): 0.5\n" +
                                            "Main Material: leather\n" +
                                            "Care Label: wash afer use",
                                    modifier = Modifier.padding(start = 60.dp))
                            }
                        }
                        Spacer(modifier = Modifier.height( 20.dp))
                    }
                }
                Spacer(modifier = Modifier.height( 30.dp))
            }

            item {
                Box(modifier = Modifier
                    .border(width = 2.dp,
                        color = Color.Gray,
                        shape = RoundedCornerShape(8.dp))
                    .padding(9.dp)
                    .width(400.dp)) {
                    Column {
                        Row(modifier = Modifier.padding(start = 80.dp, top = 5.dp)) {
                            Image(painter = painterResource(id = R.drawable.ms4),
                                contentDescription = "Men-shoe",
                                Modifier.size(150.dp)
                            )
                        }
                        Text(text = "Fashion Official Gents Black Leather Shoe")
                        Text(text = "\nPRODUCT DETAILS", fontWeight = FontWeight.Bold)
                        Text("Stand out in these cool trendy leather shoes . " +
                                "The collection of Official shoes, Casual shoes, Loafers and Sneakers offers comfort and durability with high quality finish. Accessorize with the best footwear for the perfect look! " +
                                "Our Shoes are light, durable and suitable for all types of adventures. A product of real quality with you all over the year. Place your order online on Jumia Kenya and have it delivered to your doorstep.")
                        Text(text = "KSh 1,299", fontWeight = FontWeight.Bold)
                        Text("KSh 2,100",
                            fontWeight = FontWeight.Bold,
                            textDecoration = TextDecoration.LineThrough)
                        Text("-38%\n", fontWeight = FontWeight.Bold)
                        Spacer(modifier = Modifier.height(5.dp))
                        Box(modifier = Modifier
                            .border(width = 2.dp,
                                color = Color.Gray,
                                shape = RoundedCornerShape(8.dp))
                            .fillMaxWidth()) {
                            Column {
                                Text(text = "SPECIFICATIONS\n",
                                    modifier = Modifier.padding(start = 100.dp, ),
                                    fontWeight = FontWeight.Bold)
                                Text("SKU: FA113FS1DVYBRNAFAMZ\n" +
                                        "Weight (kg): 0.7\n" +
                                        "Main Material: Rubber sole",
                                    modifier = Modifier.padding(start = 60.dp))
                            }
                        }
                        Spacer(modifier = Modifier.height( 20.dp))
                    }
                }
                Spacer(modifier = Modifier.height( 10.dp))
            }


            item {
                Box(modifier = Modifier
                    .border(width = 2.dp,
                        color = Color.Gray,
                        shape = RoundedCornerShape(8.dp))
                    .padding(9.dp)
                    .width(400.dp)) {
                    Column {
                        Row(modifier = Modifier.padding(start = 80.dp, top = 5.dp)) {
                            Image(painter = painterResource(id = R.drawable.ms5),
                                contentDescription = "Men-shoe",
                                Modifier.size(150.dp)
                            )
                        }
                        Text(text = "PHOELIX FASHIONS ELEGANT ETHIOPIAN LEATHER OFFICIAL SHOES."
                            )
                        Text(text = "\nPRODUCT DETAILS", fontWeight = FontWeight.Bold)
                        Text("This Classic Shoes designed by kenyans for kenyans provides a pleasant comfort to the foot, its classical details are a refined contrast, while combining innovation and high-quality manufacture, especially thanks to its good quality sole!The high-quality materials ensure that these  items that will stay for a very long time. There is nothing much better than enjoying a well manufactured shoe.\n" +
                                "\n" +
                                "Accessorize with the best footwear for the perfect look! Place your order online from Jumia Kenya and have it delivered straight to your doorstep.Daily Fashion How about bringing fashion into every day casual wear? We have planned ahead and done that for you! With our large variety of colors, the variety of shoes bring casual to the next level. The canvas rubber, solid colored sole provides a cool look to our solid shoes and brings class into every day wear.\n" +
                                "Comfort HavenMeet the Quick Easy Shoes and experience perfect comfort in your daily wear. Sacrificing comfort for beauty is a thing of the past. We ensure you look like a proper gentleman while your feet celebrate with thanks.\n" +
                                "Perfect Fit With a perfect fit, you’re bound to steal the show! The shoes fit perfectly and looks amazing on practically any size. No more loose backs and wide sides. Comes in fitting-sizes for a better fit. Kindly get your size correctly by looking at the stated sizing origin.\n" +
                                "Top Quality Made of the finest top quality material, We won’t compromise quality. The strong rubber sole won't scrape off the bottom and prevents embarrassing slips while you’re out.\n" +
                                "Customer Service We strive toward our mission for ultimate customer satisfaction. Our goal is to provide our customers with a most pleasant experience. With the return policy in place we make sure that you get satisfied.")
                        Text(text = "KSh 1,299", fontWeight = FontWeight.Bold)
                        Text("KSh 3,247",
                            fontWeight = FontWeight.Bold,
                            textDecoration = TextDecoration.LineThrough)
                        Text("-60%\n", fontWeight = FontWeight.Bold)
                        Spacer(modifier = Modifier.height(5.dp))
                        Box(modifier = Modifier
                            .border(width = 2.dp,
                                color = Color.Gray,
                                shape = RoundedCornerShape(8.dp))
                            .fillMaxWidth()) {
                            Column {
                                Text(text = "SPECIFICATIONS\n",
                                    modifier = Modifier.padding(start = 100.dp, ),
                                    fontWeight = FontWeight.Bold)
                                Text("SKU: BR393FS0PHWOUNAFAMZ\n" +
                                        "Model: -\n" +
                                        "Size (L x W x H cm): -\n" +
                                        "Weight (kg): 1.5\n" +
                                        "Main Material: leather",
                                    modifier = Modifier.padding(start = 60.dp))
                            }
                        }
                        Spacer(modifier = Modifier.height( 20.dp))
                    }
                }
                Spacer(modifier = Modifier.height( 10.dp))
            }



            item {
                Box(modifier = Modifier
                    .border(width = 2.dp,
                        color = Color.Gray,
                        shape = RoundedCornerShape(8.dp))
                    .padding(9.dp)
                    .width(400.dp)) {
                    Column {
                        Row(modifier = Modifier.padding(start = 80.dp, top = 5.dp)) {
                            Image(painter = painterResource(id = R.drawable.ms6),
                                contentDescription = "Men-shoe",
                                Modifier.size(150.dp)
                            )
                        }
                        Text(text = "Waanzilish Men's Official Leather Shoes Trendy Loafer Shoes High Quality Shoes -Black"
                        )
                        Text(text = "\nPRODUCT DETAILS", fontWeight = FontWeight.Bold)
                        Text("Type:Casual ;formal\n" +
                                "Design: Trendy;fashion;loafer shoes ;high quality\n" +
                                "Color: black\n" +
                                "Midsole Material:Rubber\n" +
                                "Outsole Material:Rubber\n" +
                                "Upper Height: Low Upper\n" +
                                "Feature:Fashion\\comfortable\\durable\\breathable\\flexible\n" +
                                "Packing:1 Pairs\n" +
                                "Size：41;42;43;44;45")
                        Text(text = "KSh 1,800", fontWeight = FontWeight.Bold)
                        Text("KSh 3,000",
                            fontWeight = FontWeight.Bold,
                            textDecoration = TextDecoration.LineThrough)
                        Text("-60%\n", fontWeight = FontWeight.Bold)
                        Spacer(modifier = Modifier.height(5.dp))
                        Box(modifier = Modifier
                            .border(width = 2.dp,
                                color = Color.Gray,
                                shape = RoundedCornerShape(8.dp))
                            .fillMaxWidth()) {
                            Column {
                                Text(text = "SPECIFICATIONS\n",
                                    modifier = Modifier.padding(start = 100.dp, ),
                                    fontWeight = FontWeight.Bold)
                                Text("SKU: WA773FS1D0UTLNAFAMZ\n" +
                                        "Model: 8808\n" +
                                        "Production Country: China\n" +
                                        "Size (L x W x H cm): 41;42;43;44;45\n" +
                                        "Weight (kg): 0.1\n" +
                                        "Main Material: Leather",
                                    modifier = Modifier.padding(start = 60.dp))
                            }
                        }
                        Spacer(modifier = Modifier.height( 20.dp))
                    }
                }
                Spacer(modifier = Modifier.height( 10.dp))
            }







            item {
                Box {
                    Text(text = "\t\tThank You for Choosing our Application.")
                }
            }
        })







    }
}

@Preview
@Composable
fun PreviewShoes(){
    ShoesPage(navController = rememberNavController())
}