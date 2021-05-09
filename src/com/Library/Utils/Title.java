package com.Library.Utils;

@SuppressWarnings("unused")
public abstract class Title {

    String name;
    String[] lore;
    com.Library.Utils.Effect[] effects;

    public String getInfoScreen() {
        String raw = "";
        String effectRaw = "";
        for(String s : lore) {
            raw += s + "\n";
        }
        for(Effect s : effects) {
            effectRaw += s.getInfoScreen() + "\n";
        }
        return name + "\n" + raw + effectRaw;
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

    public Effect[] getEffects() {
        return effects;
    }

    public void setEffects(Effect[] effects) {
        this.effects = effects;
    }
}
