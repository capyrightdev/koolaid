package me.capyright.Commands;

import me.capyright.Utils.*;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Heal implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;
        if(p.isOp() ) {
            if(args.length == 1) {
                Player r = Bukkit.getPlayerExact(args[0]);
                if(r != null && !r.isOp()) {
                    r.setHealth(20);
                    r.setFoodLevel(20);
                    p.sendMessage(c.c("&c" + s.star  + "&7 You have healed &c" + r.getName() + "&7."));
                    r.sendMessage(c.c("&c" + s.star + "&7 You have been healed by&c " + p.getName() + "&7."));
                } else {
                    p.sendMessage(c.c("&cEither the player is you're trying to feed is not valid, or they're opped"));
                }
            } else {
                p.setHealth(20);
                p.setFoodLevel(20);
                p.sendMessage(c.c("&c" + s.star + "&7 You have been healed."));
            }
        } else {
            p.sendMessage(c.c(s.error_np));
        }
        return false;
    }
}
