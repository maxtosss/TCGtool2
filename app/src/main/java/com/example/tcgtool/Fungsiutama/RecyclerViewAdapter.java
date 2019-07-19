package com.example.tcgtool.Fungsiutama;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.tcgtool.R;
import com.squareup.picasso.Picasso;

import java.util.List;

import room.CardEntity;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Context mContext;
    List<CardEntity> mData;

    public RecyclerViewAdapter(Context mContext, List<CardEntity> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }



    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(mContext).inflate(R.layout.item_contact,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {

        //piccaso
        String[]image_url=mData.get(position).getImage_url().toArray(new String[0]);
        Picasso.with(mContext).load(image_url[0]).into(holder.imageView);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(mContext,Card_Detail.class);
                intent.putExtra("id",mData.get(position).getId());
                intent.putExtra("name",mData.get(position).getName());
                intent.putExtra("type",mData.get(position).getType());
                intent.putExtra("desc",mData.get(position).getDech());
                intent.putExtra("atk",mData.get(position).getAtk());
                intent.putExtra("def",mData.get(position).getDef());
                intent.putExtra("level",mData.get(position).getLevel());
                intent.putExtra("race",mData.get(position).getRace());
                intent.putExtra("attribute",mData.get(position).getAttribute());
                intent.putExtra("thumbnail",mData.get(position).getImage_url());
                mContext.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        CardView cardView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

         imageView = itemView.findViewById(R.id.card_image_id);
         cardView = itemView.findViewById(R.id.item_contact);
        }
    }
}
