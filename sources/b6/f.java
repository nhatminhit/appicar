package b6;

import com.google.android.exoplayer2.source.TrackGroupArray;
import q7.m;
import t7.b;
import t7.p;
import w7.q0;

public class f implements e0 {

    /* renamed from: n  reason: collision with root package name */
    public static final int f4303n = 15000;

    /* renamed from: o  reason: collision with root package name */
    public static final int f4304o = 50000;

    /* renamed from: p  reason: collision with root package name */
    public static final int f4305p = 2500;

    /* renamed from: q  reason: collision with root package name */
    public static final int f4306q = 5000;

    /* renamed from: r  reason: collision with root package name */
    public static final int f4307r = -1;

    /* renamed from: s  reason: collision with root package name */
    public static final boolean f4308s = true;

    /* renamed from: t  reason: collision with root package name */
    public static final int f4309t = 0;

    /* renamed from: u  reason: collision with root package name */
    public static final boolean f4310u = false;

    /* renamed from: a  reason: collision with root package name */
    public final p f4311a;

    /* renamed from: b  reason: collision with root package name */
    public final long f4312b;

    /* renamed from: c  reason: collision with root package name */
    public final long f4313c;

    /* renamed from: d  reason: collision with root package name */
    public final long f4314d;

    /* renamed from: e  reason: collision with root package name */
    public final long f4315e;

    /* renamed from: f  reason: collision with root package name */
    public final long f4316f;

    /* renamed from: g  reason: collision with root package name */
    public final int f4317g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f4318h;

    /* renamed from: i  reason: collision with root package name */
    public final long f4319i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f4320j;

    /* renamed from: k  reason: collision with root package name */
    public int f4321k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f4322l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f4323m;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public p f4324a;

        /* renamed from: b  reason: collision with root package name */
        public int f4325b = 15000;

        /* renamed from: c  reason: collision with root package name */
        public int f4326c = 50000;

        /* renamed from: d  reason: collision with root package name */
        public int f4327d = 50000;

        /* renamed from: e  reason: collision with root package name */
        public int f4328e = 2500;

        /* renamed from: f  reason: collision with root package name */
        public int f4329f = 5000;

        /* renamed from: g  reason: collision with root package name */
        public int f4330g = -1;

        /* renamed from: h  reason: collision with root package name */
        public boolean f4331h = true;

        /* renamed from: i  reason: collision with root package name */
        public int f4332i = 0;

        /* renamed from: j  reason: collision with root package name */
        public boolean f4333j = false;

        /* renamed from: k  reason: collision with root package name */
        public boolean f4334k;

        public f a() {
            w7.a.i(!this.f4334k);
            this.f4334k = true;
            if (this.f4324a == null) {
                this.f4324a = new p(true, 65536);
            }
            return new f(this.f4324a, this.f4325b, this.f4326c, this.f4327d, this.f4328e, this.f4329f, this.f4330g, this.f4331h, this.f4332i, this.f4333j);
        }

        public a b(p pVar) {
            w7.a.i(!this.f4334k);
            this.f4324a = pVar;
            return this;
        }

        public a c(int i10, boolean z10) {
            w7.a.i(!this.f4334k);
            f.k(i10, 0, "backBufferDurationMs", "0");
            this.f4332i = i10;
            this.f4333j = z10;
            return this;
        }

        public a d(int i10, int i11, int i12, int i13) {
            w7.a.i(!this.f4334k);
            f.k(i12, 0, "bufferForPlaybackMs", "0");
            f.k(i13, 0, "bufferForPlaybackAfterRebufferMs", "0");
            f.k(i10, i12, "minBufferMs", "bufferForPlaybackMs");
            f.k(i10, i13, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
            f.k(i11, i10, "maxBufferMs", "minBufferMs");
            this.f4325b = i10;
            this.f4326c = i10;
            this.f4327d = i11;
            this.f4328e = i12;
            this.f4329f = i13;
            return this;
        }

        public a e(boolean z10) {
            w7.a.i(!this.f4334k);
            this.f4331h = z10;
            return this;
        }

        public a f(int i10) {
            w7.a.i(!this.f4334k);
            this.f4330g = i10;
            return this;
        }
    }

    public f() {
        this(new p(true, 65536));
    }

    @Deprecated
    public f(p pVar) {
        this(pVar, 15000, 50000, 50000, 2500, 5000, -1, true, 0, false);
    }

    public f(p pVar, int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, int i16, boolean z11) {
        int i17 = i11;
        int i18 = i12;
        int i19 = i13;
        int i20 = i14;
        int i21 = i16;
        k(i19, 0, "bufferForPlaybackMs", "0");
        k(i20, 0, "bufferForPlaybackAfterRebufferMs", "0");
        k(i10, i19, "minBufferAudioMs", "bufferForPlaybackMs");
        k(i17, i19, "minBufferVideoMs", "bufferForPlaybackMs");
        k(i10, i20, "minBufferAudioMs", "bufferForPlaybackAfterRebufferMs");
        k(i17, i20, "minBufferVideoMs", "bufferForPlaybackAfterRebufferMs");
        k(i18, i10, "maxBufferMs", "minBufferAudioMs");
        k(i18, i17, "maxBufferMs", "minBufferVideoMs");
        k(i21, 0, "backBufferDurationMs", "0");
        this.f4311a = pVar;
        this.f4312b = c.b((long) i10);
        this.f4313c = c.b((long) i17);
        this.f4314d = c.b((long) i18);
        this.f4315e = c.b((long) i19);
        this.f4316f = c.b((long) i20);
        this.f4317g = i15;
        this.f4318h = z10;
        this.f4319i = c.b((long) i21);
        this.f4320j = z11;
    }

    @Deprecated
    public f(p pVar, int i10, int i11, int i12, int i13, int i14, boolean z10) {
        this(pVar, i10, i10, i11, i12, i13, i14, z10, 0, false);
    }

    public static void k(int i10, int i11, String str, String str2) {
        boolean z10 = i10 >= i11;
        w7.a.b(z10, str + " cannot be less than " + str2);
    }

    public static boolean m(r0[] r0VarArr, m mVar) {
        for (int i10 = 0; i10 < r0VarArr.length; i10++) {
            if (r0VarArr[i10].f() == 2 && mVar.a(i10) != null) {
                return true;
            }
        }
        return false;
    }

    public void a() {
        n(false);
    }

    public boolean b() {
        return this.f4320j;
    }

    public long c() {
        return this.f4319i;
    }

    public void d(r0[] r0VarArr, TrackGroupArray trackGroupArray, m mVar) {
        this.f4323m = m(r0VarArr, mVar);
        int i10 = this.f4317g;
        if (i10 == -1) {
            i10 = l(r0VarArr, mVar);
        }
        this.f4321k = i10;
        this.f4311a.h(i10);
    }

    public boolean e(long j10, float f10, boolean z10) {
        long c02 = q0.c0(j10, f10);
        long j11 = z10 ? this.f4316f : this.f4315e;
        return j11 <= 0 || c02 >= j11 || (!this.f4318h && this.f4311a.d() >= this.f4321k);
    }

    public boolean f(long j10, float f10) {
        boolean z10 = true;
        boolean z11 = this.f4311a.d() >= this.f4321k;
        long j11 = this.f4323m ? this.f4313c : this.f4312b;
        if (f10 > 1.0f) {
            j11 = Math.min(q0.V(j11, f10), this.f4314d);
        }
        if (j10 < j11) {
            if (!this.f4318h && z11) {
                z10 = false;
            }
            this.f4322l = z10;
        } else if (j10 >= this.f4314d || z11) {
            this.f4322l = false;
        }
        return this.f4322l;
    }

    public void g() {
        n(true);
    }

    public b h() {
        return this.f4311a;
    }

    public void i() {
        n(true);
    }

    public int l(r0[] r0VarArr, m mVar) {
        int i10 = 0;
        for (int i11 = 0; i11 < r0VarArr.length; i11++) {
            if (mVar.a(i11) != null) {
                i10 += q0.O(r0VarArr[i11].f());
            }
        }
        return i10;
    }

    public final void n(boolean z10) {
        this.f4321k = 0;
        this.f4322l = false;
        if (z10) {
            this.f4311a.g();
        }
    }
}
