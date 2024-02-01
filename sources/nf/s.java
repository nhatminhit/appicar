package nf;

import fh.g;
import nf.d;
import ve.f;
import xe.l0;
import zd.h1;
import zd.i2;

@h1(version = "1.3")
@l
public interface s {
    @g

    /* renamed from: a  reason: collision with root package name */
    public static final a f21255a = a.f21256a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f21256a = new a();
    }

    public static final class b implements c {
        @g

        /* renamed from: b  reason: collision with root package name */
        public static final b f21257b = new b();

        @f
        @h1(version = "1.7")
        @l
        public static final class a implements d {
            public final long O;

            public /* synthetic */ a(long j10) {
                this.O = j10;
            }

            public static final /* synthetic */ a e(long j10) {
                return new a(j10);
            }

            public static final int i(long j10, long j11) {
                return e.l(r(j10, j11), e.P.W());
            }

            public static int j(long j10, @g d dVar) {
                l0.p(dVar, "other");
                return e(j10).compareTo(dVar);
            }

            public static long k(long j10) {
                return j10;
            }

            public static long l(long j10) {
                return p.f21252b.d(j10);
            }

            public static boolean m(long j10, Object obj) {
                return (obj instanceof a) && j10 == ((a) obj).y();
            }

            public static final boolean n(long j10, long j11) {
                return j10 == j11;
            }

            public static boolean o(long j10) {
                return e.e0(l(j10));
            }

            public static boolean p(long j10) {
                return !e.e0(l(j10));
            }

            public static int q(long j10) {
                return i2.a(j10);
            }

            public static final long r(long j10, long j11) {
                return p.f21252b.c(j10, j11);
            }

            public static long t(long j10, long j11) {
                return p.f21252b.b(j10, e.x0(j11));
            }

            public static long u(long j10, @g d dVar) {
                l0.p(dVar, "other");
                if (dVar instanceof a) {
                    return r(j10, ((a) dVar).y());
                }
                throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + x(j10) + " and " + dVar);
            }

            public static long w(long j10, long j11) {
                return p.f21252b.b(j10, j11);
            }

            public static String x(long j10) {
                return "ValueTimeMark(reading=" + j10 + ')';
            }

            public boolean a() {
                return p(this.O);
            }

            public long b() {
                return l(this.O);
            }

            public boolean d() {
                return o(this.O);
            }

            public boolean equals(Object obj) {
                return m(this.O, obj);
            }

            public long g(@g d dVar) {
                l0.p(dVar, "other");
                return u(this.O, dVar);
            }

            /* renamed from: h */
            public int compareTo(@g d dVar) {
                return d.a.a(this, dVar);
            }

            public int hashCode() {
                return q(this.O);
            }

            public long s(long j10) {
                return t(this.O, j10);
            }

            public String toString() {
                return x(this.O);
            }

            public long v(long j10) {
                return w(this.O, j10);
            }

            public final /* synthetic */ long y() {
                return this.O;
            }
        }

        public long b() {
            return p.f21252b.e();
        }

        @g
        public String toString() {
            return p.f21252b.toString();
        }
    }

    @h1(version = "1.8")
    @l
    public interface c extends s {
        @g
        d a();
    }

    @g
    r a();
}
