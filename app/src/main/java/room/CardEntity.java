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
    @SerializedName("name")
    String name;
    @SerializedName("type")
    String type;
    @SerializedName("dech")
    String dech;
    @SerializedName("race")
    String race;
    @SerializedName("attribute")
    String attribute;
    @SerializedName("archetype")
    String archetype;
    @SerializedName("atk")
    String atk;
    @SerializedName("def")
    String def;
    @SerializedName("card_image")
    ArrayList<String> image_url=new ArrayList<>();
    @SerializedName("level")
    String level;

    @NonNull
    public String getId() {
        return id;
    }

    public void setId(@NonNull String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDech() {
        return dech;
    }

    public void setDech(String dech) {
        this.dech = dech;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getArchetype() {
        return archetype;
    }

    public void setArchetype(String archetype) {
        this.archetype = archetype;
    }

    public String getAtk() {
        return atk;
    }

    public void setAtk(String atk) {
        this.atk = atk;
    }

    public String getDef() {
        return def;
    }

    public void setDef(String def) {
        this.def = def;
    }

    public ArrayList<String> getImage_url() {
        return image_url;
    }

    public void setImage_url(ArrayList<String> image_url) {
        this.image_url = image_url;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
