package tg;

import java.io.IOException;
import java.net.Socket;
import java.util.List;
import og.a;
import og.d0;
import og.g;
import og.g0;
import og.n0;
import og.x;
import pg.e;
import tg.j;
import ug.c;

public final class d {

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ boolean f23232k = false;

    /* renamed from: a  reason: collision with root package name */
    public final k f23233a;

    /* renamed from: b  reason: collision with root package name */
    public final a f23234b;

    /* renamed from: c  reason: collision with root package name */
    public final g f23235c;

    /* renamed from: d  reason: collision with root package name */
    public final g f23236d;

    /* renamed from: e  reason: collision with root package name */
    public final x f23237e;

    /* renamed from: f  reason: collision with root package name */
    public j.a f23238f;

    /* renamed from: g  reason: collision with root package name */
    public final j f23239g;

    /* renamed from: h  reason: collision with root package name */
    public e f23240h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f23241i;

    /* renamed from: j  reason: collision with root package name */
    public n0 f23242j;

    public d(k kVar, g gVar, a aVar, g gVar2, x xVar) {
        this.f23233a = kVar;
        this.f23235c = gVar;
        this.f23234b = aVar;
        this.f23236d = gVar2;
        this.f23237e = xVar;
        this.f23239g = new j(aVar, gVar.f23268e, gVar2, xVar);
    }

    public e a() {
        return this.f23240h;
    }

    public c b(g0 g0Var, d0.a aVar, boolean z10) {
        try {
            return d(aVar.i(), aVar.d(), aVar.e(), g0Var.C(), g0Var.I(), z10).r(g0Var, aVar);
        } catch (i e10) {
            h();
            throw e10;
        } catch (IOException e11) {
            h();
            throw new i(e11);
        }
    }

    public final e c(int i10, int i11, int i12, int i13, boolean z10) throws IOException {
        e eVar;
        Socket socket;
        Socket n10;
        e eVar2;
        boolean z11;
        n0 n0Var;
        boolean z12;
        List<n0> list;
        j.a aVar;
        synchronized (this.f23235c) {
            if (!this.f23233a.i()) {
                this.f23241i = false;
                k kVar = this.f23233a;
                eVar = kVar.f23290i;
                socket = null;
                n10 = (eVar == null || !eVar.f23255k) ? null : kVar.n();
                k kVar2 = this.f23233a;
                eVar2 = kVar2.f23290i;
                if (eVar2 != null) {
                    eVar = null;
                } else {
                    eVar2 = null;
                }
                if (eVar2 == null) {
                    if (this.f23235c.k(this.f23234b, kVar2, (List<n0>) null, false)) {
                        eVar2 = this.f23233a.f23290i;
                        n0Var = null;
                        z11 = true;
                    } else {
                        n0Var = this.f23242j;
                        if (n0Var != null) {
                            this.f23242j = null;
                        } else if (g()) {
                            n0Var = this.f23233a.f23290i.b();
                        }
                        z11 = false;
                    }
                }
                z11 = false;
                n0Var = null;
            } else {
                throw new IOException("Canceled");
            }
        }
        e.i(n10);
        if (eVar != null) {
            this.f23237e.i(this.f23236d, eVar);
        }
        if (z11) {
            this.f23237e.h(this.f23236d, eVar2);
        }
        if (eVar2 != null) {
            return eVar2;
        }
        if (n0Var != null || ((aVar = this.f23238f) != null && aVar.b())) {
            z12 = false;
        } else {
            this.f23238f = this.f23239g.d();
            z12 = true;
        }
        synchronized (this.f23235c) {
            if (!this.f23233a.i()) {
                if (z12) {
                    list = this.f23238f.a();
                    if (this.f23235c.k(this.f23234b, this.f23233a, list, false)) {
                        eVar2 = this.f23233a.f23290i;
                        z11 = true;
                    }
                } else {
                    list = null;
                }
                if (!z11) {
                    if (n0Var == null) {
                        n0Var = this.f23238f.c();
                    }
                    eVar2 = new e(this.f23235c, n0Var);
                    this.f23240h = eVar2;
                }
            } else {
                throw new IOException("Canceled");
            }
        }
        if (!z11) {
            eVar2.h(i10, i11, i12, i13, z10, this.f23236d, this.f23237e);
            this.f23235c.f23268e.a(eVar2.b());
            synchronized (this.f23235c) {
                this.f23240h = null;
                if (this.f23235c.k(this.f23234b, this.f23233a, list, true)) {
                    eVar2.f23255k = true;
                    socket = eVar2.d();
                    eVar2 = this.f23233a.f23290i;
                    this.f23242j = n0Var;
                } else {
                    this.f23235c.j(eVar2);
                    this.f23233a.a(eVar2);
                }
            }
            e.i(socket);
        }
        this.f23237e.h(this.f23236d, eVar2);
        return eVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        if (r0.p(r9) != false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final tg.e d(int r4, int r5, int r6, int r7, boolean r8, boolean r9) throws java.io.IOException {
        /*
            r3 = this;
        L_0x0000:
            tg.e r0 = r3.c(r4, r5, r6, r7, r8)
            tg.g r1 = r3.f23235c
            monitor-enter(r1)
            int r2 = r0.f23257m     // Catch:{ all -> 0x001f }
            if (r2 != 0) goto L_0x0013
            boolean r2 = r0.q()     // Catch:{ all -> 0x001f }
            if (r2 != 0) goto L_0x0013
            monitor-exit(r1)     // Catch:{ all -> 0x001f }
            return r0
        L_0x0013:
            monitor-exit(r1)     // Catch:{ all -> 0x001f }
            boolean r1 = r0.p(r9)
            if (r1 != 0) goto L_0x001e
            r0.t()
            goto L_0x0000
        L_0x001e:
            return r0
        L_0x001f:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001f }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.d.d(int, int, int, int, boolean, boolean):tg.e");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0031, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e() {
        /*
            r3 = this;
            tg.g r0 = r3.f23235c
            monitor-enter(r0)
            og.n0 r1 = r3.f23242j     // Catch:{ all -> 0x0032 }
            r2 = 1
            if (r1 == 0) goto L_0x000a
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return r2
        L_0x000a:
            boolean r1 = r3.g()     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x001c
            tg.k r1 = r3.f23233a     // Catch:{ all -> 0x0032 }
            tg.e r1 = r1.f23290i     // Catch:{ all -> 0x0032 }
            og.n0 r1 = r1.b()     // Catch:{ all -> 0x0032 }
            r3.f23242j = r1     // Catch:{ all -> 0x0032 }
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return r2
        L_0x001c:
            tg.j$a r1 = r3.f23238f     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0026
            boolean r1 = r1.b()     // Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0030
        L_0x0026:
            tg.j r1 = r3.f23239g     // Catch:{ all -> 0x0032 }
            boolean r1 = r1.b()     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x002f
            goto L_0x0030
        L_0x002f:
            r2 = 0
        L_0x0030:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return r2
        L_0x0032:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.d.e():boolean");
    }

    public boolean f() {
        boolean z10;
        synchronized (this.f23235c) {
            z10 = this.f23241i;
        }
        return z10;
    }

    public final boolean g() {
        e eVar = this.f23233a.f23290i;
        return eVar != null && eVar.f23256l == 0 && e.F(eVar.b().a().l(), this.f23234b.l());
    }

    public void h() {
        synchronized (this.f23235c) {
            this.f23241i = true;
        }
    }
}
