package p6;

import b6.j0;
import j6.i;
import j6.j;
import j6.k;
import j6.l;
import j6.p;
import j6.s;
import java.io.IOException;
import w7.w;

public class d implements i {

    /* renamed from: g  reason: collision with root package name */
    public static final l f11545g = new c();

    /* renamed from: h  reason: collision with root package name */
    public static final int f11546h = 8;

    /* renamed from: d  reason: collision with root package name */
    public k f11547d;

    /* renamed from: e  reason: collision with root package name */
    public i f11548e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f11549f;

    public static /* synthetic */ i[] d() {
        return new i[]{new d()};
    }

    public static w e(w wVar) {
        wVar.Q(0);
        return wVar;
    }

    public void a() {
    }

    public boolean c(j jVar) throws IOException, InterruptedException {
        try {
            return i(jVar);
        } catch (j0 unused) {
            return false;
        }
    }

    public int f(j jVar, p pVar) throws IOException, InterruptedException {
        if (this.f11548e == null) {
            if (i(jVar)) {
                jVar.h();
            } else {
                throw new j0("Failed to determine bitstream type");
            }
        }
        if (!this.f11549f) {
            s a10 = this.f11547d.a(0, 1);
            this.f11547d.r();
            this.f11548e.c(this.f11547d, a10);
            this.f11549f = true;
        }
        return this.f11548e.f(jVar, pVar);
    }

    public void g(k kVar) {
        this.f11547d = kVar;
    }

    public void h(long j10, long j11) {
        i iVar = this.f11548e;
        if (iVar != null) {
            iVar.k(j10, j11);
        }
    }

    public final boolean i(j jVar) throws IOException, InterruptedException {
        i hVar;
        f fVar = new f();
        if (fVar.a(jVar, true) && (fVar.f11561b & 2) == 2) {
            int min = Math.min(fVar.f11568i, 8);
            w wVar = new w(min);
            jVar.k(wVar.f14880a, 0, min);
            if (b.o(e(wVar))) {
                hVar = new b();
            } else if (k.p(e(wVar))) {
                hVar = new k();
            } else if (h.n(e(wVar))) {
                hVar = new h();
            }
            this.f11548e = hVar;
            return true;
        }
        return false;
    }
}
