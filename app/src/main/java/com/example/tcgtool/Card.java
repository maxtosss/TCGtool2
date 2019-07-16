package com.example.tcgtool;

public class Card {

        private String id;
        private String name;
        private String type;
        private String desc;
        private String atk;
        private String def;
        private String level;
        private String arcetype;
        private String attribute;
        private String tumbnail;

        public Card(){

        }

        public Card(String id, String name, String type, String desc, String atk, String def, String level, String race, String attribute, String tumbnail) {
            this.id = id;
            this.name = name;
            this.type = type;
            this.desc = desc;
            this.atk = atk;
            this.def = def;
            this.level = level;
            this.arcetype = arcetype;
            this.attribute = attribute;
            this.tumbnail = tumbnail;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
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

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
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

        public String getLevel() {
            return level;
        }

        public void setLevel(String level) {
            this.level = level;
        }

        public String getRace() {
            return arcetype;
        }

        public void setRace(String race) {
            this.arcetype = race;
        }

        public String getAttribute() {
            return attribute;
        }

        public void setAttribute(String attribute) {
            this.attribute = attribute;
        }

        public String getArcetype() {
            return arcetype;
        }

        public void setArcetype(String arcetype) {
            this.arcetype = arcetype;
        }

        public String getTumbnail() {
        return tumbnail;
    }

        public void setTumbnail(String tumbnail) {
        this.tumbnail = tumbnail;
    }
}
