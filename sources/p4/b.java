package p4;

import d.o0;
import d.z;
import p4.e;

public final class b implements e, d {

    /* renamed from: a  reason: collision with root package name */
    public final Object f11469a;
    @o0

    /* renamed from: b  reason: collision with root package name */
    public final e f11470b;

    /* renamed from: c  reason: collision with root package name */
    public volatile d f11471c;

    /* renamed from: d  reason: collision with root package name */
    public volatile d f11472d;
    @z("requestLock")

    /* renamed from: e  reason: collision with root package name */
    public e.a f11473e;
    @z("requestLock")

    /* renamed from: f  reason: collision with root package name */
    public e.a f11474f;

    public b(Object obj, @o0 e eVar) {
        e.a aVar = e.a.CLEARED;
        this.f11473e = aVar;
        this.f11474f = aVar;
        this.f11469a = obj;
        this.f11470b = eVar;
    }

    public boolean a() {
        boolean z10;
        synchronized (this.f11469a) {
            if (!this.f11471c.a()) {
                if (!this.f11472d.a()) {
                    z10 = false;
                }
            }
            z10 = true;
        }
        return z10;
    }

    public boolean b(d dVar) {
        boolean z10;
        synchronized (this.f11469a) {
            z10 = m() && k(dVar);
        }
        return z10;
    }

    public void c(d dVar) {
        synchronized (this.f11469a) {
            if (dVar.equals(this.f11471c)) {
                this.f11473e = e.a.SUCCESS;
            } else if (dVar.equals(this.f11472d)) {
                this.f11474f = e.a.SUCCESS;
            }
            e eVar = this.f11470b;
            if (eVar != null) {
                eVar.c(this);
            }
        }
    }

    public void clear() {
        synchronized (this.f11469a) {
            e.a aVar = e.a.CLEARED;
            this.f11473e = aVar;
            this.f11471c.clear();
            if (this.f11474f != aVar) {
                this.f11474f = aVar;
                this.f11472d.clear();
            }
        }
    }

    public boolean d(d dVar) {
        boolean z10;
        synchronized (this.f11469a) {
            z10 = n() && k(dVar);
        }
        return z10;
    }

    public boolean e(d dVar) {
        boolean z10;
        synchronized (this.f11469a) {
            z10 = l() && k(dVar);
        }
        return z10;
    }

    public boolean f(d dVar) {
        if (!(dVar instanceof b)) {
            return false;
        }
        b bVar = (b) dVar;
        return this.f11471c.f(bVar.f11471c) && this.f11472d.f(bVar.f11472d);
    }

    public boolean g() {
        boolean z10;
        synchronized (this.f11469a) {
            e.a aVar = this.f11473e;
            e.a aVar2 = e.a.CLEARED;
            z10 = aVar == aVar2 && this.f11474f == aVar2;
        }
        return z10;
    }

    public e getRoot() {
        e root;
        synchronized (this.f11469a) {
            e eVar = this.f11470b;
            root = eVar != null ? eVar.getRoot() : this;
        }
        return root;
    }

    public void h() {
        synchronized (this.f11469a) {
            e.a aVar = this.f11473e;
            e.a aVar2 = e.a.RUNNING;
            if (aVar != aVar2) {
                this.f11473e = aVar2;
                this.f11471c.h();
            }
        }
    }

    public boolean i() {
        boolean z10;
        synchronized (this.f11469a) {
            e.a aVar = this.f11473e;
            e.a aVar2 = e.a.SUCCESS;
            if (aVar != aVar2) {
                if (this.f11474f != aVar2) {
                    z10 = false;
                }
            }
            z10 = true;
        }
        return z10;
    }

    public boolean isRunning() {
        boolean z10;
        synchronized (this.f11469a) {
            e.a aVar = this.f11473e;
            e.a aVar2 = e.a.RUNNING;
            if (aVar != aVar2) {
                if (this.f11474f != aVar2) {
                    z10 = false;
                }
            }
            z10 = true;
        }
        return z10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void j(p4.d r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f11469a
            monitor-enter(r0)
            p4.d r1 = r2.f11472d     // Catch:{ all -> 0x002b }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x002b }
            if (r3 != 0) goto L_0x001e
            p4.e$a r3 = p4.e.a.FAILED     // Catch:{ all -> 0x002b }
            r2.f11473e = r3     // Catch:{ all -> 0x002b }
            p4.e$a r3 = r2.f11474f     // Catch:{ all -> 0x002b }
            p4.e$a r1 = p4.e.a.RUNNING     // Catch:{ all -> 0x002b }
            if (r3 == r1) goto L_0x001c
            r2.f11474f = r1     // Catch:{ all -> 0x002b }
            p4.d r3 = r2.f11472d     // Catch:{ all -> 0x002b }
            r3.h()     // Catch:{ all -> 0x002b }
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x001e:
            p4.e$a r3 = p4.e.a.FAILED     // Catch:{ all -> 0x002b }
            r2.f11474f = r3     // Catch:{ all -> 0x002b }
            p4.e r3 = r2.f11470b     // Catch:{ all -> 0x002b }
            if (r3 == 0) goto L_0x0029
            r3.j(r2)     // Catch:{ all -> 0x002b }
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x002b:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.b.j(p4.d):void");
    }

    @z("requestLock")
    public final boolean k(d dVar) {
        return dVar.equals(this.f11471c) || (this.f11473e == e.a.FAILED && dVar.equals(this.f11472d));
    }

    @z("requestLock")
    public final boolean l() {
        e eVar = this.f11470b;
        return eVar == null || eVar.e(this);
    }

    @z("requestLock")
    public final boolean m() {
        e eVar = this.f11470b;
        return eVar == null || eVar.b(this);
    }

    @z("requestLock")
    public final boolean n() {
        e eVar = this.f11470b;
        return eVar == null || eVar.d(this);
    }

    public void o(d dVar, d dVar2) {
        this.f11471c = dVar;
        this.f11472d = dVar2;
    }

    public void pause() {
        synchronized (this.f11469a) {
            e.a aVar = this.f11473e;
            e.a aVar2 = e.a.RUNNING;
            if (aVar == aVar2) {
                this.f11473e = e.a.PAUSED;
                this.f11471c.pause();
            }
            if (this.f11474f == aVar2) {
                this.f11474f = e.a.PAUSED;
                this.f11472d.pause();
            }
        }
    }
}
