package com.example.developer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposeCompilerApi
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.developer.ui.theme.DEVELOPERTheme
import com.example.developer.ui.theme.Shapes

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DEVELOPERTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    //DeveloperBackground("Back")
                    BackgroundImage()
                    DeveloperTitle(getString(R.string.Title))
                    DeveloperName(getString(R.string.Developername))
                    DeveloperImage("OGOLA SOSPETER")
                    DeveloperImage1("Mycalls")
                    DeveloperImage2("Myemail")
                    DeveloperImage3("Mytwitter")
                    DeveloperContacts("0795398253")
                    DeveloperEmails(getString(R.string.developeremail) )
                    DeveloperTwitter(getString(R.string.twitteraccount))


                    //ogolasospeter62@gmail.com

                }
            }
        }
    }
}

/*
@Composable
fun DeveloperBackground(back: String) {
    Column {

        Text(
            text = back,
            fontSize = 20.sp,
            textAlign = TextAlign.Left,
            modifier = Modifier
                .fillMaxWidth()
                .width(400.dp)
                .height(150.dp)
                .padding(top = 3.dp, start = 3.dp, end = 3.dp)
                .border(border = BorderStroke(width = 2.dp, color = Color.Green))
        )
    }
}
*/
@Composable
fun DeveloperTitle(title: String) {
    Column {

        Text(
            text = title,
            fontSize = 24.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxSize()
                .width(2000.dp)
                .height(100.dp)
                .padding(top = 200.dp, start = 20.dp, end = 20.dp, bottom = 3.dp)
                //.border(border = BorderStroke(width = 2.dp, color = Color.Green))
        )
    }
}

    @Composable
    fun DeveloperName(name: String) {
        Column {

            Text(
                text = name,
                fontSize = 20.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier

                    .padding(top = 500.dp, start = 142.dp, end = 20.dp)

            )
        }
    }

@Composable
fun BackgroundImage() {
    val image0 = painterResource(R.drawable.alx)
    Image(
        painter =  image0,
        alignment = Alignment.TopCenter,
        contentDescription = null,
        modifier = Modifier
            //.fillMaxSize()
            .padding(top = 2.dp, end = 2.dp, start = 2.dp)
            .width(2000.dp)
            .height(50.dp),
        //.border( width = 1.dp, color = Color.Magenta),
        contentScale = ContentScale.Inside
    )
}

    @Composable
    fun DeveloperImage(name: String) {
        val image = painterResource(R.drawable.email)
        Image(
            painter = image,
            alignment = Alignment.TopCenter,
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 280.dp, end = 20.dp, start = 70.dp)
                .width(200.dp)
                .height(100.dp),
            //.border( width = 1.dp, color = Color.Magenta),
            contentScale = ContentScale.Inside
        )
    }

    @Composable
    fun DeveloperImage1(name: String) {
        val image1 = painterResource(R.drawable.call)
        Image(
            painter = image1,
            alignment = Alignment.BottomCenter,
            contentDescription = null,
            modifier = Modifier
                //.fillMaxSize()
                //.fillMaxWidth()
                .padding(top = 637.dp, end = 20.dp, start = 70.dp)
                .width(50.dp)
                .height(50.dp)
                .border(width = 1.dp, color = Color.Magenta),
            contentScale = ContentScale.Fit
        )
    }

    @Composable
    fun DeveloperImage2(name: String) {
        val image2 = painterResource(R.drawable.email1)
        Image(
            painter = image2,
            alignment = Alignment.BottomCenter,
            contentDescription = null,
            modifier = Modifier
                //.fillMaxSize()
                //.fillMaxWidth()
                .padding(top = 690.dp, end = 20.dp, start = 70.dp)
                .width(50.dp)
                .height(50.dp)
                .border(width = 1.dp, color = Color.DarkGray),
            contentScale = ContentScale.Fit
        )

    }

    @Composable
    fun DeveloperImage3(twitter: String) {
        val image3 = painterResource(R.drawable.twitter)
        Image(
            painter = image3,
            alignment = Alignment.BottomCenter,
            contentDescription = null,
            modifier = Modifier
                //.fillMaxSize()
                //.fillMaxWidth()
                .padding(top = 750.dp, end = 20.dp, start = 70.dp)
                .width(50.dp)
                .height(50.dp)
                .border(width = 1.dp, color = Color.DarkGray),
            contentScale = ContentScale.Fit
        )

    }

    @Composable
    fun DeveloperContacts(contact: String) {
        Column {
            Text(
                text = contact,
                fontSize = 25.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier

                    .padding(top = 640.dp, start = 170.dp, end = 20.dp)

            )
        }
    }

    @Composable
    fun DeveloperEmails(email: String) {
        Column {
            Text(
                text = email,
                fontSize = 15.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier

                    .padding(top = 700.dp, start = 170.dp, end = 20.dp)

            )
        }
    }

    @Composable
    fun DeveloperTwitter(twitter: String) {
        Column {
            Text(
                text = twitter,
                fontSize = 18.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier

                    .padding(top = 764.dp, start = 180.dp, end = 20.dp)

            )
        }
    }


    @Preview(showBackground = true)
    @Composable
    fun DeveloperPreview() {
        DEVELOPERTheme {
            Surface(
                modifier = Modifier.fillMaxSize()
            ) {
                Column(
                    modifier = Modifier.fillMaxSize()
                ) {}
            }
            //DeveloperBackground("Back")
            BackgroundImage()
            DeveloperTitle("...MY SOCIAL MEDIA HANDLES...")
            DeveloperName("OGOLA SOSPETER")
            DeveloperImage("OGOLA SOSPETER")
            DeveloperImage1("Mycalls")
            DeveloperImage2("Myemail")
            DeveloperImage3("Mytwitter")
            DeveloperContacts("0795398253")
            DeveloperEmails("ogolasospeter62@gmail.com")
            DeveloperTwitter("OKONGO OGOLA")

        }
    }