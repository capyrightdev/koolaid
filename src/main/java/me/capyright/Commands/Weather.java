package me.capyright.Commands;

import me.capyright.Utils.c;
import me.capyright.Utils.s;
import org.bukkit.Bukkit;
import org.bukkit.WeatherType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Weather implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p =(Player)sender;
        if(p.isOp()) {
            if (args.length == 1) {
                switch (args[0].toLowerCase()) {
                    case "clear":
                        p.setPlayerWeather(WeatherType.CLEAR);
                        p.sendMessage(c.c("&c" + s.star + "&7 Weather has been set to &cclear&7."));
                        break;
                    case "rain":
                    case "downfall":
                        p.setPlayerWeather(WeatherType.DOWNFALL);
                        p.sendMessage(c.c("&c" + s.star + "&7 Weather has been set to &craining&7."));
                        break;
                    case "storm":
                    case "thunder":
                        p.setPlayerWeather(WeatherType.DOWNFALL);
                        p.sendMessage(c.c("&c" + s.star + "&7 Weather has been set to &cthunder&7."));
                        break;
                }
            }
        } else {
            p.sendMessage(c.c(s.error_np));
        }
        return false;
    }
}
