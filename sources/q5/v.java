package q5;

import i5.b;
import i5.d;
import i5.x;
import i5.y;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import k5.i;
import v4.u;

public abstract class v implements d, Serializable {
    public static final long Q = 1;
    public final x O;
    public transient List<y> P;

    public v(x xVar) {
        this.O = xVar == null ? x.Y : xVar;
    }

    public v(v vVar) {
        this.O = vVar.O;
    }

    public x d() {
        return this.O;
    }

    public boolean j() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r0 = i();
     */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final v4.n.d k(i5.b r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x000d
            q5.h r0 = r1.i()
            if (r0 == 0) goto L_0x000d
            v4.n$d r2 = r2.x(r0)
            goto L_0x000e
        L_0x000d:
            r2 = 0
        L_0x000e:
            if (r2 != 0) goto L_0x0012
            v4.n$d r2 = i5.d.f9044z
        L_0x0012:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.v.k(i5.b):v4.n$d");
    }

    public boolean m() {
        return this.O.l();
    }

    public u.b n(i<?> iVar, Class<?> cls) {
        b m10 = iVar.m();
        h i10 = i();
        if (i10 == null) {
            return iVar.A(cls);
        }
        u.b s10 = iVar.s(cls, i10.g());
        if (m10 == null) {
            return s10;
        }
        u.b V = m10.V(i10);
        return s10 == null ? V : s10.o(V);
    }

    public List<y> p(i<?> iVar) {
        h i10;
        List<y> list = this.P;
        if (list == null) {
            b m10 = iVar.m();
            if (!(m10 == null || (i10 = i()) == null)) {
                list = m10.Q(i10);
            }
            if (list == null) {
                list = Collections.emptyList();
            }
            this.P = list;
        }
        return list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = i();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public v4.n.d q(k5.i<?> r2, java.lang.Class<?> r3) {
        /*
            r1 = this;
            v4.n$d r3 = r2.w(r3)
            i5.b r2 = r2.m()
            if (r2 == 0) goto L_0x0015
            q5.h r0 = r1.i()
            if (r0 == 0) goto L_0x0015
            v4.n$d r2 = r2.x(r0)
            goto L_0x0016
        L_0x0015:
            r2 = 0
        L_0x0016:
            if (r3 != 0) goto L_0x001d
            if (r2 != 0) goto L_0x001c
            v4.n$d r2 = i5.d.f9044z
        L_0x001c:
            return r2
        L_0x001d:
            if (r2 != 0) goto L_0x0020
            goto L_0x0024
        L_0x0020:
            v4.n$d r3 = r3.A(r2)
        L_0x0024:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.v.q(k5.i, java.lang.Class):v4.n$d");
    }
}
