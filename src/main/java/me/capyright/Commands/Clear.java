package me.capyright.Commands;

import me.capyright.Utils.c;
import me.capyright.Utils.s;
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
        return false;
    }
}
