package y5;

import a6.c;
import a6.e;
import a6.s;
import com.fasterxml.jackson.databind.ser.j;
import i5.a0;
import i5.b;
import i5.d;
import i5.e0;
import i5.l;
import i5.o;
import i5.q;
import j5.f;
import java.io.IOException;
import s5.g;
import u5.i;
import v4.u;
import x5.k;

public abstract class b0<T> extends m0<T> implements j {
    public static final long Z = 1;

    /* renamed from: a0  reason: collision with root package name */
    public static final Object f15517a0 = u.a.NON_EMPTY;
    public final i5.j R;
    public final d S;
    public final i T;
    public final o<Object> U;
    public final s V;
    public transient k W;
    public final Object X;
    public final boolean Y;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15518a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                v4.u$a[] r0 = v4.u.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15518a = r0
                v4.u$a r1 = v4.u.a.NON_DEFAULT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f15518a     // Catch:{ NoSuchFieldError -> 0x001d }
                v4.u$a r1 = v4.u.a.NON_ABSENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f15518a     // Catch:{ NoSuchFieldError -> 0x0028 }
                v4.u$a r1 = v4.u.a.NON_EMPTY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f15518a     // Catch:{ NoSuchFieldError -> 0x0033 }
                v4.u$a r1 = v4.u.a.CUSTOM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f15518a     // Catch:{ NoSuchFieldError -> 0x003e }
                v4.u$a r1 = v4.u.a.NON_NULL     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f15518a     // Catch:{ NoSuchFieldError -> 0x0049 }
                v4.u$a r1 = v4.u.a.ALWAYS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: y5.b0.a.<clinit>():void");
        }
    }

    public b0(b0<?> b0Var, d dVar, i iVar, o<?> oVar, s sVar, Object obj, boolean z10) {
        super((m0<?>) b0Var);
        this.R = b0Var.R;
        this.W = k.c();
        this.S = dVar;
        this.T = iVar;
        this.U = oVar;
        this.V = sVar;
        this.X = obj;
        this.Y = z10;
    }

    public b0(z5.i iVar, boolean z10, i iVar2, o<Object> oVar) {
        super((i5.j) iVar);
        this.R = iVar.h();
        this.S = null;
        this.T = iVar2;
        this.U = oVar;
        this.V = null;
        this.X = null;
        this.Y = false;
        this.W = k.c();
    }

    public final o<Object> M(e0 e0Var, Class<?> cls) throws l {
        o<Object> n10 = this.W.n(cls);
        if (n10 != null) {
            return n10;
        }
        o<Object> a02 = this.R.i() ? e0Var.a0(e0Var.k(this.R, cls), this.S) : e0Var.b0(cls, this.S);
        s sVar = this.V;
        if (sVar != null) {
            a02 = a02.o(sVar);
        }
        o<Object> oVar = a02;
        this.W = this.W.m(cls, oVar);
        return oVar;
    }

    public final o<Object> N(e0 e0Var, i5.j jVar, d dVar) throws l {
        return e0Var.a0(jVar, dVar);
    }

    public abstract Object O(T t10);

    public abstract Object P(T t10);

    public abstract boolean Q(T t10);

    public boolean R(e0 e0Var, d dVar, i5.j jVar) {
        if (jVar.X()) {
            return false;
        }
        if (jVar.q() || jVar.b0()) {
            return true;
        }
        b o10 = e0Var.o();
        if (!(o10 == null || dVar == null || dVar.i() == null)) {
            f.b k02 = o10.k0(dVar.i());
            if (k02 == f.b.STATIC) {
                return true;
            }
            if (k02 == f.b.DYNAMIC) {
                return false;
            }
        }
        return e0Var.w(q.USE_STATIC_TYPING);
    }

    public i5.j S() {
        return this.R;
    }

    public abstract b0<T> T(Object obj, boolean z10);

    public abstract b0<T> U(d dVar, i iVar, o<?> oVar, s sVar);

    public o<?> d(e0 e0Var, d dVar) throws l {
        u.b n10;
        u.a g10;
        i iVar = this.T;
        if (iVar != null) {
            iVar = iVar.b(dVar);
        }
        o v10 = v(e0Var, dVar);
        if (v10 == null) {
            v10 = this.U;
            if (v10 != null) {
                v10 = e0Var.r0(v10, dVar);
            } else if (R(e0Var, dVar, this.R)) {
                v10 = N(e0Var, this.R, dVar);
            }
        }
        b0 U2 = (this.S == dVar && this.T == iVar && this.U == v10) ? this : U(dVar, iVar, v10, this.V);
        if (dVar == null || (n10 = dVar.n(e0Var.q(), g())) == null || (g10 = n10.g()) == u.a.USE_DEFAULTS) {
            return U2;
        }
        int i10 = a.f15518a[g10.ordinal()];
        Object obj = null;
        boolean z10 = true;
        if (i10 == 1) {
            obj = e.a(this.R);
            if (obj != null && obj.getClass().isArray()) {
                obj = c.b(obj);
            }
        } else if (i10 != 2) {
            if (i10 == 3) {
                obj = f15517a0;
            } else if (i10 == 4) {
                obj = e0Var.u0((q5.s) null, n10.f());
                if (obj != null) {
                    z10 = e0Var.v0(obj);
                }
            } else if (i10 != 5) {
                z10 = false;
            }
        } else if (this.R.v()) {
            obj = f15517a0;
        }
        return (this.X == obj && this.Y == z10) ? U2 : U2.T(obj, z10);
    }

    public void e(g gVar, i5.j jVar) throws l {
        o<Object> oVar = this.U;
        if (oVar == null) {
            oVar = N(gVar.c(), this.R, this.S);
            s sVar = this.V;
            if (sVar != null) {
                oVar = oVar.o(sVar);
            }
        }
        oVar.e(gVar, this.R);
    }

    public boolean h(e0 e0Var, T t10) {
        if (!Q(t10)) {
            return true;
        }
        Object O = O(t10);
        if (O == null) {
            return this.Y;
        }
        if (this.X == null) {
            return false;
        }
        o<Object> oVar = this.U;
        if (oVar == null) {
            try {
                oVar = M(e0Var, O.getClass());
            } catch (l e10) {
                throw new a0(e10);
            }
        }
        Object obj = this.X;
        return obj == f15517a0 ? oVar.h(e0Var, O) : obj.equals(O);
    }

    public boolean j() {
        return this.V != null;
    }

    public void m(T t10, w4.i iVar, e0 e0Var) throws IOException {
        Object P = P(t10);
        if (P != null) {
            o<Object> oVar = this.U;
            if (oVar == null) {
                oVar = M(e0Var, P.getClass());
            }
            i iVar2 = this.T;
            if (iVar2 != null) {
                oVar.n(P, iVar, e0Var, iVar2);
            } else {
                oVar.m(P, iVar, e0Var);
            }
        } else if (this.V == null) {
            e0Var.R(iVar);
        }
    }

    public void n(T t10, w4.i iVar, e0 e0Var, i iVar2) throws IOException {
        Object P = P(t10);
        if (P != null) {
            o<Object> oVar = this.U;
            if (oVar == null) {
                oVar = M(e0Var, P.getClass());
            }
            oVar.n(P, iVar, e0Var, iVar2);
        } else if (this.V == null) {
            e0Var.R(iVar);
        }
    }

    public o<T> o(s sVar) {
        o<Object> oVar = this.U;
        if (oVar != null && (oVar = oVar.o(sVar)) == this.U) {
            return this;
        }
        s sVar2 = this.V;
        if (sVar2 != null) {
            sVar = s.a(sVar, sVar2);
        }
        return (this.U == oVar && this.V == sVar) ? this : U(this.S, this.T, oVar, sVar);
    }
}
