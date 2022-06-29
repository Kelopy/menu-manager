package me.kelopy.menumanager.menusystem;

import org.bukkit.Bukkit;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;

public abstract class menu implements InventoryHolder {

    protected Inventory inventory;

    protected playerMenuUtils pMenuUtils;

    public menu(playerMenuUtils pMenuUtils){
        this.pMenuUtils = pMenuUtils;
    }

    public abstract String getMenuName();

    public abstract int getSlots();

    public abstract void handleMenu(InventoryClickEvent e);

    public abstract void setMenuItems();

    public void open(){
        inventory = Bukkit.createInventory(this, getSlots(), getMenuName());
        this.setMenuItems();
        pMenuUtils.getOwner().openInventory(inventory);
    }

    @Override
    public Inventory getInventory() {
        return inventory;
    }

}
