package me.controls.quests.gui;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import java.util.Collections;


public class QuestsGui {
    Inventory inv = Bukkit.createInventory(null, 9, "Quests");

    public QuestsGui(Player player) {
        if(player == null) {
            return;
        }

        ItemStack book = new ItemStack(Material.BOOK_AND_QUILL);
        ItemMeta meta = book.getItemMeta();
        meta.setDisplayName("§cQuests");
        meta.setLore(Collections.singletonList("§7§oClick to view quests"));
        book.setItemMeta(meta);

        ItemStack diamond = new ItemStack(Material.DIAMOND);
        ItemMeta meta2 = diamond.getItemMeta();
        meta2.setDisplayName("§5Quest Shop");
        meta2.setLore(Collections.singletonList("§7§oClick to view quests"));
        diamond.setItemMeta(meta2);

        inv.setItem(5, diamond);
        inv.setItem(3, book);

        player.openInventory(inv);
    }
}
