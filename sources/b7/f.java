package b7;

import b6.c;
import b6.x0;
import b7.y;
import d.o0;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import t7.r0;
import x0.e;

public final class f extends h<Void> {
    public final y W;
    public final long X;
    public final long Y;
    public final boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    public final boolean f4511a0;

    /* renamed from: b0  reason: collision with root package name */
    public final boolean f4512b0;

    /* renamed from: c0  reason: collision with root package name */
    public final ArrayList<e> f4513c0;

    /* renamed from: d0  reason: collision with root package name */
    public final x0.c f4514d0;
    @o0

    /* renamed from: e0  reason: collision with root package name */
    public Object f4515e0;

    /* renamed from: f0  reason: collision with root package name */
    public a f4516f0;

    /* renamed from: g0  reason: collision with root package name */
    public b f4517g0;

    /* renamed from: h0  reason: collision with root package name */
    public long f4518h0;

    /* renamed from: i0  reason: collision with root package name */
    public long f4519i0;

    public static final class a extends s {

        /* renamed from: c  reason: collision with root package name */
        public final long f4520c;

        /* renamed from: d  reason: collision with root package name */
        public final long f4521d;

        /* renamed from: e  reason: collision with root package name */
        public final long f4522e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f4523f;

        public a(x0 x0Var, long j10, long j11) throws b {
            super(x0Var);
            boolean z10 = false;
            if (x0Var.i() == 1) {
                x0.c n10 = x0Var.n(0, new x0.c());
                long max = Math.max(0, j10);
                long max2 = j11 == Long.MIN_VALUE ? n10.f4506i : Math.max(0, j11);
                long j12 = n10.f4506i;
                if (j12 != c.f4201b) {
                    max2 = max2 > j12 ? j12 : max2;
                    if (max != 0 && !n10.f4501d) {
                        throw new b(1);
                    } else if (max > max2) {
                        throw new b(2);
                    }
                }
                this.f4520c = max;
                this.f4521d = max2;
                int i10 = (max2 > c.f4201b ? 1 : (max2 == c.f4201b ? 0 : -1));
                this.f4522e = i10 == 0 ? -9223372036854775807L : max2 - max;
                if (n10.f4502e && (i10 == 0 || (j12 != c.f4201b && max2 == j12))) {
                    z10 = true;
                }
                this.f4523f = z10;
                return;
            }
            throw new b(0);
        }

        public x0.b g(int i10, x0.b bVar, boolean z10) {
            this.f4694b.g(0, bVar, z10);
            long m10 = bVar.m() - this.f4520c;
            long j10 = this.f4522e;
            return bVar.p(bVar.f4492a, bVar.f4493b, 0, j10 == c.f4201b ? -9223372036854775807L : j10 - m10, m10);
        }

        public x0.c p(int i10, x0.c cVar, boolean z10, long j10) {
            this.f4694b.p(0, cVar, z10, 0);
            long j11 = cVar.f4507j;
            long j12 = this.f4520c;
            cVar.f4507j = j11 + j12;
            cVar.f4506i = this.f4522e;
            cVar.f4502e = this.f4523f;
            long j13 = cVar.f4505h;
            if (j13 != c.f4201b) {
                long max = Math.max(j13, j12);
                cVar.f4505h = max;
                long j14 = this.f4521d;
                if (j14 != c.f4201b) {
                    max = Math.min(max, j14);
                }
                cVar.f4505h = max - this.f4520c;
            }
            long c10 = c.c(this.f4520c);
            long j15 = cVar.f4499b;
            if (j15 != c.f4201b) {
                cVar.f4499b = j15 + c10;
            }
            long j16 = cVar.f4500c;
            if (j16 != c.f4201b) {
                cVar.f4500c = j16 + c10;
            }
            return cVar;
        }
    }

    public static final class b extends IOException {
        public static final int P = 0;
        public static final int Q = 1;
        public static final int R = 2;
        public final int O;

        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        public b(int i10) {
            super("Illegal clipping: " + a(i10));
            this.O = i10;
        }

        public static String a(int i10) {
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? e.f15004b : "start exceeds end" : "not seekable to start" : "invalid period count";
        }
    }

    public f(y yVar, long j10) {
        this(yVar, 0, j10, true, false, true);
    }

    public f(y yVar, long j10, long j11) {
        this(yVar, j10, j11, true, false, false);
    }

    public f(y yVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
        w7.a.a(j10 >= 0);
        this.W = (y) w7.a.g(yVar);
        this.X = j10;
        this.Y = j11;
        this.Z = z10;
        this.f4511a0 = z11;
        this.f4512b0 = z12;
        this.f4513c0 = new ArrayList<>();
        this.f4514d0 = new x0.c();
    }

    /* renamed from: A */
    public void w(Void voidR, y yVar, x0 x0Var, @o0 Object obj) {
        if (this.f4517g0 == null) {
            this.f4515e0 = obj;
            B(x0Var);
        }
    }

    public final void B(x0 x0Var) {
        long j10;
        x0Var.n(0, this.f4514d0);
        long f10 = this.f4514d0.f();
        long j11 = Long.MIN_VALUE;
        if (this.f4516f0 == null || this.f4513c0.isEmpty() || this.f4511a0) {
            long j12 = this.X;
            long j13 = this.Y;
            if (this.f4512b0) {
                long b10 = this.f4514d0.b();
                j12 += b10;
                j13 += b10;
            }
            this.f4518h0 = f10 + j12;
            if (this.Y != Long.MIN_VALUE) {
                j11 = f10 + j13;
            }
            this.f4519i0 = j11;
            int size = this.f4513c0.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f4513c0.get(i10).v(this.f4518h0, this.f4519i0);
            }
            j10 = j12;
            j11 = j13;
        } else {
            long j14 = this.f4518h0 - f10;
            if (this.Y != Long.MIN_VALUE) {
                j11 = this.f4519i0 - f10;
            }
            j10 = j14;
        }
        try {
            a aVar = new a(x0Var, j10, j11);
            this.f4516f0 = aVar;
            p(aVar, this.f4515e0);
        } catch (b e10) {
            this.f4517g0 = e10;
        }
    }

    public w c(y.a aVar, t7.b bVar, long j10) {
        e eVar = new e(this.W.c(aVar, bVar, j10), this.Z, this.f4518h0, this.f4519i0);
        this.f4513c0.add(eVar);
        return eVar;
    }

    @o0
    public Object g() {
        return this.W.g();
    }

    public void h() throws IOException {
        b bVar = this.f4517g0;
        if (bVar == null) {
            super.h();
            return;
        }
        throw bVar;
    }

    public void i(w wVar) {
        w7.a.i(this.f4513c0.remove(wVar));
        this.W.i(((e) wVar).O);
        if (this.f4513c0.isEmpty() && !this.f4511a0) {
            B(this.f4516f0.f4694b);
        }
    }

    public void o(@o0 r0 r0Var) {
        super.o(r0Var);
        x(null, this.W);
    }

    public void q() {
        super.q();
        this.f4517g0 = null;
        this.f4516f0 = null;
    }

    /* renamed from: z */
    public long t(Void voidR, long j10) {
        if (j10 == c.f4201b) {
            return c.f4201b;
        }
        long c10 = c.c(this.X);
        long max = Math.max(0, j10 - c10);
        long j11 = this.Y;
        return j11 != Long.MIN_VALUE ? Math.min(c.c(j11) - c10, max) : max;
    }
}
