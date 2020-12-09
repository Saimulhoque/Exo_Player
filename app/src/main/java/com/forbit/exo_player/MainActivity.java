package com.forbit.exo_player;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.ui.PlayerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Adapter adapter;
    RecyclerView recyclerView;
    //    List<Movie> movieList;
    List<Movie> movieList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        movieList = new ArrayList<>();
//
//        for (int i=0;i<100;i++){
//            movieList.add(new Movie(R.drawable.penguin, "Movie "+String.valueOf(i+1)));

        recyclerView = findViewById(R.id.recyclerview);
        adapter = new Adapter(this, movieList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));

        prepareMovieData();
    }

    private void prepareMovieData() {
        Movie movie = new Movie(R.drawable.jaws, "Jaws");
        movieList.add(movie);

        movie = new Movie(R.drawable.penguin, "Penguin");
        movieList.add(movie);

        movie = new Movie(R.drawable.nineteenseventeen, "1917");
        movieList.add(movie);

        movie = new Movie(R.drawable.starwars, "Star Wars");
        movieList.add(movie);

        movie = new Movie(R.drawable.midway, "Midway");
        movieList.add(movie);

        movie = new Movie(R.drawable.invasion, "Invasion");
        movieList.add(movie);

        movie = new Movie(R.drawable.worldwar, "World War");
        movieList.add(movie);

        movie = new Movie(R.drawable.xmenapoclypse, "X-Men Apoclypse");
        movieList.add(movie);

        movie = new Movie(R.drawable.ufo, "UFO");
        movieList.add(movie);

        movie = new Movie(R.drawable.joinmytrip, "Join My Trip");
        movieList.add(movie);

        movie = new Movie(R.drawable.thespecialist, "The Specialist");
        movieList.add(movie);

        movie = new Movie(R.drawable.thelegend, "The Legend");
        movieList.add(movie);

        movie = new Movie(R.drawable.bladerunner, "Blade Runner");
        movieList.add(movie);

        movie = new Movie(R.drawable.alpha, "Alpha");
        movieList.add(movie);

        movie = new Movie(R.drawable.beautyandthebeast, "Beauty And The Beast");
        movieList.add(movie);

        movie = new Movie(R.drawable.dunkirk, "Dunkirk");
        movieList.add(movie);

        movie = new Movie(R.drawable.malang, "Malang");
        movieList.add(movie);

        movie = new Movie(R.drawable.avakillorbekilled, "Ava-Kill Or Be Killed");
        movieList.add(movie);

        movie = new Movie(R.drawable.titanic, "Titanic");
        movieList.add(movie);

        movie = new Movie(R.drawable.theexorcist, "The Exorcist");
        movieList.add(movie);

        movie = new Movie(R.drawable.bloodshot, "Blood Shot");
        movieList.add(movie);

        movie = new Movie(R.drawable.thejoker, "The Joker");
        movieList.add(movie);

        movie = new Movie(R.drawable.backtothefuture, "Back To The Future");
        movieList.add(movie);

        movie = new Movie(R.drawable.avengersassamble, "Avengers Assamble");
        movieList.add(movie);

        movie = new Movie(R.drawable.harrypotter, "Harry Potter");
        movieList.add(movie);

        movie = new Movie(R.drawable.spacethelastknightfight, "Space The Last Knight Fight");
        movieList.add(movie);

        movie = new Movie(R.drawable.theassassin, "The Assassing");
        movieList.add(movie);


    }
}