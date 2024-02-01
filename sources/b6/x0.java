package b6;

import android.util.Pair;
import c7.a;
import d.o0;

public abstract class x0 {

    /* renamed from: a  reason: collision with root package name */
    public static final x0 f4491a = new a();

    public static class a extends x0 {
        public int b(Object obj) {
            return -1;
        }

        public b g(int i10, b bVar, boolean z10) {
            throw new IndexOutOfBoundsException();
        }

        public int i() {
            return 0;
        }

        public Object m(int i10) {
            throw new IndexOutOfBoundsException();
        }

        public c p(int i10, c cVar, boolean z10, long j10) {
            throw new IndexOutOfBoundsException();
        }

        public int q() {
            return 0;
        }
    }

    public static final class b {
        @o0

        /* renamed from: a  reason: collision with root package name */
        public Object f4492a;
        @o0

        /* renamed from: b  reason: collision with root package name */
        public Object f4493b;

        /* renamed from: c  reason: collision with root package name */
        public int f4494c;

        /* renamed from: d  reason: collision with root package name */
        public long f4495d;

        /* renamed from: e  reason: collision with root package name */
        public long f4496e;

        /* renamed from: f  reason: collision with root package name */
        public c7.a f4497f = c7.a.f4894k;

        public int a(int i10) {
            return this.f4497f.f4897c[i10].f4900a;
        }

        public long b(int i10, int i11) {
            a.C0078a aVar = this.f4497f.f4897c[i10];
            return aVar.f4900a != -1 ? aVar.f4903d[i11] : c.f4201b;
        }

        public int c() {
            return this.f4497f.f4895a;
        }

        public int d(long j10) {
            return this.f4497f.a(j10, this.f4495d);
        }

        public int e(long j10) {
            return this.f4497f.b(j10);
        }

        public long f(int i10) {
            return this.f4497f.f4896b[i10];
        }

        public long g() {
            return this.f4497f.f4898d;
        }

        public long h() {
            return c.c(this.f4495d);
        }

        public long i() {
            return this.f4495d;
        }

        public int j(int i10) {
            return this.f4497f.f4897c[i10].c();
        }

        public int k(int i10, int i11) {
            return this.f4497f.f4897c[i10].d(i11);
        }

        public long l() {
            return c.c(this.f4496e);
        }

        public long m() {
            return this.f4496e;
        }

        public boolean n(int i10) {
            return !this.f4497f.f4897c[i10].e();
        }

        public boolean o(int i10, int i11) {
            a.C0078a aVar = this.f4497f.f4897c[i10];
            return (aVar.f4900a == -1 || aVar.f4902c[i11] == 0) ? false : true;
        }

        public b p(@o0 Object obj, @o0 Object obj2, int i10, long j10, long j11) {
            return q(obj, obj2, i10, j10, j11, c7.a.f4894k);
        }

        public b q(@o0 Object obj, @o0 Object obj2, int i10, long j10, long j11, c7.a aVar) {
            this.f4492a = obj;
            this.f4493b = obj2;
            this.f4494c = i10;
            this.f4495d = j10;
            this.f4496e = j11;
            this.f4497f = aVar;
            return this;
        }
    }

    public static final class c {
        @o0

        /* renamed from: a  reason: collision with root package name */
        public Object f4498a;

        /* renamed from: b  reason: collision with root package name */
        public long f4499b;

        /* renamed from: c  reason: collision with root package name */
        public long f4500c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f4501d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f4502e;

        /* renamed from: f  reason: collision with root package name */
        public int f4503f;

        /* renamed from: g  reason: collision with root package name */
        public int f4504g;

        /* renamed from: h  reason: collision with root package name */
        public long f4505h;

        /* renamed from: i  reason: collision with root package name */
        public long f4506i;

        /* renamed from: j  reason: collision with root package name */
        public long f4507j;

        public long a() {
            return c.c(this.f4505h);
        }

        public long b() {
            return this.f4505h;
        }

        public long c() {
            return c.c(this.f4506i);
        }

        public long d() {
            return this.f4506i;
        }

        public long e() {
            return c.c(this.f4507j);
        }

        public long f() {
            return this.f4507j;
        }

        public c g(@o0 Object obj, long j10, long j11, boolean z10, boolean z11, long j12, long j13, int i10, int i11, long j14) {
            this.f4498a = obj;
            this.f4499b = j10;
            this.f4500c = j11;
            this.f4501d = z10;
            this.f4502e = z11;
            this.f4505h = j12;
            this.f4506i = j13;
            this.f4503f = i10;
            this.f4504g = i11;
            this.f4507j = j14;
            return this;
        }
    }

    public int a(boolean z10) {
        return r() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z10) {
        if (r()) {
            return -1;
        }
        return q() - 1;
    }

    public final int d(int i10, b bVar, c cVar, int i11, boolean z10) {
        int i12 = f(i10, bVar).f4494c;
        if (n(i12, cVar).f4504g != i10) {
            return i10 + 1;
        }
        int e10 = e(i12, i11, z10);
        if (e10 == -1) {
            return -1;
        }
        return n(e10, cVar).f4503f;
    }

    public int e(int i10, int i11, boolean z10) {
        if (i11 != 0) {
            if (i11 == 1) {
                return i10;
            }
            if (i11 == 2) {
                return i10 == c(z10) ? a(z10) : i10 + 1;
            }
            throw new IllegalStateException();
        } else if (i10 == c(z10)) {
            return -1;
        } else {
            return i10 + 1;
        }
    }

    public final b f(int i10, b bVar) {
        return g(i10, bVar, false);
    }

    public abstract b g(int i10, b bVar, boolean z10);

    public b h(Object obj, b bVar) {
        return g(b(obj), bVar, true);
    }

    public abstract int i();

    public final Pair<Object, Long> j(c cVar, b bVar, int i10, long j10) {
        return (Pair) w7.a.g(k(cVar, bVar, i10, j10, 0));
    }

    @o0
    public final Pair<Object, Long> k(c cVar, b bVar, int i10, long j10, long j11) {
        w7.a.c(i10, 0, q());
        p(i10, cVar, false, j11);
        if (j10 == c.f4201b) {
            j10 = cVar.b();
            if (j10 == c.f4201b) {
                return null;
            }
        }
        int i11 = cVar.f4503f;
        long f10 = cVar.f() + j10;
        while (true) {
            long i12 = g(i11, bVar, true).i();
            if (i12 != c.f4201b && f10 >= i12 && i11 < cVar.f4504g) {
                f10 -= i12;
                i11++;
            }
        }
        return Pair.create(w7.a.g(bVar.f4493b), Long.valueOf(f10));
    }

    public int l(int i10, int i11, boolean z10) {
        if (i11 != 0) {
            if (i11 == 1) {
                return i10;
            }
            if (i11 == 2) {
                return i10 == a(z10) ? c(z10) : i10 - 1;
            }
            throw new IllegalStateException();
        } else if (i10 == a(z10)) {
            return -1;
        } else {
            return i10 - 1;
        }
    }

    public abstract Object m(int i10);

    public final c n(int i10, c cVar) {
        return o(i10, cVar, false);
    }

    public final c o(int i10, c cVar, boolean z10) {
        return p(i10, cVar, z10, 0);
    }

    public abstract c p(int i10, c cVar, boolean z10, long j10);

    public abstract int q();

    public final boolean r() {
        return q() == 0;
    }

    public final boolean s(int i10, b bVar, c cVar, int i11, boolean z10) {
        return d(i10, bVar, cVar, i11, z10) == -1;
    }
}
