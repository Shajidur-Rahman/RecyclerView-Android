package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        ArrayList<Food> foods = new ArrayList<>();
        foods.add(new Food("Vatt", android.R.drawable.btn_star_big_on));
        foods.add(new Food("Vatt", android.R.drawable.btn_star_big_on));
        foods.add(new Food("Vatt", android.R.drawable.btn_star_big_on));
        foods.add(new Food("Vatt", android.R.drawable.btn_star_big_on));
        foods.add(new Food("Vatt", android.R.drawable.btn_star_big_on));
        foods.add(new Food("Vatt", android.R.drawable.btn_star_big_on));
        foods.add(new Food("Vatt", android.R.drawable.btn_star_big_on));

        FoodAdapter foodAdapter = new FoodAdapter(this, foods);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(foodAdapter);

    }
}