package com.zara.recyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        recyclerView = findViewById(R.id.recyclerview);

        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Sumaiya Islam", "sumaiyaislam@gmail.com", R.drawable.a));
        items.add(new Item("Jahangir Alam", "jahangiralam@gmail.com", R.drawable.b));
        items.add(new Item("Sawon Sarkar", "sawonsarkar@gmail.com", R.drawable.c));
        items.add(new Item("Sabina Yasmin", "sabinayasmin@gmail.com", R.drawable.d));
        items.add(new Item("Sanzida Khatun", "sanzidakhatun@gmail.com", R.drawable.e));
        items.add(new Item("Riya Khatun", "riyakhatun@gmail.com", R.drawable.f));
        items.add(new Item("Masud Rana", "masudrana@gmail.com", R.drawable.g));
        items.add(new Item("Himangshu Kumar", "himangshukumar@gmail.com", R.drawable.h));
        items.add(new Item("Riya Sarkar", "riyasarkar@gmail.com", R.drawable.i));
        items.add(new Item("Momota Khatun", "momotakhatun@gmail.com", R.drawable.j));
        items.add(new Item("Lisa Islam", "lisaislam@gmail.com", R.drawable.k));
        items.add(new Item("Rekha Khatun", "rekhakhatun@gmail.com", R.drawable.l));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));

        button = findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SwitchButton.class));
            }
        });
    }
}