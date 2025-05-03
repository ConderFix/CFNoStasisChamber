package ru.quizie.cfnostasischamber;

import org.bukkit.plugin.java.JavaPlugin;

public final class CFNoStasisChamber extends JavaPlugin {

    @Override
    public void onEnable() {
        super.saveDefaultConfig();
        Config.load(super.getConfig());

        super.getServer().getPluginManager().registerEvents(new BukkitListeners(this), this);

    }
}
