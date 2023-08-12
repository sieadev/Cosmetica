package com.siea.cosmetica.util;

import com.siea.cosmetica.Cosmetica;
import org.bukkit.entity.Player;

public class spawnPet {
    public void spawnPet(Player p, String pet){
            if (Cosmetica.allowPets(p)){
                //Spawn Pet
            }
            else{
                p.sendMessage("You cant spawn your pet here");
            }
    }

    public static void spawnPetonJoin(Player p, String pet){
        if (Cosmetica.allowPets(p)){
            //Spawn Pet
        }
        else{
            if (pet != null) p.sendMessage("Pets are not allowed on this Server, so your pet was disabled.");
        }
    }

}
