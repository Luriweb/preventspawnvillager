package com.github.luriel0228.preventspawnvillager;

import com.github.luriel0228.preventspawnvillager.listeners.VillagerSpawnListener;

import org.bukkit.plugin.java.JavaPlugin;

public final class PreventSpawnVillager extends JavaPlugin {

    @Override
    public void onEnable() {
        registerEvent();
    }

    public void registerEvent() {
        getServer().getPluginManager().registerEvents(new VillagerSpawnListener(), this);
    }
}