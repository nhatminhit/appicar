package y5;

import com.fasterxml.jackson.databind.node.u;
import com.fasterxml.jackson.databind.ser.i;
import com.fasterxml.jackson.databind.ser.j;
import i5.d;
import i5.d0;
import i5.e0;
import i5.l;
import i5.m;
import i5.o;
import java.io.IOException;
import java.lang.reflect.Type;
import s5.g;
import t5.a;
import t5.c;
import w4.p;
import x5.k;

public abstract class b<T> extends i<T> implements j {
    public final i5.j R;
    public final d S;
    public final boolean T;
    public final Boolean U;
    public final u5.i V;
    public final o<Object> W;
    public k X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Deprecated
    public b(Class<?> cls, i5.j jVar, boolean z10, u5.i iVar, d dVar, o<Object> oVar) {
        super(cls, false);
        boolean z11 = false;
        this.R = jVar;
        if (z10 || (jVar != null && jVar.q())) {
            z11 = true;
        }
        this.T = z11;
        this.V = iVar;
        this.S = dVar;
        this.W = oVar;
        this.X = k.c();
        this.U = null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Class<?> cls, i5.j jVar, boolean z10, u5.i iVar, o<Object> oVar) {
        super(cls, false);
        boolean z11 = false;
        this.R = jVar;
        if (z10 || (jVar != null && jVar.q())) {
            z11 = true;
        }
        this.T = z11;
        this.V = iVar;
        this.S = null;
        this.W = oVar;
        this.X = k.c();
        this.U = null;
    }

    @Deprecated
    public b(b<?> bVar, d dVar, u5.i iVar, o<?> oVar) {
        this(bVar, dVar, iVar, oVar, bVar.U);
    }

    public b(b<?> bVar, d dVar, u5.i iVar, o<?> oVar, Boolean bool) {
        super((i<?>) bVar);
        this.R = bVar.R;
        this.T = bVar.T;
        this.V = iVar;
        this.S = dVar;
        this.W = oVar;
        this.X = k.c();
        this.U = bool;
    }

    public o<?> N() {
        return this.W;
    }

    public i5.j O() {
        return this.R;
    }

    public final o<Object> S(k kVar, i5.j jVar, e0 e0Var) throws l {
        k.d k10 = kVar.k(jVar, e0Var, this.S);
        k kVar2 = k10.f15105b;
        if (kVar != kVar2) {
            this.X = kVar2;
        }
        return k10.f15104a;
    }

    public final o<Object> T(k kVar, Class<?> cls, e0 e0Var) throws l {
        k.d l10 = kVar.l(cls, e0Var, this.S);
        k kVar2 = l10.f15105b;
        if (kVar != kVar2) {
            this.X = kVar2;
        }
        return l10.f15104a;
    }

    public abstract void U(T t10, w4.i iVar, e0 e0Var) throws IOException;

    @Deprecated
    public final b<T> V(d dVar, u5.i iVar, o<?> oVar) {
        return W(dVar, iVar, oVar, this.U);
    }

    public abstract b<T> W(d dVar, u5.i iVar, o<?> oVar, Boolean bool);

    public m a(e0 e0Var, Type type) throws l {
        u u10 = u("array", true);
        o<Object> oVar = this.W;
        if (oVar != null) {
            m mVar = null;
            if (oVar instanceof c) {
                mVar = ((c) oVar).a(e0Var, (Type) null);
            }
            if (mVar == null) {
                mVar = a.a();
            }
            u10.n2("items", mVar);
        }
        return u10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0060 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0061  */
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
            i5.b r2 = r6.o()
            q5.h r3 = r7.i()
            if (r3 == 0) goto L_0x0020
            java.lang.Object r2 = r2.j(r3)
            if (r2 == 0) goto L_0x0020
            i5.o r2 = r6.G0(r3, r2)
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
            i5.j r3 = r5.R
            if (r3 == 0) goto L_0x004f
            boolean r4 = r5.T
            if (r4 == 0) goto L_0x004f
            boolean r3 = r3.X()
            if (r3 != 0) goto L_0x004f
            i5.j r2 = r5.R
            i5.o r2 = r6.T(r2, r7)
        L_0x004f:
            i5.o<java.lang.Object> r6 = r5.W
            if (r2 != r6) goto L_0x0061
            i5.d r6 = r5.S
            if (r7 != r6) goto L_0x0061
            u5.i r6 = r5.V
            if (r6 != r0) goto L_0x0061
            java.lang.Boolean r6 = r5.U
            if (r6 == r1) goto L_0x0060
            goto L_0x0061
        L_0x0060:
            return r5
        L_0x0061:
            y5.b r6 = r5.W(r7, r0, r2, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: y5.b.d(i5.e0, i5.d):i5.o");
    }

    public void e(g gVar, i5.j jVar) throws l {
        o<Object> oVar = this.W;
        if (oVar == null && this.R != null) {
            oVar = gVar.c().T(this.R, this.S);
        }
        D(gVar, jVar, oVar, this.R);
    }

    public void m(T t10, w4.i iVar, e0 e0Var) throws IOException {
        if (!e0Var.w0(d0.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) || !Q(t10)) {
            iVar.T2(t10);
            U(t10, iVar, e0Var);
            iVar.f2();
            return;
        }
        U(t10, iVar, e0Var);
    }

    public void n(T t10, w4.i iVar, e0 e0Var, u5.i iVar2) throws IOException {
        g5.c o10 = iVar2.o(iVar, iVar2.g(t10, p.START_ARRAY));
        iVar.A1(t10);
        U(t10, iVar, e0Var);
        iVar2.v(iVar, o10);
    }
}
