package com.bklndev.myapplicationlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;
import android.widget.ArrayAdapter;

public class MyRecyclerActivity extends AppCompatActivity {
    //dataset yang berisi daftar pemain dan posisi
    String[] players = {"Cristiano Ronaldo","Wojciech Szczęsny","Mattia De Sciglio","Blaise Matuidi","Paulo Dybala","Aaron Ramsey",
            "Sami Khedira"," Miralem Pjanić","Matthijs de Ligt"," Giorgio Chiellini","Douglas Costa"};
    String[] position = {"Forward","Goalkick","Defensive","Midfielder","Forward","Midfielder",
            "Midfielder","Midfielder","Defensive","Defensive","Forward"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_recycler);

        RecyclerView recyclerView = findViewById(R.id.rv);

        //https://developer.android.com/guide/topics/ui/layout/recyclerview
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        RecyclerView.Adapter adapter = new RecyclerAdapter(players,position);
        recyclerView.setAdapter(adapter);
    }
}
