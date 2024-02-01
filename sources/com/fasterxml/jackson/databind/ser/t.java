package com.fasterxml.jackson.databind.ser;

import a6.b;
import i5.e0;
import i5.j;
import i5.o;
import i5.y;
import java.io.Serializable;
import q5.s;
import u5.i;
import v4.u;
import x5.k;

public abstract class t extends d implements Serializable {

    /* renamed from: l0  reason: collision with root package name */
    public static final long f5065l0 = 1;

    public t() {
    }

    public t(t tVar) {
        super(tVar);
    }

    public t(t tVar, y yVar) {
        super((d) tVar, yVar);
    }

    public t(s sVar, b bVar, j jVar) {
        this(sVar, bVar, jVar, (o<?>) null, (i) null, (j) null, sVar.t());
    }

    @Deprecated
    public t(s sVar, b bVar, j jVar, o<?> oVar, i iVar, j jVar2, u.b bVar2) {
        this(sVar, bVar, jVar, oVar, iVar, jVar2, bVar2, (Class<?>[]) null);
    }

    public t(s sVar, b bVar, j jVar, o<?> oVar, i iVar, j jVar2, u.b bVar2, Class<?>[] clsArr) {
        super(sVar, sVar.G(), bVar, jVar, oVar, iVar, jVar2, W(bVar2), X(bVar2), clsArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0004, code lost:
        r2 = r2.i();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean W(v4.u.b r2) {
        /*
            r0 = 0
            if (r2 != 0) goto L_0x0004
            return r0
        L_0x0004:
            v4.u$a r2 = r2.i()
            v4.u$a r1 = v4.u.a.ALWAYS
            if (r2 == r1) goto L_0x0011
            v4.u$a r1 = v4.u.a.USE_DEFAULTS
            if (r2 == r1) goto L_0x0011
            r0 = 1
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.t.W(v4.u$b):boolean");
    }

    public static Object X(u.b bVar) {
        if (bVar == null) {
            return Boolean.FALSE;
        }
        u.a i10 = bVar.i();
        if (i10 == u.a.ALWAYS || i10 == u.a.NON_NULL || i10 == u.a.USE_DEFAULTS) {
            return null;
        }
        return d.f5030k0;
    }

    public abstract Object Y(Object obj, w4.i iVar, e0 e0Var) throws Exception;

    public abstract t Z(k5.i<?> iVar, q5.b bVar, s sVar, j jVar);

    public void g(Object obj, w4.i iVar, e0 e0Var) throws Exception {
        Object Y = Y(obj, iVar, e0Var);
        if (Y == null) {
            o<Object> oVar = this.f5033c0;
            if (oVar != null) {
                oVar.m(null, iVar, e0Var);
            } else {
                iVar.k2();
            }
        } else {
            o<Object> oVar2 = this.f5032b0;
            if (oVar2 == null) {
                Class<?> cls = Y.getClass();
                k kVar = this.f5035e0;
                o<Object> n10 = kVar.n(cls);
                oVar2 = n10 == null ? u(kVar, cls, e0Var) : n10;
            }
            Object obj2 = this.f5037g0;
            if (obj2 != null) {
                if (d.f5030k0 == obj2) {
                    if (oVar2.h(e0Var, Y)) {
                        s(obj, iVar, e0Var);
                        return;
                    }
                } else if (obj2.equals(Y)) {
                    s(obj, iVar, e0Var);
                    return;
                }
            }
            if (Y != obj || !v(obj, iVar, e0Var, oVar2)) {
                i iVar2 = this.f5034d0;
                if (iVar2 == null) {
                    oVar2.m(Y, iVar, e0Var);
                } else {
                    oVar2.n(Y, iVar, e0Var, iVar2);
                }
            }
        }
    }

    public void h(Object obj, w4.i iVar, e0 e0Var) throws Exception {
        Object Y = Y(obj, iVar, e0Var);
        if (Y != null) {
            o<Object> oVar = this.f5032b0;
            if (oVar == null) {
                Class<?> cls = Y.getClass();
                k kVar = this.f5035e0;
                o<Object> n10 = kVar.n(cls);
                oVar = n10 == null ? u(kVar, cls, e0Var) : n10;
            }
            Object obj2 = this.f5037g0;
            if (obj2 != null) {
                if (d.f5030k0 == obj2) {
                    if (oVar.h(e0Var, Y)) {
                        return;
                    }
                } else if (obj2.equals(Y)) {
                    return;
                }
            }
            if (Y != obj || !v(obj, iVar, e0Var, oVar)) {
                iVar.j2(this.S);
                i iVar2 = this.f5034d0;
                if (iVar2 == null) {
                    oVar.m(Y, iVar, e0Var);
                } else {
                    oVar.n(Y, iVar, e0Var, iVar2);
                }
            }
        } else if (this.f5033c0 != null) {
            iVar.j2(this.S);
            this.f5033c0.m(null, iVar, e0Var);
        }
    }

    public boolean j() {
        return true;
    }
}
