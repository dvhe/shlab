package me.controls.quests;

import me.controls.quests.command.QuestsAdminCommand;
import me.controls.quests.command.QuestsCommand;
import me.controls.quests.listeners.QuestListener;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Core extends JavaPlugin {
    private static Core instance;
    public static Core getInstance() {
        return instance;
    }
    public Core() {
        super();
    }

    public void onEnable() {
        Core.instance = this;
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Quests plugin enabled");
        registerCommands();
        registerListeners();

    }

    public void onDisable() {
        Core.instance = null;
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.RED + "Quests plugin disabled");
    }

    public void registerCommands() {
        getCommand("quests").setExecutor(new QuestsCommand());
        getCommand("config").setExecutor(new QuestsAdminCommand());
    }

    public void registerListeners() {
        Bukkit.getServer().getPluginManager().registerEvents(new QuestListener(), this);
    }

}