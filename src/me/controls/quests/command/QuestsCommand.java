package me.controls.quests.command;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import me.controls.quests.gui.QuestsGui;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;

public class QuestsCommand implements CommandExecutor, Listener {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (!(sender instanceof Player)) {
            return false;
        }
        if (cmd.getName().equalsIgnoreCase("quests")) {
            Player player = (Player) sender;
            if (args.length == 0) {
                new QuestsGui(player);
            }
        }
        return true;
    }
}
