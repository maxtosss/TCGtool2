package api;


import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class GetCard {
    @SerializedName("id")
    String id;
    @SerializedName("dbfid")
    String dbfid;
    @SerializedName("name")
    String name;
    @SerializedName("text")
    String text;
    @SerializedName("flavor")
    String flavor;
    @SerializedName("artist")
    String artist;
    @SerializedName("attack")
    String attack;
    @SerializedName("cardClass")
    String cardClass;
    @SerializedName("collectible")
    String collectible;
    @SerializedName("cost")
    String cost;
    @SerializedName("elite")
    String elite;
    @SerializedName("faction")
    String faction;
    @SerializedName("health")
    String health;
    @SerializedName("mechanics")
    ArrayList<String> mechanics = new ArrayList<>();
    @SerializedName("rarity")
    String rarity;
    @SerializedName("set")
    String set;
    @SerializedName("type")
    String type;

    public String getId() {
        return id;
    }

    public String getDbfid() {
        return dbfid;
    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }

    public String getFlavor() {
        return flavor;
    }

    public String getArtist() {
        return artist;
    }

    public String getAttack() {
        return attack;
    }

    public String getCardClass() {
        return cardClass;
    }

    public String getCollectible() {
        return collectible;
    }

    public String getCost() {
        return cost;
    }

    public String getElite() {
        return elite;
    }

    public String getFaction() {
        return faction;
    }

    public String getHealth() {
        return health;
    }

    public ArrayList<String> getMechanics() {
        return mechanics;
    }

    public String getRarity() {
        return rarity;
    }

    public String getSet() {
        return set;
    }

    public String getType() {
        return type;
    }
}


