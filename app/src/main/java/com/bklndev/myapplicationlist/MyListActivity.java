package com.bklndev.myapplicationlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MyListActivity extends AppCompatActivity {
    //array bertipedata string yang berisi daftar pemain juventus
    String[] players = {"Cristiano Ronaldo","Wojciech Szczęsny","Mattia De Sciglio","Blaise Matuidi","Paulo Dybala","Aaron Ramsey",
            "Sami Khedira"," Miralem Pjanić","Matthijs de Ligt"," Giorgio Chiellini","Douglas Costa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_list);

        ListView lvItem =findViewById(R.id.lv);
        //membuat array adapter default
        //di mana datanya diambil dari array players
        ArrayAdapter<String> adapter = new
                ArrayAdapter<String>(MyListActivity.this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1, players);
        //mengisi list view dengan adapter
        lvItem.setAdapter(adapter);
    }
}
