package nf;

import be.s0;
import cf.d;
import com.google.android.material.badge.BadgeDrawable;
import gf.c;
import gf.m;
import gf.p;
import gf.v;
import java.util.Collection;
import java.util.Iterator;
import lf.b0;
import lf.c0;
import lf.e0;
import oe.f;
import xe.l0;
import zd.b1;
import zd.h1;
import zd.k;
import zd.l;
import zd.y2;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final int f21246a = 1000000;

    /* renamed from: b  reason: collision with root package name */
    public static final long f21247b = 4611686018426999999L;

    /* renamed from: c  reason: collision with root package name */
    public static final long f21248c = 4611686018427387903L;

    /* renamed from: d  reason: collision with root package name */
    public static final long f21249d = 4611686018426L;

    public static final long A(int i10) {
        return m0(i10, h.MICROSECONDS);
    }

    public static final long B(long j10) {
        return n0(j10, h.MICROSECONDS);
    }

    @h1(version = "1.3")
    @l(errorSince = "1.8", warningSince = "1.5")
    @l
    @k(message = "Use 'Double.microseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    public static /* synthetic */ void C(double d10) {
    }

    @h1(version = "1.3")
    @l(errorSince = "1.8", warningSince = "1.5")
    @l
    @k(message = "Use 'Int.microseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    public static /* synthetic */ void D(int i10) {
    }

    @h1(version = "1.3")
    @l(errorSince = "1.8", warningSince = "1.5")
    @l
    @k(message = "Use 'Long.microseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    public static /* synthetic */ void E(long j10) {
    }

    public static final long F(double d10) {
        return l0(d10, h.MILLISECONDS);
    }

    public static final long G(int i10) {
        return m0(i10, h.MILLISECONDS);
    }

    public static final long H(long j10) {
        return n0(j10, h.MILLISECONDS);
    }

    @h1(version = "1.3")
    @l(errorSince = "1.8", warningSince = "1.5")
    @l
    @k(message = "Use 'Double.milliseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    public static /* synthetic */ void I(double d10) {
    }

    @h1(version = "1.3")
    @l(errorSince = "1.8", warningSince = "1.5")
    @l
    @k(message = "Use 'Int.milliseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    public static /* synthetic */ void J(int i10) {
    }

    @h1(version = "1.3")
    @l(errorSince = "1.8", warningSince = "1.5")
    @l
    @k(message = "Use 'Long.milliseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    public static /* synthetic */ void K(long j10) {
    }

    public static final long L(double d10) {
        return l0(d10, h.MINUTES);
    }

    public static final long M(int i10) {
        return m0(i10, h.MINUTES);
    }

    public static final long N(long j10) {
        return n0(j10, h.MINUTES);
    }

    @h1(version = "1.3")
    @l(errorSince = "1.8", warningSince = "1.5")
    @l
    @k(message = "Use 'Double.minutes' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    public static /* synthetic */ void O(double d10) {
    }

    @h1(version = "1.3")
    @l(errorSince = "1.8", warningSince = "1.5")
    @l
    @k(message = "Use 'Int.minutes' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    public static /* synthetic */ void P(int i10) {
    }

    @h1(version = "1.3")
    @l(errorSince = "1.8", warningSince = "1.5")
    @l
    @k(message = "Use 'Long.minutes' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    public static /* synthetic */ void Q(long j10) {
    }

    public static final long R(double d10) {
        return l0(d10, h.NANOSECONDS);
    }

    public static final long S(int i10) {
        return m0(i10, h.NANOSECONDS);
    }

    public static final long T(long j10) {
        return n0(j10, h.NANOSECONDS);
    }

    @h1(version = "1.3")
    @l(errorSince = "1.8", warningSince = "1.5")
    @l
    @k(message = "Use 'Double.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    public static /* synthetic */ void U(double d10) {
    }

    @h1(version = "1.3")
    @l(errorSince = "1.8", warningSince = "1.5")
    @l
    @k(message = "Use 'Int.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    public static /* synthetic */ void V(int i10) {
    }

    @h1(version = "1.3")
    @l(errorSince = "1.8", warningSince = "1.5")
    @l
    @k(message = "Use 'Long.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    public static /* synthetic */ void W(long j10) {
    }

    public static final long X(double d10) {
        return l0(d10, h.SECONDS);
    }

    public static final long Y(int i10) {
        return m0(i10, h.SECONDS);
    }

    public static final long Z(long j10) {
        return n0(j10, h.SECONDS);
    }

    @h1(version = "1.3")
    @l(errorSince = "1.8", warningSince = "1.5")
    @l
    @k(message = "Use 'Double.seconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    public static /* synthetic */ void a0(double d10) {
    }

    @h1(version = "1.3")
    @l(errorSince = "1.8", warningSince = "1.5")
    @l
    @k(message = "Use 'Int.seconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    public static /* synthetic */ void b0(int i10) {
    }

    @h1(version = "1.3")
    @l(errorSince = "1.8", warningSince = "1.5")
    @l
    @k(message = "Use 'Long.seconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    public static /* synthetic */ void c0(long j10) {
    }

    public static final long d0(long j10) {
        return j10 * ((long) 1000000);
    }

    public static final long e0(long j10) {
        return j10 / ((long) 1000000);
    }

    /* JADX WARNING: Removed duplicated region for block: B:159:0x00a6 A[EDGE_INSN: B:159:0x00a6->B:45:0x00a6 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0098 A[LOOP:1: B:33:0x006c->B:43:0x0098, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long f0(java.lang.String r27, boolean r28) {
        /*
            r6 = r27
            int r7 = r27.length()
            if (r7 == 0) goto L_0x02de
            nf.e$a r8 = nf.e.P
            long r9 = r8.W()
            r11 = 0
            char r0 = r6.charAt(r11)
            r1 = 43
            r2 = 45
            r12 = 1
            if (r0 != r1) goto L_0x001c
        L_0x001a:
            r13 = r12
            goto L_0x0020
        L_0x001c:
            if (r0 != r2) goto L_0x001f
            goto L_0x001a
        L_0x001f:
            r13 = r11
        L_0x0020:
            if (r13 <= 0) goto L_0x0024
            r14 = r12
            goto L_0x0025
        L_0x0024:
            r14 = r11
        L_0x0025:
            r0 = 2
            r15 = 0
            if (r14 == 0) goto L_0x0032
            boolean r1 = lf.c0.e5(r6, r2, r11, r0, r15)
            if (r1 == 0) goto L_0x0032
            r16 = r12
            goto L_0x0034
        L_0x0032:
            r16 = r11
        L_0x0034:
            java.lang.String r5 = "No components"
            if (r7 <= r13) goto L_0x02d7
            char r1 = r6.charAt(r13)
            r2 = 80
            java.lang.String r4 = "this as java.lang.String).substring(startIndex)"
            java.lang.String r3 = "Unexpected order of duration components"
            r17 = r5
            r5 = 57
            r0 = 48
            java.lang.String r11 = "this as java.lang.String…ing(startIndex, endIndex)"
            java.lang.String r15 = "null cannot be cast to non-null type java.lang.String"
            if (r1 != r2) goto L_0x0164
            int r13 = r13 + r12
            if (r13 == r7) goto L_0x015e
            r1 = 0
            r2 = 0
        L_0x0053:
            if (r13 >= r7) goto L_0x02ca
            char r8 = r6.charAt(r13)
            r14 = 84
            if (r8 != r14) goto L_0x006b
            if (r1 != 0) goto L_0x0065
            int r13 = r13 + 1
            if (r13 == r7) goto L_0x0065
            r1 = r12
            goto L_0x0053
        L_0x0065:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x006b:
            r8 = r13
        L_0x006c:
            int r14 = r27.length()
            if (r8 >= r14) goto L_0x00a2
            char r14 = r6.charAt(r8)
            gf.c r12 = new gf.c
            r12.<init>(r0, r5)
            boolean r12 = r12.q(r14)
            if (r12 != 0) goto L_0x0091
            java.lang.String r12 = "+-."
            r18 = r7
            r0 = 2
            r5 = 0
            r7 = 0
            boolean r12 = lf.c0.V2(r12, r14, r7, r0, r5)
            if (r12 == 0) goto L_0x008f
            goto L_0x0095
        L_0x008f:
            r7 = 0
            goto L_0x0096
        L_0x0091:
            r18 = r7
            r0 = 2
            r5 = 0
        L_0x0095:
            r7 = 1
        L_0x0096:
            if (r7 == 0) goto L_0x00a6
            int r8 = r8 + 1
            r7 = r18
            r0 = 48
            r5 = 57
            r12 = 1
            goto L_0x006c
        L_0x00a2:
            r18 = r7
            r0 = 2
            r5 = 0
        L_0x00a6:
            xe.l0.n(r6, r15)
            java.lang.String r7 = r6.substring(r13, r8)
            xe.l0.o(r7, r11)
            int r8 = r7.length()
            if (r8 != 0) goto L_0x00b8
            r8 = 1
            goto L_0x00b9
        L_0x00b8:
            r8 = 0
        L_0x00b9:
            if (r8 != 0) goto L_0x0158
            int r8 = r7.length()
            int r13 = r13 + r8
            if (r13 < 0) goto L_0x0141
            int r8 = lf.c0.j3(r27)
            if (r13 > r8) goto L_0x0141
            char r8 = r6.charAt(r13)
            int r13 = r13 + 1
            nf.h r8 = nf.k.f(r8, r1)
            if (r2 == 0) goto L_0x00e1
            int r2 = r2.compareTo(r8)
            if (r2 <= 0) goto L_0x00db
            goto L_0x00e1
        L_0x00db:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r3)
            throw r0
        L_0x00e1:
            r21 = 46
            r22 = 0
            r23 = 0
            r24 = 6
            r25 = 0
            r20 = r7
            int r2 = lf.c0.r3(r20, r21, r22, r23, r24, r25)
            nf.h r12 = nf.h.SECONDS
            if (r8 != r12) goto L_0x0127
            if (r2 <= 0) goto L_0x0127
            xe.l0.n(r7, r15)
            r12 = 0
            java.lang.String r14 = r7.substring(r12, r2)
            xe.l0.o(r14, r11)
            r28 = r1
            long r0 = g0(r14)
            long r0 = n0(r0, r8)
            long r0 = nf.e.h0(r9, r0)
            xe.l0.n(r7, r15)
            java.lang.String r2 = r7.substring(r2)
            xe.l0.o(r2, r4)
            double r9 = java.lang.Double.parseDouble(r2)
            long r9 = l0(r9, r8)
            long r9 = nf.e.h0(r0, r9)
            goto L_0x0135
        L_0x0127:
            r28 = r1
            long r0 = g0(r7)
            long r0 = n0(r0, r8)
            long r9 = nf.e.h0(r9, r0)
        L_0x0135:
            r1 = r28
            r2 = r8
            r7 = r18
            r0 = 48
            r5 = 57
            r12 = 1
            goto L_0x0053
        L_0x0141:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Missing unit for value "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0158:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x015e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x0164:
            r18 = r7
            r5 = 0
            if (r28 != 0) goto L_0x02d1
            r7 = 0
            int r0 = r18 - r13
            r1 = 8
            int r12 = java.lang.Math.max(r0, r1)
            r20 = 1
            java.lang.String r2 = "Infinity"
            r1 = 48
            r0 = r27
            r1 = r13
            r26 = r3
            r3 = r7
            r7 = r4
            r4 = r12
            r12 = r17
            r17 = r5
            r5 = r20
            boolean r0 = lf.b0.e2(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0192
            long r9 = r8.q()
            goto L_0x02ca
        L_0x0192:
            r0 = r14 ^ 1
            if (r14 == 0) goto L_0x01b7
            char r1 = r6.charAt(r13)
            r2 = 40
            if (r1 != r2) goto L_0x01b7
            char r1 = lf.e0.u7(r27)
            r2 = 41
            if (r1 != r2) goto L_0x01b7
            int r13 = r13 + 1
            int r0 = r18 + -1
            if (r13 == r0) goto L_0x01b1
            r1 = r0
            r3 = r17
            r0 = 1
            goto L_0x01bb
        L_0x01b1:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r12)
            throw r0
        L_0x01b7:
            r3 = r17
            r1 = r18
        L_0x01bb:
            r2 = 0
        L_0x01bc:
            if (r13 >= r1) goto L_0x02ca
            if (r2 == 0) goto L_0x01d8
            if (r0 == 0) goto L_0x01d8
        L_0x01c2:
            int r2 = r27.length()
            if (r13 >= r2) goto L_0x01d8
            char r2 = r6.charAt(r13)
            r4 = 32
            if (r2 != r4) goto L_0x01d2
            r2 = 1
            goto L_0x01d3
        L_0x01d2:
            r2 = 0
        L_0x01d3:
            if (r2 == 0) goto L_0x01d8
            int r13 = r13 + 1
            goto L_0x01c2
        L_0x01d8:
            r2 = r13
        L_0x01d9:
            int r4 = r27.length()
            if (r2 >= r4) goto L_0x01ff
            char r4 = r6.charAt(r2)
            gf.c r5 = new gf.c
            r8 = 57
            r12 = 48
            r5.<init>(r12, r8)
            boolean r5 = r5.q(r4)
            if (r5 != 0) goto L_0x01f9
            r5 = 46
            if (r4 != r5) goto L_0x01f7
            goto L_0x01f9
        L_0x01f7:
            r4 = 0
            goto L_0x01fa
        L_0x01f9:
            r4 = 1
        L_0x01fa:
            if (r4 == 0) goto L_0x0203
            int r2 = r2 + 1
            goto L_0x01d9
        L_0x01ff:
            r8 = 57
            r12 = 48
        L_0x0203:
            xe.l0.n(r6, r15)
            java.lang.String r2 = r6.substring(r13, r2)
            xe.l0.o(r2, r11)
            int r4 = r2.length()
            if (r4 != 0) goto L_0x0215
            r4 = 1
            goto L_0x0216
        L_0x0215:
            r4 = 0
        L_0x0216:
            if (r4 != 0) goto L_0x02c4
            int r4 = r2.length()
            int r13 = r13 + r4
            r4 = r13
        L_0x021e:
            int r5 = r27.length()
            if (r4 >= r5) goto L_0x023e
            char r5 = r6.charAt(r4)
            gf.c r14 = new gf.c
            r8 = 97
            r12 = 122(0x7a, float:1.71E-43)
            r14.<init>(r8, r12)
            boolean r5 = r14.q(r5)
            if (r5 == 0) goto L_0x023e
            int r4 = r4 + 1
            r8 = 57
            r12 = 48
            goto L_0x021e
        L_0x023e:
            xe.l0.n(r6, r15)
            java.lang.String r4 = r6.substring(r13, r4)
            xe.l0.o(r4, r11)
            int r5 = r4.length()
            int r13 = r13 + r5
            nf.h r4 = nf.k.g(r4)
            if (r3 == 0) goto L_0x0262
            int r3 = r3.compareTo(r4)
            if (r3 <= 0) goto L_0x025a
            goto L_0x0262
        L_0x025a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r3 = r26
            r0.<init>(r3)
            throw r0
        L_0x0262:
            r3 = r26
            r20 = 46
            r21 = 0
            r22 = 0
            r23 = 6
            r24 = 0
            r19 = r2
            int r5 = lf.c0.r3(r19, r20, r21, r22, r23, r24)
            if (r5 <= 0) goto L_0x02af
            xe.l0.n(r2, r15)
            r8 = 0
            java.lang.String r12 = r2.substring(r8, r5)
            xe.l0.o(r12, r11)
            r14 = r11
            long r11 = java.lang.Long.parseLong(r12)
            long r11 = n0(r11, r4)
            long r9 = nf.e.h0(r9, r11)
            xe.l0.n(r2, r15)
            java.lang.String r2 = r2.substring(r5)
            xe.l0.o(r2, r7)
            double r11 = java.lang.Double.parseDouble(r2)
            long r11 = l0(r11, r4)
            long r9 = nf.e.h0(r9, r11)
            if (r13 < r1) goto L_0x02a7
            goto L_0x02bd
        L_0x02a7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Fractional component must be last"
            r0.<init>(r1)
            throw r0
        L_0x02af:
            r14 = r11
            r8 = 0
            long r11 = java.lang.Long.parseLong(r2)
            long r11 = n0(r11, r4)
            long r9 = nf.e.h0(r9, r11)
        L_0x02bd:
            r26 = r3
            r3 = r4
            r11 = r14
            r2 = 1
            goto L_0x01bc
        L_0x02c4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x02ca:
            if (r16 == 0) goto L_0x02d0
            long r9 = nf.e.x0(r9)
        L_0x02d0:
            return r9
        L_0x02d1:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x02d7:
            r12 = r5
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r12)
            throw r0
        L_0x02de:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The string is empty"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nf.g.f0(java.lang.String, boolean):long");
    }

    public static final long g0(String str) {
        boolean z10;
        int length = str.length();
        int i10 = (length <= 0 || !c0.V2("+-", str.charAt(0), false, 2, (Object) null)) ? 0 : 1;
        if (length - i10 > 16) {
            m mVar = new m(i10, c0.j3(str));
            if (!(mVar instanceof Collection) || !((Collection) mVar).isEmpty()) {
                Iterator it = mVar.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (!new c('0', '9').q(str.charAt(((s0) it).nextInt()))) {
                        z10 = false;
                        break;
                    }
                }
            }
            z10 = true;
            if (z10) {
                return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
        }
        if (b0.v2(str, BadgeDrawable.f16655n0, false, 2, (Object) null)) {
            str = e0.B6(str, 1);
        }
        return Long.parseLong(str);
    }

    public static final int h0(String str, int i10, we.l<? super Character, Boolean> lVar) {
        while (i10 < str.length() && lVar.A(Character.valueOf(str.charAt(i10))).booleanValue()) {
            i10++;
        }
        return i10;
    }

    public static final long i(long j10, int i10) {
        return e.m((j10 << 1) + ((long) i10));
    }

    public static final String i0(String str, int i10, we.l<? super Character, Boolean> lVar) {
        int i11 = i10;
        while (i11 < str.length() && lVar.A(Character.valueOf(str.charAt(i11))).booleanValue()) {
            i11++;
        }
        l0.n(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(i10, i11);
        l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final long j(long j10) {
        return e.m((j10 << 1) + 1);
    }

    @h1(version = "1.6")
    @y2(markerClass = {l.class})
    @f
    public static final long j0(double d10, long j10) {
        return e.i0(j10, d10);
    }

    public static final long k(long j10) {
        return new p(-4611686018426L, f21249d).q(j10) ? l(d0(j10)) : j(v.K(j10, -4611686018427387903L, 4611686018427387903L));
    }

    @h1(version = "1.6")
    @y2(markerClass = {l.class})
    @f
    public static final long k0(int i10, long j10) {
        return e.j0(j10, i10);
    }

    public static final long l(long j10) {
        return e.m(j10 << 1);
    }

    @h1(version = "1.6")
    @y2(markerClass = {l.class})
    public static final long l0(double d10, @fh.g h hVar) {
        l0.p(hVar, "unit");
        double a10 = j.a(d10, hVar, h.NANOSECONDS);
        if (!Double.isNaN(a10)) {
            long M0 = d.M0(a10);
            return new p(-4611686018426999999L, f21247b).q(M0) ? l(M0) : k(d.M0(j.a(d10, hVar, h.MILLISECONDS)));
        }
        throw new IllegalArgumentException("Duration value cannot be NaN.".toString());
    }

    public static final long m(long j10) {
        return new p(-4611686018426999999L, f21247b).q(j10) ? l(j10) : j(e0(j10));
    }

    @h1(version = "1.6")
    @y2(markerClass = {l.class})
    public static final long m0(int i10, @fh.g h hVar) {
        l0.p(hVar, "unit");
        return hVar.compareTo(h.SECONDS) <= 0 ? l(j.c((long) i10, hVar, h.NANOSECONDS)) : n0((long) i10, hVar);
    }

    public static final long n(double d10) {
        return l0(d10, h.DAYS);
    }

    @h1(version = "1.6")
    @y2(markerClass = {l.class})
    public static final long n0(long j10, @fh.g h hVar) {
        l0.p(hVar, "unit");
        h hVar2 = h.NANOSECONDS;
        long c10 = j.c(f21247b, hVar2, hVar);
        return new p(-c10, c10).q(j10) ? l(j.c(j10, hVar, hVar2)) : j(v.K(j.b(j10, hVar, h.MILLISECONDS), -4611686018427387903L, 4611686018427387903L));
    }

    public static final long o(int i10) {
        return m0(i10, h.DAYS);
    }

    public static final long p(long j10) {
        return n0(j10, h.DAYS);
    }

    @h1(version = "1.3")
    @l(errorSince = "1.8", warningSince = "1.5")
    @l
    @k(message = "Use 'Double.days' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    public static /* synthetic */ void q(double d10) {
    }

    @h1(version = "1.3")
    @l(errorSince = "1.8", warningSince = "1.5")
    @l
    @k(message = "Use 'Int.days' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    public static /* synthetic */ void r(int i10) {
    }

    @h1(version = "1.3")
    @l(errorSince = "1.8", warningSince = "1.5")
    @l
    @k(message = "Use 'Long.days' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    public static /* synthetic */ void s(long j10) {
    }

    public static final long t(double d10) {
        return l0(d10, h.HOURS);
    }

    public static final long u(int i10) {
        return m0(i10, h.HOURS);
    }

    public static final long v(long j10) {
        return n0(j10, h.HOURS);
    }

    @h1(version = "1.3")
    @l(errorSince = "1.8", warningSince = "1.5")
    @l
    @k(message = "Use 'Double.hours' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    public static /* synthetic */ void w(double d10) {
    }

    @h1(version = "1.3")
    @l(errorSince = "1.8", warningSince = "1.5")
    @l
    @k(message = "Use 'Int.hours' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    public static /* synthetic */ void x(int i10) {
    }

    @h1(version = "1.3")
    @l(errorSince = "1.8", warningSince = "1.5")
    @l
    @k(message = "Use 'Long.hours' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    public static /* synthetic */ void y(long j10) {
    }

    public static final long z(double d10) {
        return l0(d10, h.MICROSECONDS);
    }
}
