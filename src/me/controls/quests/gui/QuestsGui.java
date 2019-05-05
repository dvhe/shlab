package me.controls.quests.gui;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Arrays;


public class QuestsGui implements Listener {
    Inventory inv = Bukkit.createInventory(null, 27, "Quests");

    public QuestsGui(Player player) {
        if(player == null) {
            return;
        }
        Inventory inv = Bukkit.createInventory(null, 27, "Quests");
        ItemStack emerald = new ItemStack(Material.EMERALD);
        ItemMeta meta = emerald.getItemMeta();
        emerald.setItemMeta(meta);
        inv.setItem(15, emerald);
        player.openInventory(inv);
    }
}
