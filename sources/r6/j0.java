package r6;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import i7.g;
import j6.k;
import j6.s;
import java.util.List;
import r6.h0;
import w7.a;
import w7.w;

public final class j0 {

    /* renamed from: c  reason: collision with root package name */
    public static final int f12306c = 434;

    /* renamed from: a  reason: collision with root package name */
    public final List<Format> f12307a;

    /* renamed from: b  reason: collision with root package name */
    public final s[] f12308b;

    public j0(List<Format> list) {
        this.f12307a = list;
        this.f12308b = new s[list.size()];
    }

    public void a(long j10, w wVar) {
        if (wVar.a() >= 9) {
            int l10 = wVar.l();
            int l11 = wVar.l();
            int D = wVar.D();
            if (l10 == 434 && l11 == g.f9314b && D == 3) {
                g.b(j10, wVar, this.f12308b);
            }
        }
    }

    public void b(k kVar, h0.e eVar) {
        for (int i10 = 0; i10 < this.f12308b.length; i10++) {
            eVar.a();
            s a10 = kVar.a(eVar.c(), 3);
            Format format = this.f12307a.get(i10);
            String str = format.W;
            a.b(w7.s.f14800a0.equals(str) || w7.s.f14802b0.equals(str), "Invalid closed caption mime type provided: " + str);
            a10.d(Format.C(eVar.b(), str, (String) null, -1, format.Q, format.f5082o0, format.f5083p0, (DrmInitData) null, Long.MAX_VALUE, format.Y));
            this.f12308b[i10] = a10;
        }
    }
}
