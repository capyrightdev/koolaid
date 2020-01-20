package me.capyright.Commands;

import me.capyright.Utils.c;
import me.capyright.Utils.s;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
public class TPHere implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player)sender;
        if(args.length == 1) {
            Player r = Bukkit.getPlayerExact(args[0]);
            Player p2 = (Player)sender;
            if(r != null && p.isOp()) {
                r.teleport(p2);
                r.sendMessage(c.c("&c" + s.star + "&7 You have been teleported to &c" + p.getName() + "&7."));
                p.sendMessage(c.c("&c" + s.star + "&7 You have teleported &c" + r.getName() + "&7 to your location."));
            }
        }
        return false;
    }
}
