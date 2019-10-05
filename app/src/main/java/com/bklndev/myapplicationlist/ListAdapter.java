package com.bklndev.myapplicationlist;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class ListAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] players;
    private final String[] number;
    private final String[] pos;

    //constructor ListAdapter yang berisi setter dari argument yang dikirim saat pemanggilan
    public ListAdapter(Activity context, String[] players, String[] number, String[] position) {
        super(context,R.layout.cutom_list,players);
        this.context = context;
        this.players = players;
        this.number = number;
        this.pos = position;
    }

    //fungsi getView untuk meng-inflate / membuat layout custom_list.xml
    //menjadi object yang dapat diisi perintah
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.cutom_list, null,true);

        //instansiasi
        TextView txtPlayer = rowView.findViewById(R.id.txt_player);
        TextView txtPosition = rowView.findViewById(R.id.txt_position);
        TextView txtNumber = rowView.findViewById(R.id.txt_number);

        //set textview dengan data element array
        //position menunjukkan index array
        txtPlayer.setText(players[position]);
        txtPosition.setText(pos[position]);
        txtNumber.setText(number[position]);

        return rowView;

    }
}
