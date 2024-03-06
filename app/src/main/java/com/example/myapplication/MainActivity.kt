package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.icu.text.CaseMap.Title
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.security.AllPermission
import kotlin.math.max

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }
}


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyApp(){

    Scaffold (
        topBar = {
            TopAppBar(
                title = {
                    val text = buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                color= Color.Red,
                                fontWeight = FontWeight.Bold,
                                fontSize = 30.sp
                            )
                        ){
                            append("M")
                        }
                        append("y ")
                        withStyle(
                            style = SpanStyle(
                                color= Color.Red,
                                fontWeight = FontWeight.Bold,
                                fontSize = 30.sp
                            )
                        ){
                            append("A")
                        }
                        append("pp")
                    }
                    Text(text = text)
                },
                navigationIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(Icons.Filled.Menu, contentDescription = "Menu")
                    }
                },
                actions = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(Icons.Filled.Notifications, contentDescription = "Menu")
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(Icons.Filled.Search, contentDescription = "Menu")
                    }
                }
            )
        }
    ){
        Column (Modifier.padding(top = 60.dp)){
            Layout2("Arif Hussain", "03163401145")
            Layout2("Adil Hussain", "03110315257")
            Layout2("Dost Ali", "03337179203")
            

        }
        //LazyGridWithTwoPictures()
    }
}


@Composable
fun LazyGridWithTwoPictures() {
    // Replace these with your actual image resources
    val imageList = listOf(
        R.drawable.arif,
        R.drawable.arif,
        R.drawable.arif,
        R.drawable.arif,
        R.drawable.arif,
        R.drawable.arif,
        R.drawable.arif,
        R.drawable.arif,
        R.drawable.arif,
        R.drawable.arif,
        R.drawable.arif,
        R.drawable.arif,
        R.drawable.arif,
        R.drawable.arif,
        R.drawable.arif,
        R.drawable.arif,
        R.drawable.arif,
        // Add more images as needed
    )

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        contentPadding = PaddingValues(16.dp),
        modifier = Modifier.padding(top = 60.dp)
    ) {
        items(imageList) { image ->
            TwoPicturesInOneLine(image)
        }
    }
}

@Composable
fun TwoPicturesInOneLine(image: Int) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        // Display two pictures in one line
        Image(
            painter = painterResource(id = image),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp)
                .clip(shape = MaterialTheme.shapes.medium),
            contentScale = ContentScale.Crop
        )
    }
}


@Composable
fun Button1() {
    var isGreen = rememberSaveable { mutableStateOf(false)}
    val bgColor = if (isGreen.value) Color.Green else Color.Red

    Button(
        onClick = { isGreen.value = !isGreen.value },
        // modifier = Modifier.background(bgColor)

    ) {
        Text(text = "Call")
    }
}

@Composable
fun Layout2(name: String, number: String){
    Card(
        Modifier
            .padding(start = 20.dp, top = 20.dp)
            .width(380.dp)
            .height(100.dp),

        ) {
        Row(
            modifier = Modifier
                .padding(top = 20.dp, start = 20.dp, bottom = 20.dp, end = 10.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.arif),
                contentDescription ="Image",
                modifier = Modifier
                    .size(80.dp)
                    .clip(RoundedCornerShape(10.dp))
            )
            Column (
                modifier = Modifier.padding(start = 20.dp, end = 30.dp)
            ){
                Text(
                    text = "${name}",
                    fontWeight = FontWeight.Bold,
                    style = MaterialTheme.typography.titleLarge
                )
                Text(
                    text = "${number}",
                    style = MaterialTheme.typography.titleSmall
                )
            }
            Button1()
        }
    }
}




@Preview(showSystemUi = true)
@Composable
fun PreviewMessageCard() {
   MyApp()
}





