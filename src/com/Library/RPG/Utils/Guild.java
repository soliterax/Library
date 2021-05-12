package com.Library.RPG.Utils;

import javafx.scene.control.TreeView;

@SuppressWarnings("unused")
public class Guild {
    public abstract class User {
        String Guild_ID;
        Rank Guild_Rank;

        public String getGuild_ID() {
            return Guild_ID;
        }

        public void setGuild_ID(String guild_ID) {
            Guild_ID = guild_ID;
        }

        public Rank getGuild_Rank() {
            return Guild_Rank;
        }

        public void setGuild_Rank(Rank guild_Rank) {
            Guild_Rank = guild_Rank;
        }
    }

    public static class Main {
        String Guild_Name;
        String Guild_ID;
        String Guild_Description;
        Long Guild_Cup;
        TreeView<Entity> Guild_User;

        public String getGuild_Name() {
            return Guild_Name;
        }

        public void setGuild_Name(String guild_Name) {
            Guild_Name = guild_Name;
        }

        public String getGuild_ID() {
            return Guild_ID;
        }

        public void setGuild_ID(String guild_ID) {
            Guild_ID = guild_ID;
        }

        public String getGuild_Description() {
            return Guild_Description;
        }

        public void setGuild_Description(String guild_Description) {
            Guild_Description = guild_Description;
        }

        public Long getGuild_Cup() {
            return Guild_Cup;
        }

        public void setGuild_Cup(Long guild_Cup) {
            Guild_Cup = guild_Cup;
        }

        public TreeView<Entity> getGuild_User() {
            return Guild_User;
        }

        public void setGuild_User(TreeView<Entity> guild_User) {
            Guild_User = guild_User;
        }
    }

}
