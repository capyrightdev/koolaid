package me.capyright;

import me.capyright.Commands.*;
import me.capyright.Events.Events;
import me.capyright.Events.PingListener;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
        Bukkit.getPluginManager().registerEvents(new Events(), this);
        Bukkit.getPluginManager().registerEvents(new PingListener(), this);
        getCommand("gamemode").setExecutor(new Gamemode());
        getCommand("verify").setExecutor(new Verify());
        getCommand("koolaid").setExecutor(new koolaid());
        getCommand("weather").setExecutor(new Weather());
        getCommand("clear").setExecutor(new Clear());
        getCommand("suicide").setExecutor(new Kill());
        getCommand("heal").setExecutor(new Heal());
        getCommand("feed").setExecutor(new Feed());
        getCommand("cc").setExecutor(new CC());
    }
}
