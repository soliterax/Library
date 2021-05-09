package com.Library.Utils;

public abstract class Skill {

    String Skill_Name;
    String[] Skill_Lore;
    StatuePoint[] NeededPoint;

    public Skill(String name, String[] lore) {
        Skill_Name = name;
        Skill_Lore = lore;
    }

    public void use() {

    }

    public void use(Entity entity) {

    }

    public void effect() {

    }

    public void effect(Entity entity) {

    }

    public String getSkill_Name() {
        return Skill_Name;
    }

    public void setSkill_Name(String skill_Name) {
        Skill_Name = skill_Name;
    }

    public String[] getSkill_Lore() {
        return Skill_Lore;
    }

    public void setSkill_Lore(String[] skill_Lore) {
        Skill_Lore = skill_Lore;
    }

    public StatuePoint[] getNeededPoint() {
        return NeededPoint;
    }

    public void setNeededPoint(StatuePoint[] neededPoint) {
        NeededPoint = neededPoint;
    }
}
