package com.siea.durabilityalert.util;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.Damageable;

public class ReplacePlaceholders {
    private String itemName;

    public String replacePlaceholders(Player player,String message) {

        message = message.replace("%player%", "" + player.getDisplayName());

        // Adding color to the message
        message = ChatColor.translateAlternateColorCodes('&', message);
        return message;
    }
    public String replaceColour(String message) {
        message = ChatColor.translateAlternateColorCodes('&', message);
        return message;
    }

}
