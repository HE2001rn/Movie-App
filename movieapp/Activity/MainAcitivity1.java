package com.example.movieapp.Activity;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.movieapp.R;

public class MainAcitivity1 extends AppCompatActivity {
    private RecyclerView.Adapter adapterNewMovie,adapterUpComing;
    private RecyclerView recyclerViewNewMovies,recyclerViewUpComing;
    private RecyclerView
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
