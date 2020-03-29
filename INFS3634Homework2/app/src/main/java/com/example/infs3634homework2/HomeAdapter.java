package com.example.infs3634homework2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyViewHolder>{
    private ArrayList<Restaurant> currData = null;
    private Context currActivity = null;

    public void setCurrData(ArrayList<Restaurant> currData) {this.currData = currData;}
    public void setCurrActivity(Context currActivity) {this.currActivity = currActivity;}


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.homeholder,parent,false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.name.setText(currData.get(position).getName());
        holder.rank.setText("Rank: "+currData.get(position).getRank());
        // 设置图片
        // currData.get(0).getImage() ---> R.drawable.r1
        // currData.get(1).getImage() ---> R.drawable.r2
        if (currData.get(position).isLight()==true) {
            holder.star.setImageResource(R.drawable.coll_on);
        }
        holder.image.setImageResource(currData.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return currData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView name;
        TextView rank;
        ImageView image;
        ImageView star;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.homeholder_name);
            rank = itemView.findViewById(R.id.homeholder_rank);
            image = itemView.findViewById(R.id.re_image);
            star = itemView.findViewById(R.id.ifcoll);

            star.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    Restaurant currRest = currData.get(position);

                    if (currRest.isLight()==false) {
                        currRest.setLight(true);
                        Restaurant.getCollRestaurants().add(currRest);
                        Toast.makeText(currActivity, "添加成功！！！但是？", Toast.LENGTH_SHORT).show();
                        //让star亮
                        star.setImageResource(R.drawable.coll_on);
                    } else {
                        currRest.setLight(false);
                        if (currData.equals(Restaurant.getRestaurants())){
                            Restaurant.getCollRestaurants().remove(currRest);
                        } else {
                            Restaurant.getCollRestaurants().remove(position);
                        }
                        Toast.makeText(currActivity, "已删除收藏555", Toast.LENGTH_SHORT).show();
                        //让star不亮
                        star.setImageResource(R.drawable.coll_off);
                    }
                }
            });

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(currActivity,DetailActivity.class);

            Restaurant.currDetailRest = currData.get(getAdapterPosition());

            currActivity.startActivity(intent);
        }
    }
}
