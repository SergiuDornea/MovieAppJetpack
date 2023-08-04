package com.example.movieapp2.widgets

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.movieapp2.R
import com.example.movieapp2.model.Movie

@Composable
fun TextItem(header : String, data : String){
    Text(
        text = "$header: $data",
        modifier = Modifier.padding(top = 4.dp),
        style = MaterialTheme.typography.labelLarge

    )
}


@Composable
fun ListItemByMe(
    movie : Movie,
    onItemClick: (String) -> Unit
){
    val test = true
  var expanded = remember{
      mutableStateOf(false)
  }
    Card(
        modifier = Modifier
            .padding(4.dp)
            .fillMaxWidth()
            .clickable {
                onItemClick(movie.id)
            },
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

                AnimatedVisibility(visible = expanded.value, ) {

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

                Icon(imageVector =if(expanded.value) Icons.Filled.KeyboardArrowUp else Icons.Filled.KeyboardArrowDown,
                    contentDescription ="Arrow down",
                    modifier = Modifier
                        .size(25.dp)
                        .clickable {
                            expanded.value = !expanded.value
                        },
                    tint = colorResource(id = R.color.smoke)
                    )
            }

        }
    }

}


//@Preview
//@Composable
//fun listItemPreview(){
//        listItem( getMovies()[0] )
//}

