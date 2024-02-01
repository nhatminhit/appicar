package org.greenrobot.eventbus;

import android.util.Log;
import java.io.PrintStream;
import java.util.logging.Level;

public interface Logger {

    public static class AndroidLogger implements Logger {

        /* renamed from: b  reason: collision with root package name */
        public static final boolean f21878b;

        /* renamed from: a  reason: collision with root package name */
        public final String f21879a;

        static {
            boolean z10;
            try {
                Class.forName("android.util.Log");
                z10 = true;
            } catch (ClassNotFoundException unused) {
                z10 = false;
            }
            f21878b = z10;
        }

        public AndroidLogger(String str) {
            this.f21879a = str;
        }

        public static boolean isAndroidLogAvailable() {
            return f21878b;
        }

        public void log(Level level, String str) {
            if (level != Level.OFF) {
                Log.println(mapLevel(level), this.f21879a, str);
            }
        }

        public void log(Level level, String str, Throwable th2) {
            if (level != Level.OFF) {
                int mapLevel = mapLevel(level);
                String str2 = this.f21879a;
                Log.println(mapLevel, str2, str + "\n" + Log.getStackTraceString(th2));
            }
        }

        public int mapLevel(Level level) {
            int intValue = level.intValue();
            if (intValue < 800) {
                return intValue < 500 ? 2 : 3;
            }
            if (intValue < 900) {
                return 4;
            }
            return intValue < 1000 ? 5 : 6;
        }
    }

    public static class JavaLogger implements Logger {
        public final java.util.logging.Logger logger;

        public JavaLogger(String str) {
            this.logger = java.util.logging.Logger.getLogger(str);
        }

        public void log(Level level, String str) {
            this.logger.log(level, str);
        }

        public void log(Level level, String str, Throwable th2) {
            this.logger.log(level, str, th2);
        }
    }

    public static class SystemOutLogger implements Logger {
        public void log(Level level, String str) {
            PrintStream printStream = System.out;
            printStream.println("[" + level + "] " + str);
        }

        public void log(Level level, String str, Throwable th2) {
            PrintStream printStream = System.out;
            printStream.println("[" + level + "] " + str);
            th2.printStackTrace(System.out);
        }
    }

    void log(Level level, String str);

    void log(Level level, String str, Throwable th2);
}
