package o5;

import a6.h;
import i5.j;
import i5.l;
import java.io.Closeable;

public class f extends l {
    public Class<?> U;

    public f(w4.l lVar, String str) {
        this(lVar, str, (j) null);
    }

    public f(w4.l lVar, String str, j jVar) {
        super((Closeable) lVar, str);
        this.U = h.k0(jVar);
    }

    public f(w4.l lVar, String str, Class<?> cls) {
        super((Closeable) lVar, str);
        this.U = cls;
    }

    public f(w4.l lVar, String str, w4.j jVar) {
        super((Closeable) lVar, str, jVar);
    }

    public static f A(w4.l lVar, Class<?> cls, String str) {
        return new f(lVar, str, cls);
    }

    @Deprecated
    public static f B(w4.l lVar, String str) {
        return A(lVar, (Class<?>) null, str);
    }

    public static f z(w4.l lVar, j jVar, String str) {
        return new f(lVar, str, jVar);
    }

    public Class<?> C() {
        return this.U;
    }

    public f D(j jVar) {
        this.U = jVar.g();
        return this;
    }
}
