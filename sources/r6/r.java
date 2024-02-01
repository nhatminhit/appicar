package r6;

import android.util.Pair;
import b6.j0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import d.o0;
import j6.k;
import j6.s;
import java.util.Collections;
import r6.h0;
import w7.d;
import w7.v;
import w7.w;

public final class r implements m {
    public static final int A = 224;

    /* renamed from: u  reason: collision with root package name */
    public static final int f12461u = 0;

    /* renamed from: v  reason: collision with root package name */
    public static final int f12462v = 1;

    /* renamed from: w  reason: collision with root package name */
    public static final int f12463w = 2;

    /* renamed from: x  reason: collision with root package name */
    public static final int f12464x = 3;

    /* renamed from: y  reason: collision with root package name */
    public static final int f12465y = 1024;

    /* renamed from: z  reason: collision with root package name */
    public static final int f12466z = 86;

    /* renamed from: a  reason: collision with root package name */
    public final String f12467a;

    /* renamed from: b  reason: collision with root package name */
    public final w f12468b;

    /* renamed from: c  reason: collision with root package name */
    public final v f12469c;

    /* renamed from: d  reason: collision with root package name */
    public s f12470d;

    /* renamed from: e  reason: collision with root package name */
    public Format f12471e;

    /* renamed from: f  reason: collision with root package name */
    public String f12472f;

    /* renamed from: g  reason: collision with root package name */
    public int f12473g;

    /* renamed from: h  reason: collision with root package name */
    public int f12474h;

    /* renamed from: i  reason: collision with root package name */
    public int f12475i;

    /* renamed from: j  reason: collision with root package name */
    public int f12476j;

    /* renamed from: k  reason: collision with root package name */
    public long f12477k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f12478l;

    /* renamed from: m  reason: collision with root package name */
    public int f12479m;

    /* renamed from: n  reason: collision with root package name */
    public int f12480n;

    /* renamed from: o  reason: collision with root package name */
    public int f12481o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f12482p;

    /* renamed from: q  reason: collision with root package name */
    public long f12483q;

    /* renamed from: r  reason: collision with root package name */
    public int f12484r;

    /* renamed from: s  reason: collision with root package name */
    public long f12485s;

    /* renamed from: t  reason: collision with root package name */
    public int f12486t;

    public r(@o0 String str) {
        this.f12467a = str;
        w wVar = new w(1024);
        this.f12468b = wVar;
        this.f12469c = new v(wVar.f14880a);
    }

    public static long a(v vVar) {
        return (long) vVar.h((vVar.h(2) + 1) * 8);
    }

    public void b(w wVar) throws j0 {
        while (wVar.a() > 0) {
            int i10 = this.f12473g;
            if (i10 != 0) {
                if (i10 == 1) {
                    int D = wVar.D();
                    if ((D & 224) == 224) {
                        this.f12476j = D;
                        this.f12473g = 2;
                    } else if (D == 86) {
                    }
                } else if (i10 == 2) {
                    int D2 = ((this.f12476j & -225) << 8) | wVar.D();
                    this.f12475i = D2;
                    if (D2 > this.f12468b.f14880a.length) {
                        m(D2);
                    }
                    this.f12474h = 0;
                    this.f12473g = 3;
                } else if (i10 == 3) {
                    int min = Math.min(wVar.a(), this.f12475i - this.f12474h);
                    wVar.i(this.f12469c.f14876a, this.f12474h, min);
                    int i11 = this.f12474h + min;
                    this.f12474h = i11;
                    if (i11 == this.f12475i) {
                        this.f12469c.n(0);
                        g(this.f12469c);
                    }
                } else {
                    throw new IllegalStateException();
                }
                this.f12473g = 0;
            } else if (wVar.D() == 86) {
                this.f12473g = 1;
            }
        }
    }

    public void c() {
        this.f12473g = 0;
        this.f12478l = false;
    }

    public void d() {
    }

    public void e(k kVar, h0.e eVar) {
        eVar.a();
        this.f12470d = kVar.a(eVar.c(), 1);
        this.f12472f = eVar.b();
    }

    public void f(long j10, int i10) {
        this.f12477k = j10;
    }

    public final void g(v vVar) throws j0 {
        if (!vVar.g()) {
            this.f12478l = true;
            l(vVar);
        } else if (!this.f12478l) {
            return;
        }
        if (this.f12479m != 0) {
            throw new j0();
        } else if (this.f12480n == 0) {
            k(vVar, j(vVar));
            if (this.f12482p) {
                vVar.p((int) this.f12483q);
            }
        } else {
            throw new j0();
        }
    }

    public final int h(v vVar) throws j0 {
        int b10 = vVar.b();
        Pair<Integer, Integer> i10 = d.i(vVar, true);
        this.f12484r = ((Integer) i10.first).intValue();
        this.f12486t = ((Integer) i10.second).intValue();
        return b10 - vVar.b();
    }

    public final void i(v vVar) {
        int i10;
        int h10 = vVar.h(3);
        this.f12481o = h10;
        if (h10 == 0) {
            i10 = 8;
        } else if (h10 == 1) {
            i10 = 9;
        } else if (h10 == 3 || h10 == 4 || h10 == 5) {
            vVar.p(6);
            return;
        } else if (h10 == 6 || h10 == 7) {
            vVar.p(1);
            return;
        } else {
            throw new IllegalStateException();
        }
        vVar.p(i10);
    }

    public final int j(v vVar) throws j0 {
        int h10;
        if (this.f12481o == 0) {
            int i10 = 0;
            do {
                h10 = vVar.h(8);
                i10 += h10;
            } while (h10 == 255);
            return i10;
        }
        throw new j0();
    }

    public final void k(v vVar, int i10) {
        int e10 = vVar.e();
        if ((e10 & 7) == 0) {
            this.f12468b.Q(e10 >> 3);
        } else {
            vVar.i(this.f12468b.f14880a, 0, i10 * 8);
            this.f12468b.Q(0);
        }
        this.f12470d.a(this.f12468b, i10);
        this.f12470d.c(this.f12477k, 1, i10, 0, (s.a) null);
        this.f12477k += this.f12485s;
    }

    public final void l(v vVar) throws j0 {
        boolean g10;
        v vVar2 = vVar;
        int h10 = vVar2.h(1);
        int h11 = h10 == 1 ? vVar2.h(1) : 0;
        this.f12479m = h11;
        if (h11 == 0) {
            if (h10 == 1) {
                a(vVar);
            }
            if (vVar.g()) {
                this.f12480n = vVar2.h(6);
                int h12 = vVar2.h(4);
                int h13 = vVar2.h(3);
                if (h12 == 0 && h13 == 0) {
                    if (h10 == 0) {
                        int e10 = vVar.e();
                        int h14 = h(vVar);
                        vVar2.n(e10);
                        byte[] bArr = new byte[((h14 + 7) / 8)];
                        vVar2.i(bArr, 0, h14);
                        Format r10 = Format.r(this.f12472f, w7.s.f14836u, (String) null, -1, -1, this.f12486t, this.f12484r, Collections.singletonList(bArr), (DrmInitData) null, 0, this.f12467a);
                        if (!r10.equals(this.f12471e)) {
                            this.f12471e = r10;
                            this.f12485s = 1024000000 / ((long) r10.f5078k0);
                            this.f12470d.d(r10);
                        }
                    } else {
                        vVar2.p(((int) a(vVar)) - h(vVar));
                    }
                    i(vVar);
                    boolean g11 = vVar.g();
                    this.f12482p = g11;
                    this.f12483q = 0;
                    if (g11) {
                        if (h10 == 1) {
                            this.f12483q = a(vVar);
                        } else {
                            do {
                                g10 = vVar.g();
                                this.f12483q = (this.f12483q << 8) + ((long) vVar2.h(8));
                            } while (g10);
                        }
                    }
                    if (vVar.g()) {
                        vVar2.p(8);
                        return;
                    }
                    return;
                }
                throw new j0();
            }
            throw new j0();
        }
        throw new j0();
    }

    public final void m(int i10) {
        this.f12468b.M(i10);
        this.f12469c.l(this.f12468b.f14880a);
    }
}
