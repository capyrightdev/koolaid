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
        p.sendMessage(c.c("&aKoolaid\n&aVersion: 1.0\n&aStable: Y"));
        return false;
    }
}
