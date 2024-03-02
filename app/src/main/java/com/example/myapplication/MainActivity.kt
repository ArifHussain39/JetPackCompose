package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.icu.text.CaseMap.Title
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }

}
@Composable
fun Button1() {
      //  var col = rememberSaveable { mutableStateOf(Color.Red)}

        Button(
            onClick = { },
            modifier = Modifier.background(Color.Red)

        ) {
            Text(text = "Change color")
        }

}

@Composable
fun ShowSwitch(){

    var isChecked = rememberSaveable {
        mutableStateOf(true)
    }

    Switch(
        checked = isChecked.value ,
        onCheckedChange = { isChecked.value = it },
        modifier = Modifier.padding(70.dp)

    )
}


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyApp(){

    Scaffold (
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "My App")
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
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
           ShowSwitch()
            Button1()
        }
    }

}


@Preview(showSystemUi = true)
@Composable
fun PreviewMessageCard() {
    MyApp()
}





