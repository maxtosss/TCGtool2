package api;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class GetCard {

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

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() { return type; }

    public String getDech() {
        return dech;
    }

    public String getRace() {
        return race;
    }

    public String getAttribute() {
        return attribute;
    }

    public String getArchetype() {
        return archetype;
    }

    public String getAtk() {
        return atk;
    }

    public String getDef() {
        return def;
    }

    public ArrayList<String> getImage_url() {
        return image_url;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}


