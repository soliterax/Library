package com.Library.Utils;

@SuppressWarnings("unused")
public abstract class ItemStatue {

    String ItemStatue_Name;
    String[] ItemStatue_Description;
    long ItemStatue_Value;

    public ItemStatue(String ItemStatue_Name, String[] ItemStatue_Description) {
        this.ItemStatue_Name = ItemStatue_Name;
        this.ItemStatue_Description =ItemStatue_Description;
    }

    public Object effect() {
        return "";
    }

    public Object effect(Entity entity) {
        return "";
    }

    public Object effect(ItemStack item) {
        return "";
    }

    public String getItemStatue_Name() {
        return ItemStatue_Name;
    }

    public void setItemStatue_Name(String itemStatue_Name) {
        ItemStatue_Name = itemStatue_Name;
    }

    public String[] getItemStatue_Description() {
        return ItemStatue_Description;
    }

    public void setItemStatue_Description(String[] itemStatue_Description) {
        ItemStatue_Description = itemStatue_Description;
    }

    public long getItemStatue_Value() {
        return ItemStatue_Value;
    }

    public void setItemStatue_Value(long itemStatue_Value) {
        ItemStatue_Value = itemStatue_Value;
    }
}
