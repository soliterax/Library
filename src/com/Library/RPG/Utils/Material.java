package com.Library.RPG.Utils;

@SuppressWarnings("unused")
public abstract class Material {

    String id;
    MaterialType type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public MaterialType getType() {
        return type;
    }

    public void setType(MaterialType type) {
        this.type = type;
    }

    public enum MaterialType {
        Material, Food, Architecture, Engineer, Gear, Weapon, Armor
    }

}
