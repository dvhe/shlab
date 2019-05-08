package me.controls.quests.gui;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


public class AdminGui {
    Inventory inv = Bukkit.createInventory(null, 27,"Config");

    public AdminGui(Player player) {
        if(player == null) {
            return;
        }

        ItemStack config = new ItemStack(Material.TRIPWIRE_HOOK);
        ItemMeta meta = config.getItemMeta();
        meta.setDisplayName("§cConfig");
        config.setItemMeta(meta);
        inv.setItem(0, config);

        ItemStack other = new ItemStack(Material.REDSTONE_TORCH_ON);
        ItemMeta meta2 = other.getItemMeta();
        meta2.setDisplayName("§cPermissions");
        other.setItemMeta(meta2);

        ItemStack close = new ItemStack(Material.BARRIER);
        ItemMeta meta3 = close.getItemMeta();
        meta3.setDisplayName("§3Exit");
        close.setItemMeta(meta3);
        
        inv.setItem(0, config);
        inv.setItem(8, other);
        inv.setItem(22, close);


        player.openInventory(inv);
    }
}
