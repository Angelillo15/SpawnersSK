package es.angelillo15.spsk.bukkit;

import es.angelillo15.spsk.bukkit.config.ConfigLoader;

public class SpawnersSKLoader extends SpawnersSK {
    @Override
    public void onEnable() {
        drawLogo();
        loadLibs();
        new ConfigLoader().load();

    }

    @Override
    public void onDisable() {

    }
}
