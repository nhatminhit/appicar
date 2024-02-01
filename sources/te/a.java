package te;

import ve.h;
import zd.a1;
import zd.h1;
import zd.p;

@h(name = "AutoCloseableKt")
public final class a {
    @h1(version = "1.2")
    @a1
    public static final void a(@fh.h AutoCloseable autoCloseable, @fh.h Throwable th2) {
        if (autoCloseable == null) {
            return;
        }
        if (th2 == null) {
            autoCloseable.close();
            return;
        }
        try {
            autoCloseable.close();
        } catch (Throwable th3) {
            p.a(th2, th3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        xe.i0.d(1);
        a(r2, r3);
        xe.i0.c(1);
     */
    @zd.h1(version = "1.2")
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T extends java.lang.AutoCloseable, R> R b(T r2, we.l<? super T, ? extends R> r3) {
        /*
            java.lang.String r0 = "block"
            xe.l0.p(r3, r0)
            r0 = 1
            java.lang.Object r3 = r3.A(r2)     // Catch:{ all -> 0x0015 }
            xe.i0.d(r0)
            r1 = 0
            a(r2, r1)
            xe.i0.c(r0)
            return r3
        L_0x0015:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0017 }
        L_0x0017:
            r1 = move-exception
            xe.i0.d(r0)
            a(r2, r3)
            xe.i0.c(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: te.a.b(java.lang.AutoCloseable, we.l):java.lang.Object");
    }
}
