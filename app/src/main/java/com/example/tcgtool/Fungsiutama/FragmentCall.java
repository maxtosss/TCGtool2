package com.example.tcgtool.Fungsiutama;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.tcgtool.R;

import java.util.ArrayList;
import java.util.List;

import api.ApiClient;
import api.ApiInterface;
import api.GetCard;
import datasource.CardDataSource;
import datasource.CardRepository;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import room.CardEntity;
import room.Database;

public class FragmentCall extends Fragment {

    View v;
    private RecyclerView myrecylerview;
    ApiInterface mapiInterface;
    RecyclerViewAdapter recyclerViewAdapter;


    public FragmentCall() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.call_fragment, container, false);

        myrecylerview = (RecyclerView) v.findViewById(R.id.contact_recyclerview);

        myrecylerview.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        mapiInterface = ApiClient.getClient().create(ApiInterface.class);
        refresh();
        initDB();
        return v;
    }

    private void initDB() {
        Common.database = Database.getInstance(getContext());
        Common.cardRepository = CardRepository.getInstance(CardDataSource.getInstance(Common.database.cardDAO()));
    }


    private void refresh() {
        Call<GetCard> cardCall = mapiInterface.getCard();
        cardCall.enqueue(new Callback<GetCard>() {
            @Override
            public void onResponse(Call<GetCard> call, Response<GetCard> response) {

                List<GetCard> getCards = (List<GetCard>) response.body();

                for (GetCard getCard : getCards) {
                    CardEntity card = new CardEntity();
                    card.setId(getCard.getId());
                    card.setArchetype(getCard.getArchetype());
                    card.setAtk(getCard.getAtk());
                    card.setAttribute(getCard.getAttribute());
                    card.setDef(getCard.getDef());
                    card.setDech(getCard.getDech());
                    card.setLevel(getCard.getLevel());
                    card.setName(getCard.getName());
                    card.setRace(getCard.getRace());
                    card.setImage_url(getCard.getImage_url());

                    Common.cardRepository.insert(card);
                }

                List<CardEntity> cardEntities = Common.cardRepository.getAllcard();
                recyclerViewAdapter = new RecyclerViewAdapter(getContext(), cardEntities);
                myrecylerview.setAdapter(recyclerViewAdapter);
                Toast.makeText(getContext(), "data up", Toast.LENGTH_SHORT).show();
                recyclerViewAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<GetCard> call, Throwable t) {
                Toast.makeText(getContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
            }


        });
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        lstcard = new ArrayList<>();
//
//        //add card
//        lstcard.add(new Card("44852429",
//                "D/D/D Cursed King Siegfried",
//                "Fiend",
//                "1 Tuner + 1 or more non-Tuner \"D/D\" monsters\n" + "During either player's turn: You can target 1 face-up Spell/Trap Card on the field; that target has its effects negated, until the next Standby Phase. You can only use this effect of \"D/D/D Cursed King Siegfried\" once per turn. If this card is destroyed by battle or card effect and sent to the Graveyard: Gain 1000 LP for each \"Dark Contract\" card you control.",
//                "2800",
//                "2200",
//                "8",
//                "D/D",
//                "Dark",
//                "https://ygoprodeck.com/pics/6622715.jpg"));
//
//        lstcard.add(new Card("44852429",
//                "D/D/D Cursed King Siegfried",
//                "Fiend",
//                "1 Tuner + 1 or more non-Tuner \"D/D\" monsters\n" + "During either player's turn: You can target 1 face-up Spell/Trap Card on the field; that target has its effects negated, until the next Standby Phase. You can only use this effect of \"D/D/D Cursed King Siegfried\" once per turn. If this card is destroyed by battle or card effect and sent to the Graveyard: Gain 1000 LP for each \"Dark Contract\" card you control.",
//                "2800",
//                "2200",
//                "8",
//                "D/D",
//                "Dark",
//                "https://ygoprodeck.com/pics/44852429.jpg"));
//
//        lstcard.add(new Card("44852429",
//                "D/D/D Cursed King Siegfried",
//                "Fiend",
//                "1 Tuner + 1 or more non-Tuner \"D/D\" monsters\n" + "During either player's turn: You can target 1 face-up Spell/Trap Card on the field; that target has its effects negated, until the next Standby Phase. You can only use this effect of \"D/D/D Cursed King Siegfried\" once per turn. If this card is destroyed by battle or card effect and sent to the Graveyard: Gain 1000 LP for each \"Dark Contract\" card you control.",
//                "2800",
//                "2200",
//                "8",
//                "D/D",
//                "Dark",
//                "https://ygoprodeck.com/pics/44852429.jpg"));
//
//        lstcard.add(new Card("44852429",
//                "D/D/D Cursed King Siegfried",
//                "Fiend",
//                "1 Tuner + 1 or more non-Tuner \"D/D\" monsters\n" + "During either player's turn: You can target 1 face-up Spell/Trap Card on the field; that target has its effects negated, until the next Standby Phase. You can only use this effect of \"D/D/D Cursed King Siegfried\" once per turn. If this card is destroyed by battle or card effect and sent to the Graveyard: Gain 1000 LP for each \"Dark Contract\" card you control.",
//                "2800",
//                "2200",
//                "8",
//                "D/D",
//                "Dark",
//                "https://ygoprodeck.com/pics/44852429.jpg"));
//

    }
}
