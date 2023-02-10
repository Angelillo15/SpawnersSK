package es.angelillo15.spsk.bukkit;

import es.angelillo15.spsk.api.Constants;
import es.angelillo15.spsk.api.ISpawnersSK;
import es.angelillo15.spsk.api.libs.LibsManager;
import es.angelillo15.spsk.api.utils.ILogger;
import es.angelillo15.spsk.api.utils.TextUtils;
import es.angelillo15.spsk.bukkit.utils.Logger;
import lombok.Getter;
import net.byteflux.libby.BukkitLibraryManager;
import org.bukkit.plugin.java.JavaPlugin;
public class SpawnersSK extends JavaPlugin implements ISpawnersSK {
    @Getter
    private static SpawnersSK instance;
    private boolean debug = false;
    private ILogger logger;

    @Override
    public boolean isDebug() {
        return debug;
    }

    @Override
    public ILogger getPLogger() {
        return this.logger;
    }

    @Override
    public void drawLogo() {
        instance = this;
        this.logger = new Logger(this.getLogger());
        logger.info(TextUtils.simpleColorize("&b _____ _____ _____ _____"));
        logger.info(TextUtils.simpleColorize("&b|   __|  _  |   __|  |  |"));
        logger.info(TextUtils.simpleColorize("&b|__   |   __|__   |    -|"));
        logger.info(TextUtils.simpleColorize("&b|_____|__|  |_____|__|__|"));
        logger.info(TextUtils.simpleColorize(""));
        logger.info(TextUtils.simpleColorize("&bLoading SpawnersSK v"
                + Constants.VERSION + " "+ Constants.COMMIT + " by " +
                this.getDescription().getAuthors().get(0))
        );
        logger.info(TextUtils.simpleColorize(""));

    }

    @Override
    public void loadLibs(){
        BukkitLibraryManager manager = new BukkitLibraryManager(this);
        manager.addJitPack();
        manager.addMavenCentral();

        LibsManager.load();
        LibsManager.getLibs().forEach(manager::loadLibrary);
    }
}