package pl.droidsonroids.gif;

import java.lang.Thread;

public abstract class t implements Runnable {
    public final e O;

    public t(e eVar) {
        this.O = eVar;
    }

    public abstract void a();

    public final void run() {
        try {
            if (!this.O.x()) {
                a();
            }
        } catch (Throwable th2) {
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th2);
            }
            throw th2;
        }
    }
}
