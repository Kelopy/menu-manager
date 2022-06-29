package me.kelopy.menumanager.menusystem.menus;

import me.kelopy.menumanager.menusystem.menu;
import me.kelopy.menumanager.menusystem.playerMenuUtils;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class suicideConfirm extends menu {

    public suicideConfirm(playerMenuUtils pMenuUtils) {
        super(pMenuUtils);
    }

    @Override
    public String getMenuName() {
        return "Kill yourself?";
    }

    @Override
    public int getSlots() {
        return 9;
    }

    @Override
    public void handleMenu(InventoryClickEvent e) {

        switch(e.getCurrentItem().getType()){

            case EMERALD -> {
                e.getWhoClicked().closeInventory();
                e.getWhoClicked().setHealth(0.0);
                e.getWhoClicked().sendMessage(ChatColor.RED + "You died!");
            }

            case BARRIER -> {
                e.getWhoClicked().closeInventory();
                e.getWhoClicked().sendMessage(ChatColor.RED + "Changed your mind..? that's funny...");
            }

        }

    }

    @Override
    public void setMenuItems() {

        ItemStack yes = new ItemStack(Material.EMERALD, 1);
        ItemMeta yes_meta = yes.getItemMeta();
        yes_meta.setDisplayName(ChatColor.GREEN + "Yes");
        ArrayList<String> yes_lore = new ArrayList<>();
        yes_lore.add(ChatColor.AQUA + "Would you like to add ");
        yes_lore.add(ChatColor.AQUA + "this player to your lock?");
        yes_meta.setLore(yes_lore);
        yes.setItemMeta(yes_meta);

        ItemStack no = new ItemStack(Material.BARRIER, 1);
        ItemMeta no_meta = no.getItemMeta();
        no_meta.setDisplayName(ChatColor.DARK_RED + "No");
        no.setItemMeta(no_meta);

        inventory.setItem(3, yes);
        inventory.setItem(5, no);

    }

}
