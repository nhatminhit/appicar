package y3;

import d.g1;
import d.m0;
import d.z;
import e1.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p4.i;
import t4.k;
import u4.a;
import v3.f;
import y3.h;
import y3.p;

public class l<R> implements h.b<R>, a.f {

    /* renamed from: m0  reason: collision with root package name */
    public static final c f15425m0 = new c();
    public final e O;
    public final u4.c P;
    public final p.a Q;
    public final m.a<l<?>> R;
    public final c S;
    public final m T;
    public final b4.a U;
    public final b4.a V;
    public final b4.a W;
    public final b4.a X;
    public final AtomicInteger Y;
    public f Z;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f15426a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f15427b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f15428c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f15429d0;

    /* renamed from: e0  reason: collision with root package name */
    public v<?> f15430e0;

    /* renamed from: f0  reason: collision with root package name */
    public v3.a f15431f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f15432g0;

    /* renamed from: h0  reason: collision with root package name */
    public q f15433h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f15434i0;

    /* renamed from: j0  reason: collision with root package name */
    public p<?> f15435j0;

    /* renamed from: k0  reason: collision with root package name */
    public h<R> f15436k0;

    /* renamed from: l0  reason: collision with root package name */
    public volatile boolean f15437l0;

    public class a implements Runnable {
        public final i O;

        public a(i iVar) {
            this.O = iVar;
        }

        public void run() {
            synchronized (this.O.e()) {
                synchronized (l.this) {
                    if (l.this.O.c(this.O)) {
                        l.this.e(this.O);
                    }
                    l.this.h();
                }
            }
        }
    }

    public class b implements Runnable {
        public final i O;

        public b(i iVar) {
            this.O = iVar;
        }

        public void run() {
            synchronized (this.O.e()) {
                synchronized (l.this) {
                    if (l.this.O.c(this.O)) {
                        l.this.f15435j0.b();
                        l.this.f(this.O);
                        l.this.s(this.O);
                    }
                    l.this.h();
                }
            }
        }
    }

    @g1
    public static class c {
        public <R> p<R> a(v<R> vVar, boolean z10, f fVar, p.a aVar) {
            return new p(vVar, z10, true, fVar, aVar);
        }
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final i f15438a;

        /* renamed from: b  reason: collision with root package name */
        public final Executor f15439b;

        public d(i iVar, Executor executor) {
            this.f15438a = iVar;
            this.f15439b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f15438a.equals(((d) obj).f15438a);
            }
            return false;
        }

        public int hashCode() {
            return this.f15438a.hashCode();
        }
    }

    public static final class e implements Iterable<d> {
        public final List<d> O;

        public e() {
            this(new ArrayList(2));
        }

        public e(List<d> list) {
            this.O = list;
        }

        public static d f(i iVar) {
            return new d(iVar, t4.e.a());
        }

        public void b(i iVar, Executor executor) {
            this.O.add(new d(iVar, executor));
        }

        public boolean c(i iVar) {
            return this.O.contains(f(iVar));
        }

        public void clear() {
            this.O.clear();
        }

        public e e() {
            return new e(new ArrayList(this.O));
        }

        public void h(i iVar) {
            this.O.remove(f(iVar));
        }

        public boolean isEmpty() {
            return this.O.isEmpty();
        }

        @m0
        public Iterator<d> iterator() {
            return this.O.iterator();
        }

        public int size() {
            return this.O.size();
        }
    }

    public l(b4.a aVar, b4.a aVar2, b4.a aVar3, b4.a aVar4, m mVar, p.a aVar5, m.a<l<?>> aVar6) {
        this(aVar, aVar2, aVar3, aVar4, mVar, aVar5, aVar6, f15425m0);
    }

    @g1
    public l(b4.a aVar, b4.a aVar2, b4.a aVar3, b4.a aVar4, m mVar, p.a aVar5, m.a<l<?>> aVar6, c cVar) {
        this.O = new e();
        this.P = u4.c.a();
        this.Y = new AtomicInteger();
        this.U = aVar;
        this.V = aVar2;
        this.W = aVar3;
        this.X = aVar4;
        this.T = mVar;
        this.Q = aVar5;
        this.R = aVar6;
        this.S = cVar;
    }

    public void a(h<?> hVar) {
        j().execute(hVar);
    }

    public void b(v<R> vVar, v3.a aVar) {
        synchronized (this) {
            this.f15430e0 = vVar;
            this.f15431f0 = aVar;
        }
        p();
    }

    public void c(q qVar) {
        synchronized (this) {
            this.f15433h0 = qVar;
        }
        o();
    }

    public synchronized void d(i iVar, Executor executor) {
        Runnable aVar;
        this.P.c();
        this.O.b(iVar, executor);
        boolean z10 = true;
        if (this.f15432g0) {
            k(1);
            aVar = new b(iVar);
        } else if (this.f15434i0) {
            k(1);
            aVar = new a(iVar);
        } else {
            if (this.f15437l0) {
                z10 = false;
            }
            k.a(z10, "Cannot add callbacks to a cancelled EngineJob");
        }
        executor.execute(aVar);
    }

    @z("this")
    public void e(i iVar) {
        try {
            iVar.c(this.f15433h0);
        } catch (Throwable th2) {
            throw new b(th2);
        }
    }

    @z("this")
    public void f(i iVar) {
        try {
            iVar.b(this.f15435j0, this.f15431f0);
        } catch (Throwable th2) {
            throw new b(th2);
        }
    }

    public void g() {
        if (!n()) {
            this.f15437l0 = true;
            this.f15436k0.a();
            this.T.a(this, this.Z);
        }
    }

    public void h() {
        p<?> pVar;
        synchronized (this) {
            this.P.c();
            k.a(n(), "Not yet complete!");
            int decrementAndGet = this.Y.decrementAndGet();
            k.a(decrementAndGet >= 0, "Can't decrement below 0");
            if (decrementAndGet == 0) {
                pVar = this.f15435j0;
                r();
            } else {
                pVar = null;
            }
        }
        if (pVar != null) {
            pVar.g();
        }
    }

    @m0
    public u4.c i() {
        return this.P;
    }

    public final b4.a j() {
        return this.f15427b0 ? this.W : this.f15428c0 ? this.X : this.V;
    }

    public synchronized void k(int i10) {
        p<?> pVar;
        k.a(n(), "Not yet complete!");
        if (this.Y.getAndAdd(i10) == 0 && (pVar = this.f15435j0) != null) {
            pVar.b();
        }
    }

    @g1
    public synchronized l<R> l(f fVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.Z = fVar;
        this.f15426a0 = z10;
        this.f15427b0 = z11;
        this.f15428c0 = z12;
        this.f15429d0 = z13;
        return this;
    }

    public synchronized boolean m() {
        return this.f15437l0;
    }

    public final boolean n() {
        return this.f15434i0 || this.f15432g0 || this.f15437l0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r4.T.d(r4, r1, (y3.p<?>) null);
        r0 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r0.hasNext() == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        r1 = r0.next();
        r1.f15439b.execute(new y3.l.a(r4, r1.f15438a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void o() {
        /*
            r4 = this;
            monitor-enter(r4)
            u4.c r0 = r4.P     // Catch:{ all -> 0x0066 }
            r0.c()     // Catch:{ all -> 0x0066 }
            boolean r0 = r4.f15437l0     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x000f
            r4.r()     // Catch:{ all -> 0x0066 }
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            return
        L_0x000f:
            y3.l$e r0 = r4.O     // Catch:{ all -> 0x0066 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x005e
            boolean r0 = r4.f15434i0     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x0056
            r0 = 1
            r4.f15434i0 = r0     // Catch:{ all -> 0x0066 }
            v3.f r1 = r4.Z     // Catch:{ all -> 0x0066 }
            y3.l$e r2 = r4.O     // Catch:{ all -> 0x0066 }
            y3.l$e r2 = r2.e()     // Catch:{ all -> 0x0066 }
            int r3 = r2.size()     // Catch:{ all -> 0x0066 }
            int r3 = r3 + r0
            r4.k(r3)     // Catch:{ all -> 0x0066 }
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            y3.m r0 = r4.T
            r3 = 0
            r0.d(r4, r1, r3)
            java.util.Iterator r0 = r2.iterator()
        L_0x0039:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0052
            java.lang.Object r1 = r0.next()
            y3.l$d r1 = (y3.l.d) r1
            java.util.concurrent.Executor r2 = r1.f15439b
            y3.l$a r3 = new y3.l$a
            p4.i r1 = r1.f15438a
            r3.<init>(r1)
            r2.execute(r3)
            goto L_0x0039
        L_0x0052:
            r4.h()
            return
        L_0x0056:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "Already failed once"
            r0.<init>(r1)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x005e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "Received an exception without any callbacks to notify"
            r0.<init>(r1)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.l.o():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0046, code lost:
        r5.T.d(r5, r0, r2);
        r0 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (r0.hasNext() == false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
        r1 = r0.next();
        r1.f15439b.execute(new y3.l.b(r5, r1.f15438a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0068, code lost:
        h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void p() {
        /*
            r5 = this;
            monitor-enter(r5)
            u4.c r0 = r5.P     // Catch:{ all -> 0x007c }
            r0.c()     // Catch:{ all -> 0x007c }
            boolean r0 = r5.f15437l0     // Catch:{ all -> 0x007c }
            if (r0 == 0) goto L_0x0014
            y3.v<?> r0 = r5.f15430e0     // Catch:{ all -> 0x007c }
            r0.a()     // Catch:{ all -> 0x007c }
            r5.r()     // Catch:{ all -> 0x007c }
            monitor-exit(r5)     // Catch:{ all -> 0x007c }
            return
        L_0x0014:
            y3.l$e r0 = r5.O     // Catch:{ all -> 0x007c }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x007c }
            if (r0 != 0) goto L_0x0074
            boolean r0 = r5.f15432g0     // Catch:{ all -> 0x007c }
            if (r0 != 0) goto L_0x006c
            y3.l$c r0 = r5.S     // Catch:{ all -> 0x007c }
            y3.v<?> r1 = r5.f15430e0     // Catch:{ all -> 0x007c }
            boolean r2 = r5.f15426a0     // Catch:{ all -> 0x007c }
            v3.f r3 = r5.Z     // Catch:{ all -> 0x007c }
            y3.p$a r4 = r5.Q     // Catch:{ all -> 0x007c }
            y3.p r0 = r0.a(r1, r2, r3, r4)     // Catch:{ all -> 0x007c }
            r5.f15435j0 = r0     // Catch:{ all -> 0x007c }
            r0 = 1
            r5.f15432g0 = r0     // Catch:{ all -> 0x007c }
            y3.l$e r1 = r5.O     // Catch:{ all -> 0x007c }
            y3.l$e r1 = r1.e()     // Catch:{ all -> 0x007c }
            int r2 = r1.size()     // Catch:{ all -> 0x007c }
            int r2 = r2 + r0
            r5.k(r2)     // Catch:{ all -> 0x007c }
            v3.f r0 = r5.Z     // Catch:{ all -> 0x007c }
            y3.p<?> r2 = r5.f15435j0     // Catch:{ all -> 0x007c }
            monitor-exit(r5)     // Catch:{ all -> 0x007c }
            y3.m r3 = r5.T
            r3.d(r5, r0, r2)
            java.util.Iterator r0 = r1.iterator()
        L_0x004f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0068
            java.lang.Object r1 = r0.next()
            y3.l$d r1 = (y3.l.d) r1
            java.util.concurrent.Executor r2 = r1.f15439b
            y3.l$b r3 = new y3.l$b
            p4.i r1 = r1.f15438a
            r3.<init>(r1)
            r2.execute(r3)
            goto L_0x004f
        L_0x0068:
            r5.h()
            return
        L_0x006c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x007c }
            java.lang.String r1 = "Already have resource"
            r0.<init>(r1)     // Catch:{ all -> 0x007c }
            throw r0     // Catch:{ all -> 0x007c }
        L_0x0074:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x007c }
            java.lang.String r1 = "Received a resource without any callbacks to notify"
            r0.<init>(r1)     // Catch:{ all -> 0x007c }
            throw r0     // Catch:{ all -> 0x007c }
        L_0x007c:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x007c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.l.p():void");
    }

    public boolean q() {
        return this.f15429d0;
    }

    public final synchronized void r() {
        if (this.Z != null) {
            this.O.clear();
            this.Z = null;
            this.f15435j0 = null;
            this.f15430e0 = null;
            this.f15434i0 = false;
            this.f15437l0 = false;
            this.f15432g0 = false;
            this.f15436k0.A(false);
            this.f15436k0 = null;
            this.f15433h0 = null;
            this.f15431f0 = null;
            this.R.a(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public synchronized void s(i iVar) {
        boolean z10;
        this.P.c();
        this.O.h(iVar);
        if (this.O.isEmpty()) {
            g();
            if (!this.f15432g0) {
                if (!this.f15434i0) {
                    z10 = false;
                    if (z10 && this.Y.get() == 0) {
                        r();
                    }
                }
            }
            z10 = true;
            r();
        }
    }

    public synchronized void t(h<R> hVar) {
        this.f15436k0 = hVar;
        (hVar.G() ? this.U : j()).execute(hVar);
    }
}
