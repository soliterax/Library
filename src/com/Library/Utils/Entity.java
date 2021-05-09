package com.Library.Utils;


import java.io.Serializable;
import java.util.LinkedList;

@SuppressWarnings("unused")
public abstract class Entity implements Serializable {
    private static final long serialVersionUID = 1000;

    String name;
    int level;
    StatuePoint[] Points;
    CharacterClass characterClass;
    Rank rank;
    Title[] titles;
    Blessing[] blessings;


    MagicType[] types;
    Skill[] skills;
    Pet[] pet;


    Quest[] Current_Quests;

    Quest[] Quests;

    ItemStack rightHand;
    ItemStack leftHand;

    ItemStack[] accessories;

    ItemStack helmet;
    ItemStack chestplate;
    ItemStack gloves;
    ItemStack pants;
    ItemStack boots;

    LinkedList<ItemStack> toolInventory = new LinkedList<>();

    public Entity() {

    }

    public Entity(String name) {
        this.name = name;
    }

    public Entity(String name, double mana, double health) {
        this.name = name;
    }

    public Entity(String name, double maxHealth) {

        this.name = name;

    }

    public void damage(Entity target) {

    }

    public void defense() {

    }

    public String[] getInfoScreen() {
        String rawTitles = "";
        String rawMagicTypes = "";
        for(Title t : titles) {
            rawTitles += "\n    - " + t.getName();
        }
        for(MagicType a : types) {
            rawMagicTypes += "\n    - " + a.getType();
        }
        String[] recycle = new String[] { "Name: " + name,
                "Level: " + level,
                "Class: " + characterClass.getCharacterClass_Name(),
                "Rank: " + rank.getRankName(),
                "Titles: " + rawTitles,
                "Usable Magic Type: " + rawMagicTypes};

        return  recycle;

    }

    public void effects() {

    }

    public void takeDamage(Entity damager) {

    }

    public void takeDamage(Double damage) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ItemStack getRightHand() {
        return rightHand;
    }

    public void setRightHand(ItemStack rightHand) {
        this.rightHand = rightHand;
    }

    public ItemStack getLeftHand() {
        return leftHand;
    }

    public void setLeftHand(ItemStack leftHand) {
        this.leftHand = leftHand;
    }

    public ItemStack[] getAccesories() {
        return accessories;
    }

    public void setAccesories(ItemStack[] accessories) {
        this.accessories = accessories;
    }

    public ItemStack getHelmet() {
        return helmet;
    }

    public void setHelmet(ItemStack helmet) {
        this.helmet = helmet;
    }

    public ItemStack getChestplate() {
        return chestplate;
    }

    public void setChestplate(ItemStack chestplate) {
        this.chestplate = chestplate;
    }

    public ItemStack getGloves() {
        return gloves;
    }

    public void setGloves(ItemStack gloves) {
        this.gloves = gloves;
    }

    public ItemStack getPants() {
        return pants;
    }

    public void setPants(ItemStack pants) {
        this.pants = pants;
    }

    public ItemStack getBoots() {
        return boots;
    }

    public void setBoots(ItemStack boots) {
        this.boots = boots;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public CharacterClass getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(CharacterClass characterClass) {
        this.characterClass = characterClass;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public Title[] getTitles() {
        return titles;
    }

    public void setTitles(Title[] titles) {
        this.titles = titles;
    }

    public MagicType[] getTypes() {
        return types;
    }

    public void setTypes(MagicType[] types) {
        this.types = types;
    }

    public StatuePoint[] getPoints() {
        return Points;
    }

    public void setPoints(StatuePoint[] points) {
        Points = points;
    }

    public ItemStack[] getAccessories() {
        return accessories;
    }

    public void setAccessories(ItemStack[] accessories) {
        this.accessories = accessories;
    }

    public Skill[] getSkills() {
        return skills;
    }

    public void setSkills(Skill[] skills) {
        this.skills = skills;
    }

    public Pet[] getPet() {
        return pet;
    }

    public void setPet(Pet[] pet) {
        this.pet = pet;
    }

    public Quest[] getCurrent_Quests() {
        return Current_Quests;
    }

    public void setCurrent_Quests(Quest[] current_Quests) {
        Current_Quests = current_Quests;
    }

    public Quest[] getQuests() {
        return Quests;
    }

    public void setQuests(Quest[] quests) {
        Quests = quests;
    }

    public LinkedList<ItemStack> getToolInventory() {
        return toolInventory;
    }

    public void setToolInventory(LinkedList<ItemStack> toolInventory) {
        this.toolInventory = toolInventory;
    }
}
