package me.capyright.Commands;

import me.capyright.Utils.c;
import me.capyright.Utils.s;
import org.bukkit.Achievement;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TP implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player)sender;
        if(args.length == 1) {
            Player r = Bukkit.getPlayerExact(args[0]);
            if(r !=null && p.isOp()) {
                p.teleport(r);
                p.sendMessage(c.c("&c" + s.star + "&7 You've been teleported to &c" + r.getName() + "&7."));
            }
        }
        return false;
    }
}
