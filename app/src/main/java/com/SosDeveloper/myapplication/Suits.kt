import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
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
import com.SosDeveloper.myapplication.R
import com.SosDeveloper.myapplication.ui.theme.Purple500

@Composable
fun SuitsPage(navController: NavHostController) {
    Column {
        Image(painter = painterResource(id = R.drawable.rr1),
            contentDescription = "background",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
                .clip(RoundedCornerShape(1.dp))
        )
    }
    Column {
        Column {
            val color= Color(0xFF1976D2)
            var count = remember {mutableStateOf(0)}
            BottomAppBar(backgroundColor = color) {
                IconButton(onClick = {
                    run{
                            count.value +=1

                    }
                }) {
                    Row(horizontalArrangement = Arrangement.End) {
                        Icon(Icons.Filled.Favorite,
                            contentDescription = "Favourites",
                            Modifier.size(30.dp),
                            tint = Color.White,

                        )
                        Text(
                            text = count.value.toString(),
                            fontSize = 17.sp,
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.offset(5.dp,2.dp)
                        )
                    }
                }
                Spacer(modifier = Modifier.width(120.dp))
                IconButton(onClick = { navController.navigate("Dashboard") }) {
                    Icon(Icons.Default.Home,
                        contentDescription = "Back to Home",
                        Modifier.size(20.dp),
                        tint = Color.White
                    )
                }
            }
        }

Column(Modifier.offset(15.dp)) {

    LazyColumn(content = {
        item{

            Row(Modifier.padding(start = 5.dp), horizontalArrangement = Arrangement.spacedBy(13.dp)) {
                val context = LocalContext.current
                val suit3 = remember { Intent(Intent.ACTION_VIEW, Uri.parse("https://www.jumia.co.ke/catalog/?q=official+suit+for+men")) }
                val broken = remember { Intent(Intent.ACTION_VIEW, Uri.parse("https://www.jumia.co.ke/catalog/?q=men++blazers")) }
                val designer = remember { Intent(Intent.ACTION_VIEW, Uri.parse("https://www.jumia.co.ke/catalog/?q=designer+suits")) }

                Button(onClick = { context.startActivity(suit3) }) {
                    Text(text = "3-Piece Suit", fontSize = 14.sp, color = Color.White)
                }
                Button(onClick = { context.startActivity(broken) }) {
                    Text(text = "Broken", fontSize = 14.sp, color = Color.White)
                }
                Button(onClick = { context.startActivity(designer) }) {
                    Text(text = "Designer", fontSize = 14.sp, color = Color.White)
                }
            }
        }
        item {

            Text(
                "My suits wardrobe",
                fontWeight = FontWeight.Bold, fontSize = 20.sp,
                modifier = Modifier
                    .offset(50.dp, 3.dp)
                    .padding(bottom = 5.dp)
            )
            Text("A suit, lounge suit, or business suit is a set of clothes " +
                    "comprising a suit jacket and trousers of identical " +
                    "textiles worn with a collared dress shirt, necktie, and dress shoes")
        }
        item {
            Spacer(modifier = Modifier.height(4.dp))
            Divider(modifier = Modifier
                .width(400.dp)
                .height(2.dp))

            Box(
                modifier = Modifier.padding(top = 10.dp)
            ) {
                Column {
                    Image(painter = painterResource(id = R.drawable.sut1),
                        contentDescription = "Suit 1",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(width = 300.dp, height = 250.dp)
                            .offset(20.dp, 20.dp)
                            .clip(RoundedCornerShape(11.dp))
                    )
                    Spacer(modifier = Modifier.height(30.dp))
                    Text("Item Description",
                        textDecoration = TextDecoration.Underline,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        modifier = Modifier
                            .padding(top = 5.dp, bottom = 7.dp)
                            .offset(30.dp)
                    )
                    Text(text = "Generic Spring Men 3-piece Leisure Suit " +
                            "\nMale Slim Fit Work Set One Cotton Man Professional " +
                            "\nSuits Office Jacket+waistcoat+trousers （China Size）")

                    Spacer(modifier = Modifier.height(10.dp))

                    Text("Item Specifications",
                        textDecoration = TextDecoration.Underline,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        modifier = Modifier.padding(bottom = 7.dp)
                    )
                    Text(text = "Jacket Size detailsM: Chest/Bust=92cm - Shoulder=43 cm - Length=66 cm - Sleeve= 60 cmL: Chest/Bust=96cm - Shoulder=44 cm - Length=68 cm - Sleeve= 61 cmXL: Chest/Bust= 100 cm - Shoulder=45 cm - Length=70 cm - Sleeve=62 cmXXL: Chest/Bust= 104cm - Shoulder=46 cm - Length=72 cm - Sleeve=63 cm3XL: Chest/Bust= 108cm - Shoulder=47 cm - Length=74 cm - Sleeve=64 cm\n" +
                            "waistcoat size details:Size M: length=50cm--Chest/Bust=90cmSize L: length=52cm--Chest/Bust=94cmSize XL: length=54cm-Chest/Bust=98cmSize 2XL: length=56cm--Chest/Bust=102cmSize 3XL: length=58cm--Chest/Bust=106cm\n" +
                            "pant size details:Size M: length=103cm--waist=73cmSize L: length=104cm--waist=77cmSize XL: length=104cm-waist=83cmSize 2XL: length=105cm--waist=87cmSize 3XL: length=1106cm--waist=93cmThickness: conventionalSource category: SpotFabric Name: Polyester FiberApplicable scene: workReclaiming method: after openingColor: Black, Gray, Burgundy, Dark BlueThreshold: " +
                            "Single row of bucklesThe content of the main fabric composition: 78.6")
                }
                Divider(modifier = Modifier
                    .width(450.dp)
                    .height(2.dp), color = Color.DarkGray)

            }
            Divider(modifier = Modifier
                .width(450.dp)
                .height(2.dp), color = Color.DarkGray)
        }

        item {
            Spacer(modifier = Modifier.height(4.dp))
            Divider(modifier = Modifier
                .width(400.dp)
                .height(2.dp))

            Box(
                modifier = Modifier.padding(top = 10.dp)
            ) {
                Column {
                    Image(painter = painterResource(id = R.drawable.sut2),
                        contentDescription = "Suit 2",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(width = 300.dp, height = 250.dp)
                            .offset(20.dp, 20.dp)
                            .clip(RoundedCornerShape(11.dp))
                    )
                    Spacer(modifier = Modifier.height(30.dp))
                    Text("Item Description",
                        textDecoration = TextDecoration.Underline,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        modifier = Modifier
                            .padding(top = 5.dp, bottom = 7.dp)
                            .offset(30.dp)
                    )
                    Text(text = "Fashion Men's Suit Official/wedding Blue" +
                            "\nMade from high quality fabric to suite all your occasion 100% cotton, it comes with one button and free straight cut trouser, Differentiating UK size and EUROPEAN size.\n" +
                            "UK 48 50\n" +
                            "EUROPEAN 58 60\n" +
                            "different is minus 10.When it comes to Turkish tailoring," +
                            " this is the ultimate combination of classic heritage and elegant" +
                            "masculinity. \nThis suit features slim cut trousers that just hit the ankle in a flattering slim cut with a front crease. The jacket, in the same elegant black, " +
                            "features peaked lapels, a front button closure and side flap pockets.")

                    Spacer(modifier = Modifier.height(10.dp))

                    Text("Item Specifications",
                        textDecoration = TextDecoration.Underline,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        modifier = Modifier.padding(bottom = 7.dp)
                    )
                    Text(text = "SKU: FA113MW02AAK3NAFAMZ\n" +
                            "Production Country: Turkey\n" +
                            "Weight (kg): 3\n" +
                            "Main Material: cotton")

                    Spacer(modifier = Modifier.height(10.dp))
                    Text("Price:", textDecoration = TextDecoration.Underline)
                    Text("KSh 4,800", fontWeight = FontWeight.Bold)
                }
                Divider(modifier = Modifier
                    .width(450.dp)
                    .height(2.dp), color = Color.DarkGray)

            }
            Divider(modifier = Modifier
                .width(450.dp)
                .height(2.dp), color = Color.DarkGray)
        }

        item {
            Spacer(modifier = Modifier.height(4.dp))
            Divider(modifier = Modifier
                .width(400.dp)
                .height(2.dp))

            Box(
                modifier = Modifier.padding(top = 10.dp)
            ) {
                Column {
                    Image(painter = painterResource(id = R.drawable.sut3),
                        contentDescription = "Suit 3",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(width = 300.dp, height = 250.dp)
                            .offset(20.dp, 20.dp)
                            .clip(RoundedCornerShape(11.dp))
                    )
                    Spacer(modifier = Modifier.height(30.dp))
                    Text("Item Description",
                        textDecoration = TextDecoration.Underline,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        modifier = Modifier
                            .padding(top = 5.dp, bottom = 7.dp)
                            .offset(30.dp)
                    )
                    Text(text = "Fashion Men's Blue 3 Pcs Formal Wedding Dress Suit" +
                            "\nIt is a 3-pieces suit. High quality durable material, \" +\n" +
                            "                            \"exquisite design. Comfortable to wear. \\nIt is also very easy to dress up and create your own style. \" +\n" +
                            "                            \"\\nSimple and classical design, suits for different occasions.")

                    Spacer(modifier = Modifier.height(10.dp))

                    Text("Item Specifications",
                        textDecoration = TextDecoration.Underline,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        modifier = Modifier.padding(bottom = 7.dp)
                    )
                    Text(text = "SKU: FA113AA0W64SVNAFAMZ\n" +
                            "Weight (kg): 0.5\n" +
                            "Main Material: Fabric Wool")

                    Spacer(modifier = Modifier.height(10.dp))
                    Text("Price:", textDecoration = TextDecoration.Underline)
                    Text("KSh 10,500 - KSh 13,500", fontWeight = FontWeight.Bold)
                }
                Divider(modifier = Modifier
                    .width(450.dp)
                    .height(2.dp), color = Color.DarkGray)

            }
            Divider(modifier = Modifier
                .width(450.dp)
                .height(2.dp), color = Color.DarkGray)
        }

        item {
            Spacer(modifier = Modifier.height(4.dp))
            Divider(modifier = Modifier
                .width(400.dp)
                .height(2.dp))

            Box(
                modifier = Modifier.padding(top = 10.dp)
            ) {
                Column {
                    Image(painter = painterResource(id = R.drawable.sut4),
                        contentDescription = "Suit 4",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(width = 300.dp, height = 250.dp)
                            .offset(20.dp, 20.dp)
                            .clip(RoundedCornerShape(11.dp))
                    )
                    Spacer(modifier = Modifier.height(30.dp))
                    Text("Item Description",
                        textDecoration = TextDecoration.Underline,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        modifier = Modifier
                            .padding(top = 5.dp, bottom = 7.dp)
                            .offset(30.dp)
                    )
                    Text(text = "Guardiola Turkey navy-blue guardiola suits.class guaranteed" +
                            "\n" +
                            "Rock with this awesome suits which can be worn either for office " +
                            "or for a function.blue in colour and comes with different sizes " +
                            "depending on your preferred size.its slim fit thus getting that" +
                            " gentleman look that makes you stand out in public." +
                            "\nIts a good quality suit giving you value for your money and time shopping  online.\n" +
                            "The suit is easy to clean either with hands of dry cleaning")

                    Spacer(modifier = Modifier.height(10.dp))

                    Text("Item Specifications",
                        textDecoration = TextDecoration.Underline,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        modifier = Modifier.padding(bottom = 7.dp)
                    )
                    Text(text = "SKU: GU129AA1GSV7DNAFAMZ\n" +
                            "Size (L x W x H cm): 10\n" +
                            "Weight (kg): 0.5\n" +
                            "Main Material: polyester\n" +
                            "Care Label: wash with care")

                    Spacer(modifier = Modifier.height(10.dp))
                    Text("Price:", textDecoration = TextDecoration.Underline)
                    Text("KSh 7,600 - KSh 11,000", fontWeight = FontWeight.Bold)
                }
                Divider(modifier = Modifier
                    .width(450.dp)
                    .height(2.dp), color = Color.DarkGray)

            }
            Divider(modifier = Modifier
                .width(450.dp)
                .height(2.dp), color = Color.DarkGray)
        }

        item {
            Spacer(modifier = Modifier.height(4.dp))
            Divider(modifier = Modifier
                .width(400.dp)
                .height(2.dp))

            Box(
                modifier = Modifier.padding(top = 10.dp)
            ) {
                Column {
                    Image(painter = painterResource(id = R.drawable.sut5),
                        contentDescription = "Suit 5",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(width = 300.dp, height = 250.dp)
                            .offset(20.dp, 20.dp)
                            .clip(RoundedCornerShape(11.dp))
                    )
                    Spacer(modifier = Modifier.height(30.dp))
                    Text("Item Description",
                        textDecoration = TextDecoration.Underline,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        modifier = Modifier
                            .padding(top = 5.dp, bottom = 7.dp)
                            .offset(30.dp)
                    )
                    Text(text = "Fashion Men's Suits Official, Wedding And Executive + A Gift")

                    Spacer(modifier = Modifier.height(10.dp))

                    Text("Item Specifications",
                        textDecoration = TextDecoration.Underline,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        modifier = Modifier.padding(bottom = 7.dp)
                    )
                    Text(text = "Perfect for groom suit, bridegroom suit, groomsman suit, business suit and men leisure wear.\n" +
                            "This product contains jacket and pants.\n" +
                            " suit coat featuring flat collar, 2-piece suit.\n" +
                            "The suit will show your handsome and glamorous more vividly.\n" +
                            "Put on the suit, you can be more mature, charismatic, capable and experienced.\n" +
                            "\n" +
                            "Type: Suit\n" +
                            "Gender: Men's\n" +
                            "Size Type: Regular\n" +
                            "Material: Cotton\n" +
                            "Garment Care: Hand-wash\n" +
                            "Sleeve Length: Long Sleeve\n" +
                            "Style: Business\n" +
                            "Occasions: Daily Life, Wedding, Office, Cocktail, Party, etc.\n" +
                            "Features: Solid Color, Slim Fit, 2-Piece Clothing Set, Slim Fit")
                    Spacer(modifier = Modifier.height(10.dp))
                    Text("Price:", textDecoration = TextDecoration.Underline)
                    Text("KSh 4,600", fontWeight = FontWeight.Bold)

                }
                Divider(modifier = Modifier
                    .width(450.dp)
                    .height(2.dp), color = Color.DarkGray)

            }
            Divider(modifier = Modifier
                .width(450.dp)
                .height(2.dp), color = Color.DarkGray)
        }

        item {
            Spacer(modifier = Modifier.height(4.dp))
            Divider(modifier = Modifier
                .width(400.dp)
                .height(2.dp))

            Box(
                modifier = Modifier.padding(top = 10.dp)
            ) {
                Column {
                    Image(painter = painterResource(id = R.drawable.sut6),
                        contentDescription = "Suit 6",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(width = 300.dp, height = 250.dp)
                            .offset(20.dp, 20.dp)
                            .clip(RoundedCornerShape(11.dp))
                    )
                    Spacer(modifier = Modifier.height(30.dp))
                    Text("Item Description",
                        textDecoration = TextDecoration.Underline,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        modifier = Modifier
                            .padding(top = 5.dp, bottom = 7.dp)
                            .offset(30.dp)
                    )
                    Text(text = "Guardiola Turkey guardiola suits.Elegance and class guaranteed")

                    Spacer(modifier = Modifier.height(10.dp))

                    Text("Item Specifications",
                        textDecoration = TextDecoration.Underline,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        modifier = Modifier.padding(bottom = 7.dp)
                    )
                    Text(text = "Rock with this awesome suits which can be worn either for" +
                            "office or for a function.blue in colour and comes with different sizes depending on your preferred size.its slim fit thus getting that gentleman look that makes you stand out in public.Its a good quality suit giving you value for your money and time shopping  online.\n" +
                            "The suit is easy to clean either with hands of dry cleaning")

                    Spacer(modifier = Modifier.height(10.dp))
                    Text("Price:", textDecoration = TextDecoration.Underline)
                    Text("KSh 6,000 - KSh 9,500\n", fontWeight = FontWeight.Bold)


                    Divider(modifier = Modifier
                        .width(450.dp)
                        .height(2.dp), color = Color.DarkGray)
                }


            }
            Divider(modifier = Modifier
                .width(450.dp)
                .height(2.dp), color = Color.DarkGray)
        }


    })


}
    }
}



@Preview
@Composable
fun Previews(){
    SuitsPage(navController = rememberNavController())
}