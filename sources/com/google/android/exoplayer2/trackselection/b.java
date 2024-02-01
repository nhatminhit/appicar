package com.google.android.exoplayer2.trackselection;

import android.util.Pair;
import b6.e0;
import b6.f;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.trackselection.f;
import d.o0;
import d7.m;
import java.util.List;
import q7.l;
import t7.d;
import t7.p;

public final class b {

    /* renamed from: l  reason: collision with root package name */
    public static final int f5385l = 15000;

    /* renamed from: m  reason: collision with root package name */
    public static final int f5386m = 50000;

    /* renamed from: n  reason: collision with root package name */
    public static final int f5387n = 2500;

    /* renamed from: o  reason: collision with root package name */
    public static final int f5388o = 5000;

    /* renamed from: p  reason: collision with root package name */
    public static final int f5389p = 5000;

    /* renamed from: q  reason: collision with root package name */
    public static final float f5390q = 0.75f;

    /* renamed from: r  reason: collision with root package name */
    public static final int f5391r = 10000;
    @o0

    /* renamed from: a  reason: collision with root package name */
    public p f5392a;

    /* renamed from: b  reason: collision with root package name */
    public w7.c f5393b = w7.c.f14695a;

    /* renamed from: c  reason: collision with root package name */
    public int f5394c = 15000;

    /* renamed from: d  reason: collision with root package name */
    public int f5395d = 50000;

    /* renamed from: e  reason: collision with root package name */
    public int f5396e = 2500;

    /* renamed from: f  reason: collision with root package name */
    public int f5397f = 5000;

    /* renamed from: g  reason: collision with root package name */
    public int f5398g = 5000;

    /* renamed from: h  reason: collision with root package name */
    public float f5399h = 0.75f;

    /* renamed from: i  reason: collision with root package name */
    public int f5400i = 10000;

    /* renamed from: j  reason: collision with root package name */
    public c f5401j = c.f5422a;

    /* renamed from: k  reason: collision with root package name */
    public boolean f5402k;

    public class a implements f.b {
        public a() {
        }

        /* access modifiers changed from: private */
        public /* synthetic */ f d(d dVar, f.a aVar) {
            return new C0089b(aVar.f5442a, aVar.f5443b, dVar, b.this.f5394c, b.this.f5395d, b.this.f5398g, b.this.f5399h, b.this.f5400i, b.this.f5401j, b.this.f5393b, (a) null);
        }

        public f[] a(f.a[] aVarArr, d dVar) {
            return g.a(aVarArr, new q7.b(this, dVar));
        }

        public /* synthetic */ f b(TrackGroup trackGroup, d dVar, int... iArr) {
            return l.a(this, trackGroup, dVar, iArr);
        }
    }

    /* renamed from: com.google.android.exoplayer2.trackselection.b$b  reason: collision with other inner class name */
    public static final class C0089b extends q7.a {

        /* renamed from: x  reason: collision with root package name */
        public static final int f5404x = -1;

        /* renamed from: g  reason: collision with root package name */
        public final d f5405g;

        /* renamed from: h  reason: collision with root package name */
        public final w7.c f5406h;

        /* renamed from: i  reason: collision with root package name */
        public final c f5407i;

        /* renamed from: j  reason: collision with root package name */
        public final int[] f5408j;

        /* renamed from: k  reason: collision with root package name */
        public final long f5409k;

        /* renamed from: l  reason: collision with root package name */
        public final long f5410l;

        /* renamed from: m  reason: collision with root package name */
        public final long f5411m;

        /* renamed from: n  reason: collision with root package name */
        public final float f5412n;

        /* renamed from: o  reason: collision with root package name */
        public final long f5413o;

        /* renamed from: p  reason: collision with root package name */
        public final int f5414p;

        /* renamed from: q  reason: collision with root package name */
        public final int f5415q;

        /* renamed from: r  reason: collision with root package name */
        public final double f5416r;

        /* renamed from: s  reason: collision with root package name */
        public final double f5417s;

        /* renamed from: t  reason: collision with root package name */
        public boolean f5418t;

        /* renamed from: u  reason: collision with root package name */
        public int f5419u;

        /* renamed from: v  reason: collision with root package name */
        public int f5420v;

        /* renamed from: w  reason: collision with root package name */
        public float f5421w;

        public C0089b(TrackGroup trackGroup, int[] iArr, d dVar, int i10, int i11, int i12, float f10, int i13, c cVar, w7.c cVar2) {
            super(trackGroup, iArr);
            this.f5405g = dVar;
            long b10 = b6.c.b((long) i10);
            this.f5409k = b10;
            long b11 = b6.c.b((long) i11);
            this.f5410l = b11;
            long b12 = b6.c.b((long) i12);
            this.f5411m = b12;
            this.f5412n = f10;
            this.f5413o = b6.c.b((long) i13);
            this.f5407i = cVar;
            this.f5406h = cVar2;
            this.f5408j = new int[this.f12019b];
            int i14 = f(0).S;
            this.f5415q = i14;
            int i15 = f(this.f12019b - 1).S;
            this.f5414p = i15;
            this.f5420v = 0;
            this.f5421w = 1.0f;
            double log = ((double) ((b11 - b12) - b10)) / Math.log(((double) i14) / ((double) i15));
            this.f5416r = log;
            this.f5417s = ((double) b10) - (log * Math.log((double) i15));
        }

        public /* synthetic */ C0089b(TrackGroup trackGroup, int[] iArr, d dVar, int i10, int i11, int i12, float f10, int i13, c cVar, w7.c cVar2, a aVar) {
            this(trackGroup, iArr, dVar, i10, i11, i12, f10, i13, cVar, cVar2);
        }

        public static long t(long j10, long j11) {
            return j10 >= 0 ? j11 : j11 + j10;
        }

        public final void A(long j10) {
            for (int i10 = 0; i10 < this.f12019b; i10++) {
                if (j10 == Long.MIN_VALUE || !s(i10, j10)) {
                    this.f5408j[i10] = f(i10).S;
                } else {
                    this.f5408j[i10] = -1;
                }
            }
        }

        public int b() {
            return this.f5419u;
        }

        public void c(long j10, long j11, long j12, List<? extends d7.l> list, m[] mVarArr) {
            A(this.f5406h.a());
            if (this.f5420v == 0) {
                this.f5420v = 1;
                this.f5419u = w(true);
                return;
            }
            long t10 = t(j10, j11);
            int i10 = this.f5419u;
            if (this.f5418t) {
                z(t10);
            } else {
                y(t10);
            }
            if (this.f5419u != i10) {
                this.f5420v = 3;
            }
        }

        public int m() {
            return this.f5420v;
        }

        public void n(float f10) {
            this.f5421w = f10;
        }

        @o0
        public Object p() {
            return null;
        }

        public void q() {
            this.f5418t = false;
        }

        public final long u(int i10) {
            return i10 <= this.f5414p ? this.f5409k : i10 >= this.f5415q ? this.f5410l - this.f5411m : (long) ((int) ((this.f5416r * Math.log((double) i10)) + this.f5417s));
        }

        public final boolean v(long j10) {
            int i10 = this.f5408j[this.f5419u];
            return i10 == -1 || Math.abs(j10 - u(i10)) > this.f5411m;
        }

        public final int w(boolean z10) {
            long g10 = (long) (((float) this.f5405g.g()) * this.f5412n);
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int[] iArr = this.f5408j;
                if (i10 >= iArr.length) {
                    return i11;
                }
                int i12 = iArr[i10];
                if (i12 != -1) {
                    if (((long) Math.round(((float) i12) * this.f5421w)) <= g10 && this.f5407i.a(f(i10), this.f5408j[i10], z10)) {
                        return i10;
                    }
                    i11 = i10;
                }
                i10++;
            }
        }

        public final int x(long j10) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int[] iArr = this.f5408j;
                if (i10 >= iArr.length) {
                    return i11;
                }
                int i12 = iArr[i10];
                if (i12 != -1) {
                    if (u(i12) <= j10 && this.f5407i.a(f(i10), this.f5408j[i10], false)) {
                        return i10;
                    }
                    i11 = i10;
                }
                i10++;
            }
        }

        public final void y(long j10) {
            int w10 = w(false);
            int x10 = x(j10);
            int i10 = this.f5419u;
            if (x10 <= i10) {
                this.f5419u = x10;
                this.f5418t = true;
            } else if (j10 >= this.f5413o || w10 >= i10 || this.f5408j[i10] == -1) {
                this.f5419u = w10;
            }
        }

        public final void z(long j10) {
            if (v(j10)) {
                this.f5419u = x(j10);
            }
        }
    }

    public interface c {

        /* renamed from: a  reason: collision with root package name */
        public static final c f5422a = new q7.c();

        boolean a(Format format, int i10, boolean z10);
    }

    public Pair<f.b, e0> h() {
        w7.a.a(this.f5398g < this.f5395d - this.f5394c);
        w7.a.i(!this.f5402k);
        this.f5402k = true;
        f.a f10 = new f.a().f(Integer.MAX_VALUE);
        int i10 = this.f5395d;
        f.a d10 = f10.d(i10, i10, this.f5396e, this.f5397f);
        p pVar = this.f5392a;
        if (pVar != null) {
            d10.b(pVar);
        }
        return Pair.create(new a(), d10.a());
    }

    public b i(p pVar) {
        w7.a.i(!this.f5402k);
        this.f5392a = pVar;
        return this;
    }

    public b j(int i10, int i11, int i12, int i13) {
        w7.a.i(!this.f5402k);
        this.f5394c = i10;
        this.f5395d = i11;
        this.f5396e = i12;
        this.f5397f = i13;
        return this;
    }

    public b k(w7.c cVar) {
        w7.a.i(!this.f5402k);
        this.f5393b = cVar;
        return this;
    }

    public b l(c cVar) {
        w7.a.i(!this.f5402k);
        this.f5401j = cVar;
        return this;
    }

    public b m(int i10) {
        w7.a.i(!this.f5402k);
        this.f5398g = i10;
        return this;
    }

    public b n(float f10, int i10) {
        w7.a.i(!this.f5402k);
        this.f5399h = f10;
        this.f5400i = i10;
        return this;
    }
}
