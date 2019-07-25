package room;

import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

@android.arch.persistence.room.Entity
public class CardEntity implements Serializable {
    @PrimaryKey
    @NonNull
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

    public void setId(String id) {
        this.id = id;
    }

    public String getDbfid() {
        return dbfid;
    }

    public void setDbfid(String dbfid) {
        this.dbfid = dbfid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

    public String getCardClass() {
        return cardClass;
    }

    public void setCardClass(String cardClass) {
        this.cardClass = cardClass;
    }

    public String getCollectible() {
        return collectible;
    }

    public void setCollectible(String collectible) {
        this.collectible = collectible;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getElite() {
        return elite;
    }

    public void setElite(String elite) {
        this.elite = elite;
    }

    public String getFaction() {
        return faction;
    }

    public void setFaction(String faction) {
        this.faction = faction;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public ArrayList<String> getMechanics() {
        return mechanics;
    }

    public void setMechanics(ArrayList<String> mechanics) {
        this.mechanics = mechanics;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public String getSet() {
        return set;
    }

    public void setSet(String set) {
        this.set = set;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
