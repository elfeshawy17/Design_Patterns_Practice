package creational.singleton.solution.src.lazy_sync_singleton;

import creational.singleton.solution.src.LogLevel;

public class LazySyncSingleton {
    private static LazySyncSingleton INSTANCE;
    private final LogLevel logLevel;
    private final String logFormat;

    private LazySyncSingleton () {
        this.logLevel = LogLevel.INFO;
        this.logFormat = "TEXT";
    }

    public static synchronized LazySyncSingleton getInstance () {
        if (INSTANCE == null) {
            INSTANCE = new LazySyncSingleton();
        }
        return INSTANCE;
    }

    public LogLevel getLogLevel () {
        return logLevel;
    }

    public String getLogFormat () {
        return logFormat;
    }

    public boolean isDebugEnabled () {
        return logLevel == LogLevel.DEBUG;
    }
}
