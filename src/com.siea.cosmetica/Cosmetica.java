package com.siea.cosmetica;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

public class Cosmetica  extends JavaPlugin {
    @Override
    public void onEnable() {
        saveDefaultConfig();
        String prefix = new ReplacePlaceholders().replaceColour("prefix");
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
}
