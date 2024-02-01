package b7;

import android.util.Pair;
import b6.x0;

public abstract class a extends x0 {

    /* renamed from: b  reason: collision with root package name */
    public final int f4508b;

    /* renamed from: c  reason: collision with root package name */
    public final t0 f4509c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f4510d;

    public a(boolean z10, t0 t0Var) {
        this.f4510d = z10;
        this.f4509c = t0Var;
        this.f4508b = t0Var.getLength();
    }

    public static Object w(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object x(Object obj) {
        return ((Pair) obj).first;
    }

    public static Object z(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    public abstract int A(int i10);

    public abstract int B(int i10);

    public final int C(int i10, boolean z10) {
        if (z10) {
            return this.f4509c.d(i10);
        }
        if (i10 < this.f4508b - 1) {
            return i10 + 1;
        }
        return -1;
    }

    public final int D(int i10, boolean z10) {
        if (z10) {
            return this.f4509c.c(i10);
        }
        if (i10 > 0) {
            return i10 - 1;
        }
        return -1;
    }

    public abstract x0 E(int i10);

    public int a(boolean z10) {
        if (this.f4508b == 0) {
            return -1;
        }
        int i10 = 0;
        if (this.f4510d) {
            z10 = false;
        }
        if (z10) {
            i10 = this.f4509c.b();
        }
        while (E(i10).r()) {
            i10 = C(i10, z10);
            if (i10 == -1) {
                return -1;
            }
        }
        return B(i10) + E(i10).a(z10);
    }

    public final int b(Object obj) {
        int b10;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object x10 = x(obj);
        Object w10 = w(obj);
        int t10 = t(x10);
        if (t10 == -1 || (b10 = E(t10).b(w10)) == -1) {
            return -1;
        }
        return A(t10) + b10;
    }

    public int c(boolean z10) {
        int i10 = this.f4508b;
        if (i10 == 0) {
            return -1;
        }
        if (this.f4510d) {
            z10 = false;
        }
        int f10 = z10 ? this.f4509c.f() : i10 - 1;
        while (E(f10).r()) {
            f10 = D(f10, z10);
            if (f10 == -1) {
                return -1;
            }
        }
        return B(f10) + E(f10).c(z10);
    }

    public int e(int i10, int i11, boolean z10) {
        int i12 = 0;
        if (this.f4510d) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int v10 = v(i10);
        int B = B(v10);
        x0 E = E(v10);
        int i13 = i10 - B;
        if (i11 != 2) {
            i12 = i11;
        }
        int e10 = E.e(i13, i12, z10);
        if (e10 != -1) {
            return B + e10;
        }
        int C = C(v10, z10);
        while (C != -1 && E(C).r()) {
            C = C(C, z10);
        }
        if (C != -1) {
            return B(C) + E(C).a(z10);
        }
        if (i11 == 2) {
            return a(z10);
        }
        return -1;
    }

    public final x0.b g(int i10, x0.b bVar, boolean z10) {
        int u10 = u(i10);
        int B = B(u10);
        E(u10).g(i10 - A(u10), bVar, z10);
        bVar.f4494c += B;
        if (z10) {
            bVar.f4493b = z(y(u10), bVar.f4493b);
        }
        return bVar;
    }

    public final x0.b h(Object obj, x0.b bVar) {
        Object x10 = x(obj);
        Object w10 = w(obj);
        int t10 = t(x10);
        int B = B(t10);
        E(t10).h(w10, bVar);
        bVar.f4494c += B;
        bVar.f4493b = obj;
        return bVar;
    }

    public int l(int i10, int i11, boolean z10) {
        int i12 = 0;
        if (this.f4510d) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int v10 = v(i10);
        int B = B(v10);
        x0 E = E(v10);
        int i13 = i10 - B;
        if (i11 != 2) {
            i12 = i11;
        }
        int l10 = E.l(i13, i12, z10);
        if (l10 != -1) {
            return B + l10;
        }
        int D = D(v10, z10);
        while (D != -1 && E(D).r()) {
            D = D(D, z10);
        }
        if (D != -1) {
            return B(D) + E(D).c(z10);
        }
        if (i11 == 2) {
            return c(z10);
        }
        return -1;
    }

    public final Object m(int i10) {
        int u10 = u(i10);
        return z(y(u10), E(u10).m(i10 - A(u10)));
    }

    public final x0.c p(int i10, x0.c cVar, boolean z10, long j10) {
        int v10 = v(i10);
        int B = B(v10);
        int A = A(v10);
        E(v10).p(i10 - B, cVar, z10, j10);
        cVar.f4503f += A;
        cVar.f4504g += A;
        return cVar;
    }

    public abstract int t(Object obj);

    public abstract int u(int i10);

    public abstract int v(int i10);

    public abstract Object y(int i10);
}
