package me.controls.quests;

import me.controls.quests.command.QuestsCommand;
import me.controls.quests.listeners.QuestListener;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public class Core extends JavaPlugin {
    private static Core instance;

    public Core() {
        super();
    }

    public void onEnable() {
        Core.instance = this;
        Bukkit.getLogger().log(Level.SEVERE, ChatColor.GREEN + "Quests plugin enabled");
        registerCommands();
        registerListeners();
    }

    public void onDisable() {
        Core.instance = null;
        Bukkit.getLogger().log(Level.SEVERE, ChatColor.RED + "Quests plugin disabled");
    }

    public void registerCommands() {
        getCommand("quests").setExecutor(new QuestsCommand());
    }

    public void registerListeners() {
        Bukkit.getServer().getPluginManager().registerEvents(new QuestListener(), this);
    }

}