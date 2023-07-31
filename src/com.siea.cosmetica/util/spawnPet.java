package com.siea.cosmetica.util;

import org.bukkit.entity.Player;

public class spawnPet {
    public spawnPet(Player p, String pet, boolean join){
            if (allowPet(p)){
                //Spawn Pet
            }
            else if (!join){
                p.sendMessage("You cant spawn your pet here");
            }
            else{
                if (pet != null) p.sendMessage("Pets are not allowed on this Server, so your pet was disabled.");
            }
    }

    public boolean allowPet(Player p){
        String server = p.getServer().getName();
        if (server.equalsIgnoreCase("build") || server.equalsIgnoreCase("lobby")) return true;
        return false;
    }
}
