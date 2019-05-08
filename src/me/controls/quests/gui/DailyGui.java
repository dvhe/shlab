package me.controls.quests.gui;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


public class DailyGui {
    Inventory inv = Bukkit.createInventory(null, 9,"Daily");

    public DailyGui(Player player) {
        if(player == null) {
            return;
        }
        ItemStack book = new ItemStack(Material.REDSTONE_BLOCK);
        ItemMeta meta = book.getItemMeta();
        meta.setDisplayName("§5Your quest");
        book.setItemMeta(meta);
        inv.setItem(3, book);
        player.openInventory(inv);
    }
}
