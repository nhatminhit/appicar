package r6;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import d6.a;
import j6.k;
import j6.s;
import java.util.List;
import r6.h0;
import w7.v;
import w7.w;

public final class c implements m {

    /* renamed from: m  reason: collision with root package name */
    public static final int f12138m = 0;

    /* renamed from: n  reason: collision with root package name */
    public static final int f12139n = 1;

    /* renamed from: o  reason: collision with root package name */
    public static final int f12140o = 2;

    /* renamed from: p  reason: collision with root package name */
    public static final int f12141p = 128;

    /* renamed from: a  reason: collision with root package name */
    public final v f12142a;

    /* renamed from: b  reason: collision with root package name */
    public final w f12143b;

    /* renamed from: c  reason: collision with root package name */
    public final String f12144c;

    /* renamed from: d  reason: collision with root package name */
    public String f12145d;

    /* renamed from: e  reason: collision with root package name */
    public s f12146e;

    /* renamed from: f  reason: collision with root package name */
    public int f12147f;

    /* renamed from: g  reason: collision with root package name */
    public int f12148g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f12149h;

    /* renamed from: i  reason: collision with root package name */
    public long f12150i;

    /* renamed from: j  reason: collision with root package name */
    public Format f12151j;

    /* renamed from: k  reason: collision with root package name */
    public int f12152k;

    /* renamed from: l  reason: collision with root package name */
    public long f12153l;

    public c() {
        this((String) null);
    }

    public c(String str) {
        v vVar = new v(new byte[128]);
        this.f12142a = vVar;
        this.f12143b = new w(vVar.f14876a);
        this.f12147f = 0;
        this.f12144c = str;
    }

    public final boolean a(w wVar, byte[] bArr, int i10) {
        int min = Math.min(wVar.a(), i10 - this.f12148g);
        wVar.i(bArr, this.f12148g, min);
        int i11 = this.f12148g + min;
        this.f12148g = i11;
        return i11 == i10;
    }

    public void b(w wVar) {
        while (wVar.a() > 0) {
            int i10 = this.f12147f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(wVar.a(), this.f12152k - this.f12148g);
                        this.f12146e.a(wVar, min);
                        int i11 = this.f12148g + min;
                        this.f12148g = i11;
                        int i12 = this.f12152k;
                        if (i11 == i12) {
                            this.f12146e.c(this.f12153l, 1, i12, 0, (s.a) null);
                            this.f12153l += this.f12150i;
                            this.f12147f = 0;
                        }
                    }
                } else if (a(wVar, this.f12143b.f14880a, 128)) {
                    g();
                    this.f12143b.Q(0);
                    this.f12146e.a(this.f12143b, 128);
                    this.f12147f = 2;
                }
            } else if (h(wVar)) {
                this.f12147f = 1;
                byte[] bArr = this.f12143b.f14880a;
                bArr[0] = 11;
                bArr[1] = 119;
                this.f12148g = 2;
            }
        }
    }

    public void c() {
        this.f12147f = 0;
        this.f12148g = 0;
        this.f12149h = false;
    }

    public void d() {
    }

    public void e(k kVar, h0.e eVar) {
        eVar.a();
        this.f12145d = eVar.b();
        this.f12146e = kVar.a(eVar.c(), 1);
    }

    public void f(long j10, int i10) {
        this.f12153l = j10;
    }

    public final void g() {
        this.f12142a.n(0);
        a.b e10 = a.e(this.f12142a);
        Format format = this.f12151j;
        if (!(format != null && e10.f6195d == format.f5077j0 && e10.f6194c == format.f5078k0 && e10.f6192a == format.W)) {
            Format r10 = Format.r(this.f12145d, e10.f6192a, (String) null, -1, -1, e10.f6195d, e10.f6194c, (List<byte[]>) null, (DrmInitData) null, 0, this.f12144c);
            this.f12151j = r10;
            this.f12146e.d(r10);
        }
        this.f12152k = e10.f6196e;
        this.f12150i = (((long) e10.f6197f) * 1000000) / ((long) this.f12151j.f5078k0);
    }

    public final boolean h(w wVar) {
        while (true) {
            boolean z10 = false;
            if (wVar.a() <= 0) {
                return false;
            }
            if (this.f12149h) {
                int D = wVar.D();
                if (D == 119) {
                    this.f12149h = false;
                    return true;
                } else if (D != 11) {
                    this.f12149h = z10;
                }
            } else if (wVar.D() != 11) {
                this.f12149h = z10;
            }
            z10 = true;
            this.f12149h = z10;
        }
    }
}
