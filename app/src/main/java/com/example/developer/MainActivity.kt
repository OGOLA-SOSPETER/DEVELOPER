package com.example.developer

import android.graphics.drawable.shapes.RectShape
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.developer.ui.theme.DEVELOPERTheme
import kotlin.math.round

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
                    ImageInBackground()
                    DeveloperTitle(getString(R.string.Title))
                    DeveloperName(getString(R.string.Developername))
                    DeveloperImage()
                    DeveloperImage1()
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

@Composable
    fun DeveloperName(name: String) {


            Text(
                text = name,
                fontSize = 20.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier

                    .padding(top = 340.dp, start = 70.dp, end = 20.dp,bottom = 100.dp)
                    //.background(color = Green)
            )
        }
@Composable
fun ImageInBackground(){

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(20.dp)
    ){
    Card(
        elevation = 4.dp,
    )
    {}
        val image = painterResource(id = R.drawable.img)
    }
}

@Composable
fun BackgroundImage() {
    Row( verticalAlignment = Alignment.Top,
        horizontalArrangement = Arrangement.End) {
        Box {
            val image0 = painterResource(R.drawable.image)

            Image(
                painter = image0,
                alignment = Alignment.TopCenter,
                contentDescription = null,
                modifier = Modifier
                    //.fillMaxSize()
                    .padding(start = 50.dp)
                    .width(290.dp)
                    //.background(Color.DarkGray,shape = RectangleShape)
                    .border(width = 1.dp, color = Color.DarkGray)
                    .height(290.dp),
                //.border( width = 1.dp, color = Color.Magenta),
                contentScale = ContentScale.Crop
            )
            Text(
                "Ogola Sospeter",
                textAlign = TextAlign.Left,
                fontSize = 13.sp,
                modifier = Modifier.padding(top = 190.dp, start = 170.dp),
                color = Color.White
            )
        }
        Text(
            "An outgoing, industrious Gentleman.",
            textAlign = TextAlign.Center,
            fontSize = 15.sp,

        )
    }
}

    @Composable
    fun DeveloperImage() {
        val image = painterResource(R.drawable.email)
        Box {
            Image(
                painter = image,
                alignment = Alignment.TopCenter,
                contentDescription = null,
                modifier = Modifier
                    .padding(top = 299.dp, end = 20.dp, start = 170.dp)
                    .width(60.dp)
                    .height(40.dp),
                //.border( width = 1.dp, color = Color.Magenta),
                contentScale = ContentScale.Inside
            )
        }
    }
    @Composable
    fun DeveloperImage1() {
        val image1 = painterResource(R.drawable.call)
        Box {
            Image(
                painter = image1,
                alignment = Alignment.BottomCenter,
                contentDescription = null,
                modifier = Modifier
                    //.fillMaxSize()
                    //.fillMaxWidth()
                    .padding(top = 374.dp, end = 20.dp, start = 150.dp)
                    .width(30.dp)
                    .height(30.dp)
                    .border(width = 1.dp, color = Color.Magenta),
                contentScale = ContentScale.Fit
            )
        }
    }
    @Composable
    fun DeveloperImage2(name: String) {
        val image2 = painterResource(R.drawable.email1)
        Box {
            Image(
                painter = image2,
                alignment = Alignment.BottomCenter,
                contentDescription = null,
                modifier = Modifier
                    //.fillMaxSize()
                    //.fillMaxWidth()
                    .padding(top = 410.dp, end = 20.dp, start = 150.dp)
                    .width(30.dp)
                    .height(30.dp)
                    .border(width = 1.dp, color = Color.DarkGray),
                contentScale = ContentScale.Fit
            )
        }
    }

    @Composable
    fun DeveloperImage3(twitter: String) {
        val image3 = painterResource(R.drawable.twitter)
        Box {
            Image(
                painter = image3,
                alignment = Alignment.BottomCenter,
                contentDescription = null,
                modifier = Modifier
                    //.fillMaxSize()
                    //.fillMaxWidth()
                    .padding(top = 445.dp, end = 20.dp, start = 151.dp)
                    .width(30.dp)
                    .height(30.dp)
                    .border(width = 1.dp, color = Color.DarkGray),
                contentScale = ContentScale.Fit
            )
        }
    }

    @Composable
    fun DeveloperContacts(contact: String) {
        Box {
            Text(
                text = contact,
                fontSize = 20.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier

                    .padding(top = 370.dp, start = 185.dp, end = 20.dp)

            )
        }
    }
    @Composable
    fun DeveloperEmails(email: String) {
        Box {
            Text(
                text = email,
                fontSize = 13.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier

                    .padding(top = 414.dp, start = 184.dp, end = 20.dp)

            )
        }
    }

    @Composable
    fun DeveloperTwitter(twitter: String) {
        Box {
            Text(
                text = twitter,
                fontSize = 13.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier

                    .padding(top = 446.dp, start = 185.dp, end = 20.dp)

            )
        }
    }


    @Preview(showBackground = true)
    @Composable
    fun DeveloperPreview() {
        DEVELOPERTheme {

            //DeveloperBackground("Back")
            BackgroundImage()
            DeveloperTitle("...MY SOCIAL MEDIA HANDLES...")
            DeveloperName("OGOLA SOSPETER")
            DeveloperImage()
            DeveloperImage1()
            DeveloperImage2("Myemail")
            DeveloperImage3("Mytwitter")
            DeveloperContacts("0795398253")
            DeveloperEmails("ogolasospeter62@gmail.com")
            DeveloperTwitter("OKONGO OGOLA")
            ImageInBackground()

        }
    }