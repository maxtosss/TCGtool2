package com.example.tcgtool;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class FragmentCall extends Fragment {

    View v;
    private RecyclerView myrecylerview;
    private List<Card> lstcard;

    public FragmentCall() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.call_fragment,container,false);
        myrecylerview = (RecyclerView) v.findViewById(R.id.contact_recyclerview);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(),lstcard);
        myrecylerview.setLayoutManager(new GridLayoutManager(getActivity(),2));
        myrecylerview.setAdapter(recyclerViewAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstcard = new ArrayList<>();

        //add card
        lstcard.add(new Card("44852429",
                "D/D/D Cursed King Siegfried",
                "Fiend",
                "1 Tuner + 1 or more non-Tuner \"D/D\" monsters\n" + "During either player's turn: You can target 1 face-up Spell/Trap Card on the field; that target has its effects negated, until the next Standby Phase. You can only use this effect of \"D/D/D Cursed King Siegfried\" once per turn. If this card is destroyed by battle or card effect and sent to the Graveyard: Gain 1000 LP for each \"Dark Contract\" card you control.",
                "2800",
                "2200",
                "8",
                "D/D",
                "Dark",
                "https://ygoprodeck.com/pics/6622715.jpg"));

        lstcard.add(new Card("44852429",
                "D/D/D Cursed King Siegfried",
                "Fiend",
                "1 Tuner + 1 or more non-Tuner \"D/D\" monsters\n" + "During either player's turn: You can target 1 face-up Spell/Trap Card on the field; that target has its effects negated, until the next Standby Phase. You can only use this effect of \"D/D/D Cursed King Siegfried\" once per turn. If this card is destroyed by battle or card effect and sent to the Graveyard: Gain 1000 LP for each \"Dark Contract\" card you control.",
                "2800",
                "2200",
                "8",
                "D/D",
                "Dark",
                "https://ygoprodeck.com/pics/44852429.jpg"));

        lstcard.add(new Card("44852429",
                "D/D/D Cursed King Siegfried",
                "Fiend",
                "1 Tuner + 1 or more non-Tuner \"D/D\" monsters\n" + "During either player's turn: You can target 1 face-up Spell/Trap Card on the field; that target has its effects negated, until the next Standby Phase. You can only use this effect of \"D/D/D Cursed King Siegfried\" once per turn. If this card is destroyed by battle or card effect and sent to the Graveyard: Gain 1000 LP for each \"Dark Contract\" card you control.",
                "2800",
                "2200",
                "8",
                "D/D",
                "Dark",
                "https://ygoprodeck.com/pics/44852429.jpg"));

        lstcard.add(new Card("44852429",
                "D/D/D Cursed King Siegfried",
                "Fiend",
                "1 Tuner + 1 or more non-Tuner \"D/D\" monsters\n" + "During either player's turn: You can target 1 face-up Spell/Trap Card on the field; that target has its effects negated, until the next Standby Phase. You can only use this effect of \"D/D/D Cursed King Siegfried\" once per turn. If this card is destroyed by battle or card effect and sent to the Graveyard: Gain 1000 LP for each \"Dark Contract\" card you control.",
                "2800",
                "2200",
                "8",
                "D/D",
                "Dark",
                "https://ygoprodeck.com/pics/44852429.jpg"));


    }
}
