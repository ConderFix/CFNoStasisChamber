package ru.quizie.cfnostasischamber;

import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.scheduler.BukkitRunnable;

public class BukkitListeners implements Listener {

    public final CFNoStasisChamber plugin;

    public BukkitListeners(CFNoStasisChamber plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    private void on(ProjectileLaunchEvent event) {
        final Entity entity = event.getEntity();

        if (entity.getType() != EntityType.ENDER_PEARL) return;
        this.deadEnderPearl(entity);
    }

    private void deadEnderPearl(Entity entity) {
        Bukkit.getScheduler().runTaskLater(plugin, () -> {
            if (!entity.isDead()) entity.remove();
        }, Config.timeBeforeRemove * 20L);
    }

}
