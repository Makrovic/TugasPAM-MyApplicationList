package com.bklndev.myapplicationlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>{
    private String[] players;
    private String[] pos;

    public RecyclerAdapter(String[] players, String[] pos) {
        this.players = players;
        this.pos = pos;
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tvPlayer;
        TextView tvPosition;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvPlayer = itemView.findViewById(R.id.txt_player);
            tvPosition = itemView.findViewById(R.id.txt_position);
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_list,parent,false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tvPlayer.setText(players[position]);
        holder.tvPosition.setText(pos[position]);
    }

    @Override
    public int getItemCount() {
        return players.length;
    }
}
