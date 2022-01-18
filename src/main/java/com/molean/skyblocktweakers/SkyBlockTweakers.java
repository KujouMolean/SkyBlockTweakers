package com.molean.skyblocktweakers;

import org.bukkit.plugin.java.JavaPlugin;

public final class SkyBlockTweakers extends JavaPlugin {

    @Override
    public void onEnable() {
        this.saveDefaultConfig();
        this.reloadConfig();
        if (this.getConfig().getBoolean("FirstSapling")) {
            try {
                new FirstSapling();
                getLogger().info("Enabled first sapling.");
            } catch (Exception e) {
                e.printStackTrace();

            }

        }
        if (this.getConfig().getBoolean("LavaProtect")) {
            try {
                new LavaProtect();
                getLogger().info("Enabled lava protect.");
            } catch (Exception e) {
                e.printStackTrace();

            }
        }
        if (this.getConfig().getBoolean("PotionEffectKeeper")) {
            try {
                new PotionEffectKeeper();
                getLogger().info("Enabled potion effect keeper.");
            } catch (Exception e) {
                e.printStackTrace();

            }
        }
        if (this.getConfig().getBoolean("HungerKeeper")) {
            try {
                new HungerKeeper();
                getLogger().info("Enabled hunger sapling.");
            } catch (Exception e) {
                e.printStackTrace();

            }
        }
        if (this.getConfig().getBoolean("RailWay")) {
            try {
                new RailWay();
                getLogger().info("Enabled railway.");
            } catch (Exception e) {
                e.printStackTrace();

            }
        }
        if (this.getConfig().getBoolean("IronElevator")) {
            try {

                new IronElevator();
                getLogger().info("Enabled iron elevator.");
            } catch (Exception e) {
                e.printStackTrace();

            }
        }
        if (this.getConfig().getBoolean("SitDownAnywhere")) {
            try {

                new MoreChairs();
                getLogger().info("Enabled sit down anywhere.");
            } catch (Exception e) {
                e.printStackTrace();

            }
        }
        if (this.getConfig().getBoolean("PlayerHeadDrop")) {
            try {

                new PlayerHeadDrop();
                getLogger().info("Enabled player head drop.");
            } catch (Exception e) {
                e.printStackTrace();

            }
        }
        if (this.getConfig().getBoolean("SlimeChunkCommand")) {
            try {

                new SlimeChunk();
                getLogger().info("Enabled slime chunk command.");
            } catch (Exception e) {
                e.printStackTrace();

            }
        }
        if (this.getConfig().getBoolean("ElderGuardianSpawner")) {
            try {

                new ElderGuardianSpawner();
                getLogger().info("Enabled elder guardian spawner.");
            } catch (Exception e) {
                e.printStackTrace();

            }
        }
        if (this.getConfig().getBoolean("ShulkerRespawn")) {
            try {

                new ShulkerRespawn();
                getLogger().info("Enabled shulker respawn.");
            } catch (Exception e) {
                e.printStackTrace();

            }
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
