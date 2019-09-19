package me.capyright.Commands;

import me.capyright.Utils.c;
import me.capyright.Utils.s;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Clear implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;
        if(p.isOp()) {
            p.getInventory().clear();
            p.sendMessage(c.c("&c" + s.star + "&7 Your inventory has been &ccleared&7."));
        } else {
            p.sendMessage(c.c(s.error_np));
        }
        if(args.length == 1) {
            if(p.isOp()) {
                Player r = Bukkit.getPlayerExact(args[0]);
                if(r != null && !r.isOp()) {
                    r.getInventory().clear();
                    r.sendMessage(c.c("&c" + s.star + "&7 Your inventory has been &ccleared&7."));
                    p.sendMessage(c.c("&c" + s.star + "&7 You have successfully cleared&c " + r.getName() + " &7's inventory"));
                } else {
                    p.sendMessage(c.c(s.error_ip));
                }
            } else {
                p.sendMessage(c.c(s.error_np));
            }
        }
        return false;
    }
}
