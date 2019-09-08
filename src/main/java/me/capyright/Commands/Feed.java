package me.capyright.Commands;

import me.capyright.Utils.c;
import me.capyright.Utils.s;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Feed implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player)sender;
        if(p.isOp() && p.getName().equalsIgnoreCase("IAmCopyrighted")) {
            if(args.length == 1) {
                Player r = Bukkit.getPlayerExact(args[0]);
                if(r != null && !r.isOp()) {
                    r.setFoodLevel(20);
                    r.sendMessage(c.c("&c" + s.star + "&7 You've been fed by &c " + p.getName() + "&7."));
                    p.sendMessage(c.c("&c" + s.star + "&7 You've fed &c" + r.getName() + "&7."));
                } else {
                    p.sendMessage(c.c("&cEither the player is you're trying to feed is not valid, or they're opped"));
                }
            } else {
                p.setFoodLevel(20);
                p.sendMessage(c.c("&c" + s.star + "&7 You've been fed."));
            }
        } else {
            p.sendMessage(c.c(s.error_np));
        }
        return false;
    }
}
