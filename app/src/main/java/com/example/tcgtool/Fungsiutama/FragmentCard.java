package com.example.tcgtool.Fungsiutama;

import android.app.ProgressDialog;
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

public class FragmentCard extends Fragment {

    View v;
    private RecyclerView myrecylerview;

    RecyclerViewAdapter recyclerViewAdapter;
    private ProgressDialog progressDoalog;


    public FragmentCard() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.card_fragment, container, false);
        myrecylerview = (RecyclerView) v.findViewById(R.id.contact_recyclerview);

        myrecylerview.setLayoutManager(new GridLayoutManager(getActivity(), 2));

        return v;
    }

    private void initDB() {
        Common.database = Database.getInstance(getContext());
        Common.cardRepository = CardRepository.getInstance(CardDataSource.getInstance(Common.database.cardDAO()));
    }


    private void refresh() {
        progressDoalog.show();
        ApiInterface mapiInterface;
        mapiInterface = ApiClient.getClient().create(ApiInterface.class);

        Call<List<GetCard>> cardCall = mapiInterface.getCard();
        cardCall.enqueue(new Callback<List<GetCard>>() {
            @Override
            public void onResponse(Call<List<GetCard>> call, Response<List<GetCard>> response) {

                List<GetCard> getCards = response.body();

                for (GetCard getCard : getCards) {
                    CardEntity card = new CardEntity();
                    card.setId(getCard.getId());
                    card.setDbfid(getCard.getDbfid());
                    card.setName(getCard.getName());
                    card.setText(getCard.getText());
                    card.setFlavor(getCard.getFlavor());
                    card.setArtist(getCard.getArtist());
                    card.setAttack(getCard.getAttack());
                    card.setCardClass(getCard.getCardClass());
                    card.setCollectible(getCard.getCollectible());
                    card.setCost(getCard.getCost());
                    card.setElite(getCard.getElite());
                    card.setFaction(getCard.getFaction());
                    card.setMechanics(getCard.getMechanics());
                    card.setRarity(getCard.getRarity());
                    card.setSet(getCard.getSet());
                    card.setType(getCard.getType());

                    Common.cardRepository.insert(card);
                }

                List<CardEntity> cardEntities = Common.cardRepository.getAllcard();
                recyclerViewAdapter = new RecyclerViewAdapter(getContext(), cardEntities);
                myrecylerview.setAdapter(recyclerViewAdapter);
                Toast.makeText(getContext(), "data up", Toast.LENGTH_SHORT).show();
                recyclerViewAdapter.notifyDataSetChanged();
                progressDoalog.dismiss();
            }

            @Override
            public void onFailure(Call<List<GetCard>> call, Throwable t) {
                Toast.makeText(getContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        progressDoalog = new ProgressDialog(getContext());
        progressDoalog.setMessage("loading...");
        progressDoalog.setCancelable(false);


        refresh();
        initDB();

    }
}
