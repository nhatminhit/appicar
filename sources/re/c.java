package re;

import java.io.Closeable;
import ve.h;
import zd.a1;
import zd.h1;
import zd.p;

@h(name = "CloseableKt")
public final class c {
    @h1(version = "1.1")
    @a1
    public static final void a(@fh.h Closeable closeable, @fh.h Throwable th2) {
        if (closeable == null) {
            return;
        }
        if (th2 == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th3) {
            p.a(th2, th3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        xe.i0.d(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        if (oe.m.a(1, 1, 0) == false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        if (r3 != null) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        a(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0037, code lost:
        xe.i0.c(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003a, code lost:
        throw r2;
     */
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T extends java.io.Closeable, R> R b(T r3, we.l<? super T, ? extends R> r4) {
        /*
            java.lang.String r0 = "block"
            xe.l0.p(r4, r0)
            r0 = 0
            r1 = 1
            java.lang.Object r4 = r4.A(r3)     // Catch:{ all -> 0x0022 }
            xe.i0.d(r1)
            boolean r0 = oe.m.a(r1, r1, r0)
            if (r0 == 0) goto L_0x0019
            r0 = 0
            a(r3, r0)
            goto L_0x001e
        L_0x0019:
            if (r3 == 0) goto L_0x001e
            r3.close()
        L_0x001e:
            xe.i0.c(r1)
            return r4
        L_0x0022:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0024 }
        L_0x0024:
            r2 = move-exception
            xe.i0.d(r1)
            boolean r0 = oe.m.a(r1, r1, r0)
            if (r0 != 0) goto L_0x0034
            if (r3 == 0) goto L_0x0037
            r3.close()     // Catch:{ all -> 0x0037 }
            goto L_0x0037
        L_0x0034:
            a(r3, r4)
        L_0x0037:
            xe.i0.c(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: re.c.b(java.io.Closeable, we.l):java.lang.Object");
    }
}
