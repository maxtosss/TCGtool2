package com.example.tcgtool.Fungsiutama;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tcgtool.R;
import com.squareup.picasso.Picasso;

public class Card_Detail extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card__detail);


        TextView id = findViewById(R.id.idcard);
        TextView name = findViewById(R.id.Cardname);
        ImageView thumbnail= findViewById(R.id.imgCard);
        TextView desc = findViewById(R.id.description);
        TextView flavor = findViewById(R.id.flavor);
        TextView type = findViewById(R.id.type);
        TextView rarity = findViewById(R.id.rarity);
        TextView set = findViewById(R.id.set);
        TextView artist = findViewById(R.id.artist);
        TextView mechanics = findViewById(R.id.mechanics);
        TextView cardclass = findViewById(R.id.cardclass);



        Intent intent = getIntent();

        id.setText(intent.getExtras().getString("id"));
        name.setText(intent.getExtras().getString("name"));
        type.setText(intent.getExtras().getString("faction"));
        flavor.setText(intent.getExtras().getString("flavor"));
        desc.setText(intent.getExtras().getString("text"));
        rarity.setText(intent.getExtras().getString("rarity"));
        set.setText(intent.getExtras().getString("set"));
        artist.setText(intent.getExtras().getString("artist"));
        mechanics.setText(intent.getExtras().getString("mechanics"));
        cardclass.setText(intent.getExtras().getString("cardclass"));

        String idurl = intent.getExtras().getString("id");
        String url = "https://art.hearthstonejson.com/v1/render/latest/enUS/256x/EX1_001.png";
        String newurl = url.replace("EX1_001",idurl);
        Picasso.with(this).load(newurl).into(thumbnail);





    }
}
