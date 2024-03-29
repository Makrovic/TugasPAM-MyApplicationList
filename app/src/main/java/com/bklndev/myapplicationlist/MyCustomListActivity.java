package com.bklndev.myapplicationlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MyCustomListActivity extends AppCompatActivity {
    //3 array string yang berisi daftar pemain, posisi, dan nomor punggung pemain juventus
    String[] players = {"Cristiano Ronaldo","Wojciech Szczęsny","Mattia De Sciglio","Blaise Matuidi","Paulo Dybala","Aaron Ramsey",
            "Sami Khedira"," Miralem Pjanić","Matthijs de Ligt"," Giorgio Chiellini","Douglas Costa"};
    String[] position = {"Forward","Goalkick","Defensive","Midfielder","Forward","Midfielder",
            "Midfielder","Midfielder","Defensive","Defensive","Forward"};
    String[] number = {"7","1","2","14","10","8",
            "6","5","4","3","11"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_custom_list);

        //untuk menampilkan custom list view diperlukan custom layout (custom_list.xml)
        // juga custom adapter (ListAdapter.java)
        ListAdapter adapter = new ListAdapter(this,players,number,position);
        ListView lvCustom = findViewById(R.id.lv_custom);
        lvCustom.setAdapter(adapter);
    }
}
