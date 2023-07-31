package com.siea.cosmetica.commands;

import com.siea.cosmetica.inventorys.main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class cosmetica implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)){
            sender.sendMessage("Only Players can use this command");
            return true;
        }
        Player p = (Player) sender;
        if (!p.hasPermission("cosmetica.command")){
            p.sendMessage("Cosmetica is disabled on this Server");
            return true;
        }
        main gui = new main(p);
        p.openInventory(gui.getInventory());
        return true;
    }
}
