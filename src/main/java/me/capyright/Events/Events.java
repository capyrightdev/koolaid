package me.capyright.Events;

import me.capyright.Utils.c;
import me.capyright.Utils.s;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.*;

public class Events implements Listener {
    @EventHandler
    public void onInteract(PlayerInteractEvent e) {
        Player p =e.getPlayer();
        if(!p.isOp()) {
            e.setCancelled(true);
            p.sendMessage(c.c("&c" + s.triangle + "&c koolaid has denied your action!"));
        }
    }
    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        e.setJoinMessage(c.c("&c" + s.star + " &c"  + p.getName() + " &7 has joined the server."));
    }
    @EventHandler
    public void onQuit(PlayerQuitEvent e) {
        Player p = e.getPlayer();
        e.setQuitMessage(c.c("&c" + s.star + "&c " + p.getName() + "&7 has quit the server."));
    }
    @EventHandler
    public void onMove(PlayerMoveEvent e) {
        Player p = e.getPlayer();
        Location loc = e.getPlayer().getLocation();
        Block b  = loc.getBlock();
        if(b.getType() == Material.WOOL && b.getData() == 35) {
            e.setCancelled(true);
            p.sendMessage(c.c("&cDenied"));
        }
    }
    @EventHandler
    public void onChat(PlayerChatEvent e) {
        Player p = e.getPlayer();
        e.setFormat(c.c(p.getDisplayName() + ": " + e.getMessage()));
    }
}
