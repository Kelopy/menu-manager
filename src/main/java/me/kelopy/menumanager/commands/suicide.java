package me.kelopy.menumanager.commands;

import me.kelopy.menumanager.MenuManager;
import me.kelopy.menumanager.menusystem.menus.suicideConfirm;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class suicide implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player p){
            new suicideConfirm(MenuManager.getPlayerMenuUtils(p)).open();
        }else{
            System.out.println("This command can only be executed by a player.");
        }

        return true;
    }
}
