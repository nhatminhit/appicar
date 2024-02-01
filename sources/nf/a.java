package nf;

import fh.g;
import fh.h;
import nf.d;
import nf.s;
import xe.l0;
import xe.w;
import zd.h1;
import zd.k;

@h1(version = "1.3")
@l
@k(message = "Using AbstractDoubleTimeSource is no longer recommended, use AbstractLongTimeSource instead.")
public abstract class a implements s.c {
    @g

    /* renamed from: b  reason: collision with root package name */
    public final h f21242b;

    /* renamed from: nf.a$a  reason: collision with other inner class name */
    public static final class C0372a implements d {
        public final double O;
        @g
        public final a P;
        public final long Q;

        public C0372a(double d10, a aVar, long j10) {
            this.O = d10;
            this.P = aVar;
            this.Q = j10;
        }

        public /* synthetic */ C0372a(double d10, a aVar, long j10, w wVar) {
            this(d10, aVar, j10);
        }

        public boolean a() {
            return d.a.c(this);
        }

        public long b() {
            return e.g0(g.l0(this.P.c() - this.O, this.P.b()), this.Q);
        }

        @g
        public d c(long j10) {
            return d.a.d(this, j10);
        }

        public boolean d() {
            return d.a.b(this);
        }

        public boolean equals(@h Object obj) {
            return (obj instanceof C0372a) && l0.g(this.P, ((C0372a) obj).P) && e.r(g((d) obj), e.P.W());
        }

        @g
        public d f(long j10) {
            return new C0372a(this.O, this.P, e.h0(this.Q, j10), (w) null);
        }

        public long g(@g d dVar) {
            l0.p(dVar, "other");
            if (dVar instanceof C0372a) {
                C0372a aVar = (C0372a) dVar;
                if (l0.g(this.P, aVar.P)) {
                    if (e.r(this.Q, aVar.Q) && e.d0(this.Q)) {
                        return e.P.W();
                    }
                    long g02 = e.g0(this.Q, aVar.Q);
                    long l02 = g.l0(this.O - aVar.O, this.P.b());
                    return e.r(l02, e.x0(g02)) ? e.P.W() : e.h0(l02, g02);
                }
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + dVar);
        }

        /* renamed from: h */
        public int compareTo(@g d dVar) {
            return d.a.a(this, dVar);
        }

        public int hashCode() {
            return e.Z(e.h0(g.l0(this.O, this.P.b()), this.Q));
        }

        @g
        public String toString() {
            return "DoubleTimeMark(" + this.O + k.h(this.P.b()) + " + " + e.u0(this.Q) + ", " + this.P + ')';
        }
    }

    public a(@g h hVar) {
        l0.p(hVar, "unit");
        this.f21242b = hVar;
    }

    @g
    public d a() {
        return new C0372a(c(), this, e.P.W(), (w) null);
    }

    @g
    public final h b() {
        return this.f21242b;
    }

    public abstract double c();
}
