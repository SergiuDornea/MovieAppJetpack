package com.example.movieapp2.screen.details

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.movieapp2.R
import com.example.movieapp2.model.Movie
import com.example.movieapp2.model.getMovies

//
//fun getActualMovie(movieId: String?) : List<Movie> {
//    val movies = getMovies().find {movie: Movie ->
//        movie.id == movieId
//    }
//
//}    val actualMovie= getActualMovie(movieId)

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailsScreen(navController: NavController, movieId: String?){


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
            ),
            navigationIcon = { IconButton(onClick = { navController.popBackStack() }) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_back),
                    contentDescription = "back arrow",
                    tint = colorResource(id = R.color.smoke)
                ) }
            },

        )
    }){

            Surface(
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth()
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = movieId.toString(),
                        modifier = Modifier
                            .padding(top = 100.dp)
                    )


                }

            }
    }





}