package n5;

import a6.u;
import i5.d;
import i5.g;
import i5.h;
import i5.j;
import i5.k;
import j5.a;
import java.io.IOException;
import l5.i;
import l5.s;
import m5.q;
import u5.f;
import v4.n;
import w4.l;
import w4.p;

@a
public final class g0 extends a0<String[]> implements i {
    public static final long X = 2;
    public static final String[] Y = new String[0];
    public static final g0 Z = new g0();
    public k<String> T;
    public final s U;
    public final Boolean V;
    public final boolean W;

    public g0() {
        this((k<?>) null, (s) null, (Boolean) null);
    }

    public g0(k<?> kVar, s sVar, Boolean bool) {
        super((Class<?>) String[].class);
        this.T = kVar;
        this.U = sVar;
        this.V = bool;
        this.W = q.e(sVar);
    }

    public final String[] E0(l lVar, g gVar, String[] strArr) throws IOException {
        Object[] objArr;
        int i10;
        Object f10;
        Class<String> cls = String.class;
        u x02 = gVar.x0();
        if (strArr == null) {
            objArr = x02.i();
            i10 = 0;
        } else {
            i10 = strArr.length;
            objArr = x02.j(strArr, i10);
        }
        k kVar = this.T;
        while (true) {
            try {
                if (lVar.C2() == null) {
                    p Z0 = lVar.Z0();
                    if (Z0 == p.END_ARRAY) {
                        String[] strArr2 = (String[]) x02.g(objArr, i10, cls);
                        gVar.b1(x02);
                        return strArr2;
                    } else if (Z0 != p.VALUE_NULL) {
                        f10 = kVar.f(lVar, gVar);
                    } else if (!this.W) {
                        f10 = this.U.d(gVar);
                    }
                } else {
                    f10 = kVar.f(lVar, gVar);
                }
                String str = (String) f10;
                if (i10 >= objArr.length) {
                    objArr = x02.c(objArr);
                    i10 = 0;
                }
                int i11 = i10 + 1;
                try {
                    objArr[i10] = str;
                    i10 = i11;
                } catch (Exception e10) {
                    e = e10;
                    i10 = i11;
                    throw i5.l.x(e, cls, i10);
                }
            } catch (Exception e11) {
                e = e11;
                throw i5.l.x(e, cls, i10);
            }
        }
    }

    /* renamed from: F0 */
    public String[] f(l lVar, g gVar) throws IOException {
        if (!lVar.u2()) {
            return H0(lVar, gVar);
        }
        if (this.T != null) {
            return E0(lVar, gVar, (String[]) null);
        }
        u x02 = gVar.x0();
        Object[] i10 = x02.i();
        int i11 = 0;
        while (true) {
            try {
                String C2 = lVar.C2();
                if (C2 == null) {
                    p Z0 = lVar.Z0();
                    if (Z0 == p.END_ARRAY) {
                        String[] strArr = (String[]) x02.g(i10, i11, String.class);
                        gVar.b1(x02);
                        return strArr;
                    } else if (Z0 != p.VALUE_NULL) {
                        C2 = g0(lVar, gVar);
                    } else if (!this.W) {
                        C2 = (String) this.U.d(gVar);
                    }
                }
                if (i11 >= i10.length) {
                    i10 = x02.c(i10);
                    i11 = 0;
                }
                int i12 = i11 + 1;
                try {
                    i10[i11] = C2;
                    i11 = i12;
                } catch (Exception e10) {
                    e = e10;
                    i11 = i12;
                    throw i5.l.x(e, i10, x02.d() + i11);
                }
            } catch (Exception e11) {
                e = e11;
                throw i5.l.x(e, i10, x02.d() + i11);
            }
        }
    }

    /* renamed from: G0 */
    public String[] g(l lVar, g gVar, String[] strArr) throws IOException {
        if (!lVar.u2()) {
            String[] H0 = H0(lVar, gVar);
            if (H0 == null) {
                return strArr;
            }
            int length = strArr.length;
            String[] strArr2 = new String[(H0.length + length)];
            System.arraycopy(strArr, 0, strArr2, 0, length);
            System.arraycopy(H0, 0, strArr2, length, H0.length);
            return strArr2;
        } else if (this.T != null) {
            return E0(lVar, gVar, strArr);
        } else {
            u x02 = gVar.x0();
            int length2 = strArr.length;
            Object[] j10 = x02.j(strArr, length2);
            while (true) {
                try {
                    String C2 = lVar.C2();
                    if (C2 == null) {
                        p Z0 = lVar.Z0();
                        if (Z0 == p.END_ARRAY) {
                            String[] strArr3 = (String[]) x02.g(j10, length2, String.class);
                            gVar.b1(x02);
                            return strArr3;
                        } else if (Z0 != p.VALUE_NULL) {
                            C2 = g0(lVar, gVar);
                        } else if (this.W) {
                            return Y;
                        } else {
                            C2 = (String) this.U.d(gVar);
                        }
                    }
                    if (length2 >= j10.length) {
                        j10 = x02.c(j10);
                        length2 = 0;
                    }
                    int i10 = length2 + 1;
                    try {
                        j10[length2] = C2;
                        length2 = i10;
                    } catch (Exception e10) {
                        e = e10;
                        length2 = i10;
                        throw i5.l.x(e, j10, x02.d() + length2);
                    }
                } catch (Exception e11) {
                    e = e11;
                    throw i5.l.x(e, j10, x02.d() + length2);
                }
            }
        }
    }

    public final String[] H0(l lVar, g gVar) throws IOException {
        Boolean bool = this.V;
        if (bool == Boolean.TRUE || (bool == null && gVar.v0(h.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            return new String[]{lVar.q2(p.VALUE_NULL) ? (String) this.U.d(gVar) : g0(lVar, gVar)};
        } else if (!lVar.q2(p.VALUE_STRING) || !gVar.v0(h.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) || lVar.Y1().length() != 0) {
            return (String[]) gVar.i0(this.O, lVar);
        } else {
            return null;
        }
    }

    public k<?> a(g gVar, d dVar) throws i5.l {
        k r02 = r0(gVar, dVar, this.T);
        j H = gVar.H(String.class);
        k L = r02 == null ? gVar.L(H, dVar) : gVar.f0(r02, dVar, H);
        Boolean t02 = t0(gVar, dVar, String[].class, n.a.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        s p02 = p0(gVar, dVar, L);
        if (L != null && B0(L)) {
            L = null;
        }
        return (this.T == L && this.V == t02 && this.U == p02) ? this : new g0(L, p02, t02);
    }

    public Object h(l lVar, g gVar, f fVar) throws IOException {
        return fVar.d(lVar, gVar);
    }

    public a6.a l() {
        return a6.a.CONSTANT;
    }

    public Object n(g gVar) throws i5.l {
        return Y;
    }

    public Boolean u(i5.f fVar) {
        return Boolean.TRUE;
    }
}
