package r6;

import android.util.Pair;
import b6.c;
import b6.j0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import j6.h;
import j6.k;
import j6.s;
import java.util.Arrays;
import java.util.Collections;
import r6.h0;
import w7.d;
import w7.p;
import w7.v;
import w7.w;

public final class i implements m {
    public static final int A = 4;
    public static final int B = 5;
    public static final int C = 2;
    public static final int D = 8;
    public static final int E = 256;
    public static final int F = 512;
    public static final int G = 768;
    public static final int H = 1024;
    public static final int I = 10;
    public static final int J = 6;
    public static final byte[] K = {73, 68, 51};
    public static final int L = -1;

    /* renamed from: v  reason: collision with root package name */
    public static final String f12270v = "AdtsReader";

    /* renamed from: w  reason: collision with root package name */
    public static final int f12271w = 0;

    /* renamed from: x  reason: collision with root package name */
    public static final int f12272x = 1;

    /* renamed from: y  reason: collision with root package name */
    public static final int f12273y = 2;

    /* renamed from: z  reason: collision with root package name */
    public static final int f12274z = 3;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f12275a;

    /* renamed from: b  reason: collision with root package name */
    public final v f12276b;

    /* renamed from: c  reason: collision with root package name */
    public final w f12277c;

    /* renamed from: d  reason: collision with root package name */
    public final String f12278d;

    /* renamed from: e  reason: collision with root package name */
    public String f12279e;

    /* renamed from: f  reason: collision with root package name */
    public s f12280f;

    /* renamed from: g  reason: collision with root package name */
    public s f12281g;

    /* renamed from: h  reason: collision with root package name */
    public int f12282h;

    /* renamed from: i  reason: collision with root package name */
    public int f12283i;

    /* renamed from: j  reason: collision with root package name */
    public int f12284j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f12285k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f12286l;

    /* renamed from: m  reason: collision with root package name */
    public int f12287m;

    /* renamed from: n  reason: collision with root package name */
    public int f12288n;

    /* renamed from: o  reason: collision with root package name */
    public int f12289o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f12290p;

    /* renamed from: q  reason: collision with root package name */
    public long f12291q;

    /* renamed from: r  reason: collision with root package name */
    public int f12292r;

    /* renamed from: s  reason: collision with root package name */
    public long f12293s;

    /* renamed from: t  reason: collision with root package name */
    public s f12294t;

    /* renamed from: u  reason: collision with root package name */
    public long f12295u;

    public i(boolean z10) {
        this(z10, (String) null);
    }

    public i(boolean z10, String str) {
        this.f12276b = new v(new byte[7]);
        this.f12277c = new w(Arrays.copyOf(K, 10));
        r();
        this.f12287m = -1;
        this.f12288n = -1;
        this.f12291q = c.f4201b;
        this.f12275a = z10;
        this.f12278d = str;
    }

    public static boolean l(int i10) {
        return (i10 & 65526) == 65520;
    }

    public final void a(w wVar) {
        if (wVar.a() != 0) {
            this.f12276b.f14876a[0] = wVar.f14880a[wVar.c()];
            this.f12276b.n(2);
            int h10 = this.f12276b.h(4);
            int i10 = this.f12288n;
            if (i10 == -1 || h10 == i10) {
                if (!this.f12286l) {
                    this.f12286l = true;
                    this.f12287m = this.f12289o;
                    this.f12288n = h10;
                }
                s();
                return;
            }
            p();
        }
    }

    public void b(w wVar) throws j0 {
        while (wVar.a() > 0) {
            int i10 = this.f12282h;
            if (i10 == 0) {
                i(wVar);
            } else if (i10 == 1) {
                a(wVar);
            } else if (i10 != 2) {
                if (i10 == 3) {
                    if (h(wVar, this.f12276b.f14876a, this.f12285k ? 7 : 5)) {
                        m();
                    }
                } else if (i10 == 4) {
                    o(wVar);
                } else {
                    throw new IllegalStateException();
                }
            } else if (h(wVar, this.f12277c.f14880a, 10)) {
                n();
            }
        }
    }

    public void c() {
        p();
    }

    public void d() {
    }

    public void e(k kVar, h0.e eVar) {
        eVar.a();
        this.f12279e = eVar.b();
        this.f12280f = kVar.a(eVar.c(), 1);
        if (this.f12275a) {
            eVar.a();
            s a10 = kVar.a(eVar.c(), 4);
            this.f12281g = a10;
            a10.d(Format.w(eVar.b(), w7.s.Z, (String) null, -1, (DrmInitData) null));
            return;
        }
        this.f12281g = new h();
    }

    public void f(long j10, int i10) {
        this.f12293s = j10;
    }

    public final boolean g(w wVar, int i10) {
        wVar.Q(i10 + 1);
        if (!v(wVar, this.f12276b.f14876a, 1)) {
            return false;
        }
        this.f12276b.n(4);
        int h10 = this.f12276b.h(1);
        int i11 = this.f12287m;
        if (i11 != -1 && h10 != i11) {
            return false;
        }
        if (this.f12288n != -1) {
            if (!v(wVar, this.f12276b.f14876a, 1)) {
                return true;
            }
            this.f12276b.n(2);
            if (this.f12276b.h(4) != this.f12288n) {
                return false;
            }
            wVar.Q(i10 + 2);
        }
        if (!v(wVar, this.f12276b.f14876a, 4)) {
            return true;
        }
        this.f12276b.n(14);
        int h11 = this.f12276b.h(13);
        if (h11 <= 6) {
            return false;
        }
        int i12 = i10 + h11;
        int i13 = i12 + 1;
        if (i13 >= wVar.d()) {
            return true;
        }
        byte[] bArr = wVar.f14880a;
        return k(bArr[i12], bArr[i13]) && (this.f12287m == -1 || ((wVar.f14880a[i13] & 8) >> 3) == h10);
    }

    public final boolean h(w wVar, byte[] bArr, int i10) {
        int min = Math.min(wVar.a(), i10 - this.f12283i);
        wVar.i(bArr, this.f12283i, min);
        int i11 = this.f12283i + min;
        this.f12283i = i11;
        return i11 == i10;
    }

    public final void i(w wVar) {
        int i10;
        byte[] bArr = wVar.f14880a;
        int c10 = wVar.c();
        int d10 = wVar.d();
        while (c10 < d10) {
            int i11 = c10 + 1;
            byte b10 = bArr[c10] & 255;
            if (this.f12284j != 512 || !k((byte) -1, (byte) b10) || (!this.f12286l && !g(wVar, i11 - 2))) {
                int i12 = this.f12284j;
                byte b11 = b10 | i12;
                if (b11 != 329) {
                    if (b11 == 511) {
                        this.f12284j = 512;
                    } else if (b11 == 836) {
                        i10 = 1024;
                    } else if (b11 == 1075) {
                        t();
                        wVar.Q(i11);
                        return;
                    } else if (i12 != 256) {
                        this.f12284j = 256;
                        i11--;
                    }
                    c10 = i11;
                } else {
                    i10 = G;
                }
                this.f12284j = i10;
                c10 = i11;
            } else {
                this.f12289o = (b10 & 8) >> 3;
                boolean z10 = true;
                if ((b10 & 1) != 0) {
                    z10 = false;
                }
                this.f12285k = z10;
                if (!this.f12286l) {
                    q();
                } else {
                    s();
                }
                wVar.Q(i11);
                return;
            }
        }
        wVar.Q(c10);
    }

    public long j() {
        return this.f12291q;
    }

    public final boolean k(byte b10, byte b11) {
        return l(((b10 & 255) << 8) | (b11 & 255));
    }

    public final void m() throws j0 {
        this.f12276b.n(0);
        if (!this.f12290p) {
            int h10 = this.f12276b.h(2) + 1;
            if (h10 != 2) {
                p.l(f12270v, "Detected audio object type: " + h10 + ", but assuming AAC LC.");
                h10 = 2;
            }
            this.f12276b.p(5);
            byte[] a10 = d.a(h10, this.f12288n, this.f12276b.h(3));
            Pair<Integer, Integer> j10 = d.j(a10);
            Format r10 = Format.r(this.f12279e, w7.s.f14836u, (String) null, -1, -1, ((Integer) j10.second).intValue(), ((Integer) j10.first).intValue(), Collections.singletonList(a10), (DrmInitData) null, 0, this.f12278d);
            this.f12291q = 1024000000 / ((long) r10.f5078k0);
            this.f12280f.d(r10);
            this.f12290p = true;
        } else {
            this.f12276b.p(10);
        }
        this.f12276b.p(4);
        int h11 = (this.f12276b.h(13) - 2) - 5;
        if (this.f12285k) {
            h11 -= 2;
        }
        u(this.f12280f, this.f12291q, 0, h11);
    }

    public final void n() {
        this.f12281g.a(this.f12277c, 10);
        this.f12277c.Q(6);
        u(this.f12281g, 0, 10, this.f12277c.C() + 10);
    }

    public final void o(w wVar) {
        int min = Math.min(wVar.a(), this.f12292r - this.f12283i);
        this.f12294t.a(wVar, min);
        int i10 = this.f12283i + min;
        this.f12283i = i10;
        int i11 = this.f12292r;
        if (i10 == i11) {
            this.f12294t.c(this.f12293s, 1, i11, 0, (s.a) null);
            this.f12293s += this.f12295u;
            r();
        }
    }

    public final void p() {
        this.f12286l = false;
        r();
    }

    public final void q() {
        this.f12282h = 1;
        this.f12283i = 0;
    }

    public final void r() {
        this.f12282h = 0;
        this.f12283i = 0;
        this.f12284j = 256;
    }

    public final void s() {
        this.f12282h = 3;
        this.f12283i = 0;
    }

    public final void t() {
        this.f12282h = 2;
        this.f12283i = K.length;
        this.f12292r = 0;
        this.f12277c.Q(0);
    }

    public final void u(s sVar, long j10, int i10, int i11) {
        this.f12282h = 4;
        this.f12283i = i10;
        this.f12294t = sVar;
        this.f12295u = j10;
        this.f12292r = i11;
    }

    public final boolean v(w wVar, byte[] bArr, int i10) {
        if (wVar.a() < i10) {
            return false;
        }
        wVar.i(bArr, 0, i10);
        return true;
    }
}
