package zd;

import fh.h;

public final class t2 extends RuntimeException {
    public t2() {
    }

    public t2(@h String str) {
        super(str);
    }

    public t2(@h String str, @h Throwable th2) {
        super(str, th2);
    }

    public t2(@h Throwable th2) {
        super(th2);
    }
}
