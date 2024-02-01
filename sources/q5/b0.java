package q5;

import i5.b;
import i5.x;
import i5.y;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import v4.u;
import v4.x;

public class b0 extends s implements Comparable<b0> {

    /* renamed from: a0  reason: collision with root package name */
    public static final b.a f11929a0 = b.a.f("");
    public final boolean P;
    public final k5.i<?> Q;
    public final i5.b R;
    public final y S;
    public final y T;
    public k<f> U;
    public k<l> V;
    public k<i> W;
    public k<i> X;
    public transient x Y;
    public transient b.a Z;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f11930a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                v4.x$a[] r0 = v4.x.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11930a = r0
                v4.x$a r1 = v4.x.a.READ_ONLY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f11930a     // Catch:{ NoSuchFieldError -> 0x001d }
                v4.x$a r1 = v4.x.a.READ_WRITE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f11930a     // Catch:{ NoSuchFieldError -> 0x0028 }
                v4.x$a r1 = v4.x.a.WRITE_ONLY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f11930a     // Catch:{ NoSuchFieldError -> 0x0033 }
                v4.x$a r1 = v4.x.a.AUTO     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: q5.b0.a.<clinit>():void");
        }
    }

    public class b implements m<Class<?>[]> {
        public b() {
        }

        /* renamed from: b */
        public Class<?>[] a(h hVar) {
            return b0.this.R.s0(hVar);
        }
    }

    public class c implements m<b.a> {
        public c() {
        }

        /* renamed from: b */
        public b.a a(h hVar) {
            return b0.this.R.Y(hVar);
        }
    }

    public class d implements m<Boolean> {
        public d() {
        }

        /* renamed from: b */
        public Boolean a(h hVar) {
            return b0.this.R.F0(hVar);
        }
    }

    public class e implements m<Boolean> {
        public e() {
        }

        /* renamed from: b */
        public Boolean a(h hVar) {
            return b0.this.R.C0(hVar);
        }
    }

    public class f implements m<String> {
        public f() {
        }

        /* renamed from: b */
        public String a(h hVar) {
            return b0.this.R.T(hVar);
        }
    }

    public class g implements m<Integer> {
        public g() {
        }

        /* renamed from: b */
        public Integer a(h hVar) {
            return b0.this.R.W(hVar);
        }
    }

    public class h implements m<String> {
        public h() {
        }

        /* renamed from: b */
        public String a(h hVar) {
            return b0.this.R.S(hVar);
        }
    }

    public class i implements m<z> {
        public i() {
        }

        /* renamed from: b */
        public z a(h hVar) {
            z J = b0.this.R.J(hVar);
            return J != null ? b0.this.R.K(hVar, J) : J;
        }
    }

    public class j implements m<x.a> {
        public j() {
        }

        /* renamed from: b */
        public x.a a(h hVar) {
            return b0.this.R.P(hVar);
        }
    }

    public static final class k<T> {

        /* renamed from: a  reason: collision with root package name */
        public final T f11940a;

        /* renamed from: b  reason: collision with root package name */
        public final k<T> f11941b;

        /* renamed from: c  reason: collision with root package name */
        public final y f11942c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f11943d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f11944e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f11945f;

        public k(T t10, k<T> kVar, y yVar, boolean z10, boolean z11, boolean z12) {
            this.f11940a = t10;
            this.f11941b = kVar;
            y yVar2 = (yVar == null || yVar.i()) ? null : yVar;
            this.f11942c = yVar2;
            if (z10) {
                if (yVar2 == null) {
                    throw new IllegalArgumentException("Cannot pass true for 'explName' if name is null/empty");
                } else if (!yVar.f()) {
                    z10 = false;
                }
            }
            this.f11943d = z10;
            this.f11944e = z11;
            this.f11945f = z12;
        }

        public k<T> a(k<T> kVar) {
            k<T> kVar2 = this.f11941b;
            return kVar2 == null ? c(kVar) : c(kVar2.a(kVar));
        }

        public k<T> b() {
            k<T> kVar = this.f11941b;
            if (kVar == null) {
                return this;
            }
            k<T> b10 = kVar.b();
            if (this.f11942c != null) {
                return b10.f11942c == null ? c((k) null) : c(b10);
            }
            if (b10.f11942c != null) {
                return b10;
            }
            boolean z10 = this.f11944e;
            return z10 == b10.f11944e ? c(b10) : z10 ? c((k) null) : b10;
        }

        public k<T> c(k<T> kVar) {
            if (kVar == this.f11941b) {
                return this;
            }
            return new k(this.f11940a, kVar, this.f11942c, this.f11943d, this.f11944e, this.f11945f);
        }

        public k<T> d(T t10) {
            if (t10 == this.f11940a) {
                return this;
            }
            return new k(t10, this.f11941b, this.f11942c, this.f11943d, this.f11944e, this.f11945f);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
            r0 = r0.e();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public q5.b0.k<T> e() {
            /*
                r2 = this;
                boolean r0 = r2.f11945f
                if (r0 == 0) goto L_0x000f
                q5.b0$k<T> r0 = r2.f11941b
                if (r0 != 0) goto L_0x000a
                r0 = 0
                goto L_0x000e
            L_0x000a:
                q5.b0$k r0 = r0.e()
            L_0x000e:
                return r0
            L_0x000f:
                q5.b0$k<T> r0 = r2.f11941b
                if (r0 == 0) goto L_0x0020
                q5.b0$k r0 = r0.e()
                q5.b0$k<T> r1 = r2.f11941b
                if (r0 == r1) goto L_0x0020
                q5.b0$k r0 = r2.c(r0)
                return r0
            L_0x0020:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: q5.b0.k.e():q5.b0$k");
        }

        public k<T> f() {
            return this.f11941b == null ? this : new k(this.f11940a, (k) null, this.f11942c, this.f11943d, this.f11944e, this.f11945f);
        }

        public k<T> g() {
            k<T> kVar = this.f11941b;
            k<T> g10 = kVar == null ? null : kVar.g();
            return this.f11944e ? c(g10) : g10;
        }

        public String toString() {
            String format = String.format("%s[visible=%b,ignore=%b,explicitName=%b]", new Object[]{this.f11940a.toString(), Boolean.valueOf(this.f11944e), Boolean.valueOf(this.f11945f), Boolean.valueOf(this.f11943d)});
            if (this.f11941b == null) {
                return format;
            }
            return format + ", " + this.f11941b.toString();
        }
    }

    public static class l<T extends h> implements Iterator<T> {
        public k<T> O;

        public l(k<T> kVar) {
            this.O = kVar;
        }

        /* renamed from: a */
        public T next() {
            k<T> kVar = this.O;
            if (kVar != null) {
                T t10 = (h) kVar.f11940a;
                this.O = kVar.f11941b;
                return t10;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return this.O != null;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public interface m<T> {
        T a(h hVar);
    }

    public b0(k5.i<?> iVar, i5.b bVar, boolean z10, y yVar) {
        this(iVar, bVar, z10, yVar, yVar);
    }

    public b0(k5.i<?> iVar, i5.b bVar, boolean z10, y yVar, y yVar2) {
        this.Q = iVar;
        this.R = bVar;
        this.T = yVar;
        this.S = yVar2;
        this.P = z10;
    }

    public b0(b0 b0Var, y yVar) {
        this.Q = b0Var.Q;
        this.R = b0Var.R;
        this.T = b0Var.T;
        this.S = yVar;
        this.U = b0Var.U;
        this.V = b0Var.V;
        this.W = b0Var.W;
        this.X = b0Var.X;
        this.P = b0Var.P;
    }

    public static <T> k<T> C0(k<T> kVar, k<T> kVar2) {
        return kVar == null ? kVar2 : kVar2 == null ? kVar : kVar.a(kVar2);
    }

    public Iterator<l> A() {
        k<l> kVar = this.V;
        return kVar == null ? a6.h.n() : new l(kVar);
    }

    public <T> T A0(m<T> mVar, T t10) {
        T a10;
        T a11;
        T a12;
        T a13;
        T a14;
        T a15;
        T a16;
        T a17;
        if (this.R == null) {
            return null;
        }
        if (this.P) {
            k<i> kVar = this.W;
            if (kVar != null && (a17 = mVar.a((h) kVar.f11940a)) != null && a17 != t10) {
                return a17;
            }
            k<f> kVar2 = this.U;
            if (kVar2 != null && (a16 = mVar.a((h) kVar2.f11940a)) != null && a16 != t10) {
                return a16;
            }
            k<l> kVar3 = this.V;
            if (kVar3 != null && (a15 = mVar.a((h) kVar3.f11940a)) != null && a15 != t10) {
                return a15;
            }
            k<i> kVar4 = this.X;
            if (kVar4 == null || (a14 = mVar.a((h) kVar4.f11940a)) == null || a14 == t10) {
                return null;
            }
            return a14;
        }
        k<l> kVar5 = this.V;
        if (kVar5 != null && (a13 = mVar.a((h) kVar5.f11940a)) != null && a13 != t10) {
            return a13;
        }
        k<i> kVar6 = this.X;
        if (kVar6 != null && (a12 = mVar.a((h) kVar6.f11940a)) != null && a12 != t10) {
            return a12;
        }
        k<f> kVar7 = this.U;
        if (kVar7 != null && (a11 = mVar.a((h) kVar7.f11940a)) != null && a11 != t10) {
            return a11;
        }
        k<i> kVar8 = this.W;
        if (kVar8 == null || (a10 = mVar.a((h) kVar8.f11940a)) == null || a10 == t10) {
            return null;
        }
        return a10;
    }

    public f B() {
        f fVar;
        k kVar = this.U;
        if (kVar == null) {
            return null;
        }
        f fVar2 = (f) kVar.f11940a;
        while (true) {
            kVar = kVar.f11941b;
            if (kVar != null) {
                fVar = (f) kVar.f11940a;
                Class<?> n10 = fVar2.n();
                Class<?> n11 = fVar.n();
                if (n10 != n11) {
                    if (!n10.isAssignableFrom(n11)) {
                        if (!n11.isAssignableFrom(n10)) {
                            break;
                        }
                    } else {
                        fVar2 = fVar;
                    }
                } else {
                    break;
                }
            } else {
                return fVar2;
            }
        }
        throw new IllegalArgumentException("Multiple fields representing property \"" + getName() + "\": " + fVar2.o() + " vs " + fVar.o());
    }

    public h B0() {
        k kVar;
        if (this.P) {
            kVar = this.W;
            if (kVar == null && (kVar = this.U) == null) {
                return null;
            }
        } else {
            kVar = this.V;
            if (kVar == null && (kVar = this.X) == null && (kVar = this.U) == null && (kVar = this.W) == null) {
                return null;
            }
        }
        return (h) kVar.f11940a;
    }

    public i C() {
        k<i> kVar = this.W;
        if (kVar == null) {
            return null;
        }
        k<T> kVar2 = kVar.f11941b;
        if (kVar2 != null) {
            while (kVar2 != null) {
                Class<?> n10 = ((i) kVar.f11940a).n();
                Class<?> n11 = ((i) kVar2.f11940a).n();
                if (n10 != n11) {
                    if (!n10.isAssignableFrom(n11)) {
                        if (n11.isAssignableFrom(n10)) {
                            continue;
                            kVar2 = kVar2.f11941b;
                        }
                    }
                    kVar = kVar2;
                    kVar2 = kVar2.f11941b;
                }
                int h02 = h0((i) kVar2.f11940a);
                int h03 = h0((i) kVar.f11940a);
                if (h02 != h03) {
                    if (h02 >= h03) {
                        kVar2 = kVar2.f11941b;
                    }
                    kVar = kVar2;
                    kVar2 = kVar2.f11941b;
                } else {
                    throw new IllegalArgumentException("Conflicting getter definitions for property \"" + getName() + "\": " + ((i) kVar.f11940a).o() + " vs " + ((i) kVar2.f11940a).o());
                }
            }
            this.W = kVar.f();
        }
        return (i) kVar.f11940a;
    }

    public String D() {
        return this.T.d();
    }

    public void D0(boolean z10) {
        p i02;
        if (z10) {
            k<i> kVar = this.W;
            if (kVar != null) {
                this.W = Y(this.W, i0(0, kVar, this.U, this.V, this.X));
                return;
            }
            k<f> kVar2 = this.U;
            if (kVar2 != null) {
                i02 = i0(0, kVar2, this.V, this.X);
            } else {
                return;
            }
        } else {
            k<l> kVar3 = this.V;
            if (kVar3 != null) {
                this.V = Y(this.V, i0(0, kVar3, this.X, this.U, this.W));
                return;
            }
            k<i> kVar4 = this.X;
            if (kVar4 != null) {
                this.X = Y(this.X, i0(0, kVar4, this.U, this.W));
                return;
            }
            k<f> kVar5 = this.U;
            if (kVar5 != null) {
                i02 = i0(0, kVar5, this.W);
            } else {
                return;
            }
        }
        this.U = Y(this.U, i02);
    }

    public void E0() {
        this.V = null;
    }

    public void F0() {
        this.U = k0(this.U);
        this.W = k0(this.W);
        this.X = k0(this.X);
        this.V = k0(this.V);
    }

    public h G() {
        if (this.P) {
            return y();
        }
        h E = E();
        return E == null ? y() : E;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0045, code lost:
        if (r4.P != false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004e, code lost:
        if (r4.P == false) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public v4.x.a G0(boolean r5) {
        /*
            r4 = this;
            v4.x$a r0 = r4.x0()
            if (r0 != 0) goto L_0x0008
            v4.x$a r0 = v4.x.a.AUTO
        L_0x0008:
            int[] r1 = q5.b0.a.f11930a
            int r2 = r0.ordinal()
            r1 = r1[r2]
            r2 = 1
            r3 = 0
            if (r1 == r2) goto L_0x0048
            r2 = 2
            if (r1 == r2) goto L_0x0052
            r2 = 3
            if (r1 == r2) goto L_0x0041
            q5.b0$k<q5.i> r1 = r4.W
            q5.b0$k r1 = r4.l0(r1)
            r4.W = r1
            q5.b0$k<q5.l> r1 = r4.V
            q5.b0$k r1 = r4.l0(r1)
            r4.V = r1
            if (r5 == 0) goto L_0x0030
            q5.b0$k<q5.i> r5 = r4.W
            if (r5 != 0) goto L_0x0052
        L_0x0030:
            q5.b0$k<q5.f> r5 = r4.U
            q5.b0$k r5 = r4.l0(r5)
            r4.U = r5
            q5.b0$k<q5.i> r5 = r4.X
            q5.b0$k r5 = r4.l0(r5)
            r4.X = r5
            goto L_0x0052
        L_0x0041:
            r4.W = r3
            boolean r5 = r4.P
            if (r5 == 0) goto L_0x0052
            goto L_0x0050
        L_0x0048:
            r4.X = r3
            r4.V = r3
            boolean r5 = r4.P
            if (r5 != 0) goto L_0x0052
        L_0x0050:
            r4.U = r3
        L_0x0052:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.b0.G0(boolean):v4.x$a");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = B();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i5.j H() {
        /*
            r2 = this;
            boolean r0 = r2.P
            if (r0 == 0) goto L_0x001a
            q5.i r0 = r2.C()
            if (r0 != 0) goto L_0x0015
            q5.f r0 = r2.B()
            if (r0 != 0) goto L_0x0015
            i5.j r0 = z5.n.l0()
            return r0
        L_0x0015:
            i5.j r0 = r0.h()
            return r0
        L_0x001a:
            q5.l r0 = r2.z()
            if (r0 != 0) goto L_0x0030
            q5.i r0 = r2.J()
            if (r0 == 0) goto L_0x002c
            r1 = 0
            i5.j r0 = r0.D(r1)
            return r0
        L_0x002c:
            q5.f r0 = r2.B()
        L_0x0030:
            if (r0 != 0) goto L_0x003d
            q5.i r0 = r2.C()
            if (r0 != 0) goto L_0x003d
            i5.j r0 = z5.n.l0()
            return r0
        L_0x003d:
            i5.j r0 = r0.h()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.b0.H():i5.j");
    }

    public void H0() {
        this.U = n0(this.U);
        this.W = n0(this.W);
        this.X = n0(this.X);
        this.V = n0(this.V);
    }

    public Class<?> I() {
        return H().g();
    }

    /* renamed from: I0 */
    public b0 S(y yVar) {
        return new b0(this, yVar);
    }

    public i J() {
        k<i> kVar = this.X;
        if (kVar == null) {
            return null;
        }
        k<T> kVar2 = kVar.f11941b;
        if (kVar2 != null) {
            while (kVar2 != null) {
                Class<?> n10 = ((i) kVar.f11940a).n();
                Class<?> n11 = ((i) kVar2.f11940a).n();
                if (n10 != n11) {
                    if (!n10.isAssignableFrom(n11)) {
                        if (n11.isAssignableFrom(n10)) {
                            continue;
                            kVar2 = kVar2.f11941b;
                        }
                    }
                    kVar = kVar2;
                    kVar2 = kVar2.f11941b;
                }
                i iVar = (i) kVar2.f11940a;
                i iVar2 = (i) kVar.f11940a;
                int m02 = m0(iVar);
                int m03 = m0(iVar2);
                if (m02 != m03) {
                    if (m02 >= m03) {
                        kVar2 = kVar2.f11941b;
                    }
                    kVar = kVar2;
                    kVar2 = kVar2.f11941b;
                } else {
                    i5.b bVar = this.R;
                    if (bVar != null) {
                        i K0 = bVar.K0(this.Q, iVar2, iVar);
                        if (K0 != iVar2) {
                            if (K0 != iVar) {
                            }
                            kVar = kVar2;
                            kVar2 = kVar2.f11941b;
                        } else {
                            continue;
                            kVar2 = kVar2.f11941b;
                        }
                    }
                    throw new IllegalArgumentException(String.format("Conflicting setter definitions for property \"%s\": %s vs %s", new Object[]{getName(), ((i) kVar.f11940a).o(), ((i) kVar2.f11940a).o()}));
                }
            }
            this.X = kVar.f();
        }
        return (i) kVar.f11940a;
    }

    /* renamed from: J0 */
    public b0 T(String str) {
        y m10 = this.S.m(str);
        return m10 == this.S ? this : new b0(this, m10);
    }

    public boolean K() {
        return this.V != null;
    }

    public boolean L() {
        return this.U != null;
    }

    public boolean M() {
        return this.W != null;
    }

    public boolean N(y yVar) {
        return this.S.equals(yVar);
    }

    public boolean O() {
        return this.X != null;
    }

    public boolean P() {
        return V(this.U) || V(this.W) || V(this.X) || U(this.V);
    }

    public boolean Q() {
        return U(this.U) || U(this.W) || U(this.X) || U(this.V);
    }

    public boolean R() {
        Boolean bool = (Boolean) z0(new d());
        return bool != null && bool.booleanValue();
    }

    public final <T> boolean U(k<T> kVar) {
        while (kVar != null) {
            if (kVar.f11942c != null && kVar.f11943d) {
                return true;
            }
            kVar = kVar.f11941b;
        }
        return false;
    }

    public final <T> boolean V(k<T> kVar) {
        while (kVar != null) {
            y yVar = kVar.f11942c;
            if (yVar != null && yVar.f()) {
                return true;
            }
            kVar = kVar.f11941b;
        }
        return false;
    }

    public final <T> boolean W(k<T> kVar) {
        while (kVar != null) {
            if (kVar.f11945f) {
                return true;
            }
            kVar = kVar.f11941b;
        }
        return false;
    }

    public final <T> boolean X(k<T> kVar) {
        while (kVar != null) {
            if (kVar.f11944e) {
                return true;
            }
            kVar = kVar.f11941b;
        }
        return false;
    }

    public final <T extends h> k<T> Y(k<T> kVar, p pVar) {
        h hVar = (h) ((h) kVar.f11940a).t(pVar);
        k<T> kVar2 = kVar.f11941b;
        if (kVar2 != null) {
            kVar = kVar.c(Y(kVar2, pVar));
        }
        return kVar.d(hVar);
    }

    public final void Z(Collection<y> collection, Map<y, b0> map, k<?> kVar) {
        for (k kVar2 = kVar; kVar2 != null; kVar2 = kVar2.f11941b) {
            y yVar = kVar2.f11942c;
            if (kVar2.f11943d && yVar != null) {
                b0 b0Var = map.get(yVar);
                if (b0Var == null) {
                    b0Var = new b0(this.Q, this.R, this.P, this.T, yVar);
                    map.put(yVar, b0Var);
                }
                if (kVar == this.U) {
                    b0Var.U = kVar2.c(b0Var.U);
                } else if (kVar == this.W) {
                    b0Var.W = kVar2.c(b0Var.W);
                } else if (kVar == this.X) {
                    b0Var.X = kVar2.c(b0Var.X);
                } else if (kVar == this.V) {
                    b0Var.V = kVar2.c(b0Var.V);
                } else {
                    throw new IllegalStateException("Internal error: mismatched accessors, property: " + this);
                }
            } else if (kVar2.f11944e) {
                throw new IllegalStateException("Conflicting/ambiguous property name definitions (implicit name '" + this.S + "'): found multiple explicit names: " + collection + ", but also implicit accessor: " + kVar2);
            }
        }
    }

    public y a() {
        return this.S;
    }

    public String a0() {
        return (String) z0(new h());
    }

    public String b0() {
        return (String) z0(new f());
    }

    public final Set<y> c0(k<? extends h> kVar, Set<y> set) {
        k<T> kVar2;
        while (kVar2 != null) {
            if (kVar2.f11943d && kVar2.f11942c != null) {
                if (set == null) {
                    set = new HashSet<>();
                }
                set.add(kVar2.f11942c);
            }
            k<T> kVar3 = kVar2.f11941b;
            kVar2 = kVar;
            kVar2 = kVar3;
        }
        return set;
    }

    public i5.x d() {
        i5.x xVar;
        if (this.Y == null) {
            Boolean e02 = e0();
            String b02 = b0();
            Integer d02 = d0();
            String a02 = a0();
            if (e02 == null && d02 == null && a02 == null) {
                xVar = i5.x.Y;
                if (b02 != null) {
                    xVar = xVar.o(b02);
                }
            } else {
                xVar = i5.x.a(e02, b02, d02, a02);
            }
            this.Y = xVar;
            if (!this.P) {
                this.Y = g0(this.Y);
            }
        }
        return this.Y;
    }

    public Integer d0() {
        return (Integer) z0(new g());
    }

    public Boolean e0() {
        return (Boolean) z0(new e());
    }

    public final <T extends h> p f0(k<T> kVar) {
        p m10 = ((h) kVar.f11940a).m();
        k<T> kVar2 = kVar.f11941b;
        return kVar2 != null ? p.h(m10, f0(kVar2)) : m10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ab A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i5.x g0(i5.x r8) {
        /*
            r7 = this;
            q5.h r0 = r7.B0()
            q5.h r1 = r7.y()
            r2 = 0
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L_0x0075
            i5.b r5 = r7.R
            if (r5 == 0) goto L_0x0039
            if (r1 == 0) goto L_0x0028
            java.lang.Boolean r5 = r5.E(r0)
            if (r5 == 0) goto L_0x0028
            boolean r4 = r5.booleanValue()
            if (r4 == 0) goto L_0x0027
            i5.x$a r4 = i5.x.a.b(r1)
            i5.x r8 = r8.q(r4)
        L_0x0027:
            r4 = r2
        L_0x0028:
            i5.b r5 = r7.R
            v4.c0$a r5 = r5.m0(r0)
            if (r5 == 0) goto L_0x0039
            v4.k0 r3 = r5.m()
            v4.k0 r5 = r5.l()
            goto L_0x003a
        L_0x0039:
            r5 = r3
        L_0x003a:
            if (r4 != 0) goto L_0x0040
            if (r3 == 0) goto L_0x0040
            if (r5 != 0) goto L_0x0076
        L_0x0040:
            java.lang.Class r0 = r7.j0(r0)
            k5.i<?> r6 = r7.Q
            k5.c r0 = r6.q(r0)
            v4.c0$a r6 = r0.h()
            if (r6 == 0) goto L_0x005c
            if (r3 != 0) goto L_0x0056
            v4.k0 r3 = r6.m()
        L_0x0056:
            if (r5 != 0) goto L_0x005c
            v4.k0 r5 = r6.l()
        L_0x005c:
            if (r4 == 0) goto L_0x0076
            if (r1 == 0) goto L_0x0076
            java.lang.Boolean r0 = r0.g()
            if (r0 == 0) goto L_0x0076
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0077
            i5.x$a r0 = i5.x.a.c(r1)
            i5.x r8 = r8.q(r0)
            goto L_0x0077
        L_0x0075:
            r5 = r3
        L_0x0076:
            r2 = r4
        L_0x0077:
            if (r2 != 0) goto L_0x007d
            if (r3 == 0) goto L_0x007d
            if (r5 != 0) goto L_0x00a9
        L_0x007d:
            k5.i<?> r0 = r7.Q
            v4.c0$a r0 = r0.C()
            if (r3 != 0) goto L_0x0089
            v4.k0 r3 = r0.m()
        L_0x0089:
            if (r5 != 0) goto L_0x008f
            v4.k0 r5 = r0.l()
        L_0x008f:
            if (r2 == 0) goto L_0x00a9
            k5.i<?> r0 = r7.Q
            java.lang.Boolean r0 = r0.u()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00a9
            if (r1 == 0) goto L_0x00a9
            i5.x$a r0 = i5.x.a.a(r1)
            i5.x r8 = r8.q(r0)
        L_0x00a9:
            if (r3 != 0) goto L_0x00ad
            if (r5 == 0) goto L_0x00b1
        L_0x00ad:
            i5.x r8 = r8.r(r3, r5)
        L_0x00b1:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.b0.g0(i5.x):i5.x");
    }

    public String getName() {
        y yVar = this.S;
        if (yVar == null) {
            return null;
        }
        return yVar.d();
    }

    public int h0(i iVar) {
        String f10 = iVar.f();
        if (!f10.startsWith("get") || f10.length() <= 3) {
            return (!f10.startsWith("is") || f10.length() <= 2) ? 3 : 2;
        }
        return 1;
    }

    public final p i0(int i10, k<? extends h>... kVarArr) {
        p f02 = f0(kVarArr[i10]);
        do {
            i10++;
            if (i10 >= kVarArr.length) {
                return f02;
            }
        } while (kVarArr[i10] == null);
        return p.h(f02, i0(i10, kVarArr));
    }

    public Class<?> j0(h hVar) {
        i5.j h10;
        if (hVar instanceof i) {
            i iVar = (i) hVar;
            if (iVar.C() > 0) {
                h10 = iVar.D(0);
                return h10.g();
            }
        }
        h10 = hVar.h();
        return h10.g();
    }

    public final <T> k<T> k0(k<T> kVar) {
        return kVar == null ? kVar : kVar.e();
    }

    public final <T> k<T> l0(k<T> kVar) {
        return kVar == null ? kVar : kVar.g();
    }

    public int m0(i iVar) {
        String f10 = iVar.f();
        return (!f10.startsWith("set") || f10.length() <= 3) ? 2 : 1;
    }

    public final <T> k<T> n0(k<T> kVar) {
        return kVar == null ? kVar : kVar.b();
    }

    public y o() {
        i5.b bVar;
        h G = G();
        if (G == null || (bVar = this.R) == null) {
            return null;
        }
        return bVar.t0(G);
    }

    public void o0(b0 b0Var) {
        this.U = C0(this.U, b0Var.U);
        this.V = C0(this.V, b0Var.V);
        this.W = C0(this.W, b0Var.W);
        this.X = C0(this.X, b0Var.X);
    }

    public void p0(l lVar, y yVar, boolean z10, boolean z11, boolean z12) {
        this.V = new k(lVar, this.V, yVar, z10, z11, z12);
    }

    public void q0(f fVar, y yVar, boolean z10, boolean z11, boolean z12) {
        this.U = new k(fVar, this.U, yVar, z10, z11, z12);
    }

    public boolean r() {
        return (this.V == null && this.X == null && this.U == null) ? false : true;
    }

    public void r0(i iVar, y yVar, boolean z10, boolean z11, boolean z12) {
        this.W = new k(iVar, this.W, yVar, z10, z11, z12);
    }

    public boolean s() {
        return (this.W == null && this.U == null) ? false : true;
    }

    public void s0(i iVar, y yVar, boolean z10, boolean z11, boolean z12) {
        this.X = new k(iVar, this.X, yVar, z10, z11, z12);
    }

    public u.b t() {
        h y10 = y();
        i5.b bVar = this.R;
        u.b V2 = bVar == null ? null : bVar.V(y10);
        return V2 == null ? u.b.d() : V2;
    }

    public boolean t0() {
        return W(this.U) || W(this.W) || W(this.X) || W(this.V);
    }

    public String toString() {
        return "[Property '" + this.S + "'; ctors: " + this.V + ", field(s): " + this.U + ", getter(s): " + this.W + ", setter(s): " + this.X + "]";
    }

    public z u() {
        return (z) z0(new i());
    }

    public boolean u0() {
        return X(this.U) || X(this.W) || X(this.X) || X(this.V);
    }

    /* renamed from: v0 */
    public int compareTo(b0 b0Var) {
        if (this.V != null) {
            if (b0Var.V == null) {
                return -1;
            }
        } else if (b0Var.V != null) {
            return 1;
        }
        return getName().compareTo(b0Var.getName());
    }

    public b.a w() {
        b.a aVar = this.Z;
        if (aVar == null) {
            b.a aVar2 = (b.a) z0(new c());
            this.Z = aVar2 == null ? f11929a0 : aVar2;
            return aVar2;
        } else if (aVar == f11929a0) {
            return null;
        } else {
            return aVar;
        }
    }

    public Collection<b0> w0(Collection<y> collection) {
        HashMap hashMap = new HashMap();
        Z(collection, hashMap, this.U);
        Z(collection, hashMap, this.W);
        Z(collection, hashMap, this.X);
        Z(collection, hashMap, this.V);
        return hashMap.values();
    }

    public Class<?>[] x() {
        return (Class[]) z0(new b());
    }

    public x.a x0() {
        return (x.a) A0(new j(), x.a.AUTO);
    }

    public Set<y> y0() {
        Set<y> c02 = c0(this.V, c0(this.X, c0(this.W, c0(this.U, (Set<y>) null))));
        return c02 == null ? Collections.emptySet() : c02;
    }

    public l z() {
        k kVar = this.V;
        if (kVar == null) {
            return null;
        }
        while (true) {
            if (((l) kVar.f11940a).v() instanceof d) {
                break;
            }
            kVar = kVar.f11941b;
            if (kVar == null) {
                kVar = this.V;
                break;
            }
        }
        return (l) kVar.f11940a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        if (r0 != null) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        r0 = r2.U;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        if (r0 != null) goto L_0x000d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T z0(q5.b0.m<T> r3) {
        /*
            r2 = this;
            i5.b r0 = r2.R
            r1 = 0
            if (r0 == 0) goto L_0x0037
            boolean r0 = r2.P
            if (r0 == 0) goto L_0x0016
            q5.b0$k<q5.i> r0 = r2.W
            if (r0 == 0) goto L_0x0029
        L_0x000d:
            T r0 = r0.f11940a
            q5.h r0 = (q5.h) r0
            java.lang.Object r1 = r3.a(r0)
            goto L_0x0029
        L_0x0016:
            q5.b0$k<q5.l> r0 = r2.V
            if (r0 == 0) goto L_0x0022
            T r0 = r0.f11940a
            q5.h r0 = (q5.h) r0
            java.lang.Object r1 = r3.a(r0)
        L_0x0022:
            if (r1 != 0) goto L_0x0029
            q5.b0$k<q5.i> r0 = r2.X
            if (r0 == 0) goto L_0x0029
            goto L_0x000d
        L_0x0029:
            if (r1 != 0) goto L_0x0037
            q5.b0$k<q5.f> r0 = r2.U
            if (r0 == 0) goto L_0x0037
            T r0 = r0.f11940a
            q5.h r0 = (q5.h) r0
            java.lang.Object r1 = r3.a(r0)
        L_0x0037:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.b0.z0(q5.b0$m):java.lang.Object");
    }
}
