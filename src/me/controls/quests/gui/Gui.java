package me.controls.quests.gui;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Collections;

public class Gui {

    public static Inventory AdminGui(Player player) {
        if(player == null) {
            return null;
        }
        Inventory inv = Bukkit.createInventory(null, 27,"Config");

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
        return inv;
    }

    public static Inventory DailyGui(Player player) {
        if(player == null) {
            return null;
        }
        Inventory inv = Bukkit.createInventory(null, 9,"Daily");
        ItemStack book = new ItemStack(Material.REDSTONE_BLOCK);
        ItemMeta meta = book.getItemMeta();
        meta.setDisplayName("§5Your quest");
        book.setItemMeta(meta);
        inv.setItem(3, book);
        player.openInventory(inv);
        return inv;
    }

    public static Inventory QuestsGui(Player player) {
        if(player == null) {
            return null;
        }
        Inventory inv = Bukkit.createInventory(null, 9,"Quests");
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
        return inv;
    }
}
