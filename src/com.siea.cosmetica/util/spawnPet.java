package com.siea.cosmetica.util;

import org.bukkit.entity.Player;

public class spawnPet {
    public spawnPet(Player p, String pet){
            if (allowPet(p)){
                //Spawn Pet
            }
            else{
                p.sendMessage("You cant spawn your pet here");
            }
    }

    public spawnPetonJoin(Player p, String pet){
        if (allowPet(p)){
            //Spawn Pet
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
