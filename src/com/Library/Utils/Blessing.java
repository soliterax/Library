package com.Library.Utils;

public abstract class Blessing {

    String Blessing_Name;
    String[] Blessing_Description;

    public Blessing(String Blessing_Name, String[] Blessing_Description) {
        this.Blessing_Name = Blessing_Name;
        this.Blessing_Description = Blessing_Description;
    }

    public void effect() {

    }

    public void effect(Entity entity) {

    }

    public void damage(Entity entity) {

    }
    public void damage() {

    }

    public String getBlessing_Name() {
        return Blessing_Name;
    }

    public void setBlessing_Name(String blessing_Name) {
        Blessing_Name = blessing_Name;
    }

    public String[] getBlessing_Description() {
        return Blessing_Description;
    }

    public void setBlessing_Description(String[] blessing_Description) {
        Blessing_Description = blessing_Description;
    }
}
