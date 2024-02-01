package v3;

import d.o0;
import java.io.IOException;

public final class e extends IOException {
    public static final long P = 1;
    public static final int Q = -1;
    public final int O;

    public e(int i10) {
        this("Http request failed with status code: " + i10, i10);
    }

    public e(String str) {
        this(str, -1);
    }

    public e(String str, int i10) {
        this(str, i10, (Throwable) null);
    }

    public e(String str, int i10, @o0 Throwable th2) {
        super(str, th2);
        this.O = i10;
    }

    public int a() {
        return this.O;
    }
}
