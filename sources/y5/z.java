package y5;

import com.fasterxml.jackson.databind.ser.j;
import i5.d;
import i5.d0;
import i5.e0;
import i5.l;
import i5.o;
import j5.a;
import java.io.IOException;
import s5.b;
import s5.g;
import u5.i;
import x5.k;

@a
public class z extends a<Object[]> implements j {
    public final boolean T;
    public final i5.j U;
    public final i V;
    public o<Object> W;
    public k X;

    public z(i5.j jVar, boolean z10, i iVar, o<Object> oVar) {
        super(Object[].class);
        this.U = jVar;
        this.T = z10;
        this.V = iVar;
        this.X = k.c();
        this.W = oVar;
    }

    public z(z zVar, d dVar, i iVar, o<?> oVar, Boolean bool) {
        super(zVar, dVar, bool);
        this.U = zVar.U;
        this.V = iVar;
        this.T = zVar.T;
        this.X = k.c();
        this.W = oVar;
    }

    public z(z zVar, i iVar) {
        super((a<?>) zVar);
        this.U = zVar.U;
        this.V = iVar;
        this.T = zVar.T;
        this.X = zVar.X;
        this.W = zVar.W;
    }

    public com.fasterxml.jackson.databind.ser.i<?> M(i iVar) {
        return new z(this.U, this.T, iVar, this.W);
    }

    public o<?> N() {
        return this.W;
    }

    public i5.j O() {
        return this.U;
    }

    public o<?> T(d dVar, Boolean bool) {
        return new z(this, dVar, this.V, this.W, bool);
    }

    public final o<Object> V(k kVar, i5.j jVar, e0 e0Var) throws l {
        k.d k10 = kVar.k(jVar, e0Var, this.R);
        k kVar2 = k10.f15105b;
        if (kVar != kVar2) {
            this.X = kVar2;
        }
        return k10.f15104a;
    }

    public final o<Object> W(k kVar, Class<?> cls, e0 e0Var) throws l {
        k.d l10 = kVar.l(cls, e0Var, this.R);
        k kVar2 = l10.f15105b;
        if (kVar != kVar2) {
            this.X = kVar2;
        }
        return l10.f15104a;
    }

    /* renamed from: X */
    public boolean Q(Object[] objArr) {
        return objArr.length == 1;
    }

    /* renamed from: Y */
    public boolean h(e0 e0Var, Object[] objArr) {
        return objArr.length == 0;
    }

    /* renamed from: Z */
    public final void m(Object[] objArr, w4.i iVar, e0 e0Var) throws IOException {
        int length = objArr.length;
        if (length != 1 || ((this.S != null || !e0Var.w0(d0.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) && this.S != Boolean.TRUE)) {
            iVar.U2(objArr, length);
            U(objArr, iVar, e0Var);
            iVar.f2();
            return;
        }
        U(objArr, iVar, e0Var);
    }

    /* renamed from: a0 */
    public void U(Object[] objArr, w4.i iVar, e0 e0Var) throws IOException {
        if (r0 != 0) {
            o<Object> oVar = this.W;
            if (oVar != null) {
                b0(objArr, iVar, e0Var, oVar);
            } else if (this.V != null) {
                c0(objArr, iVar, e0Var);
            } else {
                try {
                    k kVar = this.X;
                    for (Object obj : objArr) {
                        if (obj == null) {
                            e0Var.R(iVar);
                        } else {
                            Class<?> cls = obj.getClass();
                            o<Object> n10 = kVar.n(cls);
                            if (n10 == null) {
                                n10 = this.U.i() ? V(kVar, e0Var.k(this.U, cls), e0Var) : W(kVar, cls, e0Var);
                            }
                            n10.m(obj, iVar, e0Var);
                        }
                    }
                } catch (Exception e10) {
                    K(e0Var, e10, (Object) null, 0);
                }
            }
        }
    }

    public void b0(Object[] objArr, w4.i iVar, e0 e0Var, o<Object> oVar) throws IOException {
        int length = objArr.length;
        i iVar2 = this.V;
        int i10 = 0;
        Object obj = null;
        while (i10 < length) {
            try {
                obj = objArr[i10];
                if (obj == null) {
                    e0Var.R(iVar);
                } else if (iVar2 == null) {
                    oVar.m(obj, iVar, e0Var);
                } else {
                    oVar.n(obj, iVar, e0Var, iVar2);
                }
                i10++;
            } catch (Exception e10) {
                K(e0Var, e10, obj, i10);
                return;
            }
        }
    }

    public void c0(Object[] objArr, w4.i iVar, e0 e0Var) throws IOException {
        i iVar2 = this.V;
        try {
            k kVar = this.X;
            for (Object obj : objArr) {
                if (obj == null) {
                    e0Var.R(iVar);
                } else {
                    Class<?> cls = obj.getClass();
                    o<Object> n10 = kVar.n(cls);
                    if (n10 == null) {
                        n10 = W(kVar, cls, e0Var);
                    }
                    n10.n(obj, iVar, e0Var, iVar2);
                }
            }
        } catch (Exception e10) {
            K(e0Var, e10, (Object) null, 0);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i5.o<?> d(i5.e0 r6, i5.d r7) throws i5.l {
        /*
            r5 = this;
            u5.i r0 = r5.V
            if (r0 == 0) goto L_0x0008
            u5.i r0 = r0.b(r7)
        L_0x0008:
            r1 = 0
            if (r7 == 0) goto L_0x0020
            q5.h r2 = r7.i()
            i5.b r3 = r6.o()
            if (r2 == 0) goto L_0x0020
            java.lang.Object r3 = r3.j(r2)
            if (r3 == 0) goto L_0x0020
            i5.o r2 = r6.G0(r2, r3)
            goto L_0x0021
        L_0x0020:
            r2 = r1
        L_0x0021:
            java.lang.Class r3 = r5.g()
            v4.n$d r3 = r5.z(r6, r7, r3)
            if (r3 == 0) goto L_0x0031
            v4.n$a r1 = v4.n.a.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            java.lang.Boolean r1 = r3.h(r1)
        L_0x0031:
            if (r2 != 0) goto L_0x0035
            i5.o<java.lang.Object> r2 = r5.W
        L_0x0035:
            i5.o r2 = r5.w(r6, r7, r2)
            if (r2 != 0) goto L_0x004f
            i5.j r3 = r5.U
            if (r3 == 0) goto L_0x004f
            boolean r4 = r5.T
            if (r4 == 0) goto L_0x004f
            boolean r3 = r3.X()
            if (r3 != 0) goto L_0x004f
            i5.j r2 = r5.U
            i5.o r2 = r6.T(r2, r7)
        L_0x004f:
            y5.z r6 = r5.d0(r7, r0, r2, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: y5.z.d(i5.e0, i5.d):i5.o");
    }

    public z d0(d dVar, i iVar, o<?> oVar, Boolean bool) {
        return (this.R == dVar && oVar == this.W && this.V == iVar && this.S == bool) ? this : new z(this, dVar, iVar, oVar, bool);
    }

    public void e(g gVar, i5.j jVar) throws l {
        b m10 = gVar.m(jVar);
        if (m10 != null) {
            i5.j jVar2 = this.U;
            o<Object> oVar = this.W;
            if (oVar == null) {
                oVar = gVar.c().T(jVar2, this.R);
            }
            m10.g(oVar, jVar2);
        }
    }
}
