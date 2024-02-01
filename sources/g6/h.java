package g6;

import d.o0;
import g6.f;
import g6.g;
import java.lang.Exception;
import java.util.ArrayDeque;

public abstract class h<I extends f, O extends g, E extends Exception> implements d<I, O, E> {

    /* renamed from: a  reason: collision with root package name */
    public final Thread f8068a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f8069b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayDeque<I> f8070c = new ArrayDeque<>();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayDeque<O> f8071d = new ArrayDeque<>();

    /* renamed from: e  reason: collision with root package name */
    public final I[] f8072e;

    /* renamed from: f  reason: collision with root package name */
    public final O[] f8073f;

    /* renamed from: g  reason: collision with root package name */
    public int f8074g;

    /* renamed from: h  reason: collision with root package name */
    public int f8075h;

    /* renamed from: i  reason: collision with root package name */
    public I f8076i;

    /* renamed from: j  reason: collision with root package name */
    public E f8077j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f8078k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f8079l;

    /* renamed from: m  reason: collision with root package name */
    public int f8080m;

    public class a extends Thread {
        public a() {
        }

        public void run() {
            h.this.u();
        }
    }

    public h(I[] iArr, O[] oArr) {
        this.f8072e = iArr;
        this.f8074g = iArr.length;
        for (int i10 = 0; i10 < this.f8074g; i10++) {
            this.f8072e[i10] = h();
        }
        this.f8073f = oArr;
        this.f8075h = oArr.length;
        for (int i11 = 0; i11 < this.f8075h; i11++) {
            this.f8073f[i11] = i();
        }
        a aVar = new a();
        this.f8068a = aVar;
        aVar.start();
    }

    public void a() {
        synchronized (this.f8069b) {
            this.f8079l = true;
            this.f8069b.notify();
        }
        try {
            this.f8068a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public final void flush() {
        synchronized (this.f8069b) {
            this.f8078k = true;
            this.f8080m = 0;
            I i10 = this.f8076i;
            if (i10 != null) {
                r(i10);
                this.f8076i = null;
            }
            while (!this.f8070c.isEmpty()) {
                r((f) this.f8070c.removeFirst());
            }
            while (!this.f8071d.isEmpty()) {
                ((g) this.f8071d.removeFirst()).q();
            }
        }
    }

    public final boolean g() {
        return !this.f8070c.isEmpty() && this.f8075h > 0;
    }

    public abstract I h();

    public abstract O i();

    public abstract E j(Throwable th2);

    @o0
    public abstract E k(I i10, O o10, boolean z10);

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if (r1.n() == false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        r3.i(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        if (r1.m() == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
        r3.i(Integer.MIN_VALUE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r6.f8077j = k(r1, r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0051, code lost:
        r6.f8077j = j(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean l() throws java.lang.InterruptedException {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f8069b
            monitor-enter(r0)
        L_0x0003:
            boolean r1 = r6.f8079l     // Catch:{ all -> 0x008d }
            if (r1 != 0) goto L_0x0013
            boolean r1 = r6.g()     // Catch:{ all -> 0x008d }
            if (r1 != 0) goto L_0x0013
            java.lang.Object r1 = r6.f8069b     // Catch:{ all -> 0x008d }
            r1.wait()     // Catch:{ all -> 0x008d }
            goto L_0x0003
        L_0x0013:
            boolean r1 = r6.f8079l     // Catch:{ all -> 0x008d }
            r2 = 0
            if (r1 == 0) goto L_0x001a
            monitor-exit(r0)     // Catch:{ all -> 0x008d }
            return r2
        L_0x001a:
            java.util.ArrayDeque<I> r1 = r6.f8070c     // Catch:{ all -> 0x008d }
            java.lang.Object r1 = r1.removeFirst()     // Catch:{ all -> 0x008d }
            g6.f r1 = (g6.f) r1     // Catch:{ all -> 0x008d }
            O[] r3 = r6.f8073f     // Catch:{ all -> 0x008d }
            int r4 = r6.f8075h     // Catch:{ all -> 0x008d }
            r5 = 1
            int r4 = r4 - r5
            r6.f8075h = r4     // Catch:{ all -> 0x008d }
            r3 = r3[r4]     // Catch:{ all -> 0x008d }
            boolean r4 = r6.f8078k     // Catch:{ all -> 0x008d }
            r6.f8078k = r2     // Catch:{ all -> 0x008d }
            monitor-exit(r0)     // Catch:{ all -> 0x008d }
            boolean r0 = r1.n()
            if (r0 == 0) goto L_0x003c
            r0 = 4
            r3.i(r0)
            goto L_0x0063
        L_0x003c:
            boolean r0 = r1.m()
            if (r0 == 0) goto L_0x0047
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r3.i(r0)
        L_0x0047:
            java.lang.Exception r0 = r6.k(r1, r3, r4)     // Catch:{ RuntimeException -> 0x0050, OutOfMemoryError -> 0x004e }
            r6.f8077j = r0     // Catch:{ RuntimeException -> 0x0050, OutOfMemoryError -> 0x004e }
            goto L_0x0057
        L_0x004e:
            r0 = move-exception
            goto L_0x0051
        L_0x0050:
            r0 = move-exception
        L_0x0051:
            java.lang.Exception r0 = r6.j(r0)
            r6.f8077j = r0
        L_0x0057:
            E r0 = r6.f8077j
            if (r0 == 0) goto L_0x0063
            java.lang.Object r0 = r6.f8069b
            monitor-enter(r0)
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            return r2
        L_0x0060:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            throw r1
        L_0x0063:
            java.lang.Object r4 = r6.f8069b
            monitor-enter(r4)
            boolean r0 = r6.f8078k     // Catch:{ all -> 0x008a }
            if (r0 == 0) goto L_0x006e
        L_0x006a:
            r3.q()     // Catch:{ all -> 0x008a }
            goto L_0x0085
        L_0x006e:
            boolean r0 = r3.m()     // Catch:{ all -> 0x008a }
            if (r0 == 0) goto L_0x007a
            int r0 = r6.f8080m     // Catch:{ all -> 0x008a }
            int r0 = r0 + r5
            r6.f8080m = r0     // Catch:{ all -> 0x008a }
            goto L_0x006a
        L_0x007a:
            int r0 = r6.f8080m     // Catch:{ all -> 0x008a }
            r3.Q = r0     // Catch:{ all -> 0x008a }
            r6.f8080m = r2     // Catch:{ all -> 0x008a }
            java.util.ArrayDeque<O> r0 = r6.f8071d     // Catch:{ all -> 0x008a }
            r0.addLast(r3)     // Catch:{ all -> 0x008a }
        L_0x0085:
            r6.r(r1)     // Catch:{ all -> 0x008a }
            monitor-exit(r4)     // Catch:{ all -> 0x008a }
            return r5
        L_0x008a:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x008a }
            throw r0
        L_0x008d:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x008d }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g6.h.l():boolean");
    }

    /* renamed from: m */
    public final I d() throws Exception {
        I i10;
        synchronized (this.f8069b) {
            p();
            w7.a.i(this.f8076i == null);
            int i11 = this.f8074g;
            if (i11 == 0) {
                i10 = null;
            } else {
                I[] iArr = this.f8072e;
                int i12 = i11 - 1;
                this.f8074g = i12;
                i10 = iArr[i12];
            }
            this.f8076i = i10;
        }
        return i10;
    }

    /* renamed from: n */
    public final O c() throws Exception {
        synchronized (this.f8069b) {
            p();
            if (this.f8071d.isEmpty()) {
                return null;
            }
            O o10 = (g) this.f8071d.removeFirst();
            return o10;
        }
    }

    public final void o() {
        if (g()) {
            this.f8069b.notify();
        }
    }

    public final void p() throws Exception {
        E e10 = this.f8077j;
        if (e10 != null) {
            throw e10;
        }
    }

    /* renamed from: q */
    public final void e(I i10) throws Exception {
        synchronized (this.f8069b) {
            p();
            w7.a.a(i10 == this.f8076i);
            this.f8070c.addLast(i10);
            o();
            this.f8076i = null;
        }
    }

    public final void r(I i10) {
        i10.j();
        I[] iArr = this.f8072e;
        int i11 = this.f8074g;
        this.f8074g = i11 + 1;
        iArr[i11] = i10;
    }

    public void s(O o10) {
        synchronized (this.f8069b) {
            t(o10);
            o();
        }
    }

    public final void t(O o10) {
        o10.j();
        O[] oArr = this.f8073f;
        int i10 = this.f8075h;
        this.f8075h = i10 + 1;
        oArr[i10] = o10;
    }

    public final void u() {
        do {
            try {
            } catch (InterruptedException e10) {
                throw new IllegalStateException(e10);
            }
        } while (l());
    }

    public final void v(int i10) {
        w7.a.i(this.f8074g == this.f8072e.length);
        for (I r10 : this.f8072e) {
            r10.r(i10);
        }
    }
}
