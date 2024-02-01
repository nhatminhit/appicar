package nf;

import fh.g;
import fh.h;
import nf.d;
import nf.e;
import nf.s;
import xe.l0;
import xe.w;
import zd.h1;

@h1(version = "1.3")
@l
public abstract class b implements s.c {
    @g

    /* renamed from: b  reason: collision with root package name */
    public final h f21243b;

    public static final class a implements d {
        public final long O;
        @g
        public final b P;
        public final long Q;

        public a(long j10, b bVar, long j11) {
            this.O = j10;
            this.P = bVar;
            this.Q = j11;
        }

        public /* synthetic */ a(long j10, b bVar, long j11, w wVar) {
            this(j10, bVar, j11);
        }

        public boolean a() {
            return d.a.c(this);
        }

        public long b() {
            return e.d0(this.Q) ? e.x0(this.Q) : e.g0(g.n0(this.P.c() - this.O, this.P.b()), this.Q);
        }

        @g
        public d c(long j10) {
            return d.a.d(this, j10);
        }

        public boolean d() {
            return d.a.b(this);
        }

        public final long e() {
            long h02;
            long n02;
            if (e.d0(this.Q)) {
                return this.Q;
            }
            h b10 = this.P.b();
            h hVar = h.MILLISECONDS;
            if (b10.compareTo(hVar) >= 0) {
                h02 = g.n0(this.O, b10);
                n02 = this.Q;
            } else {
                long b11 = j.b(1, hVar, b10);
                long j10 = this.O;
                long j11 = j10 / b11;
                long j12 = j10 % b11;
                long j13 = this.Q;
                long P2 = e.P(j13);
                int T = e.T(j13);
                long n03 = g.n0(j12, b10);
                e.a aVar = e.P;
                h02 = e.h0(e.h0(n03, g.m0(T % 1000000, h.NANOSECONDS)), g.n0(j11 + ((long) (T / 1000000)), hVar));
                n02 = g.n0(P2, h.SECONDS);
            }
            return e.h0(h02, n02);
        }

        public boolean equals(@h Object obj) {
            return (obj instanceof a) && l0.g(this.P, ((a) obj).P) && e.r(g((d) obj), e.P.W());
        }

        @g
        public d f(long j10) {
            return new a(this.O, this.P, e.h0(this.Q, j10), (w) null);
        }

        public long g(@g d dVar) {
            l0.p(dVar, "other");
            if (dVar instanceof a) {
                a aVar = (a) dVar;
                if (l0.g(this.P, aVar.P)) {
                    if (e.r(this.Q, aVar.Q) && e.d0(this.Q)) {
                        return e.P.W();
                    }
                    long g02 = e.g0(this.Q, aVar.Q);
                    long n02 = g.n0(this.O - aVar.O, this.P.b());
                    return e.r(n02, e.x0(g02)) ? e.P.W() : e.h0(n02, g02);
                }
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + dVar);
        }

        /* renamed from: h */
        public int compareTo(@g d dVar) {
            return d.a.a(this, dVar);
        }

        public int hashCode() {
            return e.Z(e());
        }

        @g
        public String toString() {
            return "LongTimeMark(" + this.O + k.h(this.P.b()) + " + " + e.u0(this.Q) + " (=" + e.u0(e()) + "), " + this.P + ')';
        }
    }

    public b(@g h hVar) {
        l0.p(hVar, "unit");
        this.f21243b = hVar;
    }

    @g
    public d a() {
        return new a(c(), this, e.P.W(), (w) null);
    }

    @g
    public final h b() {
        return this.f21243b;
    }

    public abstract long c();
}
