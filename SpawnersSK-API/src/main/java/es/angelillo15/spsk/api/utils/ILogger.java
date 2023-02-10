package es.angelillo15.spsk.api.utils;

public interface ILogger {
    /**
     * Log a message
     * @param message
     */
    void info(String message);

    /**
     * Log a warning message
     * @param message
     */
    void warn(String message);

    /**
     * Log a error message
     * @param message
     */
    void error(String message);

    /**
     * Log a debug message
     * @param message
     */
    void debug(String message);
}
