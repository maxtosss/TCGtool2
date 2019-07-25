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

        String url = "https://art.hearthstonejson.com/v1/render/latest/enUS/256x/EX1_001.png";
        String idurl = mData.get(position).getId();
        String newurl = url.replace("EX1_001",idurl);
        Picasso.with(mContext).load(newurl).into(holder.imageView);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(mContext,Card_Detail.class);
                intent.putExtra("id",mData.get(position).getId());
                intent.putExtra("dbfid",mData.get(position).getDbfid());
                intent.putExtra("name",mData.get(position).getName());
                intent.putExtra("text",mData.get(position).getText());
                intent.putExtra("flavor",mData.get(position).getFlavor());
                intent.putExtra("artist",mData.get(position).getArtist());
                intent.putExtra("attack",mData.get(position).getAttack());
                intent.putExtra("cardClass",mData.get(position).getCardClass());
                intent.putExtra("collectible",mData.get(position).getCollectible());
                intent.putExtra("cost",mData.get(position).getCost());
                intent.putExtra("elite",mData.get(position).getElite());
                intent.putExtra("faction",mData.get(position).getFaction());
                intent.putExtra("health",mData.get(position).getHealth());
                intent.putStringArrayListExtra("mechanics",mData.get(position).getMechanics());
                intent.putExtra("rarity",mData.get(position).getRarity());
                intent.putExtra("set",mData.get(position).getSet());
                intent.putExtra("type",mData.get(position).getType());

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
