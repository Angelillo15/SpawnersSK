package es.angelillo15.spsk.bukkit;

import es.angelillo15.spsk.api.ISpawnersSK;
import es.angelillo15.spsk.api.utils.ILogger;
import org.bukkit.plugin.java.JavaPlugin;

public class SpawnersSK extends JavaPlugin implements ISpawnersSK {
    @Override
    public ILogger getPLogger() {
        return null;
    }

    @Override
    public void drawLogo() {

    }
}
