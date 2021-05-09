package com.Library.Utils;

@SuppressWarnings("unused")
public abstract class Aura {

    String name;
    int level;

    public void use() {

    }

    public void use(Entity entity) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
