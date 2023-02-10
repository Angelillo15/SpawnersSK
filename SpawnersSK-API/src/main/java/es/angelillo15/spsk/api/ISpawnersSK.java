package es.angelillo15.spsk.api;

import es.angelillo15.spsk.api.utils.ILogger;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

public interface ISpawnersSK  {
    /**
     * Get if the plugin is in debug mode
     * @return boolean
     */
    boolean isDebug();
    /**
     * Draw the logo of the plugin
     */
    void drawLogo();

    /**
     * Load the libs of the plugin
     */
    void loadLibs();

    /**
     * Get the instance of the logger
     * @return ILogger see {@link ILogger}
     */
    ILogger getPLogger();

    /**
     * Get the instance of the plugin
     * @return ISpawnersSK extends of {@link Plugin}
     */
    public static ISpawnersSK getInstance(){
        return (ISpawnersSK) Bukkit.getServer().getPluginManager().getPlugin("SpawnersSK");
    }
}
