package me.kelopy.menumanager.listeners;

import me.kelopy.menumanager.menusystem.menu;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.InventoryHolder;

public class menuListener implements Listener {

    @EventHandler
    public void onMenuClick(InventoryClickEvent e){
        Player p = (Player) e.getWhoClicked();

        InventoryHolder holder = e.getClickedInventory().getHolder();

        if(holder instanceof menu moonoo){
            e.setCancelled(true);

            if(e.getCurrentItem() == null){
                return;
            }

            moonoo.handleMenu(e);
        }

    }

}
