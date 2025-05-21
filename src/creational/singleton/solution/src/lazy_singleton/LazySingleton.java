package creational.singleton.solution.src.lazy_singleton;

import creational.singleton.solution.src.LogLevel;

public class LazySingleton {
    private static LazySingleton INSTANCE;
    private final LogLevel logLevel;
    private final String logFormat;

    private LazySingleton () {
        this.logLevel = LogLevel.INFO;
        this.logFormat = "TEXT";
    }

    public static LazySingleton getInstance () {
        if (INSTANCE == null) {
            INSTANCE = new LazySingleton();
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
