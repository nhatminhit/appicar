package x5;

import com.fasterxml.jackson.databind.ser.i;
import com.fasterxml.jackson.databind.ser.j;
import i5.d;
import i5.d0;
import i5.e0;
import i5.l;
import i5.m;
import j5.a;
import java.io.IOException;
import java.lang.reflect.Type;
import s5.g;
import z5.n;

@a
public class o extends y5.a<String[]> implements j {
    public static final i5.j U = n.c0().k0(String.class);
    public static final o V = new o();
    public final i5.o<Object> T;

    public o() {
        super(String[].class);
        this.T = null;
    }

    public o(o oVar, d dVar, i5.o<?> oVar2, Boolean bool) {
        super(oVar, dVar, bool);
        this.T = oVar2;
    }

    public i<?> M(u5.i iVar) {
        return this;
    }

    public i5.o<?> N() {
        return this.T;
    }

    public i5.j O() {
        return U;
    }

    public i5.o<?> T(d dVar, Boolean bool) {
        return new o(this, dVar, this.T, bool);
    }

    /* renamed from: V */
    public boolean Q(String[] strArr) {
        return strArr.length == 1;
    }

    /* renamed from: W */
    public boolean h(e0 e0Var, String[] strArr) {
        return strArr.length == 0;
    }

    /* renamed from: X */
    public final void m(String[] strArr, w4.i iVar, e0 e0Var) throws IOException {
        int length = strArr.length;
        if (length != 1 || ((this.S != null || !e0Var.w0(d0.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) && this.S != Boolean.TRUE)) {
            iVar.U2(strArr, length);
            U(strArr, iVar, e0Var);
            iVar.f2();
            return;
        }
        U(strArr, iVar, e0Var);
    }

    /* renamed from: Y */
    public void U(String[] strArr, w4.i iVar, e0 e0Var) throws IOException {
        if (r0 != 0) {
            i5.o<Object> oVar = this.T;
            if (oVar != null) {
                Z(strArr, iVar, e0Var, oVar);
                return;
            }
            for (String str : strArr) {
                if (str == null) {
                    iVar.k2();
                } else {
                    iVar.Z2(str);
                }
            }
        }
    }

    public final void Z(String[] strArr, w4.i iVar, e0 e0Var, i5.o<Object> oVar) throws IOException {
        for (String str : strArr) {
            if (str == null) {
                e0Var.R(iVar);
            } else {
                oVar.m(str, iVar, e0Var);
            }
        }
    }

    public m a(e0 e0Var, Type type) {
        return u("array", true).n2("items", t("string"));
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0041 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0042  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i5.o<?> d(i5.e0 r5, i5.d r6) throws i5.l {
        /*
            r4 = this;
            r0 = 0
            if (r6 == 0) goto L_0x0018
            i5.b r1 = r5.o()
            q5.h r2 = r6.i()
            if (r2 == 0) goto L_0x0018
            java.lang.Object r1 = r1.j(r2)
            if (r1 == 0) goto L_0x0018
            i5.o r1 = r5.G0(r2, r1)
            goto L_0x0019
        L_0x0018:
            r1 = r0
        L_0x0019:
            java.lang.Class<java.lang.String[]> r2 = java.lang.String[].class
            v4.n$a r3 = v4.n.a.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            java.lang.Boolean r2 = r4.y(r5, r6, r2, r3)
            if (r1 != 0) goto L_0x0025
            i5.o<java.lang.Object> r1 = r4.T
        L_0x0025:
            i5.o r1 = r4.w(r5, r6, r1)
            if (r1 != 0) goto L_0x0031
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            i5.o r1 = r5.U(r1, r6)
        L_0x0031:
            boolean r5 = r4.C(r1)
            if (r5 == 0) goto L_0x0038
            goto L_0x0039
        L_0x0038:
            r0 = r1
        L_0x0039:
            i5.o<java.lang.Object> r5 = r4.T
            if (r0 != r5) goto L_0x0042
            java.lang.Boolean r5 = r4.S
            if (r2 != r5) goto L_0x0042
            return r4
        L_0x0042:
            x5.o r5 = new x5.o
            r5.<init>(r4, r6, r0, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: x5.o.d(i5.e0, i5.d):i5.o");
    }

    public void e(g gVar, i5.j jVar) throws l {
        E(gVar, jVar, s5.d.STRING);
    }
}
