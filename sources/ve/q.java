package ve;

import fh.h;

public class q extends Error {
    public q() {
        super("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public q(@h String str) {
        super(str);
    }

    public q(@h String str, @h Throwable th2) {
        super(str, th2);
    }

    public q(@h Throwable th2) {
        super(th2);
    }
}
