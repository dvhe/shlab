package me.controls.quests.command;

import me.controls.quests.gui.Gui;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class QuestsAdminCommand implements CommandExecutor, Listener {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (!(sender instanceof Player)) {
            return false;
        }
        if (cmd.getName().equalsIgnoreCase("config")) {
            Player player = (Player) sender;
            if(player.hasPermission("quests.admin") && player.isOp()) {
                if (args.length == 0) {
                    Gui.AdminGui(player);
                }
            } else {
                player.sendMessage("$4Permission denied");
            }
        }
        return true;
    }
}
