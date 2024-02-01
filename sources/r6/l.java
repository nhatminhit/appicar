package r6;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import j6.k;
import j6.s;
import java.util.Collections;
import java.util.List;
import r6.h0;
import w7.w;

public final class l implements m {

    /* renamed from: a  reason: collision with root package name */
    public final List<h0.a> f12324a;

    /* renamed from: b  reason: collision with root package name */
    public final s[] f12325b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f12326c;

    /* renamed from: d  reason: collision with root package name */
    public int f12327d;

    /* renamed from: e  reason: collision with root package name */
    public int f12328e;

    /* renamed from: f  reason: collision with root package name */
    public long f12329f;

    public l(List<h0.a> list) {
        this.f12324a = list;
        this.f12325b = new s[list.size()];
    }

    public final boolean a(w wVar, int i10) {
        if (wVar.a() == 0) {
            return false;
        }
        if (wVar.D() != i10) {
            this.f12326c = false;
        }
        this.f12327d--;
        return this.f12326c;
    }

    public void b(w wVar) {
        if (!this.f12326c) {
            return;
        }
        if (this.f12327d != 2 || a(wVar, 32)) {
            if (this.f12327d != 1 || a(wVar, 0)) {
                int c10 = wVar.c();
                int a10 = wVar.a();
                for (s a11 : this.f12325b) {
                    wVar.Q(c10);
                    a11.a(wVar, a10);
                }
                this.f12328e += a10;
            }
        }
    }

    public void c() {
        this.f12326c = false;
    }

    public void d() {
        if (this.f12326c) {
            for (s c10 : this.f12325b) {
                c10.c(this.f12329f, 1, this.f12328e, 0, (s.a) null);
            }
            this.f12326c = false;
        }
    }

    public void e(k kVar, h0.e eVar) {
        for (int i10 = 0; i10 < this.f12325b.length; i10++) {
            h0.a aVar = this.f12324a.get(i10);
            eVar.a();
            s a10 = kVar.a(eVar.c(), 3);
            a10.d(Format.u(eVar.b(), w7.s.f14826n0, (String) null, -1, 0, Collections.singletonList(aVar.f12259c), aVar.f12257a, (DrmInitData) null));
            this.f12325b[i10] = a10;
        }
    }

    public void f(long j10, int i10) {
        if ((i10 & 4) != 0) {
            this.f12326c = true;
            this.f12329f = j10;
            this.f12328e = 0;
            this.f12327d = 2;
        }
    }
}
