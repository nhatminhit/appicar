package p4;

import d.o0;
import d.z;
import p4.e;

public class k implements e, d {
    @o0

    /* renamed from: a  reason: collision with root package name */
    public final e f11501a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f11502b;

    /* renamed from: c  reason: collision with root package name */
    public volatile d f11503c;

    /* renamed from: d  reason: collision with root package name */
    public volatile d f11504d;
    @z("requestLock")

    /* renamed from: e  reason: collision with root package name */
    public e.a f11505e;
    @z("requestLock")

    /* renamed from: f  reason: collision with root package name */
    public e.a f11506f;
    @z("requestLock")

    /* renamed from: g  reason: collision with root package name */
    public boolean f11507g;

    public k(Object obj, @o0 e eVar) {
        e.a aVar = e.a.CLEARED;
        this.f11505e = aVar;
        this.f11506f = aVar;
        this.f11502b = obj;
        this.f11501a = eVar;
    }

    public boolean a() {
        boolean z10;
        synchronized (this.f11502b) {
            if (!this.f11504d.a()) {
                if (!this.f11503c.a()) {
                    z10 = false;
                }
            }
            z10 = true;
        }
        return z10;
    }

    public boolean b(d dVar) {
        boolean z10;
        synchronized (this.f11502b) {
            z10 = l() && dVar.equals(this.f11503c) && !a();
        }
        return z10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(p4.d r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f11502b
            monitor-enter(r0)
            p4.d r1 = r2.f11504d     // Catch:{ all -> 0x002b }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x002b }
            if (r3 == 0) goto L_0x0011
            p4.e$a r3 = p4.e.a.SUCCESS     // Catch:{ all -> 0x002b }
            r2.f11506f = r3     // Catch:{ all -> 0x002b }
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x0011:
            p4.e$a r3 = p4.e.a.SUCCESS     // Catch:{ all -> 0x002b }
            r2.f11505e = r3     // Catch:{ all -> 0x002b }
            p4.e r3 = r2.f11501a     // Catch:{ all -> 0x002b }
            if (r3 == 0) goto L_0x001c
            r3.c(r2)     // Catch:{ all -> 0x002b }
        L_0x001c:
            p4.e$a r3 = r2.f11506f     // Catch:{ all -> 0x002b }
            boolean r3 = r3.a()     // Catch:{ all -> 0x002b }
            if (r3 != 0) goto L_0x0029
            p4.d r3 = r2.f11504d     // Catch:{ all -> 0x002b }
            r3.clear()     // Catch:{ all -> 0x002b }
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x002b:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.k.c(p4.d):void");
    }

    public void clear() {
        synchronized (this.f11502b) {
            this.f11507g = false;
            e.a aVar = e.a.CLEARED;
            this.f11505e = aVar;
            this.f11506f = aVar;
            this.f11504d.clear();
            this.f11503c.clear();
        }
    }

    public boolean d(d dVar) {
        boolean z10;
        synchronized (this.f11502b) {
            z10 = m() && (dVar.equals(this.f11503c) || this.f11505e != e.a.SUCCESS);
        }
        return z10;
    }

    public boolean e(d dVar) {
        boolean z10;
        synchronized (this.f11502b) {
            z10 = k() && dVar.equals(this.f11503c) && this.f11505e != e.a.PAUSED;
        }
        return z10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean f(p4.d r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof p4.k
            r1 = 0
            if (r0 == 0) goto L_0x002e
            p4.k r4 = (p4.k) r4
            p4.d r0 = r3.f11503c
            if (r0 != 0) goto L_0x0010
            p4.d r0 = r4.f11503c
            if (r0 != 0) goto L_0x002e
            goto L_0x001a
        L_0x0010:
            p4.d r0 = r3.f11503c
            p4.d r2 = r4.f11503c
            boolean r0 = r0.f(r2)
            if (r0 == 0) goto L_0x002e
        L_0x001a:
            p4.d r0 = r3.f11504d
            if (r0 != 0) goto L_0x0023
            p4.d r4 = r4.f11504d
            if (r4 != 0) goto L_0x002e
            goto L_0x002d
        L_0x0023:
            p4.d r0 = r3.f11504d
            p4.d r4 = r4.f11504d
            boolean r4 = r0.f(r4)
            if (r4 == 0) goto L_0x002e
        L_0x002d:
            r1 = 1
        L_0x002e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.k.f(p4.d):boolean");
    }

    public boolean g() {
        boolean z10;
        synchronized (this.f11502b) {
            z10 = this.f11505e == e.a.CLEARED;
        }
        return z10;
    }

    public e getRoot() {
        e root;
        synchronized (this.f11502b) {
            e eVar = this.f11501a;
            root = eVar != null ? eVar.getRoot() : this;
        }
        return root;
    }

    public void h() {
        e.a aVar;
        e.a aVar2;
        synchronized (this.f11502b) {
            this.f11507g = true;
            try {
                if (!(this.f11505e == e.a.SUCCESS || this.f11506f == (aVar2 = e.a.RUNNING))) {
                    this.f11506f = aVar2;
                    this.f11504d.h();
                }
                if (this.f11507g && this.f11505e != (aVar = e.a.RUNNING)) {
                    this.f11505e = aVar;
                    this.f11503c.h();
                }
            } finally {
                this.f11507g = false;
            }
        }
    }

    public boolean i() {
        boolean z10;
        synchronized (this.f11502b) {
            z10 = this.f11505e == e.a.SUCCESS;
        }
        return z10;
    }

    public boolean isRunning() {
        boolean z10;
        synchronized (this.f11502b) {
            z10 = this.f11505e == e.a.RUNNING;
        }
        return z10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void j(p4.d r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f11502b
            monitor-enter(r0)
            p4.d r1 = r2.f11503c     // Catch:{ all -> 0x001e }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x001e }
            if (r3 != 0) goto L_0x0011
            p4.e$a r3 = p4.e.a.FAILED     // Catch:{ all -> 0x001e }
            r2.f11506f = r3     // Catch:{ all -> 0x001e }
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return
        L_0x0011:
            p4.e$a r3 = p4.e.a.FAILED     // Catch:{ all -> 0x001e }
            r2.f11505e = r3     // Catch:{ all -> 0x001e }
            p4.e r3 = r2.f11501a     // Catch:{ all -> 0x001e }
            if (r3 == 0) goto L_0x001c
            r3.j(r2)     // Catch:{ all -> 0x001e }
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return
        L_0x001e:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.k.j(p4.d):void");
    }

    @z("requestLock")
    public final boolean k() {
        e eVar = this.f11501a;
        return eVar == null || eVar.e(this);
    }

    @z("requestLock")
    public final boolean l() {
        e eVar = this.f11501a;
        return eVar == null || eVar.b(this);
    }

    @z("requestLock")
    public final boolean m() {
        e eVar = this.f11501a;
        return eVar == null || eVar.d(this);
    }

    public void n(d dVar, d dVar2) {
        this.f11503c = dVar;
        this.f11504d = dVar2;
    }

    public void pause() {
        synchronized (this.f11502b) {
            if (!this.f11506f.a()) {
                this.f11506f = e.a.PAUSED;
                this.f11504d.pause();
            }
            if (!this.f11505e.a()) {
                this.f11505e = e.a.PAUSED;
                this.f11503c.pause();
            }
        }
    }
}
