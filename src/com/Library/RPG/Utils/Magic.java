package com.Library.RPG.Utils;

@SuppressWarnings("unused")
public abstract class Magic extends MagicType{

    String Name;
    String[] Lore;
    int level;
    long Mana_Cost;
    Float[] damage;

    public Magic(String name) {
        this.Name = name;
    }

    public void use(){
        effect();
    }

    public void use(Entity entity) {
        effect(entity);
    }

    public void effect(){

    }

    public void effect(Entity entity) {

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String[] getLore() {
        return Lore;
    }

    public void setLore(String[] lore) {
        Lore = lore;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Float[] getDamage() {
        return damage;
    }

    public void setDamage(Float[] damage) {
        this.damage = damage;
    }

    public long getMana_Cost() {
        return Mana_Cost;
    }

    public void setMana_Cost(long mana_Cost) {
        Mana_Cost = mana_Cost;
    }
}
