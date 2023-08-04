package com.example.movieapp2.screen.details

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.movieapp2.R
import com.example.movieapp2.model.Movie
import com.example.movieapp2.widgets.TextItem


//fun getActualMovie(movieId: String?) : Movie {
//    val movies = getMovies().filter {movie: Movie ->
//        movie.id == movieId
//    }
//    return movies[0]
//
//}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailsScreen(navController: NavController, movieId: String?, movieList: List<Movie> ) {

    // somehow not working :((
//    val actualMovie= getActualMovie(movieId)

//    another try
//    val index = movieId.toString()
//    val movies = getMovies()
//    val movies = getMovies()
//    val actualMovie = movies[index]


    // another try
//       val actualMovie = getMovies().find {movie ->
//           movie.id == index
//    }

    val actualMovie = movieList.find { movie ->
        movie.id == movieId
    }
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
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_back),
                            contentDescription = "back arrow",
                            tint = colorResource(id = R.color.smoke)
                        )
                    }
                }
            )
        }
    ) {
        Surface(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
            color = colorResource(id = R.color.soft_grey)
        ) {

            if (actualMovie != null) {
                MoviePresentation(actualMovie)
            } else {
                MoviePresentation()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MoviePresentation(movie : Movie = dummyMovie){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier.padding(top = 100.dp)) {
            Text(
                text = movie.title,
                style = MaterialTheme.typography.headlineMedium,
                modifier = Modifier
                    .padding(bottom = 16.dp),
                color = colorResource(id = R.color.smoke)
            )
        Card(
            modifier = Modifier
                .padding(4.dp)
                .fillMaxWidth(),
            shape = RoundedCornerShape(20.dp),
            elevation = CardDefaults.cardElevation(4.dp),
            colors = CardDefaults.cardColors(
                containerColor = colorResource(R.color.soft_blue),
                contentColor = colorResource(R.color.smoke),


                )
        ) {
            Row (
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ){
                Surface(
                    modifier = Modifier
                        .padding(12.dp)
                        .size(100.dp),
                    shape = RectangleShape,
                    shadowElevation = 4.dp
                ) {
                    AsyncImage(
                        model = ImageRequest.Builder(LocalContext.current)
                            .data(movie.poster)
                            .crossfade(true)
                            .build(),
                        contentDescription = "Movie poster",
                        contentScale = ContentScale.Crop,

                        )
                }

                Column(modifier = Modifier.padding(4.dp)) {
                    TextItem(header = "Director", data = movie.director)
                    TextItem(header = "Released", data = movie.year)

                    Column {
                        TextItem(header = "Actors", data = movie.actors)
                        TextItem(header = "Rating", data = movie.rating)
                        Spacer(modifier = Modifier.height(4.dp))
                        Divider(color = colorResource(id = R.color.smoke))
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(text = buildAnnotatedString {
                            withStyle(style = SpanStyle(fontSize = 13.sp )){
                                append("Plot: ")
                            }
                            withStyle(style = SpanStyle(fontSize = 13.sp, fontWeight = FontWeight.SemiBold)){
                                append(movie.plot)
                            }
                        })
                    }

                }

            }
        }
        Spacer(modifier = Modifier.height(30.dp))
        Divider(
            color = colorResource(id = R.color.soft_blue),
            thickness = 5.dp
            )
        Text(text = "Movie images:",
            style = MaterialTheme.typography.headlineMedium,
            color = colorResource(id = R.color.soft_blue)
            )
        LazyRow{
            items(movie.images){ image->
                Card(
                    modifier = Modifier
                        .size(240.dp)
                        .padding(10.dp)
                ){
                    AsyncImage(
                        model = ImageRequest.Builder(LocalContext.current)
                            .data(image)
                            .crossfade(true)
                            .build(),
                        contentDescription = "Movie image",
                        contentScale = ContentScale.Crop,

                        )
                }

            }
        }
        }

}

val dummyMovie = Movie("ID Not Found ","TITLE Not Found","RELEASE Not Found","GENRE Not Found","DIRECTOR Not Found","ACTORS Not Found","PLOT Not Found","POSTER Not Found", listOf("IMG1 Not Found", "IMG2 Not Found", "IMG3 Not Found"), "RATING Not Found")

//                    Text(
//                        text = movieList[movieId].title,
//                        modifier = Modifier
//                            .padding(top = 100.dp)
//                    )
//


