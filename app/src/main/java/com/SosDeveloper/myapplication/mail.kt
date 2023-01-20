package com.SosDeveloper.myapplication

import android.content.Intent
import android.text.method.LinkMovementMethod
import android.text.util.Linkify
import android.widget.TextView
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.text.util.LinkifyCompat
import androidx.navigation.NavHostController


@Composable
fun EmailPage(navController: NavHostController){

    val mContext = LocalContext.current
    val mCustomLinkifyText = remember { TextView(mContext) }

    val mText = "https://mail.google.com/mail/"

    Column(Modifier
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        AndroidView(factory = { mCustomLinkifyText }) { textView ->
            textView.text = mText
            textView.textSize = 20F
            LinkifyCompat.addLinks(textView, Linkify.ALL)
            textView.movementMethod = LinkMovementMethod.getInstance()
        }
    }
}


@Composable
fun FaceBookPage(navController: NavHostController){

    val mContext = LocalContext.current
    val mCustomLinkifyText = remember { TextView(mContext) }

    val mText = "https://www.facebook.com/"

    Column(Modifier
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        AndroidView(factory = { mCustomLinkifyText }) { textView ->
            textView.text = mText
            textView.textSize = 20F
            LinkifyCompat.addLinks(textView, Linkify.ALL)
            textView.movementMethod = LinkMovementMethod.getInstance()
        }
    }
}


@Composable
fun openEmailer() {

    // in the below line, we are
    // creating variables for URL
    val senderEmail = remember {
        mutableStateOf(TextFieldValue())
    }
    val emailSubject = remember {
        mutableStateOf(TextFieldValue())
    }
    val emailBody = remember {
        mutableStateOf(TextFieldValue())
    }

    // on below line we are creating
    // a variable for a context
    val ctx = LocalContext.current

    // on below line we are creating a column
    Column(
        // on below line we are specifying modifier
        // and setting max height and max width
        // for our column
        modifier = Modifier
            .fillMaxSize()
            .fillMaxHeight()
            .fillMaxWidth()
            // on below line we are
            // adding padding for our column
            .padding(5.dp),
        // on below line we are specifying horizontal
        // and vertical alignment for our column
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        // on the below line, we are
        // creating a text field.
        TextField(
            // on below line we are specifying
            // value for our  text field.
            value = senderEmail.value,

            // on below line we are adding on value
            // change for text field.
            onValueChange = { senderEmail.value = it },

            // on below line we are adding place holder as text
            placeholder = { Text(text = "Enter sender email address") },

            // on below line we are adding modifier to it
            // and adding padding to it and filling max width
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),

            // on below line we are adding text style
            // specifying color and font size to it.
            textStyle = TextStyle(color = Color.Black, fontSize = 15.sp),

            // on below line we are
            // adding single line to it.
            singleLine = true,
        )
        // on below line adding a spacer.
        Spacer(modifier = Modifier.height(10.dp))

        // on the below line, we are creating a text field.
        TextField(
            // on below line we are specifying
            // value for our  text field.
            value = emailSubject.value,

            // on below line we are adding on value change
            // for text field.
            onValueChange = { emailSubject.value = it },

            // on below line we are adding place holder as text
            placeholder = { Text(text = "Enter email subject") },

            // on below line we are adding modifier to it
            // and adding padding to it and filling max width
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),

            // on below line we are adding text style
            // specifying color and font size to it.
            textStyle = TextStyle(color = Color.Black, fontSize = 15.sp),

            // on below line we are
            // adding single line to it.
            singleLine = true,
        )

        // on below line adding a spacer.
        Spacer(modifier = Modifier.height(10.dp))

        // on the below line, we are creating a text field.
        TextField(
            // on below line we are specifying
            // value for our  text field.
            value = emailBody.value,
            // on below line we are adding on value
            // change for text field.
            onValueChange = { emailBody.value = it },

            // on below line we are adding place holder as text
            placeholder = { Text(text = "Enter email body") },

            // on below line we are adding modifier to it
            // and adding padding to it and filling max width
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),

            // on below line we are adding text style
            // specifying color and font size to it.
            textStyle = TextStyle(color = Color.Black, fontSize = 15.sp),

            // on below line we are
            // adding single line to it.
            singleLine = true,
        )

        // on below line adding a spacer.
        Spacer(modifier = Modifier.height(20.dp))

        // on below line adding a
        // button to send an email
        Button(onClick = {

            // on below line we are creating
            // an intent to send an email
            val i = Intent(Intent.ACTION_SEND)

            // on below line we are passing email address,
            // email subject and email body
            val emailAddress = arrayOf(senderEmail.value.text)
            i.putExtra(Intent.EXTRA_EMAIL, emailAddress)
            i.putExtra(Intent.EXTRA_SUBJECT, emailSubject.value.text)
            i.putExtra(Intent.EXTRA_TEXT, emailBody.value.text)

            // on below line we are
            // setting type of intent
            i.setType("message/rfc822")

            // on the below line we are starting our activity to open email application.
            ctx.startActivity(Intent.createChooser(i, "Choose an Email client : "))

        }) {
            // on the below line creating a text for our button.
            Text(
                // on below line adding a text ,
                // padding, color and font size.
                text = "Send Email",
                modifier = Modifier.padding(10.dp),
                color = Color.White,
                fontSize = 15.sp
            )
        }
    }

//Another.
    val annotatedLinkString = buildAnnotatedString {
        val str = "Click this link to go to web site"
        val startIndex = str.indexOf("link")
        val endIndex = startIndex + 4
        append(str)
        addStyle(
            style = SpanStyle(
                color = Color(0xff64B5F6),
                textDecoration = TextDecoration.Underline
            ), start = startIndex, end = endIndex
        )
    }

    Text(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        text = annotatedLinkString
    )

}