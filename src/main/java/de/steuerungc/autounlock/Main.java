package de.steuerungc.autounlock;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Martin on 15.04.2016.
 */
public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        BackendHandler bh = new BackendHandler();
        this.getServer().getPluginManager().registerEvents(new EventHandler(bh), this);
    }

}
