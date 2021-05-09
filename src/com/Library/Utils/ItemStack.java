package com.Library.Utils;

import com.Library.Systems.Rarity;

import java.io.Serializable;
import java.util.LinkedList;
@SuppressWarnings("unused")
public abstract class ItemStack extends Material implements Serializable {
    private static final long serialVersionUID = 1000;

    String name = "??";
    String[] lore = new String[] {"?????????"};
    int level = 1;
    long exp = 0;
    ItemStatue[] status;
    Rarity rarity = Rarity.Trash;
    int upgrade = 0;
    int[] upgrades = new int[] {};
    LinkedList<Long> expMax = new LinkedList<Long>();
    LinkedList<Enchant> enchants = new LinkedList<Enchant>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public MaterialType getType() {
        return super.getType();
    }

    @Override
    public void setType(MaterialType type) {
        super.setType(type);
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

    public long getExp() {
        return exp;
    }

    public void setExp(long exp) {
        this.exp = exp;
    }

    public ItemStatue[] getStatus() {
        return status;
    }

    public void setStatus(ItemStatue[] status) {
        this.status = status;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public void setRarity(Rarity rarity) {
        this.rarity = rarity;
    }

    public int getUpgrade() {
        return upgrade;
    }

    public void setUpgrade(int upgrade) {
        this.upgrade = upgrade;
    }

    public int[] getUpgrades() {
        return upgrades;
    }

    public void setUpgrades(int[] upgrades) {
        this.upgrades = upgrades;
    }

    public LinkedList<Long> getExpMax() {
        return expMax;
    }

    public void setExpMax(LinkedList<Long> expMax) {
        this.expMax = expMax;
    }

    public void addExpMax(Long exp) {
        expMax.add(exp);
    }

    public LinkedList<Enchant> getEnchants() {
        return enchants;
    }

    public void setEnchants(LinkedList<Enchant> enchants) {
        this.enchants = enchants;
    }

    public void addEnchant(Enchant ench) {
        enchants.add(ench);
    }

    public void use() {


    }

    public void use(Entity entity) {


    }

    public void effect() {

    }

    public void effect(Entity entity) {

    }

    public void system() {

    }

}
