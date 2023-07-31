package com.siea.cosmetica.listeners;

import com.siea.cosmetica.util.spawnPet;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class onJoin implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        Player p = e.getPlayer();

        //Spawn Pet
            String pet = null; //Get selected pet
            spawnPet spawnPet = new com.siea.cosmetica.util.spawnPet(p, pet, true);

        //setArmor

    }
}
