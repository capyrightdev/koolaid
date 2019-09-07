package me.capyright;

import me.capyright.Commands.Gamemode;
import me.capyright.Commands.Verify;
import me.capyright.Commands.koolaid;
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
    }
}
