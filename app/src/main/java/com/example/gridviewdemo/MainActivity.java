package com.example.gridviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    int[] images = {R.drawable.f1, R.drawable.f2, R.drawable.f3, R.drawable.f4, R.drawable.f5};
    String[] names = {"Fruit 1", "Fruit 2", "Fruit 3", "Fruit 4", "Fruit 5",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);

        ProductAdapter adapter = new ProductAdapter(getApplicationContext(), images, names);

        gridView.setAdapter(adapter);
    }
}