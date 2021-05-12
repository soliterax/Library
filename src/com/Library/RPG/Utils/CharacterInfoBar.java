package com.Library.RPG.Utils;

@SuppressWarnings("unused")
public abstract class CharacterInfoBar {

    String InfoBar_Name;
    String[] InfoBar_Description;
    String value;

    public String getInfoBar_Name() {
        return InfoBar_Name;
    }

    public void setInfoBar_Name(String infoBar_Name) {
        InfoBar_Name = infoBar_Name;
    }

    public String[] getInfoBar_Description() {
        return InfoBar_Description;
    }

    public void setInfoBar_Description(String[] infoBar_Description) {
        InfoBar_Description = infoBar_Description;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Long getLongValue() {
        return Long.parseLong(value);
    }

    public Integer getIntValue() {
        return Integer.parseInt(value);
    }

    public Double getDoubleValue() {
        return Double.parseDouble(value);
    }

    public Float getFloatValue() {
        return Float.parseFloat(value);
    }

    public char[] getCharacterArrayValue() {
        return value.toCharArray();
    }

    public Byte getByteValue() {
        return Byte.parseByte(value);
    }

    public Short getShortValue() {
        return Short.parseShort(value);
    }


}
