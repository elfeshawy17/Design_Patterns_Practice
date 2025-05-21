package creational.singleton.solution.src.eager_singleton;

import creational.singleton.solution.src.LogLevel;

public class EagerSingleton {
    private static final EagerSingleton INSTANCE = new EagerSingleton();
    private final LogLevel logLevel;
    private final String logFormat;

    private EagerSingleton () {
        this.logLevel = LogLevel.INFO;
        this.logFormat = "TEXT";
    }

    public static EagerSingleton getInstance () {
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
