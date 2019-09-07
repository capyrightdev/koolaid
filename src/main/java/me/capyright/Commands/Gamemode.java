package me.capyright.Commands;

import me.capyright.Utils.c;
import me.capyright.Utils.s;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Gamemode implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player)sender;
        if(p.isOp()) {
            if(args.length == 1) {
                switch (args[0].toLowerCase()) {
                    case "c":
                    case "creative":
                        p.setGameMode(GameMode.CREATIVE);
                        p.sendMessage(c.c("&c" + s.double_arrow + "&7 Your gamemode has been updated to &ccreative&7."));
                        break;
                    case "s":
                    case "survival":
                        p.setGameMode(GameMode.SURVIVAL);
                        p.sendMessage(c.c("&c" + s.double_arrow + "&7 Your gamemode has been updated to &csurvival&7."));
                        break;
                    case "spec":
                    case "spectator":
                        p.setGameMode(GameMode.SPECTATOR);
                        p.sendMessage(c.c("&c" + s.double_arrow + "&7 Your gamemode has been updated to &cspectator&7."));
                        break;
                }
            }
        }
        if(p.isOp()) {
            if(label.equalsIgnoreCase("gmc")) {
                p.setGameMode(GameMode.CREATIVE);
                p.sendMessage(c.c("&c" + s.double_arrow + "&7 Your gamemode has been updated to &ccreative&7."));
            } else if (label.equalsIgnoreCase("gms")) {
                p.setGameMode(GameMode.SURVIVAL);
                p.sendMessage(c.c("&c" + s.double_arrow + "&7 Your gamemode has been updated to &csurvival&7."));
            } else if(label.equalsIgnoreCase("gmsp")) {
                p.setGameMode(GameMode.SPECTATOR);
                p.sendMessage(c.c("&c" + s.double_arrow + "&7 Your gamemode has been updated to &cspectator&7."));
            }
        }
        return false;
    }
}
