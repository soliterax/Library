package com.Library.RPG.Utils;

public abstract class CharacterClass {

    String CharacterClass_Name;
    String[] CharacterClass_Description;

    public CharacterClass(String CharacterClass_Name, String[] CharacterClass_Description) {
        this.CharacterClass_Name = CharacterClass_Name;
        this.CharacterClass_Description = CharacterClass_Description;
    }

    public void effect() {

    }

    public void effect(Entity entity) {

    }

    public void effect(Class<Object> entity) {

    }

    public void attack(Entity entity) {

    }

    public void attack() {

    }

    public void attack(Class<Object> entity) {

    }

    public String getCharacterClass_Name() {
        return CharacterClass_Name;
    }

    public void setCharacterClass_Name(String characterClass_Name) {
        CharacterClass_Name = characterClass_Name;
    }

    public String[] getCharacterClass_Description() {
        return CharacterClass_Description;
    }

    public void setCharacterClass_Description(String[] characterClass_Description) {
        CharacterClass_Description = characterClass_Description;
    }
}
