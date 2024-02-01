package r6;

import b6.c;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import j6.k;
import j6.s;
import r6.h0;
import w7.j0;
import w7.w;

public final class c0 implements z {

    /* renamed from: a  reason: collision with root package name */
    public j0 f12154a;

    /* renamed from: b  reason: collision with root package name */
    public s f12155b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f12156c;

    public void a(j0 j0Var, k kVar, h0.e eVar) {
        this.f12154a = j0Var;
        eVar.a();
        s a10 = kVar.a(eVar.c(), 4);
        this.f12155b = a10;
        a10.d(Format.w(eVar.b(), w7.s.f14820k0, (String) null, -1, (DrmInitData) null));
    }

    public void b(w wVar) {
        if (!this.f12156c) {
            if (this.f12154a.e() != c.f4201b) {
                this.f12155b.d(Format.v((String) null, w7.s.f14820k0, this.f12154a.e()));
                this.f12156c = true;
            } else {
                return;
            }
        }
        int a10 = wVar.a();
        this.f12155b.a(wVar, a10);
        this.f12155b.c(this.f12154a.d(), 1, a10, 0, (s.a) null);
    }
}
