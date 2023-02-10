package es.angelillo15.spsk.bukkit.utils;

import es.angelillo15.spsk.api.utils.ILogger;
import es.angelillo15.spsk.bukkit.SpawnersSK;

public class Logger implements ILogger {
    private java.util.logging.Logger logger;
    public Logger(java.util.logging.Logger logger) {
        this.logger = logger;
    }

    @Override
    public void info(String message) {
        logger.info(message);
    }

    @Override
    public void warn(String message) {
        logger.warning(message);
    }

    @Override
    public void error(String message) {
        logger.severe(message);
    }

    @Override
    public void debug(String message) {
        if(SpawnersSK.getInstance().isDebug())
            logger.info("[DEBUG] " + message);
    }
}
