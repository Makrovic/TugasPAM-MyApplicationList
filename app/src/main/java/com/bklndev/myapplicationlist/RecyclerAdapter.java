package com.bklndev.myapplicationlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

//class RecyclerAdapter perlu meng-inherit class RecyclerView.Adapter beserta method-methodnya
//https://developer.android.com/guide/topics/ui/layout/recyclerview
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>{
    private String[] players;
    private String[] pos;

    //constructor
    public RecyclerAdapter(String[] players, String[] pos) {
        this.players = players;
        this.pos = pos;
    }


    //class ViewHolder meng-inherit class RecyclerView.ViewHolder
    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tvPlayer;
        TextView tvPosition;
        //constructor MyViewHolder
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvPlayer = itemView.findViewById(R.id.txt_player);
            tvPosition = itemView.findViewById(R.id.txt_position);
        }
    }

    //method MyViewHolder adalah turunan dari RecyclerView.Adapter
    //fungsinya untuk meng-inflate layout recycler_list.xml / custom view
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_list,parent,false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    //method untuk menset data ke text view pada custom view (recycler_list.xml)
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tvPlayer.setText(players[position]);
        holder.tvPosition.setText(pos[position]);
    }

    //yang ini buat ngitung panjang array
    @Override
    public int getItemCount() {
        return players.length;
    }
}
