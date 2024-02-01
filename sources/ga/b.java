package ga;

import d.m0;
import j8.s;

public class b extends Exception {
    @Deprecated
    public b() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(@m0 String str) {
        super(str);
        s.i(str, "Detail message must not be empty");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(@m0 String str, @m0 Throwable th2) {
        super(str, th2);
        s.i(str, "Detail message must not be empty");
    }
}
