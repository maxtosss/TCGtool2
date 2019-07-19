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
        type.setText(intent.getExtras().getString("type"));
        desc.setText(intent.getExtras().getString("desc"));
        atk.setText(intent.getExtras().getString("atk"));
        def.setText(intent.getExtras().getString("def"));
        level.setText(intent.getExtras().getString("level"));
        race.setText(intent.getExtras().getString("race"));
        attribute.setText(intent.getExtras().getString("attribute"));

        String[]image_url=intent.getExtras().getStringArrayList("thumnail").toArray(new String[0]);
        Picasso.with(this).load(image_url[0]).into(thumbnail);





    }
}
