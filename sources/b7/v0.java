package b7;

import b6.c;
import b6.x0;
import d.o0;
import w7.a;

public final class v0 extends x0 {

    /* renamed from: k  reason: collision with root package name */
    public static final Object f4708k = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final long f4709b;

    /* renamed from: c  reason: collision with root package name */
    public final long f4710c;

    /* renamed from: d  reason: collision with root package name */
    public final long f4711d;

    /* renamed from: e  reason: collision with root package name */
    public final long f4712e;

    /* renamed from: f  reason: collision with root package name */
    public final long f4713f;

    /* renamed from: g  reason: collision with root package name */
    public final long f4714g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f4715h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f4716i;
    @o0

    /* renamed from: j  reason: collision with root package name */
    public final Object f4717j;

    public v0(long j10, long j11, long j12, long j13, long j14, long j15, boolean z10, boolean z11, @o0 Object obj) {
        this.f4709b = j10;
        this.f4710c = j11;
        this.f4711d = j12;
        this.f4712e = j13;
        this.f4713f = j14;
        this.f4714g = j15;
        this.f4715h = z10;
        this.f4716i = z11;
        this.f4717j = obj;
    }

    public v0(long j10, long j11, long j12, long j13, boolean z10, boolean z11, @o0 Object obj) {
        this(c.f4201b, c.f4201b, j10, j11, j12, j13, z10, z11, obj);
    }

    public v0(long j10, boolean z10, boolean z11) {
        this(j10, z10, z11, (Object) null);
    }

    public v0(long j10, boolean z10, boolean z11, @o0 Object obj) {
        this(j10, j10, 0, 0, z10, z11, obj);
    }

    public int b(Object obj) {
        return f4708k.equals(obj) ? 0 : -1;
    }

    public x0.b g(int i10, x0.b bVar, boolean z10) {
        a.c(i10, 0, 1);
        return bVar.p((Object) null, z10 ? f4708k : null, 0, this.f4711d, -this.f4713f);
    }

    public int i() {
        return 1;
    }

    public Object m(int i10) {
        a.c(i10, 0, 1);
        return f4708k;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        if (r1 > r6) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b6.x0.c p(int r19, b6.x0.c r20, boolean r21, long r22) {
        /*
            r18 = this;
            r0 = r18
            r1 = 0
            r2 = 1
            r3 = r19
            w7.a.c(r3, r1, r2)
            if (r21 == 0) goto L_0x000e
            java.lang.Object r1 = r0.f4717j
            goto L_0x000f
        L_0x000e:
            r1 = 0
        L_0x000f:
            r3 = r1
            long r1 = r0.f4714g
            boolean r9 = r0.f4716i
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r9 == 0) goto L_0x0030
            r6 = 0
            int r6 = (r22 > r6 ? 1 : (r22 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0030
            long r6 = r0.f4712e
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 != 0) goto L_0x0029
        L_0x0027:
            r10 = r4
            goto L_0x0031
        L_0x0029:
            long r1 = r1 + r22
            int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x0030
            goto L_0x0027
        L_0x0030:
            r10 = r1
        L_0x0031:
            long r4 = r0.f4709b
            long r6 = r0.f4710c
            boolean r8 = r0.f4715h
            long r12 = r0.f4712e
            r14 = 0
            r15 = 0
            long r1 = r0.f4713f
            r16 = r1
            r2 = r20
            b6.x0$c r1 = r2.g(r3, r4, r6, r8, r9, r10, r12, r14, r15, r16)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.v0.p(int, b6.x0$c, boolean, long):b6.x0$c");
    }

    public int q() {
        return 1;
    }
}
