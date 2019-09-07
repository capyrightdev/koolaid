package me.capyright.Events;

import me.capyright.Utils.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

public class PingListener implements Listener {
    @EventHandler
    public void onPing(ServerListPingEvent e) {
        e.setMaxPlayers(10);
        e.setMotd(c.c("                       &c" + s.star + " Official Testing Server " + s.star + "                       "));
    }
}
