package com.Library.RPG.Utils;

public abstract class StatuePoint {

    String Name;
    String[] Lore;
    long Value;
    long Point;
    long[] Max_Values;

    public StatuePoint(String name, String[] lore) {
        this.Name = name;
        this.Lore = lore;
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

    public long getValue() {
        return Value;
    }

    public void setValue(long value) {
        Value = value;
    }

    public long getPoint() {
        return Point;
    }

    public void setPoint(long point) {
        Point = point;
    }

    public long[] getMax_Values() {
        return Max_Values;
    }

    public void setMax_Values(long[] max_Values) {
        Max_Values = max_Values;
    }
}
