package me.kelopy.menumanager;

import me.kelopy.menumanager.commands.suicide;
import me.kelopy.menumanager.listeners.menuListener;
import me.kelopy.menumanager.menusystem.playerMenuUtils;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;

public final class MenuManager extends JavaPlugin {

    private static final HashMap<Player, playerMenuUtils> playerUtilsMap = new HashMap<>();

    @Override
    public void onEnable() {
        System.out.println("Watching people suici~");

        getCommand("suicide").setExecutor(new suicide());
        getServer().getPluginManager().registerEvents(new menuListener(), this);
    }

    public static playerMenuUtils getPlayerMenuUtils(Player p){
        playerMenuUtils pMenuUtils;

        if(playerUtilsMap.containsKey(p)){
            return playerUtilsMap.get(p);
        }else{
            pMenuUtils = new playerMenuUtils(p);
            playerUtilsMap.put(p, pMenuUtils);
            return pMenuUtils;
        }

    }

}
