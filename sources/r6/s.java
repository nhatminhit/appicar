package r6;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import j6.k;
import j6.o;
import j6.s;
import java.util.List;
import r6.h0;
import w7.w;

public final class s implements m {

    /* renamed from: m  reason: collision with root package name */
    public static final int f12487m = 0;

    /* renamed from: n  reason: collision with root package name */
    public static final int f12488n = 1;

    /* renamed from: o  reason: collision with root package name */
    public static final int f12489o = 2;

    /* renamed from: p  reason: collision with root package name */
    public static final int f12490p = 4;

    /* renamed from: a  reason: collision with root package name */
    public final w f12491a;

    /* renamed from: b  reason: collision with root package name */
    public final o f12492b;

    /* renamed from: c  reason: collision with root package name */
    public final String f12493c;

    /* renamed from: d  reason: collision with root package name */
    public String f12494d;

    /* renamed from: e  reason: collision with root package name */
    public j6.s f12495e;

    /* renamed from: f  reason: collision with root package name */
    public int f12496f;

    /* renamed from: g  reason: collision with root package name */
    public int f12497g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f12498h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f12499i;

    /* renamed from: j  reason: collision with root package name */
    public long f12500j;

    /* renamed from: k  reason: collision with root package name */
    public int f12501k;

    /* renamed from: l  reason: collision with root package name */
    public long f12502l;

    public s() {
        this((String) null);
    }

    public s(String str) {
        this.f12496f = 0;
        w wVar = new w(4);
        this.f12491a = wVar;
        wVar.f14880a[0] = -1;
        this.f12492b = new o();
        this.f12493c = str;
    }

    public final void a(w wVar) {
        byte[] bArr = wVar.f14880a;
        int d10 = wVar.d();
        for (int c10 = wVar.c(); c10 < d10; c10++) {
            byte b10 = bArr[c10];
            boolean z10 = (b10 & 255) == 255;
            boolean z11 = this.f12499i && (b10 & 224) == 224;
            this.f12499i = z10;
            if (z11) {
                wVar.Q(c10 + 1);
                this.f12499i = false;
                this.f12491a.f14880a[1] = bArr[c10];
                this.f12497g = 2;
                this.f12496f = 1;
                return;
            }
        }
        wVar.Q(d10);
    }

    public void b(w wVar) {
        while (wVar.a() > 0) {
            int i10 = this.f12496f;
            if (i10 == 0) {
                a(wVar);
            } else if (i10 == 1) {
                h(wVar);
            } else if (i10 == 2) {
                g(wVar);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public void c() {
        this.f12496f = 0;
        this.f12497g = 0;
        this.f12499i = false;
    }

    public void d() {
    }

    public void e(k kVar, h0.e eVar) {
        eVar.a();
        this.f12494d = eVar.b();
        this.f12495e = kVar.a(eVar.c(), 1);
    }

    public void f(long j10, int i10) {
        this.f12502l = j10;
    }

    public final void g(w wVar) {
        int min = Math.min(wVar.a(), this.f12501k - this.f12497g);
        this.f12495e.a(wVar, min);
        int i10 = this.f12497g + min;
        this.f12497g = i10;
        int i11 = this.f12501k;
        if (i10 >= i11) {
            this.f12495e.c(this.f12502l, 1, i11, 0, (s.a) null);
            this.f12502l += this.f12500j;
            this.f12497g = 0;
            this.f12496f = 0;
        }
    }

    public final void h(w wVar) {
        int min = Math.min(wVar.a(), 4 - this.f12497g);
        wVar.i(this.f12491a.f14880a, this.f12497g, min);
        int i10 = this.f12497g + min;
        this.f12497g = i10;
        if (i10 >= 4) {
            this.f12491a.Q(0);
            if (!o.b(this.f12491a.l(), this.f12492b)) {
                this.f12497g = 0;
                this.f12496f = 1;
                return;
            }
            o oVar = this.f12492b;
            this.f12501k = oVar.f9605c;
            if (!this.f12498h) {
                int i11 = oVar.f9606d;
                this.f12500j = (((long) oVar.f9609g) * 1000000) / ((long) i11);
                this.f12495e.d(Format.r(this.f12494d, oVar.f9604b, (String) null, -1, 4096, oVar.f9607e, i11, (List<byte[]>) null, (DrmInitData) null, 0, this.f12493c));
                this.f12498h = true;
            }
            this.f12491a.Q(0);
            this.f12495e.a(this.f12491a, 4);
            this.f12496f = 2;
        }
    }
}
