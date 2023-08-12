package com.siea.cosmetica;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;

public class Cosmetica  extends JavaPlugin {



    @Override
    public void onEnable() {
        saveDefaultConfig();
        String prefix = new com.siea.durabilityalert.util.ReplacePlaceholders().replaceColour("prefix");
        boolean chatWarning = getConfig().getBoolean("chatWarning");
        boolean titleWarning = getConfig().getBoolean("titleWarning");
        boolean subTitleWarning = getConfig().getBoolean("subTitleWarning");
        int fadeIn = getConfig().getInt("fadeIn");
        int stay = getConfig().getInt("stay");
        int fadeOut = getConfig().getInt("fadeOut");
        getServer().getConsoleSender().sendMessage(prefix +"Config Successfully Loaded");
        getServer().getConsoleSender().sendMessage(ChatColor.GOLD + "Cosmetica is now enabled");
    }

    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "Cosmetica is now disabled");
    }

    static List<String> allowPets = getConfig().getStringList("allowPets");
    static List<String> allowHats = getConfig().getStringList("allowHats");
    static List<String> allowArmor = getConfig().getStringList("allowArmor");
    public static boolean allowPets(Player p){
        String server = p.getServer().getName();
        if (allowPets.contains(server) ){
            return true;
        }
        return false;
    }
    public static boolean allowHats(Player p){
        String server = p.getServer().getName();
        if (allowHats.contains(server) ){
            return true;
        }
        return false;
    }

    public static boolean allowArmor(Player p){
        String server = p.getServer().getName();
        if (allowArmor.contains(server) ){
            return true;
        }
        return false;
    }
}
