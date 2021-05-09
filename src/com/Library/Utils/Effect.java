package com.Library.Utils;

@SuppressWarnings("unused")
public abstract class Effect {

    String name;
    String[] lore;
    int level;

    public void system() {

    }

    public void system(Entity entity) {

    }

    public String getInfoScreen() {
        return name + " - " + level + " lvl.";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getLore() {
        return lore;
    }

    public void setLore(String[] lore) {
        this.lore = lore;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
