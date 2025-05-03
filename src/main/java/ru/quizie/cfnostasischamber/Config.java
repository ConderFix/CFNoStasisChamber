package ru.quizie.cfnostasischamber;

import org.bukkit.configuration.file.FileConfiguration;

public class Config {

    public static void load(FileConfiguration config) {
        timeBeforeRemove = config.getInt("time-before-remove");
    }

    public static int timeBeforeRemove;
}
