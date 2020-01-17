package me.capyright.Commands;

import me.capyright.Utils.c;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class koolaid implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;
        p.sendMessage(c.c("&aKoolaid\n&aVersion: 1.3\n&aStable: Y"));
        p.sendMessage(c.c("&aSource: &7https://github.com/capyrightdev"));
        return false;
    }
}
