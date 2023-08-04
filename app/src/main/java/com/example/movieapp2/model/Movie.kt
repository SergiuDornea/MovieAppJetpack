package com.example.movieapp2.model

// dummy data :)
data class Movie(
    var id: String,
    val title : String,
    val year : String,
    val genre : String,
    val director: String,
    val actors: String,
    val plot: String,
    val poster: String,
    val images: List<String>,
    val rating: String
                 )

fun getMovies(): List<Movie> {
    return listOf(
        Movie(
//            id = "tt2713180",
            id = "0",
            title = "Fury",
            year = "2014",
            genre = "Action, War, Drama",
            director = "David Ayer",
            actors = "Brad Pitt, Shia LaBeouf, Logan Lerman, Michael Peña, Jon Bernthal",
            plot = "A grizzled tank commander makes tough decisions as he and his crew fight their way across Germany in April, 1945.",
            poster = "https://m.media-amazon.com/images/M/MV5BMjA4MDU0NTUyN15BMl5BanBnXkFtZTgwMzQxMzY4MjE@._V1_.jpg",
            images = listOf(
                "https://m.media-amazon.com/images/M/MV5BMTU4ODQ2MjU2Nl5BMl5BanBnXkFtZTgwNzQyNTY4MjE@._V1_.jpg",
                "https://m.media-amazon.com/images/M/MV5BMjM1ODA1NjQ4MF5BMl5BanBnXkFtZTgwOTQyNTY4MjE@._V1_.jpg",
                "https://m.media-amazon.com/images/M/MV5BNjg0MDU3NTU3M15BMl5BanBnXkFtZTgwNjQyNTY4MjE@._V1_.jpg",
                "https://m.media-amazon.com/images/M/MV5BMjIwMjA5NjY2NV5BMl5BanBnXkFtZTgwNzEyNTY4MjE@._V1_.jpg"
            ),
            rating = "7.6"

        ),

        Movie(
//            id = "tt0120815",
            id = "1",
            title = "Saving Private Ryan",
            year = "1998",
            genre = "Action, War, Drama",
            director = "Steve Spielberg",
            actors = "Tom Hanks, Matt Damon, Tom Sizemore",
            plot = "Following the Normandy Landings, a group of U.S. soldiers go behind enemy lines to retrieve a paratrooper whose brothers have been killed in action.",
            poster = "https://m.media-amazon.com/images/M/MV5BZjhkMDM4MWItZTVjOC00ZDRhLThmYTAtM2I5NzBmNmNlMzI1XkEyXkFqcGdeQXVyNDYyMDk5MTU@._V1_FMjpg_UX1000_.jpg",
            images = listOf(
                "https://m.media-amazon.com/images/M/MV5BN2ZkY2E2ODYtZTY1MC00NTAzLWJhNDUtNzAyNTcyZTcwZmE3XkEyXkFqcGdeQXVyMDc2NTEzMw@@._V1_.jpg",
                "https://m.media-amazon.com/images/M/MV5BN2I3Y2U1ZTEtZTdjNi00OGRmLWI2OTgtZjYzNGFkNzM3YWYzXkEyXkFqcGdeQXVyMDc2NTEzMw@@._V1_.jpg",
                "https://m.media-amazon.com/images/M/MV5BMTM4NzE0MTIwMF5BMl5BanBnXkFtZTcwNzg3NzgwMw@@._V1_.jpg",
                "https://m.media-amazon.com/images/M/MV5BMTYwNjE4OTAwOV5BMl5BanBnXkFtZTcwODQyODgwMw@@._V1_.jpg"
            ),
            rating = "8.6"

        ),

        Movie(
//            id = "tt2119532",
            id = "2",
            title = "Hacksaw Ridge",
            year = "2016",
            genre = "Action, War, Drama",
            director = "Mel Gibson",
            actors = "Andrew Garfield, Sam Worthington, Luke Bracey",
            plot = "World War II American Army Medic Desmond T. Doss, who served during the Battle of Okinawa, refuses to kill people and becomes the first man in American history to receive the Medal of Honor without firing a shot.",
            poster = "https://desmonddoss.com/_si.php?resz=55&fo=hacksaw-ridge-movie&fi=hrm.jpg",
            images = listOf(
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ5fBZ8phUApuT6eyAmWkJUPOTBbhIoG26rP7nUUKmCCNFzenXXrtDfZ7zwKDFj-fvpbcs&usqp=CAU",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTPIEePfrhHc30L_hvx0RfNswjMLBL5mtAWdqbgql-2oRO7vB0XLZXeJ0RedbXDFUl8FXw&usqp=CAU",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQa1suas-ZDbzuI0DCFf2L_ZZsK9RNAw1TucWi2DHmbAXqkLWzJRPVNKIjvjqVzeDFXkpM&usqp=CAU",
                "https://m.media-amazon.com/images/M/MV5BMjI5MDQ3MTI5Nl5BMl5BanBnXkFtZTgwMDUwNDU0MDI@._V1_.jpg"
            ),
            rating = "8.1"

        ),

        Movie(
//            id = "tt0485985",
            id = "3",
            title = "Red tails",
            year = "2012",
            genre = "Action, War, Drama",
            director = "Anthony Hemingway",
            actors = "Cuba Gooding Jr, Gerald McRaney, David Oyelowo",
            plot = "A crew of African American pilots in the Tuskegee training program, having faced segregation while kept mostly on the ground during World War II, are called into duty under the guidance of Col. A.J. Bullard.",
            poster = "https://m.media-amazon.com/images/M/MV5BNDQ5MTg2NzI4OF5BMl5BanBnXkFtZTcwMDM2NzQzNg@@._V1_.jpg",
            images = listOf(
                "https://m.media-amazon.com/images/M/MV5BMTM0ODI0MTU2Ml5BMl5BanBnXkFtZTcwMzM0MzQyNw@@._V1_.jpg",
                "https://m.media-amazon.com/images/M/MV5BMjI3NDk3MTQzMl5BMl5BanBnXkFtZTcwOTI0MzQyNw@@._V1_.jpg",
                "https://m.media-amazon.com/images/M/MV5BMTg4OTk4ODU0MF5BMl5BanBnXkFtZTcwNTI0MzQyNw@@._V1_.jpg",
                "https://m.media-amazon.com/images/M/MV5BMTkzMTkxMTg1NV5BMl5BanBnXkFtZTcwMjI0MzQyNw@@._V1_.jpg"
            ),
            rating = "5.9"

        ),

        Movie(
//            id = "tt5013056",
            id = "4",
            title = "Dunkirk",
            year = "2017",
            genre = "Action, War, Drama",
            director = "Christopher Nolan",
            actors = "Fionn Whitehead, Barry Keoghan, Mark Rylance",
            plot = "Allied soldiers from Belgium, the British Commonwealth and Empire, and France are surrounded by the German Army and evacuated during a fierce battle in World War II.",
            poster = "https://m.media-amazon.com/images/M/MV5BN2YyZjQ0NTEtNzU5MS00NGZkLTg0MTEtYzJmMWY3MWRhZjM2XkEyXkFqcGdeQXVyMDA4NzMyOA@@._V1_FMjpg_UX1000_.jpg",
            images = listOf(
                "https://m.media-amazon.com/images/M/MV5BYWYzOTdmMjItY2Q4Yi00MjAyLWE0ZDctMjQwOTc0ZDkyZmVmXkEyXkFqcGdeQVRoaXJkUGFydHlJbmdlc3Rpb25Xb3JrZmxvdw@@._V1_.jpg",
                "https://m.media-amazon.com/images/M/MV5BNjUwMjg0NTY5MV5BMl5BanBnXkFtZTgwODcyOTIyMjI@._V1_.jpg",
                "https://m.media-amazon.com/images/M/MV5BN2VhMGY3YWQtMGYwZC00ZmM5LTg2MzgtZGRlNWQ2MGE2MTNiXkEyXkFqcGdeQXVyMjM4OTI2MTU@._V1_.jpg",
                "https://m.media-amazon.com/images/M/MV5BMTUwMjQyNDU2Ml5BMl5BanBnXkFtZTgwODgyNDY4MjI@._V1_.jpg"
            ),
            rating = "7.8"

        ),

        Movie(
//            id = "tt1809398",
            id = "5",
            title = "Unbroken",
            year = "2014",
            genre = "Action, War, Drama",
            director = "Angelina Jolie",
            actors = "Jack O'Connell, Miyavi, Domhnall Gleeson",
            plot = "After a near-fatal plane crash in WWII, Olympian Louis Zamperini spends a harrowing 47 days in a raft with two fellow crewmen before he's caught by the Japanese navy and sent to a prisoner-of-war camp.",
            poster = "https://m.media-amazon.com/images/M/MV5BMTY3ODg2OTgyOF5BMl5BanBnXkFtZTgwODk1OTAwMzE@._V1_.jpg",
            images = listOf(
                "https://m.media-amazon.com/images/M/MV5BNTUxMzMxOTczMl5BMl5BanBnXkFtZTgwODQzMzMzMzE@._V1_.jpg",
                "https://m.media-amazon.com/images/M/MV5BMTExOTUzNTc3OTJeQTJeQWpwZ15BbWU4MDQxNjkwMDMx._V1_.jpg",
                "https://m.media-amazon.com/images/M/MV5BMjM3NzQ2NDg0Nl5BMl5BanBnXkFtZTgwODE1NDcxMjE@._V1_.jpg",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRR2S8Fy-r30PGV-rfRbnVkBvHtJwYwqXw6OQi-EE7APTdXW0zis-59uadSIWHS4u_XStI&usqp=CAU"
            ),
            rating = "7.2"

        ),
    )
}