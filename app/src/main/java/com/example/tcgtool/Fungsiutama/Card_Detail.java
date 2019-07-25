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
    private String name,type,desc,atk,def,level,race,attribute,tumbnail,idcard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card__detail);


        TextView id = findViewById(R.id.idcard);
        TextView name = findViewById(R.id.Cardname);
        TextView type = findViewById(R.id.type);
        TextView desc = findViewById(R.id.description);
        TextView atk = findViewById(R.id.atk);
        TextView def = findViewById(R.id.def);
        TextView level = findViewById(R.id.level);
        TextView race = findViewById(R.id.idrace);
        TextView attribute= findViewById(R.id.atribbute);
        ImageView thumbnail= findViewById(R.id.imgCard);

        Intent intent = getIntent();

        id.setText(intent.getExtras().getString("id"));
        name.setText(intent.getExtras().getString("name"));
        type.setText(intent.getExtras().getString("faction"));
        desc.setText(intent.getExtras().getString("text"));
        atk.setText(intent.getExtras().getString("cost"));
        def.setText(intent.getExtras().getString("mechanics"));
        level.setText(intent.getExtras().getString("rarity"));
        race.setText(intent.getExtras().getString("set"));
        attribute.setText(intent.getExtras().getString("type"));

        String idurl = intent.getExtras().getString("id");
        String url = "https://art.hearthstonejson.com/v1/render/latest/enUS/256x/EX1_001.png";
        String newurl = url.replace("EX1_001",idurl);
        Picasso.with(this).load(newurl).into(thumbnail);





    }
}
