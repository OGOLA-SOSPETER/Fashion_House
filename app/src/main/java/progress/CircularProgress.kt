package progress

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.progressBarRangeInfo
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.stateDescription
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun CardDemo(navController: NavHostController) {
    Column {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp)

                .clickable { },
            elevation = 15.dp
        ) {
            Column(
                modifier = Modifier.padding(15.dp)
            ) {
                Text(
                    buildAnnotatedString {
                        append("welcome to ")
                        withStyle(
                            style = SpanStyle(
                                fontWeight = FontWeight.W900,
                                color = Color(0xFF4552B8)
                            )
                        ) {
                            append("Jetpack Compose Playground")
                        }
                    }
                )
                Text(
                    buildAnnotatedString {
                        append("Now you are in the ")
                        withStyle(style = SpanStyle(fontWeight = FontWeight.W900)) {
                            append("Card")
                        }
                        append(" section")
                    }
                )
            }

        }
        CircularProgressIndicatorSample()
    }
}

@Composable
fun CircularProgressIndicatorSample() {
    var progress by remember { mutableStateOf(0.1f) }
    val animatedProgress = animateFloatAsState(
        targetValue = progress,
        animationSpec = ProgressIndicatorDefaults.ProgressAnimationSpec
    ).value

    Column(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(top = 50.dp)) {
        Spacer(Modifier.height(30.dp))
        CircularProgressIndicator(modifier = Modifier.weight(34.5F), color = MaterialTheme.colors.primaryVariant)
    }
}



@Composable
fun circularbar(){
    var progress by remember { mutableStateOf(0.1f) }
    val animatedProgress by animateFloatAsState(
        targetValue = progress,
        animationSpec = ProgressIndicatorDefaults.ProgressAnimationSpec
    )

    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        CircularProgressIndicator(progress = animatedProgress)
        Spacer(Modifier.requiredHeight(30.dp))
        OutlinedButton(
            modifier = Modifier.semantics {
                val progressPercent = (progress * 100).toInt()
                if (progressPercent in progressBarRangeInfo) {
                    stateDescription = "Progress $progressPercent%"
                }
            },
            onClick = {
                if (progress < 1f) progress += 0.1f
            }
        ) {
            Text("Increase")
        }
    }
}

private operator fun Any.contains(progressPercent: Int): Boolean {
    return true
}

@Preview
@Composable
fun PreviewCard(){
    CardDemo(navController = rememberNavController())
}