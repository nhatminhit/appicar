package r6;

import android.util.Pair;
import b6.c;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import d6.b0;
import j6.k;
import j6.s;
import java.util.Arrays;
import java.util.Collections;
import r6.h0;
import w7.t;
import w7.w;

public final class n implements m {

    /* renamed from: q  reason: collision with root package name */
    public static final int f12330q = 0;

    /* renamed from: r  reason: collision with root package name */
    public static final int f12331r = 179;

    /* renamed from: s  reason: collision with root package name */
    public static final int f12332s = 181;

    /* renamed from: t  reason: collision with root package name */
    public static final int f12333t = 184;

    /* renamed from: u  reason: collision with root package name */
    public static final int f12334u = 178;

    /* renamed from: v  reason: collision with root package name */
    public static final double[] f12335v = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a  reason: collision with root package name */
    public String f12336a;

    /* renamed from: b  reason: collision with root package name */
    public s f12337b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f12338c;

    /* renamed from: d  reason: collision with root package name */
    public long f12339d;

    /* renamed from: e  reason: collision with root package name */
    public final j0 f12340e;

    /* renamed from: f  reason: collision with root package name */
    public final w f12341f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean[] f12342g;

    /* renamed from: h  reason: collision with root package name */
    public final a f12343h;

    /* renamed from: i  reason: collision with root package name */
    public final t f12344i;

    /* renamed from: j  reason: collision with root package name */
    public long f12345j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f12346k;

    /* renamed from: l  reason: collision with root package name */
    public long f12347l;

    /* renamed from: m  reason: collision with root package name */
    public long f12348m;

    /* renamed from: n  reason: collision with root package name */
    public long f12349n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f12350o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f12351p;

    public static final class a {

        /* renamed from: e  reason: collision with root package name */
        public static final byte[] f12352e = {0, 0, 1};

        /* renamed from: a  reason: collision with root package name */
        public boolean f12353a;

        /* renamed from: b  reason: collision with root package name */
        public int f12354b;

        /* renamed from: c  reason: collision with root package name */
        public int f12355c;

        /* renamed from: d  reason: collision with root package name */
        public byte[] f12356d;

        public a(int i10) {
            this.f12356d = new byte[i10];
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f12353a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f12356d;
                int length = bArr2.length;
                int i13 = this.f12354b;
                if (length < i13 + i12) {
                    this.f12356d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f12356d, this.f12354b, i12);
                this.f12354b += i12;
            }
        }

        public boolean b(int i10, int i11) {
            if (this.f12353a) {
                int i12 = this.f12354b - i11;
                this.f12354b = i12;
                if (this.f12355c == 0 && i10 == 181) {
                    this.f12355c = i12;
                } else {
                    this.f12353a = false;
                    return true;
                }
            } else if (i10 == 179) {
                this.f12353a = true;
            }
            byte[] bArr = f12352e;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f12353a = false;
            this.f12354b = 0;
            this.f12355c = 0;
        }
    }

    public n() {
        this((j0) null);
    }

    public n(j0 j0Var) {
        w wVar;
        this.f12340e = j0Var;
        this.f12342g = new boolean[4];
        this.f12343h = new a(128);
        if (j0Var != null) {
            this.f12344i = new t(178, 128);
            wVar = new w();
        } else {
            wVar = null;
            this.f12344i = null;
        }
        this.f12341f = wVar;
    }

    public static Pair<Format, Long> a(a aVar, String str) {
        int i10;
        float f10;
        float f11;
        a aVar2 = aVar;
        byte[] copyOf = Arrays.copyOf(aVar2.f12356d, aVar2.f12354b);
        byte b10 = copyOf[5] & 255;
        int i11 = ((copyOf[4] & 255) << 4) | (b10 >> 4);
        byte b11 = ((b10 & 15) << 8) | (copyOf[6] & 255);
        int i12 = (copyOf[7] & 240) >> 4;
        if (i12 != 2) {
            if (i12 == 3) {
                f10 = (float) (b11 * 16);
                i10 = i11 * 9;
            } else if (i12 != 4) {
                f11 = 1.0f;
            } else {
                f10 = (float) (b11 * 121);
                i10 = i11 * 100;
            }
            f11 = f10 / ((float) i10);
        } else {
            f10 = (float) (b11 * 4);
            i10 = i11 * 3;
            f11 = f10 / ((float) i10);
        }
        Format G = Format.G(str, w7.s.f14827o, (String) null, -1, -1, i11, b11, -1.0f, Collections.singletonList(copyOf), -1, f11, (DrmInitData) null);
        long j10 = 0;
        int i13 = (copyOf[7] & 15) - 1;
        if (i13 >= 0) {
            double[] dArr = f12335v;
            if (i13 < dArr.length) {
                double d10 = dArr[i13];
                byte b12 = copyOf[aVar2.f12355c + 9];
                int i14 = (b12 & 96) >> 5;
                byte b13 = b12 & b0.f6265f;
                if (i14 != b13) {
                    d10 *= (((double) i14) + 1.0d) / ((double) (b13 + 1));
                }
                j10 = (long) (1000000.0d / d10);
            }
        }
        return Pair.create(G, Long.valueOf(j10));
    }

    public void b(w wVar) {
        int i10;
        w wVar2 = wVar;
        int c10 = wVar.c();
        int d10 = wVar.d();
        byte[] bArr = wVar2.f14880a;
        this.f12345j += (long) wVar.a();
        this.f12337b.a(wVar2, wVar.a());
        while (true) {
            int c11 = t.c(bArr, c10, d10, this.f12342g);
            if (c11 == d10) {
                break;
            }
            int i11 = c11 + 3;
            byte b10 = wVar2.f14880a[i11] & 255;
            int i12 = c11 - c10;
            boolean z10 = false;
            if (!this.f12338c) {
                if (i12 > 0) {
                    this.f12343h.a(bArr, c10, c11);
                }
                if (this.f12343h.b(b10, i12 < 0 ? -i12 : 0)) {
                    Pair<Format, Long> a10 = a(this.f12343h, this.f12336a);
                    this.f12337b.d((Format) a10.first);
                    this.f12339d = ((Long) a10.second).longValue();
                    this.f12338c = true;
                }
            }
            if (this.f12340e != null) {
                if (i12 > 0) {
                    this.f12344i.a(bArr, c10, c11);
                    i10 = 0;
                } else {
                    i10 = -i12;
                }
                if (this.f12344i.b(i10)) {
                    t tVar = this.f12344i;
                    this.f12341f.O(this.f12344i.f12506d, t.k(tVar.f12506d, tVar.f12507e));
                    this.f12340e.a(this.f12349n, this.f12341f);
                }
                if (b10 == 178 && wVar2.f14880a[c11 + 2] == 1) {
                    this.f12344i.e(b10);
                }
            }
            if (b10 == 0 || b10 == 179) {
                int i13 = d10 - c11;
                if (this.f12346k && this.f12351p && this.f12338c) {
                    this.f12337b.c(this.f12349n, this.f12350o ? 1 : 0, ((int) (this.f12345j - this.f12348m)) - i13, i13, (s.a) null);
                }
                boolean z11 = this.f12346k;
                if (!z11 || this.f12351p) {
                    this.f12348m = this.f12345j - ((long) i13);
                    long j10 = this.f12347l;
                    if (j10 == c.f4201b) {
                        j10 = z11 ? this.f12349n + this.f12339d : 0;
                    }
                    this.f12349n = j10;
                    this.f12350o = false;
                    this.f12347l = c.f4201b;
                    this.f12346k = true;
                }
                if (b10 == 0) {
                    z10 = true;
                }
                this.f12351p = z10;
            } else if (b10 == 184) {
                this.f12350o = true;
            }
            c10 = i11;
        }
        if (!this.f12338c) {
            this.f12343h.a(bArr, c10, d10);
        }
        if (this.f12340e != null) {
            this.f12344i.a(bArr, c10, d10);
        }
    }

    public void c() {
        t.a(this.f12342g);
        this.f12343h.c();
        if (this.f12340e != null) {
            this.f12344i.d();
        }
        this.f12345j = 0;
        this.f12346k = false;
    }

    public void d() {
    }

    public void e(k kVar, h0.e eVar) {
        eVar.a();
        this.f12336a = eVar.b();
        this.f12337b = kVar.a(eVar.c(), 2);
        j0 j0Var = this.f12340e;
        if (j0Var != null) {
            j0Var.b(kVar, eVar);
        }
    }

    public void f(long j10, int i10) {
        this.f12347l = j10;
    }
}
