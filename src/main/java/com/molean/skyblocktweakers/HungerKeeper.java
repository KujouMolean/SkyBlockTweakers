package com.molean.skyblocktweakers;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class HungerKeeper implements Listener {
    private static final Map<UUID, Pair<Integer, Float>> hungerMap = new HashMap<>();

    public HungerKeeper() {
        Bukkit.getPluginManager().registerEvents(this, JavaPlugin.getPlugin(SkyBlockTweakers.class));
    }

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent e) {
        Player player = e.getEntity();
        Pair<Integer, Float> hunger = new Pair<>(player.getFoodLevel(), player.getSaturation());
        hungerMap.put(player.getUniqueId(), hunger);
    }

    @EventHandler
    public void onPlayerRespawn(PlayerRespawnEvent e) {
        Player player = e.getPlayer();
        Pair<Integer, Float> hunger = hungerMap.get(player.getUniqueId());
        if (hunger != null) {
            Bukkit.getScheduler().runTaskLater(JavaPlugin.getPlugin(SkyBlockTweakers.class), () -> {
                player.setFoodLevel(hunger.getKey());
                player.setSaturation(hunger.getValue());
            }, 3L);
        }
    }
}
