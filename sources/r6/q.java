package r6;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import j6.k;
import j6.s;
import r6.h0;
import w7.p;
import w7.w;

public final class q implements m {

    /* renamed from: g  reason: collision with root package name */
    public static final String f12453g = "Id3Reader";

    /* renamed from: h  reason: collision with root package name */
    public static final int f12454h = 10;

    /* renamed from: a  reason: collision with root package name */
    public final w f12455a = new w(10);

    /* renamed from: b  reason: collision with root package name */
    public s f12456b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f12457c;

    /* renamed from: d  reason: collision with root package name */
    public long f12458d;

    /* renamed from: e  reason: collision with root package name */
    public int f12459e;

    /* renamed from: f  reason: collision with root package name */
    public int f12460f;

    public void b(w wVar) {
        if (this.f12457c) {
            int a10 = wVar.a();
            int i10 = this.f12460f;
            if (i10 < 10) {
                int min = Math.min(a10, 10 - i10);
                System.arraycopy(wVar.f14880a, wVar.c(), this.f12455a.f14880a, this.f12460f, min);
                if (this.f12460f + min == 10) {
                    this.f12455a.Q(0);
                    if (73 == this.f12455a.D() && 68 == this.f12455a.D() && 51 == this.f12455a.D()) {
                        this.f12455a.R(3);
                        this.f12459e = this.f12455a.C() + 10;
                    } else {
                        p.l(f12453g, "Discarding invalid ID3 tag");
                        this.f12457c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(a10, this.f12459e - this.f12460f);
            this.f12456b.a(wVar, min2);
            this.f12460f += min2;
        }
    }

    public void c() {
        this.f12457c = false;
    }

    public void d() {
        int i10;
        if (this.f12457c && (i10 = this.f12459e) != 0 && this.f12460f == i10) {
            this.f12456b.c(this.f12458d, 1, i10, 0, (s.a) null);
            this.f12457c = false;
        }
    }

    public void e(k kVar, h0.e eVar) {
        eVar.a();
        s a10 = kVar.a(eVar.c(), 4);
        this.f12456b = a10;
        a10.d(Format.w(eVar.b(), w7.s.Z, (String) null, -1, (DrmInitData) null));
    }

    public void f(long j10, int i10) {
        if ((i10 & 4) != 0) {
            this.f12457c = true;
            this.f12458d = j10;
            this.f12459e = 0;
            this.f12460f = 0;
        }
    }
}
