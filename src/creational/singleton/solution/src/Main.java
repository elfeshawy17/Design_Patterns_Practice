package creational.singleton.solution.src;

import creational.singleton.solution.src.double_check_locking_singleton.DoubleCheckLockingSingleton;
import creational.singleton.solution.src.eager_singleton.EagerSingleton;
import creational.singleton.solution.src.enum_singleton.EnumSingleton;
import creational.singleton.solution.src.lazy_singleton.LazySingleton;
import creational.singleton.solution.src.lazy_sync_singleton.LazySyncSingleton;

public class Main {

    public static void main (String[] args) {

        EagerSingleton eager = EagerSingleton.getInstance();
        LazySingleton lazy = LazySingleton.getInstance();
        LazySyncSingleton lazySync = LazySyncSingleton.getInstance();
        DoubleCheckLockingSingleton dcl = DoubleCheckLockingSingleton.getINSTANCE();
        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;

        System.out.println("Eager: " + eager.getLogLevel() + ", " + eager.getLogFormat());
        System.out.println("Lazy: " + lazy.getLogLevel() + ", " + lazy.getLogFormat());
        System.out.println("LazySync: " + lazySync.getLogLevel() + ", " + lazySync.getLogFormat());
        System.out.println("DCL: " + dcl.getLogLevel() + ", " + dcl.getLogFormat());
        System.out.println("Enum: " + enumSingleton.getLogLevel() + ", " + enumSingleton.getLogFormat());

    }

}
