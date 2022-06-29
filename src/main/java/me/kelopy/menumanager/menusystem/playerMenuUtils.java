package me.kelopy.menumanager.menusystem;

import org.bukkit.entity.Player;

public class playerMenuUtils {

    private Player owner;

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }

    public playerMenuUtils(Player owner) {
        this.owner = owner;
    }

}
