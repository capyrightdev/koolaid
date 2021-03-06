package me.capyright.Events;

import me.capyright.Utils.c;
import me.capyright.Utils.s;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
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
        e.setJoinMessage(c.c("&a" + s.star + " &a"  + p.getName() + " &7 has joined the server."));
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
        Block b = loc.getBlock().getRelative(BlockFace.DOWN);
        if (b.getType() == Material.QUARTZ) {
            p.setVelocity(loc.getDirection().multiply(-0.3));
            p.sendMessage(c.c("&c" + s.star + " You're not allowed to leave this area!"));
        }
    }
    @EventHandler
    public void onDeath(PlayerDeathEvent e) {
        Player p = e.getEntity();
        EntityDamageEvent cause = e.getEntity().getLastDamageCause();
        e.setDeathMessage(c.c("&c" + s.star + "&c " + p.getName() + " &7was killed by &c" + cause.getCause()));
        if(cause.getCause().equals(EntityDamageEvent.DamageCause.ENTITY_ATTACK)) {
            if(e.getEntity().getLastDamageCause().getEntity().equals(EntityType.ZOMBIE)) {
                e.setDeathMessage(c.c("&c" + s.star + "&c " + p.getName() + " &7was killed by a &cZOMBIE."));
            } else if(e.getEntity().getLastDamageCause().getEntity().equals(EntityType.CREEPER)) {
                e.setDeathMessage(c.c("&c" + s.star + "&c " + p.getName() + " &7was killed by an &c explosion"));
            }else if(e.getEntity().getLastDamageCause().getEntity().equals(EntityType.SKELETON)) {
                e.setDeathMessage(c.c("&c" + s.star + "&c " + p.getName() + " &7was shot by a &cskeleton&7"));
            } else if(e.getEntity().getLastDamageCause().getEntity().equals(EntityType.PLAYER)) {

            }
        }
    }
    @EventHandler
    public void onChat(PlayerChatEvent e) {
        Player p = e.getPlayer();
        e.setFormat(c.c(p.getDisplayName() + ": " + e.getMessage()));
    }
}
