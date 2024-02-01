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

public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public final List<Format> f12136a;

    /* renamed from: b  reason: collision with root package name */
    public final s[] f12137b;

    public b0(List<Format> list) {
        this.f12136a = list;
        this.f12137b = new s[list.size()];
    }

    public void a(long j10, w wVar) {
        g.a(j10, wVar, this.f12137b);
    }

    public void b(k kVar, h0.e eVar) {
        for (int i10 = 0; i10 < this.f12137b.length; i10++) {
            eVar.a();
            s a10 = kVar.a(eVar.c(), 3);
            Format format = this.f12136a.get(i10);
            String str = format.W;
            a.b(w7.s.f14800a0.equals(str) || w7.s.f14802b0.equals(str), "Invalid closed caption mime type provided: " + str);
            String str2 = format.O;
            if (str2 == null) {
                str2 = eVar.b();
            }
            a10.d(Format.C(str2, str, (String) null, -1, format.Q, format.f5082o0, format.f5083p0, (DrmInitData) null, Long.MAX_VALUE, format.Y));
            this.f12137b[i10] = a10;
        }
    }
}
