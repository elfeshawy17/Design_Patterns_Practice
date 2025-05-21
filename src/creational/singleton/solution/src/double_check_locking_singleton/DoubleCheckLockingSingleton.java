package creational.singleton.solution.src.double_check_locking_singleton;

import creational.singleton.solution.src.LogLevel;

public class DoubleCheckLockingSingleton {
    private static DoubleCheckLockingSingleton INSTANCE;
    private final LogLevel logLevel;
    private final String logFormat;

    private DoubleCheckLockingSingleton() {
        this.logLevel = LogLevel.INFO;
        this.logFormat = "TEXT";
    }

    public static DoubleCheckLockingSingleton getINSTANCE() {
        if (INSTANCE == null) {
            synchronized (DoubleCheckLockingSingleton.class) {
                if (INSTANCE == null) INSTANCE = new DoubleCheckLockingSingleton();
            }
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
