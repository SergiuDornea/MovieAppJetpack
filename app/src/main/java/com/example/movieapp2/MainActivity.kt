package com.example.movieapp2

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.movieapp2.navigation.MovieNavigation
import com.example.movieapp2.screens.screen.MainContent
import com.example.movieapp2.ui.theme.MovieApp2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp {
                MovieNavigation()
            }
        }
    }
}




@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MyApp(content: @Composable () -> Unit){
    MovieApp2Theme {
        content()


    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview(){
    var nav = rememberNavController()
    MyApp {
        MainContent(nav)

    }


}

