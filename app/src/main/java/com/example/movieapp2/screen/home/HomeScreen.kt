package com.example.movieapp2.screens.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.movieapp2.R
import com.example.movieapp2.model.*
import com.example.movieapp2.navigation.MovieScreens
import com.example.movieapp2.widgets.ListItemByMe

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController){
    Scaffold(
        containerColor = colorResource(id = R.color.soft_grey),
        topBar = {
        TopAppBar(
            title = {
                Text(text = "Movies")
            },
            colors = TopAppBarDefaults.mediumTopAppBarColors(
                containerColor = colorResource(id = R.color.dark_navy),
                titleContentColor = colorResource(id = R.color.smoke)
            )
        )
    })
    {
        MainContent(navController = navController)
    }

}


@Composable
fun MainContent(navController: NavController,
                movieList: List<Movie> = getMovies() ){
    LazyColumn(modifier = Modifier.padding(top = 70.dp)){
        items(items = movieList){
            ListItemByMe(it){ movie ->
                navController.navigate(route = MovieScreens.DetailsScreen.name+"/$movie ")

            }
        }
    }

}

//@Preview
//@Composable
//fun HomeScreenPreview(){
//    var nav = rememberNavController()
//    HomeScreen(nav)
//
//}
