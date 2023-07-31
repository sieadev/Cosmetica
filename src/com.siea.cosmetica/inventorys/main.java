package com.siea.cosmetica.inventorys;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Collections;
import java.util.List;

public class main implements InventoryHolder {

    private Inventory inv;

    public main(Player p) {
        inv = Bukkit.createInventory(this, 44, "Cosmetics");
        init(p);
    }

    private void init(Player p) {
        for (int i = 0; i < inv.getSize(); i++){
            ItemStack glass = createItem(ChatColor.WHITE + "", Material.STAINED_GLASS_PANE , null);
            inv.setItem(i, glass);
        }
        //Pets
        ItemStack pets = createItem(ChatColor.GOLD + "Pets", Material.BONE, Collections.singletonList("§7View and spawn Pets"));
        inv.setItem(11, pets);
        //Util
        ItemStack util = createItem(ChatColor.DARK_BLUE + "Util", Material.ANVIL, Collections.singletonList("§7Amazing and fun Gadgets"));
        inv.setItem(16, util);
        //Effects
        ItemStack effects = createItem(ChatColor.AQUA + "Effects", Material.POTION, Collections.singletonList("§7Cloaks, Particles, Effects and more"));
        inv.setItem(21, effects);
        //Sound Effects
        ItemStack soundeffects = createItem(ChatColor.YELLOW + "Sound Effects", Material.BONE, Collections.singletonList("§7Sound Effects for all situations"));
        inv.setItem(23, soundeffects);
        //Kits
        ItemStack kits = createItem(ChatColor.BLACK + "Kits", Material.POTION, Collections.singletonList("§7Create Kits to switch between styles"));
        inv.setItem(38, kits);
        //Helmet
        ItemStack helmet = createItem(ChatColor.GREEN + "Helmet", Material.BONE, Collections.singletonList("§7Hat's, Helmets and more"));
        inv.setItem(39, helmet);
        //Chestplate
        ItemStack chestplate = createItem(ChatColor.GREEN + "Chestplate", Material.BONE, Collections.singletonList("§7What about a Tuxedo?"));
        inv.setItem(40, chestplate);
        //Leggins
        ItemStack leggins = createItem(ChatColor.GREEN + "Leggins", Material.BONE, Collections.singletonList("§7Wear some nice pants"));
        inv.setItem(41, leggins);
        //Boots
        ItemStack boots = createItem(ChatColor.GREEN + "Boots", Material.BONE, Collections.singletonList("§7Get them new yeezys"));
        inv.setItem(42, boots);
    }

    private ItemStack createItem(String name, Material mat, List<String> lore){
        ItemStack item = new ItemStack(mat, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    @Override
    public Inventory getInventory() {
        return inv;
    }
}
