package nf;

import cf.d;
import com.google.android.material.slider.c;
import fh.g;
import fh.h;
import gf.p;
import gf.v;
import lf.c0;
import pf.x1;
import ve.f;
import we.q;
import we.r;
import we.s;
import xe.l0;
import xe.w;
import zd.a1;
import zd.b1;
import zd.h1;
import zd.i2;
import zd.k;
import zd.l;
import zd.y2;

@f
@h1(version = "1.6")
@y2(markerClass = {l.class})
public final class e implements Comparable<e> {
    @g
    public static final a P = new a((w) null);
    public static final long Q = m(0);
    public static final long R = g.j(4611686018427387903L);
    public static final long S = g.j(-4611686018427387903L);
    public final long O;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }

        @oe.f
        public static /* synthetic */ void A(double d10) {
        }

        @oe.f
        public static /* synthetic */ void B(int i10) {
        }

        @oe.f
        public static /* synthetic */ void C(long j10) {
        }

        @oe.f
        public static /* synthetic */ void G(double d10) {
        }

        @oe.f
        public static /* synthetic */ void H(int i10) {
        }

        @oe.f
        public static /* synthetic */ void I(long j10) {
        }

        @oe.f
        public static /* synthetic */ void N(double d10) {
        }

        @oe.f
        public static /* synthetic */ void O(int i10) {
        }

        @oe.f
        public static /* synthetic */ void P(long j10) {
        }

        @oe.f
        public static /* synthetic */ void T(double d10) {
        }

        @oe.f
        public static /* synthetic */ void U(int i10) {
        }

        @oe.f
        public static /* synthetic */ void V(long j10) {
        }

        @oe.f
        public static /* synthetic */ void h(double d10) {
        }

        @oe.f
        public static /* synthetic */ void i(int i10) {
        }

        @oe.f
        public static /* synthetic */ void j(long j10) {
        }

        @oe.f
        public static /* synthetic */ void n(double d10) {
        }

        @oe.f
        public static /* synthetic */ void o(int i10) {
        }

        @oe.f
        public static /* synthetic */ void p(long j10) {
        }

        @oe.f
        public static /* synthetic */ void u(double d10) {
        }

        @oe.f
        public static /* synthetic */ void v(int i10) {
        }

        @oe.f
        public static /* synthetic */ void w(long j10) {
        }

        public final long D(double d10) {
            return g.l0(d10, h.MINUTES);
        }

        public final long E(int i10) {
            return g.m0(i10, h.MINUTES);
        }

        public final long F(long j10) {
            return g.n0(j10, h.MINUTES);
        }

        public final long J() {
            return e.S;
        }

        public final long K(double d10) {
            return g.l0(d10, h.NANOSECONDS);
        }

        public final long L(int i10) {
            return g.m0(i10, h.NANOSECONDS);
        }

        public final long M(long j10) {
            return g.n0(j10, h.NANOSECONDS);
        }

        public final long Q(double d10) {
            return g.l0(d10, h.SECONDS);
        }

        public final long R(int i10) {
            return g.m0(i10, h.SECONDS);
        }

        public final long S(long j10) {
            return g.n0(j10, h.SECONDS);
        }

        public final long W() {
            return e.Q;
        }

        @h1(version = "1.5")
        @l(errorSince = "1.8", warningSince = "1.6")
        @l
        @k(message = "Use 'Double.hours' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        public final long X(double d10) {
            return g.l0(d10, h.HOURS);
        }

        @h1(version = "1.5")
        @l(errorSince = "1.8", warningSince = "1.6")
        @l
        @k(message = "Use 'Int.hours' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        public final long Y(int i10) {
            return g.m0(i10, h.HOURS);
        }

        @h1(version = "1.5")
        @l(errorSince = "1.8", warningSince = "1.6")
        @l
        @k(message = "Use 'Long.hours' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        public final long Z(long j10) {
            return g.n0(j10, h.HOURS);
        }

        @l
        public final double a(double d10, @g h hVar, @g h hVar2) {
            l0.p(hVar, "sourceUnit");
            l0.p(hVar2, "targetUnit");
            return j.a(d10, hVar, hVar2);
        }

        @h1(version = "1.5")
        @l(errorSince = "1.8", warningSince = "1.6")
        @l
        @k(message = "Use 'Double.microseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        public final long a0(double d10) {
            return g.l0(d10, h.MICROSECONDS);
        }

        @h1(version = "1.5")
        @l(errorSince = "1.8", warningSince = "1.6")
        @l
        @k(message = "Use 'Double.days' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        public final long b(double d10) {
            return g.l0(d10, h.DAYS);
        }

        @h1(version = "1.5")
        @l(errorSince = "1.8", warningSince = "1.6")
        @l
        @k(message = "Use 'Int.microseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        public final long b0(int i10) {
            return g.m0(i10, h.MICROSECONDS);
        }

        @h1(version = "1.5")
        @l(errorSince = "1.8", warningSince = "1.6")
        @l
        @k(message = "Use 'Int.days' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        public final long c(int i10) {
            return g.m0(i10, h.DAYS);
        }

        @h1(version = "1.5")
        @l(errorSince = "1.8", warningSince = "1.6")
        @l
        @k(message = "Use 'Long.microseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        public final long c0(long j10) {
            return g.n0(j10, h.MICROSECONDS);
        }

        @h1(version = "1.5")
        @l(errorSince = "1.8", warningSince = "1.6")
        @l
        @k(message = "Use 'Long.days' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        public final long d(long j10) {
            return g.n0(j10, h.DAYS);
        }

        @h1(version = "1.5")
        @l(errorSince = "1.8", warningSince = "1.6")
        @l
        @k(message = "Use 'Double.milliseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        public final long d0(double d10) {
            return g.l0(d10, h.MILLISECONDS);
        }

        public final long e(double d10) {
            return g.l0(d10, h.DAYS);
        }

        @h1(version = "1.5")
        @l(errorSince = "1.8", warningSince = "1.6")
        @l
        @k(message = "Use 'Int.milliseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        public final long e0(int i10) {
            return g.m0(i10, h.MILLISECONDS);
        }

        public final long f(int i10) {
            return g.m0(i10, h.DAYS);
        }

        @h1(version = "1.5")
        @l(errorSince = "1.8", warningSince = "1.6")
        @l
        @k(message = "Use 'Long.milliseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        public final long f0(long j10) {
            return g.n0(j10, h.MILLISECONDS);
        }

        public final long g(long j10) {
            return g.n0(j10, h.DAYS);
        }

        @h1(version = "1.5")
        @l(errorSince = "1.8", warningSince = "1.6")
        @l
        @k(message = "Use 'Double.minutes' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        public final long g0(double d10) {
            return g.l0(d10, h.MINUTES);
        }

        @h1(version = "1.5")
        @l(errorSince = "1.8", warningSince = "1.6")
        @l
        @k(message = "Use 'Int.minutes' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        public final long h0(int i10) {
            return g.m0(i10, h.MINUTES);
        }

        @h1(version = "1.5")
        @l(errorSince = "1.8", warningSince = "1.6")
        @l
        @k(message = "Use 'Long.minutes' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        public final long i0(long j10) {
            return g.n0(j10, h.MINUTES);
        }

        @h1(version = "1.5")
        @l(errorSince = "1.8", warningSince = "1.6")
        @l
        @k(message = "Use 'Double.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        public final long j0(double d10) {
            return g.l0(d10, h.NANOSECONDS);
        }

        public final long k(double d10) {
            return g.l0(d10, h.HOURS);
        }

        @h1(version = "1.5")
        @l(errorSince = "1.8", warningSince = "1.6")
        @l
        @k(message = "Use 'Int.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        public final long k0(int i10) {
            return g.m0(i10, h.NANOSECONDS);
        }

        public final long l(int i10) {
            return g.m0(i10, h.HOURS);
        }

        @h1(version = "1.5")
        @l(errorSince = "1.8", warningSince = "1.6")
        @l
        @k(message = "Use 'Long.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        public final long l0(long j10) {
            return g.n0(j10, h.NANOSECONDS);
        }

        public final long m(long j10) {
            return g.n0(j10, h.HOURS);
        }

        public final long m0(@g String str) {
            l0.p(str, "value");
            try {
                return g.f0(str, false);
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException("Invalid duration string format: '" + str + "'.", e10);
            }
        }

        public final long n0(@g String str) {
            l0.p(str, "value");
            try {
                return g.f0(str, true);
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + str + "'.", e10);
            }
        }

        @h
        public final e o0(@g String str) {
            l0.p(str, "value");
            try {
                return e.j(g.f0(str, true));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @h
        public final e p0(@g String str) {
            l0.p(str, "value");
            try {
                return e.j(g.f0(str, false));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final long q() {
            return e.R;
        }

        @h1(version = "1.5")
        @l(errorSince = "1.8", warningSince = "1.6")
        @l
        @k(message = "Use 'Double.seconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        public final long q0(double d10) {
            return g.l0(d10, h.SECONDS);
        }

        public final long r(double d10) {
            return g.l0(d10, h.MICROSECONDS);
        }

        @h1(version = "1.5")
        @l(errorSince = "1.8", warningSince = "1.6")
        @l
        @k(message = "Use 'Int.seconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        public final long r0(int i10) {
            return g.m0(i10, h.SECONDS);
        }

        public final long s(int i10) {
            return g.m0(i10, h.MICROSECONDS);
        }

        @h1(version = "1.5")
        @l(errorSince = "1.8", warningSince = "1.6")
        @l
        @k(message = "Use 'Long.seconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        public final long s0(long j10) {
            return g.n0(j10, h.SECONDS);
        }

        public final long t(long j10) {
            return g.n0(j10, h.MICROSECONDS);
        }

        public final long x(double d10) {
            return g.l0(d10, h.MILLISECONDS);
        }

        public final long y(int i10) {
            return g.m0(i10, h.MILLISECONDS);
        }

        public final long z(long j10) {
            return g.n0(j10, h.MILLISECONDS);
        }
    }

    public /* synthetic */ e(long j10) {
        this.O = j10;
    }

    public static final double A(long j10) {
        return o0(j10, h.MICROSECONDS);
    }

    @l(errorSince = "1.8", warningSince = "1.5")
    @l
    @k(message = "Use inWholeMilliseconds property instead or convert toDouble(MILLISECONDS) if a double value is required.", replaceWith = @b1(expression = "toDouble(DurationUnit.MILLISECONDS)", imports = {}))
    public static /* synthetic */ void B() {
    }

    public static final double C(long j10) {
        return o0(j10, h.MILLISECONDS);
    }

    @l(errorSince = "1.8", warningSince = "1.5")
    @l
    @k(message = "Use inWholeMinutes property instead or convert toDouble(MINUTES) if a double value is required.", replaceWith = @b1(expression = "toDouble(DurationUnit.MINUTES)", imports = {}))
    public static /* synthetic */ void D() {
    }

    public static final double E(long j10) {
        return o0(j10, h.MINUTES);
    }

    @l(errorSince = "1.8", warningSince = "1.5")
    @l
    @k(message = "Use inWholeNanoseconds property instead or convert toDouble(NANOSECONDS) if a double value is required.", replaceWith = @b1(expression = "toDouble(DurationUnit.NANOSECONDS)", imports = {}))
    public static /* synthetic */ void F() {
    }

    public static final double G(long j10) {
        return o0(j10, h.NANOSECONDS);
    }

    @l(errorSince = "1.8", warningSince = "1.5")
    @l
    @k(message = "Use inWholeSeconds property instead or convert toDouble(SECONDS) if a double value is required.", replaceWith = @b1(expression = "toDouble(DurationUnit.SECONDS)", imports = {}))
    public static /* synthetic */ void H() {
    }

    public static final double I(long j10) {
        return o0(j10, h.SECONDS);
    }

    public static final long J(long j10) {
        return r0(j10, h.DAYS);
    }

    public static final long K(long j10) {
        return r0(j10, h.HOURS);
    }

    public static final long L(long j10) {
        return r0(j10, h.MICROSECONDS);
    }

    public static final long M(long j10) {
        return (!b0(j10) || !a0(j10)) ? r0(j10, h.MILLISECONDS) : Y(j10);
    }

    public static final long N(long j10) {
        return r0(j10, h.MINUTES);
    }

    public static final long O(long j10) {
        long Y = Y(j10);
        if (c0(j10)) {
            return Y;
        }
        if (Y > x1.f22050f) {
            return Long.MAX_VALUE;
        }
        if (Y < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return g.d0(Y);
    }

    public static final long P(long j10) {
        return r0(j10, h.SECONDS);
    }

    @a1
    public static /* synthetic */ void Q() {
    }

    public static final int R(long j10) {
        if (d0(j10)) {
            return 0;
        }
        return (int) (N(j10) % ((long) 60));
    }

    @a1
    public static /* synthetic */ void S() {
    }

    public static final int T(long j10) {
        if (d0(j10)) {
            return 0;
        }
        boolean b02 = b0(j10);
        long Y = Y(j10);
        return (int) (b02 ? g.d0(Y % ((long) 1000)) : Y % ((long) c.f17348e));
    }

    @a1
    public static /* synthetic */ void U() {
    }

    public static final int V(long j10) {
        if (d0(j10)) {
            return 0;
        }
        return (int) (P(j10) % ((long) 60));
    }

    public static final h W(long j10) {
        return c0(j10) ? h.NANOSECONDS : h.MILLISECONDS;
    }

    public static final int X(long j10) {
        return ((int) j10) & 1;
    }

    public static final long Y(long j10) {
        return j10 >> 1;
    }

    public static int Z(long j10) {
        return i2.a(j10);
    }

    public static final boolean a0(long j10) {
        return !d0(j10);
    }

    public static final boolean b0(long j10) {
        return (((int) j10) & 1) == 1;
    }

    public static final boolean c0(long j10) {
        return (((int) j10) & 1) == 0;
    }

    public static final boolean d0(long j10) {
        return j10 == R || j10 == S;
    }

    public static final long e(long j10, long j11, long j12) {
        long g10 = g.e0(j12);
        long j13 = j11 + g10;
        if (!new p(-4611686018426L, g.f21249d).q(j13)) {
            return g.j(v.K(j13, -4611686018427387903L, 4611686018427387903L));
        }
        return g.l(g.d0(j13) + (j12 - g.d0(g10)));
    }

    public static final boolean e0(long j10) {
        return j10 < 0;
    }

    public static final boolean f0(long j10) {
        return j10 > 0;
    }

    public static final long g0(long j10, long j11) {
        return h0(j10, x0(j11));
    }

    public static final long h0(long j10, long j11) {
        if (d0(j10)) {
            if (a0(j11) || (j11 ^ j10) >= 0) {
                return j10;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        } else if (d0(j11)) {
            return j11;
        } else {
            if ((((int) j10) & 1) == (((int) j11) & 1)) {
                long Y = Y(j10) + Y(j11);
                return c0(j10) ? g.m(Y) : g.k(Y);
            } else if (b0(j10)) {
                return e(j10, Y(j10), Y(j11));
            } else {
                return e(j10, Y(j11), Y(j10));
            }
        }
    }

    public static final void i(long j10, StringBuilder sb2, int i10, int i11, int i12, String str, boolean z10) {
        sb2.append(i10);
        if (i11 != 0) {
            sb2.append('.');
            String U3 = c0.U3(String.valueOf(i11), i12, '0');
            int i13 = -1;
            int length = U3.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i14 = length - 1;
                    if (U3.charAt(length) != '0') {
                        i13 = length;
                        break;
                    } else if (i14 < 0) {
                        break;
                    } else {
                        length = i14;
                    }
                }
            }
            int i15 = i13 + 1;
            if (z10 || i15 >= 3) {
                i15 = ((i15 + 2) / 3) * 3;
            }
            sb2.append(U3, 0, i15);
            l0.o(sb2, "this.append(value, startIndex, endIndex)");
        }
        sb2.append(str);
    }

    public static final long i0(long j10, double d10) {
        int K0 = d.K0(d10);
        if (((double) K0) == d10) {
            return j0(j10, K0);
        }
        h W = W(j10);
        return g.l0(o0(j10, W) * d10, W);
    }

    public static final /* synthetic */ e j(long j10) {
        return new e(j10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008c, code lost:
        if ((cf.d.V(r1) * cf.d.U(r18)) > 0) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ac, code lost:
        if ((cf.d.V(r1) * cf.d.U(r18)) > 0) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return S;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return R;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long j0(long r16, int r18) {
        /*
            r0 = r18
            boolean r1 = d0(r16)
            if (r1 == 0) goto L_0x001c
            if (r0 == 0) goto L_0x0014
            if (r0 <= 0) goto L_0x000f
            r0 = r16
            goto L_0x0013
        L_0x000f:
            long r0 = x0(r16)
        L_0x0013:
            return r0
        L_0x0014:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Multiplying infinite duration by zero yields an undefined result."
            r0.<init>(r1)
            throw r0
        L_0x001c:
            if (r0 != 0) goto L_0x0021
            long r0 = Q
            return r0
        L_0x0021:
            long r1 = Y(r16)
            long r3 = (long) r0
            long r5 = r1 * r3
            boolean r7 = c0(r16)
            r8 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            r10 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            if (r7 == 0) goto L_0x008f
            gf.p r7 = new gf.p
            r12 = -2147483647(0xffffffff80000001, double:NaN)
            r14 = 2147483647(0x7fffffff, double:1.060997895E-314)
            r7.<init>(r12, r14)
            boolean r7 = r7.q(r1)
            if (r7 == 0) goto L_0x004e
            long r0 = nf.g.l(r5)
            goto L_0x00b3
        L_0x004e:
            long r12 = r5 / r3
            int r7 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r7 != 0) goto L_0x0059
            long r0 = nf.g.m(r5)
            goto L_0x00b3
        L_0x0059:
            long r5 = nf.g.e0(r1)
            long r12 = nf.g.d0(r5)
            long r12 = r1 - r12
            long r14 = r5 * r3
            long r12 = r12 * r3
            long r12 = nf.g.e0(r12)
            long r12 = r12 + r14
            long r3 = r14 / r3
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0083
            long r3 = r12 ^ r14
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 < 0) goto L_0x0083
            gf.p r0 = new gf.p
            r0.<init>(r10, r8)
            long r0 = gf.v.L(r12, r0)
            goto L_0x009e
        L_0x0083:
            int r1 = cf.d.V(r1)
            int r0 = cf.d.U(r18)
            int r1 = r1 * r0
            if (r1 <= 0) goto L_0x00b1
            goto L_0x00ae
        L_0x008f:
            long r3 = r5 / r3
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x00a3
            gf.p r0 = new gf.p
            r0.<init>(r10, r8)
            long r0 = gf.v.L(r5, r0)
        L_0x009e:
            long r0 = nf.g.j(r0)
            goto L_0x00b3
        L_0x00a3:
            int r1 = cf.d.V(r1)
            int r0 = cf.d.U(r18)
            int r1 = r1 * r0
            if (r1 <= 0) goto L_0x00b1
        L_0x00ae:
            long r0 = R
            goto L_0x00b3
        L_0x00b1:
            long r0 = S
        L_0x00b3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nf.e.j0(long, int):long");
    }

    public static final <T> T k0(long j10, @g we.p<? super Long, ? super Integer, ? extends T> pVar) {
        l0.p(pVar, "action");
        return pVar.g0(Long.valueOf(P(j10)), Integer.valueOf(T(j10)));
    }

    public static int l(long j10, long j11) {
        long j12 = j10 ^ j11;
        if (j12 < 0 || (((int) j12) & 1) == 0) {
            return l0.u(j10, j11);
        }
        int i10 = (((int) j10) & 1) - (((int) j11) & 1);
        return e0(j10) ? -i10 : i10;
    }

    public static final <T> T l0(long j10, @g q<? super Long, ? super Integer, ? super Integer, ? extends T> qVar) {
        l0.p(qVar, "action");
        return qVar.y(Long.valueOf(N(j10)), Integer.valueOf(V(j10)), Integer.valueOf(T(j10)));
    }

    public static long m(long j10) {
        if (f.d()) {
            if (c0(j10)) {
                if (!new p(-4611686018426999999L, g.f21247b).q(Y(j10))) {
                    throw new AssertionError(Y(j10) + " ns is out of nanoseconds range");
                }
            } else if (!new p(-4611686018427387903L, 4611686018427387903L).q(Y(j10))) {
                throw new AssertionError(Y(j10) + " ms is out of milliseconds range");
            } else if (new p(-4611686018426L, g.f21249d).q(Y(j10))) {
                throw new AssertionError(Y(j10) + " ms is denormalized");
            }
        }
        return j10;
    }

    public static final <T> T m0(long j10, @g r<? super Long, ? super Integer, ? super Integer, ? super Integer, ? extends T> rVar) {
        l0.p(rVar, "action");
        return rVar.M(Long.valueOf(K(j10)), Integer.valueOf(R(j10)), Integer.valueOf(V(j10)), Integer.valueOf(T(j10)));
    }

    public static final double n(long j10, long j11) {
        h hVar = (h) fe.h.X(W(j10), W(j11));
        return o0(j10, hVar) / o0(j11, hVar);
    }

    public static final <T> T n0(long j10, @g s<? super Long, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> sVar) {
        l0.p(sVar, "action");
        return sVar.i0(Long.valueOf(J(j10)), Integer.valueOf(u(j10)), Integer.valueOf(R(j10)), Integer.valueOf(V(j10)), Integer.valueOf(T(j10)));
    }

    public static final long o(long j10, double d10) {
        int K0 = d.K0(d10);
        if ((((double) K0) == d10) && K0 != 0) {
            return p(j10, K0);
        }
        h W = W(j10);
        return g.l0(o0(j10, W) / d10, W);
    }

    public static final double o0(long j10, @g h hVar) {
        l0.p(hVar, "unit");
        if (j10 == R) {
            return Double.POSITIVE_INFINITY;
        }
        if (j10 == S) {
            return Double.NEGATIVE_INFINITY;
        }
        return j.a((double) Y(j10), W(j10), hVar);
    }

    public static final long p(long j10, int i10) {
        if (i10 == 0) {
            if (f0(j10)) {
                return R;
            }
            if (e0(j10)) {
                return S;
            }
            throw new IllegalArgumentException("Dividing zero duration by zero yields an undefined result.");
        } else if (c0(j10)) {
            return g.l(Y(j10) / ((long) i10));
        } else {
            if (d0(j10)) {
                return j0(j10, d.U(i10));
            }
            long j11 = (long) i10;
            long Y = Y(j10) / j11;
            if (!new p(-4611686018426L, g.f21249d).q(Y)) {
                return g.j(Y);
            }
            return g.l(g.d0(Y) + (g.d0(Y(j10) - (Y * j11)) / j11));
        }
    }

    public static final int p0(long j10, @g h hVar) {
        l0.p(hVar, "unit");
        return (int) v.K(r0(j10, hVar), y4.c.L0, y4.c.M0);
    }

    public static boolean q(long j10, Object obj) {
        return (obj instanceof e) && j10 == ((e) obj).y0();
    }

    @g
    public static final String q0(long j10) {
        StringBuilder sb2 = new StringBuilder();
        if (e0(j10)) {
            sb2.append('-');
        }
        sb2.append("PT");
        long s10 = s(j10);
        long K = K(s10);
        int R2 = R(s10);
        int V = V(s10);
        int T = T(s10);
        if (d0(j10)) {
            K = 9999999999999L;
        }
        boolean z10 = true;
        boolean z11 = K != 0;
        boolean z12 = (V == 0 && T == 0) ? false : true;
        if (R2 == 0 && (!z12 || !z11)) {
            z10 = false;
        }
        if (z11) {
            sb2.append(K);
            sb2.append('H');
        }
        if (z10) {
            sb2.append(R2);
            sb2.append('M');
        }
        if (z12 || (!z11 && !z10)) {
            i(j10, sb2, V, T, 9, w1.a.L4, true);
        }
        String sb3 = sb2.toString();
        l0.o(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public static final boolean r(long j10, long j11) {
        return j10 == j11;
    }

    public static final long r0(long j10, @g h hVar) {
        l0.p(hVar, "unit");
        if (j10 == R) {
            return Long.MAX_VALUE;
        }
        if (j10 == S) {
            return Long.MIN_VALUE;
        }
        return j.b(Y(j10), W(j10), hVar);
    }

    public static final long s(long j10) {
        return e0(j10) ? x0(j10) : j10;
    }

    @l(errorSince = "1.8", warningSince = "1.5")
    @l
    @k(message = "Use inWholeMilliseconds property instead.", replaceWith = @b1(expression = "this.inWholeMilliseconds", imports = {}))
    public static final long s0(long j10) {
        return M(j10);
    }

    @a1
    public static /* synthetic */ void t() {
    }

    @l(errorSince = "1.8", warningSince = "1.5")
    @l
    @k(message = "Use inWholeNanoseconds property instead.", replaceWith = @b1(expression = "this.inWholeNanoseconds", imports = {}))
    public static final long t0(long j10) {
        return O(j10);
    }

    public static final int u(long j10) {
        if (d0(j10)) {
            return 0;
        }
        return (int) (K(j10) % ((long) 24));
    }

    @g
    public static String u0(long j10) {
        boolean z10;
        String str;
        int i10;
        int i11;
        int i12;
        StringBuilder sb2;
        long j11;
        if (j10 == 0) {
            return "0s";
        }
        if (j10 == R) {
            return "Infinity";
        }
        if (j10 == S) {
            return "-Infinity";
        }
        boolean e02 = e0(j10);
        StringBuilder sb3 = new StringBuilder();
        if (e02) {
            sb3.append('-');
        }
        long s10 = s(j10);
        long J = J(s10);
        int u10 = u(s10);
        int R2 = R(s10);
        int V = V(s10);
        int T = T(s10);
        int i13 = 0;
        boolean z11 = J != 0;
        boolean z12 = u10 != 0;
        boolean z13 = R2 != 0;
        boolean z14 = (V == 0 && T == 0) ? false : true;
        if (z11) {
            sb3.append(J);
            sb3.append('d');
            i13 = 1;
        }
        if (z12 || (z11 && (z13 || z14))) {
            int i14 = i13 + 1;
            if (i13 > 0) {
                sb3.append(p7.f.f11698i);
            }
            sb3.append(u10);
            sb3.append('h');
            i13 = i14;
        }
        if (z13 || (z14 && (z12 || z11))) {
            int i15 = i13 + 1;
            if (i13 > 0) {
                sb3.append(p7.f.f11698i);
            }
            sb3.append(R2);
            sb3.append('m');
            i13 = i15;
        }
        if (z14) {
            int i16 = i13 + 1;
            if (i13 > 0) {
                sb3.append(p7.f.f11698i);
            }
            if (V != 0 || z11 || z12 || z13) {
                i10 = 9;
                j11 = j10;
                sb2 = sb3;
                i12 = V;
                i11 = T;
                str = "s";
                z10 = false;
            } else {
                if (T >= 1000000) {
                    i12 = T / 1000000;
                    i11 = T % 1000000;
                    i10 = 6;
                    z10 = false;
                    str = "ms";
                } else if (T >= 1000) {
                    i12 = T / 1000;
                    i11 = T % 1000;
                    i10 = 3;
                    z10 = false;
                    str = "us";
                } else {
                    sb3.append(T);
                    sb3.append("ns");
                    i13 = i16;
                }
                j11 = j10;
                sb2 = sb3;
            }
            i(j11, sb2, i12, i11, i10, str, z10);
            i13 = i16;
        }
        if (e02 && i13 > 1) {
            sb3.insert(1, '(').append(')');
        }
        String sb4 = sb3.toString();
        l0.o(sb4, "StringBuilder().apply(builderAction).toString()");
        return sb4;
    }

    @l(errorSince = "1.8", warningSince = "1.5")
    @l
    @k(message = "Use inWholeDays property instead or convert toDouble(DAYS) if a double value is required.", replaceWith = @b1(expression = "toDouble(DurationUnit.DAYS)", imports = {}))
    public static /* synthetic */ void v() {
    }

    @g
    public static final String v0(long j10, @g h hVar, int i10) {
        l0.p(hVar, "unit");
        if (i10 >= 0) {
            double o02 = o0(j10, hVar);
            if (Double.isInfinite(o02)) {
                return String.valueOf(o02);
            }
            return f.b(o02, v.B(i10, 12)) + k.h(hVar);
        }
        throw new IllegalArgumentException(("decimals must be not negative, but was " + i10).toString());
    }

    public static final double w(long j10) {
        return o0(j10, h.DAYS);
    }

    public static /* synthetic */ String w0(long j10, h hVar, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return v0(j10, hVar, i10);
    }

    @l(errorSince = "1.8", warningSince = "1.5")
    @l
    @k(message = "Use inWholeHours property instead or convert toDouble(HOURS) if a double value is required.", replaceWith = @b1(expression = "toDouble(DurationUnit.HOURS)", imports = {}))
    public static /* synthetic */ void x() {
    }

    public static final long x0(long j10) {
        return g.i(-Y(j10), ((int) j10) & 1);
    }

    public static final double y(long j10) {
        return o0(j10, h.HOURS);
    }

    @l(errorSince = "1.8", warningSince = "1.5")
    @l
    @k(message = "Use inWholeMicroseconds property instead or convert toDouble(MICROSECONDS) if a double value is required.", replaceWith = @b1(expression = "toDouble(DurationUnit.MICROSECONDS)", imports = {}))
    public static /* synthetic */ void z() {
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return k(((e) obj).y0());
    }

    public boolean equals(Object obj) {
        return q(this.O, obj);
    }

    public int hashCode() {
        return Z(this.O);
    }

    public int k(long j10) {
        return l(this.O, j10);
    }

    @g
    public String toString() {
        return u0(this.O);
    }

    public final /* synthetic */ long y0() {
        return this.O;
    }
}
