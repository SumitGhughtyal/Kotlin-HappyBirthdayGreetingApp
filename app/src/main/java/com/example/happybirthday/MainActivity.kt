package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BirthdayGreetingImage( message = getString(R.string.happy_birthday_text) , from = getString(
                                            R.string.signature))
                }
            }
        }
    }
}

@Composable

fun BirthdayGreetingText(message : String , from : String , modifier: Modifier  = Modifier) {
    Column{
        Text(
            text = message , fontSize = 20.sp,
            modifier = Modifier.fillMaxWidth().wrapContentWidth(align = Alignment.Start).padding(start = 16.dp, top = 16.dp)


        )

        Text(
            text = from , fontSize = 16.sp,
            modifier = Modifier.fillMaxWidth().wrapContentWidth(align = Alignment.End).padding(start = 16.dp, end = 16.dp)
        )
        
    }



}

@Composable
fun BirthdayGreetingImage(message : String , from : String, modifier : Modifier = Modifier){
    val image = painterResource(R.drawable.androidparty)
    Box {
        Image(
            painter  = image,
            contentDescription = null,
            contentScale = ContentScale.Crop

        )
        BirthdayGreetingText(message = message, from = from)
    }

}




@Preview(showBackground = false )
@Composable
fun BirthdayGreetingImagePreview() {
    HappyBirthdayTheme {
        BirthdayGreetingImage( message = "Happy Birthday Sumit Ghughtyal !" ,  "  ~ from Khushi Pant" )

    }
}