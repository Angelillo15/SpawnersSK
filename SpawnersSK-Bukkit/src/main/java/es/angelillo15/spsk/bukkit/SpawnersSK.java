package es.angelillo15.spsk.bukkit;

import es.angelillo15.spsk.api.ISpawnersSK;
import es.angelillo15.spsk.api.utils.ILogger;
import es.angelillo15.spsk.api.utils.TextUtils;
import es.angelillo15.spsk.bukkit.utils.Logger;
import lombok.Getter;
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
        logger.info(TextUtils.simpleColorize("Loading SpawnersSK v"
                + this.getDescription().getVersion() + " by " +
                this.getDescription().getAuthors().get(1))
        );
        logger.info(TextUtils.simpleColorize(""));

    }
}
