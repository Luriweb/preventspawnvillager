package com.github.luriel0228.preventspawnvillager.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.entity.EntityType;

public class VillagerSpawnListener implements Listener {

    @EventHandler
    public void onVillagerSpawn(CreatureSpawnEvent event) {
        if (event.getEntityType().equals(EntityType.VILLAGER)) {
            event.setCancelled(true);
        }
    }

}