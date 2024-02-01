package pa;

import java.io.IOException;

public final class e extends IOException {
    public static final long O = 1;

    public e(String str) {
        super(str);
    }

    public e(String str, Throwable th2) {
        super(str);
        initCause(th2);
    }

    public e(Throwable th2) {
        initCause(th2);
    }
}
