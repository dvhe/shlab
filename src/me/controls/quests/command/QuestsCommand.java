package me.controls.quests.command;

import me.controls.quests.gui.Gui;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class QuestsCommand implements CommandExecutor, Listener {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (!(sender instanceof Player)) {
            return false;
        }
        if (cmd.getName().equalsIgnoreCase("quests")) {
            Player player = (Player) sender;
            if (args.length == 0) {
                Gui.QuestsGui(player);
            }
        }
        return true;
    }
}
