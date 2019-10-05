package com.bklndev.myapplicationlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //instansiasi button yang telah di buat di xml main activity
        Button btnList = findViewById(R.id.btn_list);
        Button btnCustom = findViewById(R.id.btn_custom);
        Button btnRecycler = findViewById(R.id.btn_recycler);

        //menset event untuk button yang telah diinstansiasi
        //dengan fungsi yang dibuat di bawah
        btnList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intentList();
            }
        });
        btnCustom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intentCustomList();
            }
        });
        btnRecycler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intentRecycler();
            }
        });
    }

    //membuat fungsi yang berisi intent untuk komunikasi ke activity lain
    private void intentList(){
        Intent in = new Intent(this,MyListActivity.class);
        startActivity(in);
    }
    private void intentCustomList(){
        Intent in = new Intent(this,MyCustomListActivity.class);
        startActivity(in);
    }
    private void intentRecycler(){
        Intent in = new Intent(this,MyRecyclerActivity.class);
        startActivity(in);
    }
}
