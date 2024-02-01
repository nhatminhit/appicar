package i5;

import com.fasterxml.jackson.databind.ser.k;
import i5.w;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.Collection;
import k5.l;
import w4.c0;
import w4.i;
import x5.k;
import x5.q;

public class b0 implements c0, Closeable, Flushable {
    public final k O;
    public final c0 P;
    public final i Q;
    public final o<Object> R;
    public final u5.i S;
    public final boolean T;
    public final boolean U;
    public final boolean V;
    public x5.k W = x5.k.d();
    public boolean X;
    public boolean Y;

    public b0(k kVar, i iVar, boolean z10, w.b bVar) throws IOException {
        this.O = kVar;
        this.Q = iVar;
        this.T = z10;
        this.R = bVar.c();
        this.S = bVar.b();
        c0 j02 = kVar.q();
        this.P = j02;
        this.U = j02.P0(d0.FLUSH_AFTER_WRITE_VALUE);
        this.V = j02.P0(d0.CLOSE_CLOSEABLE);
    }

    public final o<Object> c(j jVar) throws l {
        u5.i iVar = this.S;
        k.d i10 = iVar == null ? this.W.i(jVar, this.O) : this.W.a(jVar, new q(iVar, this.O.g0(jVar, (d) null)));
        this.W = i10.f15105b;
        return i10.f15104a;
    }

    public void close() throws IOException {
        if (!this.Y) {
            this.Y = true;
            if (this.X) {
                this.X = false;
                this.Q.f2();
            }
            if (this.T) {
                this.Q.close();
            }
        }
    }

    public final o<Object> f(Class<?> cls) throws l {
        u5.i iVar = this.S;
        k.d j10 = iVar == null ? this.W.j(cls, this.O) : this.W.b(cls, new q(iVar, this.O.i0(cls, (d) null)));
        this.W = j10.f15105b;
        return j10.f15104a;
    }

    public void flush() throws IOException {
        if (!this.Y) {
            this.Q.flush();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0034 A[SYNTHETIC, Splitter:B:18:0x0034] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i5.b0 g(java.lang.Object r6) throws java.io.IOException {
        /*
            r5 = this;
            r0 = r6
            java.io.Closeable r0 = (java.io.Closeable) r0
            r1 = 0
            i5.o<java.lang.Object> r2 = r5.R     // Catch:{ all -> 0x0031 }
            if (r2 != 0) goto L_0x001a
            java.lang.Class r2 = r6.getClass()     // Catch:{ all -> 0x0031 }
            x5.k r3 = r5.W     // Catch:{ all -> 0x0031 }
            i5.o r3 = r3.n(r2)     // Catch:{ all -> 0x0031 }
            if (r3 != 0) goto L_0x0019
            i5.o r2 = r5.f(r2)     // Catch:{ all -> 0x0031 }
            goto L_0x001a
        L_0x0019:
            r2 = r3
        L_0x001a:
            com.fasterxml.jackson.databind.ser.k r3 = r5.O     // Catch:{ all -> 0x0031 }
            w4.i r4 = r5.Q     // Catch:{ all -> 0x0031 }
            r3.a1(r4, r6, r1, r2)     // Catch:{ all -> 0x0031 }
            boolean r6 = r5.U     // Catch:{ all -> 0x0031 }
            if (r6 == 0) goto L_0x002a
            w4.i r6 = r5.Q     // Catch:{ all -> 0x0031 }
            r6.flush()     // Catch:{ all -> 0x0031 }
        L_0x002a:
            r0.close()     // Catch:{ all -> 0x002e }
            return r5
        L_0x002e:
            r6 = move-exception
            r0 = r1
            goto L_0x0032
        L_0x0031:
            r6 = move-exception
        L_0x0032:
            if (r0 == 0) goto L_0x0037
            r0.close()     // Catch:{ IOException -> 0x0037 }
        L_0x0037:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.b0.g(java.lang.Object):i5.b0");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002f A[SYNTHETIC, Splitter:B:16:0x002f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i5.b0 h(java.lang.Object r5, i5.j r6) throws java.io.IOException {
        /*
            r4 = this;
            r0 = r5
            java.io.Closeable r0 = (java.io.Closeable) r0
            x5.k r1 = r4.W     // Catch:{ all -> 0x002c }
            java.lang.Class r2 = r6.g()     // Catch:{ all -> 0x002c }
            i5.o r1 = r1.n(r2)     // Catch:{ all -> 0x002c }
            if (r1 != 0) goto L_0x0013
            i5.o r1 = r4.c(r6)     // Catch:{ all -> 0x002c }
        L_0x0013:
            com.fasterxml.jackson.databind.ser.k r2 = r4.O     // Catch:{ all -> 0x002c }
            w4.i r3 = r4.Q     // Catch:{ all -> 0x002c }
            r2.a1(r3, r5, r6, r1)     // Catch:{ all -> 0x002c }
            boolean r5 = r4.U     // Catch:{ all -> 0x002c }
            if (r5 == 0) goto L_0x0023
            w4.i r5 = r4.Q     // Catch:{ all -> 0x002c }
            r5.flush()     // Catch:{ all -> 0x002c }
        L_0x0023:
            r5 = 0
            r0.close()     // Catch:{ all -> 0x0028 }
            return r4
        L_0x0028:
            r6 = move-exception
            r0 = r5
            r5 = r6
            goto L_0x002d
        L_0x002c:
            r5 = move-exception
        L_0x002d:
            if (r0 == 0) goto L_0x0032
            r0.close()     // Catch:{ IOException -> 0x0032 }
        L_0x0032:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.b0.h(java.lang.Object, i5.j):i5.b0");
    }

    public b0 i(boolean z10) throws IOException {
        if (z10) {
            this.Q.R2();
            this.X = true;
        }
        return this;
    }

    public b0 k(Object obj) throws IOException {
        if (obj == null) {
            this.O.Y0(this.Q, (Object) null);
            return this;
        } else if (this.V && (obj instanceof Closeable)) {
            return g(obj);
        } else {
            o<Object> oVar = this.R;
            if (oVar == null) {
                Class<?> cls = obj.getClass();
                o<Object> n10 = this.W.n(cls);
                oVar = n10 == null ? f(cls) : n10;
            }
            this.O.a1(this.Q, obj, (j) null, oVar);
            if (this.U) {
                this.Q.flush();
            }
            return this;
        }
    }

    public b0 l(Object obj, j jVar) throws IOException {
        if (obj == null) {
            this.O.Y0(this.Q, (Object) null);
            return this;
        } else if (this.V && (obj instanceof Closeable)) {
            return h(obj, jVar);
        } else {
            o<Object> n10 = this.W.n(jVar.g());
            if (n10 == null) {
                n10 = c(jVar);
            }
            this.O.a1(this.Q, obj, jVar, n10);
            if (this.U) {
                this.Q.flush();
            }
            return this;
        }
    }

    public b0 m(Iterable<?> iterable) throws IOException {
        for (Object k10 : iterable) {
            k(k10);
        }
        return this;
    }

    public <C extends Collection<?>> b0 o(C c10) throws IOException {
        for (Object k10 : c10) {
            k(k10);
        }
        return this;
    }

    public b0 q(Object[] objArr) throws IOException {
        for (Object k10 : objArr) {
            k(k10);
        }
        return this;
    }

    public w4.b0 version() {
        return l.O;
    }
}
