package com.example.infs3634homework2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyViewHolder>{
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.homeholder,parent,false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.name.setText(Restaurant.getRestaurants().get(position).getName());
        holder.rank.setText("Rank: "+Restaurant.getRestaurants().get(position).getRank());
    }

    @Override
    public int getItemCount() {
        return Restaurant.getRestaurants().size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView name;
        TextView rank;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.homeholder_name);
            rank = itemView.findViewById(R.id.homeholder_rank);
        }
    }
}
