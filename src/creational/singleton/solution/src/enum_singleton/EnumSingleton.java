package creational.singleton.solution.src.enum_singleton;

import creational.singleton.solution.src.LogLevel;

public enum EnumSingleton {
    INSTANCE;

    private final LogLevel logLevel;
    private final String logFormat;

    EnumSingleton() {
        this.logLevel = LogLevel.INFO;
        this.logFormat = "TEXT";
    }

    public LogLevel getLogLevel() {
        return logLevel;
    }

    public boolean isDebugEnabled() {
        return logLevel == LogLevel.DEBUG;
    }

    public String getLogFormat() {
        return logFormat;
    }
}
