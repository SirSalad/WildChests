package com.bgsoftware.wildchests.nms.v1_12_R1.inventory;

import net.minecraft.server.v1_12_R1.ContainerHopper;
import net.minecraft.server.v1_12_R1.EntityHuman;
import net.minecraft.server.v1_12_R1.PlayerInventory;
import org.bukkit.craftbukkit.v1_12_R1.inventory.CraftInventoryView;

public class WildContainerHopper extends ContainerHopper {

    private final BaseNMSMenu base;

    private WildContainerHopper(PlayerInventory playerInventory, EntityHuman entityHuman, WildInventory inventory) {
        super(playerInventory, inventory, entityHuman);
        this.base = new BaseNMSMenu(this, playerInventory, inventory);
    }

    @Override
    public CraftInventoryView getBukkitView() {
        return this.base.getBukkitView();
    }

    @Override
    public void b(EntityHuman entityhuman) {
        this.base.removed(entityhuman);
    }

    public static WildContainerHopper of(PlayerInventory playerInventory, EntityHuman entityHuman, WildInventory inventory) {
        return new WildContainerHopper(playerInventory, entityHuman, inventory);
    }

}

