package o5;

import i5.j;
import i5.l;
import java.io.Closeable;

public class i extends l {
    public final j U;

    public i(w4.l lVar, String str, j jVar) {
        super((Closeable) lVar, str);
        this.U = jVar;
    }

    public i(w4.l lVar, String str, j jVar, Throwable th2) {
        super((Closeable) lVar, str, th2);
        this.U = jVar;
    }

    public static i A(w4.l lVar, String str, j jVar, Throwable th2) {
        return new i(lVar, str, jVar, th2);
    }

    public static i z(w4.l lVar, String str, j jVar) {
        return new i(lVar, str, jVar);
    }

    public j B() {
        return this.U;
    }
}
