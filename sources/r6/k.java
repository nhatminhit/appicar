package r6;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import d6.b0;
import j6.s;
import r6.h0;
import w7.w;

public final class k implements m {

    /* renamed from: l  reason: collision with root package name */
    public static final int f12309l = 0;

    /* renamed from: m  reason: collision with root package name */
    public static final int f12310m = 1;

    /* renamed from: n  reason: collision with root package name */
    public static final int f12311n = 2;

    /* renamed from: o  reason: collision with root package name */
    public static final int f12312o = 18;

    /* renamed from: a  reason: collision with root package name */
    public final w f12313a = new w(new byte[18]);

    /* renamed from: b  reason: collision with root package name */
    public final String f12314b;

    /* renamed from: c  reason: collision with root package name */
    public String f12315c;

    /* renamed from: d  reason: collision with root package name */
    public s f12316d;

    /* renamed from: e  reason: collision with root package name */
    public int f12317e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f12318f;

    /* renamed from: g  reason: collision with root package name */
    public int f12319g;

    /* renamed from: h  reason: collision with root package name */
    public long f12320h;

    /* renamed from: i  reason: collision with root package name */
    public Format f12321i;

    /* renamed from: j  reason: collision with root package name */
    public int f12322j;

    /* renamed from: k  reason: collision with root package name */
    public long f12323k;

    public k(String str) {
        this.f12314b = str;
    }

    public final boolean a(w wVar, byte[] bArr, int i10) {
        int min = Math.min(wVar.a(), i10 - this.f12318f);
        wVar.i(bArr, this.f12318f, min);
        int i11 = this.f12318f + min;
        this.f12318f = i11;
        return i11 == i10;
    }

    public void b(w wVar) {
        while (wVar.a() > 0) {
            int i10 = this.f12317e;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(wVar.a(), this.f12322j - this.f12318f);
                        this.f12316d.a(wVar, min);
                        int i11 = this.f12318f + min;
                        this.f12318f = i11;
                        int i12 = this.f12322j;
                        if (i11 == i12) {
                            this.f12316d.c(this.f12323k, 1, i12, 0, (s.a) null);
                            this.f12323k += this.f12320h;
                            this.f12317e = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (a(wVar, this.f12313a.f14880a, 18)) {
                    g();
                    this.f12313a.Q(0);
                    this.f12316d.a(this.f12313a, 18);
                    this.f12317e = 2;
                }
            } else if (h(wVar)) {
                this.f12317e = 1;
            }
        }
    }

    public void c() {
        this.f12317e = 0;
        this.f12318f = 0;
        this.f12319g = 0;
    }

    public void d() {
    }

    public void e(j6.k kVar, h0.e eVar) {
        eVar.a();
        this.f12315c = eVar.b();
        this.f12316d = kVar.a(eVar.c(), 1);
    }

    public void f(long j10, int i10) {
        this.f12323k = j10;
    }

    public final void g() {
        byte[] bArr = this.f12313a.f14880a;
        if (this.f12321i == null) {
            Format g10 = b0.g(bArr, this.f12315c, this.f12314b, (DrmInitData) null);
            this.f12321i = g10;
            this.f12316d.d(g10);
        }
        this.f12322j = b0.a(bArr);
        this.f12320h = (long) ((int) ((((long) b0.f(bArr)) * 1000000) / ((long) this.f12321i.f5078k0)));
    }

    public final boolean h(w wVar) {
        while (wVar.a() > 0) {
            int i10 = this.f12319g << 8;
            this.f12319g = i10;
            int D = i10 | wVar.D();
            this.f12319g = D;
            if (b0.d(D)) {
                byte[] bArr = this.f12313a.f14880a;
                int i11 = this.f12319g;
                bArr[0] = (byte) ((i11 >> 24) & 255);
                bArr[1] = (byte) ((i11 >> 16) & 255);
                bArr[2] = (byte) ((i11 >> 8) & 255);
                bArr[3] = (byte) (i11 & 255);
                this.f12318f = 4;
                this.f12319g = 0;
                return true;
            }
        }
        return false;
    }
}
