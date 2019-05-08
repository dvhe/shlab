package me.controls.quests.listeners;

import me.controls.quests.gui.Gui;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;

public class QuestListener implements Listener {

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        if(event.getInventory().getTitle().equalsIgnoreCase("Config") || event.getInventory().getTitle().equalsIgnoreCase("Daily") || event.getInventory().getTitle().equalsIgnoreCase("Quests")) {
            Player player = (Player) event.getWhoClicked();
            event.setCancelled(true);
            player.updateInventory();
        }
        if(event.getCurrentItem().getType().equals(Material.BARRIER)) {
            Player player = (Player) event.getWhoClicked();
            player.closeInventory();
        }
        Player player = (Player) event.getWhoClicked();
        switch(event.getCurrentItem().getType()) {
            case BOOK_AND_QUILL:
                Gui.DailyGui(player);
                player.updateInventory();
                break;
        }
    }

    @EventHandler
    public void onInventoryDrag(InventoryDragEvent event) {
        if(event.getInventory().getTitle().equalsIgnoreCase("Config") || event.getInventory().getTitle().equalsIgnoreCase("Daily") || event.getInventory().getTitle().equalsIgnoreCase("Quests")) {
            Player player = (Player) event.getWhoClicked();
            event.setCancelled(true);
            player.updateInventory();
        }
    }
}
